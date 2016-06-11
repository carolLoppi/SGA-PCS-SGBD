<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		<form method="post" action="incluir">
			<input type="hidden" name="index" value="<%=request.getAttribute("index")%>"/>
			<br><br><br>
			<div class="container">
				<div class="row col-md-12">
					<div class="panel panel-default">
						<div class="panel-body">
							<div class="row">
								<div class="col-sm-6 col-md-10">
									<h1>Sistema de Gestão de Almoxarifado</h1>
								</div>
								<div class="col-sm-6 col-md-2"><img src="./resources/bootstrap/img/logoSGA.jpg" width="100" height="100"></div>
								<div class="col-sm-6 col-md-10"><h3>Registrar Entrada</h3></div>
								
							</div>
								
							<hr>
							<form>
								<div class="form-group">
									<div class="row">
										<div class="col-sm-6 col-md-4"><label>Material</label>
											<select class="form-control margin-top-xs" name="material">
												<option selected="selected">Selecione um Material...</option>
												<c:forEach items="${materiais}" var="material">
													<option value="${material.id}">${material.descricao}</option>
												</c:forEach>
											</select>
										</div>
										<div class="col-sm-6 col-md-3"><label>Fornecedor</label>
											<select class="form-control margin-top-xs" name="fornecedor">
												<option selected="selected">Selecione um Fornecedor...</option>
												<c:forEach items="${fornecedores}" var="fornecedor">
													<option value="${fornecedor.id}">${fornecedor.nome}</option>
												</c:forEach>											
											</select>
										</div>
										<div class="col-sm-6 col-md-3"><label>Setor</label>
											<select class="form-control margin-top-xs" name="setor">
												<option selected="selected">Selecione um Setor...</option>
												<c:forEach items="${setores}" var="setor">
													<option value="${setor.id}">${setor.nome}</option>
												</c:forEach>											
											</select>
										</div>
										<div class="col-sm-6 col-md-2"><label>Quantidade</label>
											<input type="text" placeholder="Digite a Quantidade" class="form-control margin-top-xs" name="quantidade"/>
										</div>
									</div>
									<br>
									<button type="submit" class="btn btn-primary pull-right">Salvar</button>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</form>
	</body>
</html>
