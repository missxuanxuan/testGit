package com.yyt.utils;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class SqlSessionUtilsTest {
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	@Test
	public void testGetSqlSession() {
		SqlSession session=sqlSessionFactory.openSession();
		Connection connection=session.getConnection();
		assertNotNull("连接不为空",connection);
	}


}
