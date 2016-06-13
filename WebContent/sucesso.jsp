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
		<form method="post" action="redirecionaOpcao">
			<input type="hidden" name="index" value="<%=request.getAttribute("index")%>"/>
			<input type="hidden" name="login" value="<%=request.getAttribute("login")%>"/>
			<input type="hidden" name="nomeOperador" value="<%=request.getAttribute("nomeOperador")%>"/>
			
			
			<br><br><br>
			<div class="container">
				<div class="row col-md-12">
						<div class="panel panel-default">
							<div class="panel-body">
								<div class="row">
									<div class="col-sm-6 col-md-10"><h1>Sistema de Gestão de Almoxarifado</h1>
										<c:if test="${inclusao != true}">
											<h4>Seja bem vindo(a): ${nome}</h4>
										</c:if>
									</div>
									<div class="col-sm-6 col-md-2 pull-right"><img src="./resources/bootstrap/img/logoSGA.jpg" width="100" height="100"></div>
								</div>
								<br>
								<button type="submit" value="entrada" class="btn btn-primary" name="entrada" value>Registrar Entrada de Material</button>
								<button  type="submit" value="saida" class="btn btn-primary" name="saida">Registrar Saída de Material</button>
								<hr>
								<c:if test="${inclusao == true && entradaSucesso == true}"> 
									<div class="alert alert-success" role="alert">Entrada Realizada Com Sucesso! : )</div>
								</c:if>
								<c:if test="${inclusao == true && entradaSucesso == false}"> 
									<div class="alert alert-danger" role="alert">Ocorreu um erro ao realizar a sua entrada. Por favor, tente mais tarde.</div>
								</c:if>
								
								
							</div>
						</div>
					</div>
				</div>
			</div>
		</form>
	</body>
</html>
