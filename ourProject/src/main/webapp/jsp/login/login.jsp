<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<link rel="stylesheet"
	href="http://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script type="text/javascript" src="../js/bootstrap.min.js"></script>
<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript" src="../js/login.js"></script>

<!-- <link href='../css/bootstrap.min.css' rel='stylesheet' type='text/css'> -->
<link href='../css/font-awesome.min.css' rel='stylesheet'
	type='text/css'>
<link href='../css/login.css' rel='stylesheet' type='text/css'>
<style type="text/css">
body {
	background-image: url(../picture/wolf.jpg);
}

@font-face {
	font-family: 'Oxygen';
	font-style: normal;
	font-weight: 400;
	src: local('Oxygen'), local('Oxygen-Regular'),
		url(https://fonts.gstatic.com/s/oxygen/v5/RzoNiRR1p2Mqyyz2RwqSMw.woff)
		format('woff');
}

@font-face {
	font-family: 'Passion One';
	font-style: normal;
	font-weight: 400;
	src: local('Passion One'), local('PassionOne-Regular'),
		url(https://fonts.gstatic.com/s/passionone/v6/fY6k21F1QT2c_Oc3HRNDwobN6UDyHWBl620a-IRfuBk.woff)
		format('woff');
}
</style>
</head>
<body>
	<form action="login.do">
		<div class="container">

			<div class="row" style="margin-top: 20px">
				<div
					class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
					<form role="form">
						<fieldset>
							<h2>Please Sign In</h2>
							<hr class="colorgraph">
							<div class="form-group">
								<input type="text" name="name" id="name"
									class="form-control input-lg" placeholder="user name">
							</div>
							<div class="form-group">
								<input type="password" name="password" id="password"
									class="form-control input-lg" placeholder="user password">
							</div>
							<span class="button-checkbox">
								<button type="button" class="btn" data-color="info">Remember
									Me</button> <input type="checkbox" name="remember_me" id="remember_me"
								checked="checked" class="hidden"> <a href=""
								class="btn btn-link pull-right">Forgot Password?</a>
							</span>
							<hr class="colorgraph">
							<div class="row">
								<div class="col-xs-6 col-sm-6 col-md-6">
									<input type="submit" class="btn btn-lg btn-success btn-block"
										value="Sign In">
								</div>
								<div class="col-xs-6 col-sm-6 col-md-6">
									<a href="/LoginDemo/form/register.jsp"
										class="btn btn-lg btn-primary btn-block">Register</a>
								</div>
							</div>
						</fieldset>
					</form>
				</div>
			</div>

		</div>
	</form>
</body>
</html>