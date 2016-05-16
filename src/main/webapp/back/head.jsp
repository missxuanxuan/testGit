<%@ page  contentType="text/html; charset=utf-8" pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="header" class="wrap">
	<img src="images/logo.gif" />
</div>
<div id="navbar" class="wrap">
	<div class="profile">
		<c:choose>
			<c:when test="${not empty user}">
				您好,${user.vuusername }
			</c:when>
			<c:otherwise>
				您好,游客,请<a href="login.jsp">登录</a>
			</c:otherwise>
		</c:choose>
		<span class="return"><a href="vote_list">返回列表</a></span>
		<span class="addnew"><a href="subject_read">添加新投票</a></span>
		<span class="modify"><a href="Subject!modify.action">维护</a></span>
		
	</div>
	<div class="search">
		<form method="post" action="Subject!search.action">
			<input type="text" name="keywords" class="input-text" value=""/><input type="submit" name="submit" class="input-button" value="" />
		</form>
	</div>
</div>