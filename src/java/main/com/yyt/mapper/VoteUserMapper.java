package com.yyt.mapper;

import com.yyt.entity.VoteUser;

public interface VoteUserMapper {
	public VoteUser userLogin(VoteUser voteUser);
	public int addVoteUser(VoteUser voteUser);
}