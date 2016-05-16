package com.yyt.mapper;

import java.util.List;

import com.yyt.entity.AddSubjectBean;
import com.yyt.entity.OptionBean;
import com.yyt.entity.SubjectBean;
import com.yyt.entity.VoteBean;
import com.yyt.entity.VoteItem;
import com.yyt.entity.VoteOption;
import com.yyt.entity.VoteSubject;


public interface VoteSubjectMapper {
    List<VoteSubject> getAllSubject();
    List<SubjectBean> getAllSubjectBean();
    OptionBean findOptionBeanByVsId(int vsId);
	VoteBean getVoteBeanByVsId(int vsid);
	boolean addItem(VoteItem item);
	void addSubject(AddSubjectBean addSubjectBean);
	void addOptions(VoteOption voteOption);
	
}