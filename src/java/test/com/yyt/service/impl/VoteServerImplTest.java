package com.yyt.service.impl;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yyt.entity.OptionBean;
import com.yyt.entity.SubjectBean;
import com.yyt.entity.VoteBean;
import com.yyt.entity.VoteSubject;
import com.yyt.service.VoteServer;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value={"classpath:spring-com.xml","classpath:spring-mybatis.xml"})
public class VoteServerImplTest {
	@Autowired
	private VoteServer voteServer;
	@Test
	public void testGetAllSubject() {
		List<VoteSubject> list=voteServer.getAllSubject();
		System.out.println(list);
		assertNotNull("数据不为空",list);
	}
	
	@Test
	public void testGetAllSubjectBean() {
		List<SubjectBean> list=voteServer.getAllSubjectBean();
		System.out.println(list);
		assertNotNull("数据不为空",list);
	}
	@Test
	public void testGetAllOptionByVsId() {
		OptionBean list=voteServer.findOptionBeanByVsId(101);
		System.out.println(list);
		assertNotNull("数据不为空",list);
	}
	@Test
	public void testGetVoteBeanByVsId() {
		VoteBean list=voteServer.findVoteBeanByVsId(101);
		System.out.println(list);
		assertNotNull("数据不为空",list);
	}
}
