package com.yyt.utils;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value={"classpath:spring-com.xml","classpath:spring-mybatis.xml"})
public class MailSendTest {
	@Autowired
	private JavaMailSender javaMailSender;//在spring中配置的邮件发送的信息
	@Test
	public void sendMail(){
		SimpleMailMessage smm=new SimpleMailMessage();
		smm.setFrom("13187306743@163.com");//发送人的邮件
		smm.setTo("750907159@qq.com");//接收的邮箱的地址
		smm.setSubject("使用了properties,哈哈");//邮件的标题
		smm.setText("骄傲骄傲骄傲骄傲家居,你收到了没有");//邮件的内容
		javaMailSender.send(smm);//发送邮件
		System.out.println("发送成功");
	}
	@Test
	public void sendMail01(){
		/**
		 * 使用另一种的方式发送邮件,然后在邮件 使html格式生效
		 */
		MimeMessage mm=javaMailSender.createMimeMessage();
		MimeMessageHelper smm=new MimeMessageHelper(mm);
		try {
			smm.setFrom("13187306743@163.com");//发送人的邮件
			smm.setTo("750907159@qq.com");//接收的邮箱的地址
			smm.setSubject("使用了properties,哈哈,猜猜我是谁?");//邮件的标题
			smm.setText("骄傲骄傲骄傲骄傲家居,你收到了没有<br><a href='http://www.baidu.com'>去百度吧!</a>",true);//邮件的内容  true 是代表的html格式生效
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		javaMailSender.send(mm);//发送邮件
		System.out.println("发送成功");
	}
	@Test
	public void sendMail02(){
		/**
		 * 使用另一种的方式发送邮件,然后在邮件,发送一个照片
		 */
		MimeMessage mm=javaMailSender.createMimeMessage();
		MimeMessageHelper smm=null;
		try {
			smm=new MimeMessageHelper(mm,true);
			smm.setFrom("13187306743@163.com");//发送人的邮件
			smm.setTo("750907159@qq.com");//接收的邮箱的地址
			smm.setSubject("你丫的吃了狗屎了,你还不发送成功");//邮件的标题
			smm.setText("山东凯撒第三款<a href='http://www.baidu.com'>去百度吧!</a><img src='cid:identifier1234'>",true);//邮件的内容  true 是代表的html格式生效
			File file=new File("D:/1.jpg");
			System.out.println(file);
			FileSystemResource resource=new FileSystemResource(file);
			smm.addInline("identifier1234", resource);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		javaMailSender.send(mm);//发送邮件
		System.out.println("发送成功");
	}
	@Test
	public void sendMail03(){
		/**
		 * 使用另一种的方式发送邮件,然后在邮件,发送一个附件
		 */
		MimeMessage mm=javaMailSender.createMimeMessage();
		MimeMessageHelper smm=null;
		try {
			smm=new MimeMessageHelper(mm,true);
			smm.setFrom("13187306743@163.com");//发送人的邮件
			smm.setTo("750907159@qq.com");//接收的邮箱的地址
			smm.setSubject("你丫的吃了狗屎了,你还不发送成功");//邮件的标题
			smm.setText("山东凯撒第三款<a href='http://www.baidu.com'>去百度吧!</a>",true);//邮件的内容  true 是代表的html格式生效
			File file=new File("D:/1.jpg");
			System.out.println(file);
			FileSystemResource resource=new FileSystemResource(file);
			smm.addAttachment("CoolImage.jpg", resource);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		javaMailSender.send(mm);//发送邮件
		System.out.println("发送成功");
	}
}
