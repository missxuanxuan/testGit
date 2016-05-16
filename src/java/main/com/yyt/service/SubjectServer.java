package com.yyt.service;

import com.yyt.entity.AddSubjectBean;
import com.yyt.entity.VoteOption;

public interface SubjectServer {
	void addAddSubject(AddSubjectBean addSubjectBean);
	void addOption(VoteOption voteOption);
	void add(AddSubjectBean addSubjectBean);

}
