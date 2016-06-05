<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	Login
	<form method="post" action="authentication">
		<input type="hidden" name="index" value="<%=request.getAttribute("index")%>"/>
	
	
		<table>
			<tr>
				<th align="right">Nome:</th>
				<td align="left"><input type="text" name="login" size="64" /></td>
			</tr>

			<tr>
				<th align="right">Senha:</th>
				<td align="left"><input type="text" name="senha" size="12" /></td>
			</tr>

			<tr>
				<td colspan="2" align="right"><input type="submit" /></td>
			</tr>

		</table>

	</form>




</body>
</html>
