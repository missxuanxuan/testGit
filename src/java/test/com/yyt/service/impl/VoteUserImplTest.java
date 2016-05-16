package com.yyt.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yyt.entity.VoteUser;
import com.yyt.service.VoteUserService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value={"classpath:spring-com.xml","classpath:spring-mybatis.xml"})
public class VoteUserImplTest {
	@Autowired
	private VoteUserService voteUserService;
	@Test
	public void testUserLogin() {
		VoteUser user=new VoteUser();
		user.setVuusername("ss");
		user.setVupassword("a");
		VoteUser voteUser=voteUserService.userLogin(user);
		assertNotNull("数据为空",voteUser);
	}

	@Test
	public void testAddVoteUser() {
		VoteUser user=new VoteUser();
		user.setVuusername("yyt");
		user.setVupassword("a");
		user.setVustatus(1);
		user.setVuversion(1l);
		int result=voteUserService.addVoteUser(user);
		System.out.println(result);
	}

}
