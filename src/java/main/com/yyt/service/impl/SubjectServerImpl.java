package com.yyt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yyt.entity.AddSubjectBean;
import com.yyt.entity.VoteOption;
import com.yyt.mapper.VoteSubjectMapper;
import com.yyt.service.SubjectServer;
@Service("subjectServer")
public class SubjectServerImpl implements SubjectServer {
	@Autowired
	private VoteSubjectMapper voteSubjectMapper;
	@Override @Transactional
	public void addAddSubject(AddSubjectBean addSubjectBean) {
		voteSubjectMapper.addSubject(addSubjectBean);
	}

	@Override @Transactional
	public void addOption(VoteOption voteOption) {
		voteSubjectMapper.addOptions(voteOption);
	}

	@Override @Transactional
	public void add(AddSubjectBean addSubjectBean) {
		/**
		 * 先插入投票的主题,然后的得到投票的主题
		 * 在循环插入选项
		 */
		addAddSubject(addSubjectBean);
		System.out.println("添加过后的值"+addSubjectBean);
		List<String> options=addSubjectBean.getOptions();
		for (int i = 0; i < options.size(); i++) {
			addOption(new VoteOption(options.get(i),addSubjectBean.getVsId(),i+1));
		}
	}

}
