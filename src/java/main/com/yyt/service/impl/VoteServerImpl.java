package com.yyt.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yyt.entity.OptionBean;
import com.yyt.entity.SubjectBean;
import com.yyt.entity.VoteBean;
import com.yyt.entity.VoteItem;
import com.yyt.entity.VoteSubject;
import com.yyt.mapper.VoteSubjectMapper;
import com.yyt.service.VoteServer;
@Service("voteServer")
public class VoteServerImpl implements VoteServer {
	@Autowired
	private VoteSubjectMapper voteSubjectMapper;

	@Override
	public List<VoteSubject> getAllSubject() {
		return voteSubjectMapper.getAllSubject();
	}

	@Override
	public List<SubjectBean> getAllSubjectBean() {
		return voteSubjectMapper.getAllSubjectBean();
	}

	@Override
	public OptionBean findOptionBeanByVsId(int vsId) {
		return voteSubjectMapper.findOptionBeanByVsId(vsId);
	}

	@Override 
	public VoteBean findVoteBeanByVsId(int vsid) {
		return voteSubjectMapper.getVoteBeanByVsId(vsid);
	}

	@Override  @Transactional
	public boolean addItem(VoteItem item) {
		try {
			voteSubjectMapper.addItem(item);
			return true;
		} catch (Exception e) {
			LogManager.getLogger().error("投票失败",e);
			throw new RuntimeException("投票失败",e);
		}
	}
	@Override @Transactional
	public boolean addItem(VoteItem item, String[] options) {
		if(options.length>1){
			for (String s : options) {
				item.setVoId(Integer.parseInt(s));
				if(!addItem(item)){
					return false;
				}
			}
		}else{
			return addItem(item);
		}
		return true;
	}
}
