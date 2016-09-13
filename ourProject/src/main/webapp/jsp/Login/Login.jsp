<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<%@ include file="../publicJSP/publicJs.jsp"%>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/Login/style.css">
<script src="http://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

<style type="text/css">
body {
	background-image: url(picture/wolf.jpg);
}
</style>
</head>
<body>
	<div class="row" style="margin-top: 50px; margin-left: 10px;">
		<div class="col-md-6" style="border-right: 1px solid #ddd;">
			<div class="well col-md-11">
				<h3>用户登录</h3>
				<div class="input-group input-group-md">
					<span class="input-group-addon" id="sizing-addon1"><i
						class="glyphicon glyphicon-user" aria-hidden="true"></i></span> <input
						type="text" class="form-control" placeholder="用户名"
						aria-describedby="sizing-addon1">
				</div>
				<div class="input-group input-group-md">
					<span class="input-group-addon" id="sizing-addon1"><i
						class="glyphicon glyphicon-lock"></i></span> <input type="password"
						class="form-control" placeholder="密码"
						aria-describedby="sizing-addon1">
				</div>
				<div class="well well-sm" style="text-align: center;">
					<input type="radio" name="kind" value="tea"> 职员 <input
						type="radio" name="kind" value="stu"> 老板
				</div>
				<button type="submit" class="btn btn-success btn-block">登录
				</button>
				<br>
				<button type="submit" class="btn btn-success btn-block">注册
				</button>
				<br>
			</div>
		</div>
		<div class="col-md-6">
			<h3>欢迎使用单点登录系统</h3>
			<ul>
				<li>职员使用<em>职工号</em>登录，初始密码为<em>6个1</em>，登录后请及时修改密码
				</li>
				<li>老板请使用<em>管理员号</em>登录，初始密码为<em>6个1</em>，登录后请及时修改密码
				</li>
			</ul>
		</div>
	</div>
</body>
</html>