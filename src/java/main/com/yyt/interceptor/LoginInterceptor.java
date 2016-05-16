package com.yyt.interceptor;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import com.yyt.entity.VoteUser;

/**
 * 过滤请求的方法名,在struts中配置
 * @author yyt
 */
public class LoginInterceptor extends MethodFilterInterceptor{
	private static final long serialVersionUID = 1L;
	public static final String LOGINUSER="user";
	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		Map<String, Object> session=ActionContext.getContext().getSession();
		VoteUser user=(VoteUser)session.get(LOGINUSER) ;
		if(user==null){
			session.put("loginMessage", "请登录!!!");
			return "login";
		}
		String result=invocation.invoke();
		return result;
	}


}
