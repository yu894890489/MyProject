<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
<script type="text/javascript" src="../js/bootstrap.min.js"></script>
<script type="text/javascript" src="../js/jquery.min.js"></script>
<script src="../js/bootstrap-datetimepicker.js"></script>
<script src="../js/bootstrap-datetimepicker.min.js"></script>
<script src="../js/locales/bootstrap-datetimepicker.fr.js"></script>
<script src="../js/locales/bootstrap-datetimepicker.zh-CN.js"></script>
<script src="../js/vue.js"></script>

<link rel="stylesheet"
	href="http://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
<!-- <link href='../css/bootstrap.min.css' rel='stylesheet' type='text/css'> -->
<link href='../css/bootstrap-datetimepicker.min.css' rel='stylesheet'
	type='text/css'>
<link href='../css/bootstrap-datetimepicker.css' rel='stylesheet'
	type='text/css'>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">

<!-- <link href='../css/font-awesome.min.css' rel='stylesheet' type='text/css'> -->
<link href='../css/register.css' rel='stylesheet' type='text/css'>

</head>
<body>
	<div class="container">
		<div class="row main">
			<div class="panel-heading">
				<div class="panel-title text-center">
					<h1 class="title">SSO register</h1>
					<hr />
				</div>
			</div>
			<div class="main-login main-center">
				<form class="form-horizontal" method="post" action="register.do">

					<div class="form-group">
						<label for="name" class="cols-sm-2 control-label">Your
							Name</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><i class="fa fa-user fa"
									aria-hidden="true"></i> </span> <input type="text"
									class="form-control" name="name" id="name"
									placeholder="Enter your Name" />
							</div>
						</div>
					</div>

					<div class="form-group">
						<label for="email" class="cols-sm-2 control-label">Your
							Email</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><i
									class="fa fa-envelope fa" aria-hidden="true"></i> </span> <input
									type="text" class="form-control" name="email" id="email"
									placeholder="Enter your Email" />
							</div>
						</div>
					</div>
					<div class="form-group">
						<label for="birthday" class="cols-sm-2 control-label">Your
							birthday</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><i
									class="glyphicon glyphicon-calendar" aria-hidden="true"></i> </span> <input
									class="form-control" name="birthday" id="birthday" type="date"
									placeholder="Enter your birthday">
							</div>
						</div>
					</div>

					<div class="form-group">
						<label for="username" class="cols-sm-2 control-label">Username</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><i class="fa fa-users fa"
									aria-hidden="true"></i> </span> <input type="text"
									class="form-control" name="username" id="username"
									placeholder="Enter your Username" />
							</div>
						</div>
					</div>

					<div class="form-group">
						<label for="password" class="cols-sm-2 control-label">Password</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><i
									class="fa fa-lock fa-lg" aria-hidden="true"></i> </span> <input
									type="password" class="form-control" name="password"
									id="password" placeholder="Enter your Password" />
							</div>
						</div>
					</div>

					<div class="form-group">
						<label for="confirm" class="cols-sm-2 control-label">Confirm
							Password</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><i
									class="fa fa-lock fa-lg" aria-hidden="true"></i> </span> <input
									type="password" class="form-control" name="confirm"
									id="confirm" placeholder="Confirm your Password" />
							</div>
						</div>
					</div>

					<div class="form-group ">
						<button type="submit"
							class="btn btn-primary btn-lg btn-block login-button">注册</button>
					</div>
					<div class="login-register">
						<a href="/LoginDemo/form/login.jsp">登录</a>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>