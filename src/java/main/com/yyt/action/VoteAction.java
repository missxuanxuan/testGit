package com.yyt.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.yyt.entity.OptionBean;
import com.yyt.entity.SubjectBean;
import com.yyt.entity.VoteBean;
import com.yyt.entity.VoteItem;
import com.yyt.service.VoteServer;

@Controller("voteAction")
@Scope("prototype")
public class VoteAction implements SessionAware, ModelDriven<VoteItem> {
	@Autowired
	private VoteServer voteServer;
	private Map<String, Object> session;
	private VoteItem item;

	public String list() {
		List<SubjectBean> list = voteServer.getAllSubjectBean();
		session.put("subject", list);
		return "list";
	}

	public String view() {
		OptionBean optionBeans = voteServer.findOptionBeanByVsId(item.getVsid());
		session.put("view", optionBeans);
		return "view";
	}

	public String vote() {
		VoteBean voteBeans = voteServer.findVoteBeanByVsId(item.getVsid());
		voteBeans.setVsId(item.getVsid());
		session.put("vote", voteBeans);
		return "vote";
	}

	public String save() {
		// 取到信息后将信息添加到item的表中
		String[] options=ServletActionContext.getRequest().getParameterValues("voId");
		try {
			voteServer.addItem(item,options);
			return "saveSuccess";
		} catch (Exception e) {}
		session.put("voteMsg", "投票失败!!");
		return "vote";
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	@Override
	public VoteItem getModel() {
		item = new VoteItem();
		return item;
	}
}
