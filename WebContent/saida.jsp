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
								<div class="col-sm-6 col-md-10">
									<h3>Sistema de Gestão de Almoxarifado</h3>
									<h4>Registrar Saída</h4>
								</div>
								<div class="col-sm-6 col-md-2"><img src="./resources/bootstrap/img/logoSGA.jpg" width="100" height="100"></div>
							</div>
								
							<hr>
							<form>
								<div class="form-group">
									<div class="row">
										<div class="col-sm-6 col-md-4"><label>Material</label>
											<select type="text" class="form-control margin-top-xs" name="material"/>
												<option value class selected="selected">Selecione um Material...</option>
											</select>
										</div>
										<div class="col-sm-6 col-md-4"><label>Departamento</label>
											<input type="text" placeholder="Digite o Nome do Departamento Destino" class="form-control margin-top-xs" name="unidadeMedida"/>
										</div>
										<div class="col-sm-6 col-md-2"><label>Quantidade</label>
											<input type="text" placeholder="Digite a Quantidade" class="form-control margin-top-xs" name="quantidade"/>
										</div>
										<div class="col-sm-6 col-md-2"><label>Unidade de Medida</label>
											<input type="text" placeholder="unidade" class="form-control margin-top-xs" name="unidadeMedida" disabled/>
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