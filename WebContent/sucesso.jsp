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
								<div class="row">
									<div class="col-sm-6 col-md-10"><h1>Sistema de Gestão de Almoxarifado</h1><h4>Seja bem vindo(a): ${nome}</h4></div>
									<div class="col-sm-6 col-md-2 pull-right"><img src="./resources/bootstrap/img/logoSGA.jpg" width="100" height="100"></div>
								</div>
								<br>
								<a href="/list.do"><button class="btn btn-primary" align="center" name="entrada">Registrar Entrada de Material</button></a>
								<a href="/list.do"><button  class="btn btn-primary" name="saida" value>Registrar Saída de Material</button></a>
								<hr>
								
							</div>
						</div>
					</div>
				</div>
			</div>
		</form>
	</body>
</html>
