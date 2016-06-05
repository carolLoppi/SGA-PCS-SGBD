<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
Login Não Funcional
<%
	//String error = (String) request.getAttribute (Constants.ERROR_KEY);
	
// 	if (error != null)
// 		out.println ("<p><font color=red><b>" + error + "</b></font></p>");
	
%>


<form method="get" action="/sucesso">
	
	<table>
	<tr>
	  <th align="right">
		Nome:
	  </th>
	  <td align="left">
		<input type="text" name="login" size="64"/>
	  </td>
	</tr>

	<tr>
	  <th align="right">
		Senha:
	  </th>
	  <td align="left">
		<input type="text" name="senha" size="12"/>
	  </td>
	</tr>								

	<tr>
	  <td colspan="2" align="right">
		<input type="submit"/>
	  </td>									
	</tr>
	
	</table>					

</form>

<p>
<!--   <a href="/list.do">Retorna para a lista</a> -->
</p>



</body>
</html>
