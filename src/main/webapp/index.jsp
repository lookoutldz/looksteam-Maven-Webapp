<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<body>
<h2>Hello World!</h2>
<a href="<%=basePath%>Test/jsArray.do">go</a>
<script type="text/javascript">
	var myArray = new Array();
	
</script>
</body>
</html>
