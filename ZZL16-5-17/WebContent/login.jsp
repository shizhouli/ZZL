<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 登录 -->
<form action="<%=request.getContextPath() %>/System/userLogin" style="margin:0 auto;width:450px;padding:10px 30px;text-align:center;margin-top:150px;">
	<img src="<%=request.getContextPath() %>/images/logo.jpg" style="vertical-align:middle;width:60%;height:auto;">
	<div style="width:100%;height:auto;margin-top:10%;">
		<a style="color:white;float:left;">账号：</a>
		<input type="text" name="account" style="float:left;padding:5px 10px;border:1px solid #EEE9E9;border-radius:3px;width:80%;">
     	</div><br/>
     	<div style="width:100%;height:auto;margin-top:10%;">
     		<a style="color:white;float:left;">密码：</a>
		<input type="password" name="password" style="float:left;padding:5px 10px;border:1px solid #EEE9E9;border-radius:3px;width:80%;">
     	</div><br/><br/><br/><br/>
     	<button type="submit" class="btn btn-success" style="width:80%;background-color:#1abb48;">登录</button>
</form>
<script type="text/javascript">
	color();
	function color(){
		$("body").css("background-color","#3c8dbc");
	}
</script>
<!-- 登录 -->