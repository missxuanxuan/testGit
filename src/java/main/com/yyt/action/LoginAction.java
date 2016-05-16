package com.yyt.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.yyt.entity.VoteUser;
import com.yyt.interceptor.LoginInterceptor;
import com.yyt.service.VoteUserService;

@Controller("loginAction")
public class LoginAction implements SessionAware, ModelDriven<VoteUser> {
	private VoteUser user;
	private String confirmPassword;
	@Autowired
	private VoteUserService voteUserService;

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	private Map<String, Object> session;

	public String login() {
		VoteUser login = voteUserService.userLogin(user);
		if (login == null) {
			session.put("loginMessage", "用户名或密码错误!!!");
			return "login";
		}
		session.put(LoginInterceptor.LOGINUSER, login);
		return "list";
	}

	public String register() {
		if(!confirmPassword.equals(user.getVupassword())){
			session.put("registerMessage", "两次密码不相等!!!");
			return "register";
		}
		voteUserService.addVoteUser(user);
		return "login";
	}

	@Override
	public VoteUser getModel() {
		user = new VoteUser();
		return user;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
