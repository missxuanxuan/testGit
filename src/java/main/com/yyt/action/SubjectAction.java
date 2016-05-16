package com.yyt.action;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.yyt.entity.AddSubjectBean;
import com.yyt.service.SubjectServer;
@Controller("subjectAction")
public class SubjectAction implements ModelDriven<AddSubjectBean> {
	private AddSubjectBean addSubjectBean;
	@Autowired
	private SubjectServer subjectService;
	
	public String add(){
		LogManager.getLogger().debug("取到的数据是:"+addSubjectBean);
		try {
			subjectService.add(addSubjectBean);
			return "index";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "add";
	}
	public String read(){
		return "add";
	}
	@Override
	public AddSubjectBean getModel() {
		addSubjectBean =new AddSubjectBean();
		return addSubjectBean;
	}

}
