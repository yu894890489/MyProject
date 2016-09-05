<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<link rel="stylesheet" type="text/css" href="https://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
	<script type="text/javascript"><%=request.getContextPath()%>/js/publicJS/vue.js</script>
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
		window.onload = function(){
			new Vue({
			    el:'#app',
			    data: {
			        message:'hello vue.js.'
			    }
			});
		}
	</script>
</body>
</html>