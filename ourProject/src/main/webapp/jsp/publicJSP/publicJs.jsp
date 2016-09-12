<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/bootstrap/bootstrap.min.css">
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/publicJS/vue.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/publicJS/bootstrap.min.js">
</head>
<body>
	<div class="container">
		<div class="col-md-6 col-md-offset-3">
			<h1>Vue demo</h1>
			<div id="app">
    			<div>{{message}}</div>
   				 <input type="text" v-model="message">
			</div>
		</div>
	</div>
	<script type="text/javascript">
			new Vue({
			    el:'#app',
			    data: {
			        message:'hello vue.js.'
			    }
			});
	</script>
</body>
</html>