package com.yyt.service;

import java.util.List;

import com.yyt.entity.OptionBean;
import com.yyt.entity.SubjectBean;
import com.yyt.entity.VoteBean;
import com.yyt.entity.VoteItem;
import com.yyt.entity.VoteSubject;


public interface VoteServer {
	 List<VoteSubject> getAllSubject();
	 
	 List<SubjectBean> getAllSubjectBean();
	 
	 OptionBean findOptionBeanByVsId(int vsId);

	 VoteBean findVoteBeanByVsId(int vsid);
	 
	 boolean addItem(VoteItem item);
	 boolean addItem(VoteItem item,String[] options);
}
