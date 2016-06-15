<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<!-- Esta inclusão abaixo é importante ser mantida por conta da utilização da cláusula c:forEach.-->
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Saida</title>
		<link rel="stylesheet" type="text/css" href="./resources/bootstrap/css/bootstrap.min.css" />
		<link rel="stylesheet" type="text/css" href="./resources/bootstrap/css/bootstrap-theme.min.css" />
 		<script src="./resources/bootstrap/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="top-border"></div>
		<form method="post" action="realizaEntrada">
			<input type="hidden" name="index" value="<%=request.getAttribute("index")%>"/>
			<input type="hidden" name="login" value="<%=request.getAttribute("login")%>"/>
			<input type="hidden" name="nomeOperador" value="<%=request.getAttribute("nomeOperador")%>"/>
			
			<br><br><br>
			<div class="container">
				<div class="row col-md-12">
					<div class="panel panel-default">
						<div class="panel-body">
							<div class="row">
								<div class="col-sm-6 col-md-10">
									<h3>Sistema de Gestão de Almoxarifado</h3>
									<h4>Registrar Entrada</h4>
								</div>
								<div class="col-sm-6 col-md-2"><img src="./resources/bootstrap/img/logoSGA.jpg" width="100" height="100"></div>
							</div>
							<hr>
							<div class="form-group">
								<div class="row">
									<div class="col-sm-6 col-md-10"><label>Almoxarifado</label>
										<select class="form-control margin-top-xs" name="idAlmoxarifado">
											<option selected="selected">Selecione um Almoxarifado...</option>
											<c:forEach items="${almoxarifados}" var="almoxarifado">
												<option value="${almoxarifado.id}">${almoxarifado.codigo}</option>
											</c:forEach>
										</select>
									</div>
								</div>
								<br>
								<button type="submit" class="btn btn-primary pull-right">Verificar Disponibilidade</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</form>
	</body>
</html>
