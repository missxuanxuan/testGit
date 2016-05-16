<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"
	isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="ftm" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8" />
<title>显示投票信息</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
</head>
<body>
	<%@ include file="head.jsp" %>

	<div id="vote" class="wrap">
		<h2>查看投票</h2>
		<ul class="list">
			<li>
				<h4>${view.vsTitle}</h4>
				<p class="info">共有 ${view.optionCount} 个选项，已有  ${view.voteUserCount} 个网友参与了投票。</p>
				<ol>
					<c:forEach items="${view.voteOptionCount}" var="item">
						<li>
						<div class="rate">
							<div class="ratebg">
								<div class="percent" style='width:
									<c:choose>
										<c:when test="${view.voteUserCount==0}">0</c:when>
										<c:otherwise>
											<ftm:formatNumber value="${item/view.voteUserCount }" type="percent" maxFractionDigits="2"/>
										</c:otherwise>
									</c:choose>
								'></div>
							</div>
							<p>
								${item}票<span>(
									<c:choose>
										<c:when test="${view.voteUserCount==0}">0</c:when>
										<c:otherwise>
											<ftm:formatNumber value="${item/view.voteUserCount }" type="percent" maxFractionDigits="2"/>
										</c:otherwise>
									</c:choose>
								)</span>
							</p>
						</div>
					</li>
					</c:forEach>
				</ol>
				<div class="goback">
					<a href="vote_list">返回投票列表</a>
				</div>
			</li>
		</ul>
	</div>
	<div id="footer" class="wrap">源辰信息 &copy; 版权所有</div>
</body>
</html>
