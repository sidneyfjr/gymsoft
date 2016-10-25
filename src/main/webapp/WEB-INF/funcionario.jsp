<%@page import="java.util.List" %> 
<%@page import="pessoas.entidade.Pessoa" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Funcionário</title>
</head>
<body>

<div align="center" style="margin: 0px 40px;">

<%@ include file="menuCompletoCadastros.jsp" %>

<%-- <%
	
		List<Pessoa> lista = (List<Pessoa>)request.getAttribute("lista");
	
		for(Pessoa p:lista){
			out.print(p.getNome());
		}
	
	%>
 --%>
<div align="center">
		<div style="border: 1px #cecece solid; padding: 10px; width: 60%;">

			<div align="left" style="margin-bottom: 40px;">
				<b>Cadastro de Funcionário</b>
			</div>

			<form align="left" action="funcionariocontroller.do" method="post">

				<div style="margin: 10px;">
					Nome : <input type="text" name="nome" size="60" value="" />
				</div>

				<div style="margin: 10px;">

					Sexo : <select name="sexo">
						<option value="M">Masculino</option>
						<option value="F">Feminino</option>
					</select>
				</div>

				<!-- <div style="margin: 10px;">
	Nascimento : <input type="date" name="nascimento" value="" />
</div> -->

				<div style="margin: 10px;">
					Email : <input type="text" name="email" size="60" value="" />
				</div>
				<div style="margin: 10px;">
					RG : <input type="text" name="rg" value="" />
				</div>
				<div style="margin: 10px;">
					CPF : <input type="text" name="cpf" value="" />
				</div>

				<div style="margin: 10px;">
					Rua : <input type="text" name="rua" size="60" value="" />
				</div>

				<div style="margin: 10px;">
					Nº : <input type="text" name="numero" size="10" value="" />
				</div>

				<div style="margin: 10px;">
					Bairro : <input type="text" name="bairro" size="40" value="" />
				</div>

				<div style="margin: 10px;">
					Complemento : <input type="text" name="complemento" size="40"
						value="" />
				</div>

				<div style="margin: 10px;">
					Cidade : <input type="text" name="cidade" value="" />
				</div>

				<div style="margin: 10px;">
					Estado : <input type="text" name="estado" value="" />
				</div>

				<div
					style="border: 1px solid #cecece; margin: 20px 40px 20px 40px; padding: 20px;"
					align="center">

					<div align="center" style="margin-bottom: 20px;">
						<b>Acesso ao Sistema</b>
					</div>
					<div style="margin: 10px;">
						Login: <input type="text" name="login" value="" />
					</div>
					<div style="margin: 10px;">
						Senha: <input type="text" name="senha" value="" />
					</div>
				</div>
				<div align="right">
					<input type="submit" style="padding: 5px;" value="salvar" />
				</div>
			</form>
		</div>
	</div>
</div>
</body>
</html>