package com.yyt.service;

import com.yyt.entity.VoteUser;

public interface VoteUserService {
	public VoteUser userLogin(VoteUser voteUser);
	
	public int addVoteUser(VoteUser voteUser);
}
