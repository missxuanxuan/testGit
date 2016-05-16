package com.yyt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yyt.entity.VoteUser;
import com.yyt.mapper.VoteUserMapper;
import com.yyt.service.VoteUserService;
@Service("voteUserService")
public class VoteUserImpl implements VoteUserService {
	@Autowired
	private VoteUserMapper voteUserMapper;
	@Override
	public VoteUser userLogin(VoteUser voteUser) {
		return voteUserMapper.userLogin(voteUser);
	}

	@Override
	public int addVoteUser(VoteUser voteUser) {
		return voteUserMapper.addVoteUser(voteUser);
	}

}
