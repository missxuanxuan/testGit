<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>发布新投票</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
<script type="text/javascript">
	var isIE = !!document.all;
	function AddOption() {
		var voteoptions = document.getElementById("voteoptions");
		var _p = document.createElement("p");
		var _input = document.createElement("input");
		_input.type = "text";
		_input.className = "input-text";
		_input.setAttribute("name", "options");
		_p.appendChild(_input);
		var _a = document.createElement("a");
		_a.className = "del";
		_a.setAttribute("href", "javascript:;");
		if (isIE) {
			_a.attachEvent("onclick", DelOption);
		} else {
			_a.addEventListener("click", DelOption, false);
		}
		_a.appendChild(document.createTextNode("删除"));
		_p.appendChild(_a);
		voteoptions.appendChild(_p);
	}
	function DelOption(e) {
		if (!e)
			e = window.event;
		var a = e.srcElement || e.target;
		var obj = a.parentNode;
		obj.parentNode.removeChild(obj);
	}
</script>
</head>
<body>
	<%@ include file="head.jsp" %>
	<div id="voteManage" class="box">
		<h2>添加新投票</h2>
		<div class="content">
			<form method="post" action="subject_add.action">
				<dl>
					<dt>投票内容：</dt>
					<dd>
						<input type="text" class="input-text" name="vsTitle" value="" />
					</dd>
					<dt>投票类型：</dt>
					<dd>
						<input type="radio" name="vsType" checked="checked" value="1" />单选
						<input type="radio" name="vsType" value="2" />多选
					</dd>
					<dt>投票选项：</dt>

					<dd id="voteoptions">
						<p>
							<input type="text" class="input-text" name="options" />
						</p>
						<p>
							<input type="text" class="input-text" name="options" />
						</p>
					</dd>
					<dt></dt>
					<dd class="button">
						<input type="image" src="images/button_submit.gif"/> <a
							href="javascript:;" onclick="AddOption()">增加选项</a> <a
							href="vote_list">取消操作</a>
					</dd>
				</dl>
			</form>
		</div>
	</div>
	<div id="footer" class="wrap">源辰信息 &copy; 版权所有</div>
</body>
</html>