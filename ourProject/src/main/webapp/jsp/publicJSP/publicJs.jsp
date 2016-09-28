
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
	<base href="<%=basePath%>">
	<meta charset="UTF-8">
	<script type="text/javascript" src="js/publicJS/jquery.min.js"></script>
	<link rel="stylesheet" type="text/css" href="css/bootstrap/bootstrap.min.css">
	<script type="text/javascript" src="js/publicJS/vue.js"></script>
	<script type="text/javascript" src="js/publicJS/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/publicJS/bootstrap-datetimepicker.js"></script>
	<script type="text/javascript" src="js/register/bootstrap-datetimepicker.min.js"></script>
</head>
</html>