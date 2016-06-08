<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Login</title>
		<link rel="stylesheet" type="text/css" href="./resources/bootstrap/css/bootstrap.min.css" />
		<link rel="stylesheet" type="text/css" href="./resources/bootstrap/css/bootstrap-theme.min.css" />
 		<script src="./resources/bootstrap/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="top-border"></div>
		<form method="post" action="authentication">
			<input type="hidden" name="index" value="<%=request.getAttribute("index")%>"/>
			
			
			<br><br><br>
			<div class="container">
				<div class="row col-md-12">
						<div class="panel panel-default">
							<div class="panel-body">
								<img src="./resources/bootstrap/img/logoSGA.jpg" width="100" height="100">
								<h3>Sistema de Gestão de Almoxarifado</h3>
								<hr>
									<div>
										<p>Seja bem vindo(a): ${nome}!</p>									
									</div>
								<hr>
									<div class="form-group">
										<a href="/list.do"><button type="submit" class="btn btn-primary" align="center" name="entrada">Entrada de Materiais</button></a>
									</div>
									<div class="form-group">
										<a href="/list.do"><button type="submit" class="btn btn-primary" name="saida" value>Saída de Materiais</button></a>
									</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</form>
	</body>
</html>
