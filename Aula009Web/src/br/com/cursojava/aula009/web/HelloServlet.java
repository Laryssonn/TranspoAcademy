package br.com.cursojava.aula009.web;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getServletPath();
		String  ipSolicintante = req.getRemoteHost();
		StringBuilder result = new StringBuilder();
		result.append("<!doctyp html>")
		.append("<html>")
		.append("<head>")
		.append("<meta charset=\"utf-8\" > ")
		.append("<title> Hello World Java Web </title>")
		.append("</head>")
		.append("<body>")
		.append("<h1> Bem vindo ao mundo Java Web </h1>")
		.append("<h3> Dados da Requisição:</h3>")
		.append("<p><strong> path: ").append(path).append("</strong></p>")
		.append("<p><strong> ip: ").append(ipSolicintante).append("</strong></p>")
		.append("<p><strong> Data Hora: ").append(new Date()).append("</strong></p>")
		.append("</body>")
		.append("</html>");
		resp.setContentType("text/html");
		resp.getWriter().println(result);
	}

}
