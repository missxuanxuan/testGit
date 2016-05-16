<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"
	isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="ftm" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8" />
<title>参与投票</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
</head>
<body>

<%@ include file="head.jsp" %>

	<div id="vote" class="wrap">
		<h2>参与投票</h2>
		<label style="color: red;">${voteMsg}</label>
		<c:remove var="voteMsg" scope="session"/>
		<ul class="list">
			<li>
				<h4>${vote.vsTitle}</h4>
				<p class="info">共有 ${vote.optionCount} 个选项，已有
					${vote.voteUserCount} 个网友参与了投票。</p>
				<form method="post" action="vote_save.action">
					<input type="hidden" name="vsid" value="${vote.vsId}" />
					<input type="hidden" name="vuid" value="${user.vuid}" />
					<ol>
						<c:set var="inputtype"
							value="${vote.vsType==1 ? 'radio' :'checkbox' }" />
						<c:forEach items="${vote.options}" var="item">
							<li><input type=${inputtype } name="voId"
								value="${item.voId}" />${item.voOption}</li>
						</c:forEach>
					</ol>
					<p class="voteView">
						<input type="image" src="images/button_vote.gif" /><a
							href="vote_view.action?vsid=${vote.vsId}"><img
							src="images/button_view.gif" /></a>
					</p>
				</form>
			</li>
		</ul>
	</div>
	<div id="footer" class="wrap">源辰信息 &copy; 版权所有</div>
</body>
</html>
