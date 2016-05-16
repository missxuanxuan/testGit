<%@ page  contentType="text/html; charset=utf-8" pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta  charset="utf-8">
<title>投票列表</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
</head>
<body>
<%@ include file="head.jsp" %>
<div id="vote" class="wrap">
	<h2>投票列表</h2>
	<ul class="list">
		<c:forEach items="${subject}" var="item"  varStatus="status">
		<li  <c:if test="${status.index %2 ==0 }"> class="odd" </c:if>  >
			<h4>				
				<a href="vote_view.action?vsid=${item.vsid}">${item.vstitle }</a>
			</h4>
			<div class="join"><a href="vote_vote.action?vsid=${item.vsid}">我要参与</a></div>
			<p class="info">共有 ${item.optionCount} 个选项，已有${item.voteUserCount}个网友参与了投票。</p>
		</li>
		</c:forEach>
	</ul>
</div>
<div id="footer" class="wrap">
	源辰信息 &copy; 版权所有
</div>
</body>
</html>
