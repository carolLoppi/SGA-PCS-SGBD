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
		<br><br><br>
		<div class="container">
			<div class="row col-md-12">
				<div class="panel panel-default">
					<div class="panel-body">
						<div class="row">
							<div class="col-sm-6 col-md-10">
								<h3>Sistema de Gestão de Almoxarifado</h3>
								<h4>Registrar Saída</h4>
								<br>
								<c:if test="${exclusao == true && saidaSucesso == true}"> 
									<h5>
										<b>Material:</b>
										<br>
										<br>
										<input width="250" class="form-control clipboardjs-input-sm" readonly value="${alocacoes[0].material.descricao}">
									</h5>
								</c:if>
							</div>
							<div class="col-sm-6 col-md-2"><img src="./resources/bootstrap/img/logoSGA.jpg" width="100" height="100"></div>
						</div>
						<hr>
						<c:if test="${exclusao == true && saidaSucesso == false}"> 
							<div class="alert alert-danger" role="alert">Material Não Disponível em Estoque!</div>
						</c:if>
						<c:if test="${quantidadeInvalida == true}"> 
							<div class="alert alert-danger" role="alert">Quantidade não disponível! Por favor, digite um número menor ou igual à quantidade disponível </div>
						</c:if>
						<c:if test="${exclusao == true && saidaSucesso == true}"> 
							<div class="form-group">
								<div class="table-responsive">
									<table class="table table-condensed">
										<thead class="table-head-brown">
											<tr>
												<th>Setor</th>
												<th>Fornecedor</th>
												<th width="150">Quantidade Disponível</th>
												<th width="250">Quantidade a Retirar</th>
												<th class="text-align:center">Departamento Destino</th>
												<th> </th>
											</tr>
										</thead>
										<tbody>
											<c:forEach items="${alocacoes}" var="alocacao">
												
												<tr>
													<form method="post" action="registrarSaida">
														<input type="hidden" name="index" value="<%=request.getAttribute("index")%>"/>
														<input type="hidden" name="idOperador" value="<%=request.getAttribute("idOperador")%>"/>
														<input type="hidden" name="alocacaoId" value="${alocacao.id}">
														<input type="hidden" name="quantidadeDisponivel" value="${alocacao.quantidade}">
														<td>${alocacao.setor.nome}</td>
														<td>${alocacao.fornecedor.nome}</td>
														<td>${alocacao.quantidade}</td>
														<td><input type="text" class="form-control margin-top-xs" name="quantidadeSaida"></td>
														<td><input type="text" placeholder="Digite o Nome do Departamento" class="form-control margin-top-xs" name="departamentoDestino"/></td>
														<td><button type="submit" class="btn btn-primary pull-right"> Registrar Saída</button></td>
													</form>
												</tr>
											</c:forEach>
										</tbody>
									</table>
									</div>
								</div>
								<br>
							</div>
						</c:if>

					</div>
				</div>
			</div>
		</div>
	</body>
</html>
