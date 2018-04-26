
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Scanner"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Zambrana´s GYM</title>


        <link href="css/estilonuevo.css" rel="stylesheet"/>
    </head>
    <body>
       
        <form method="get" action="sesion.jsp">
            <div class="login">
	<h1>Login</h1>
    <form method="post">
    	<input type="text" name="u" placeholder="Usuario" required="required" />
        <input type="password" name="p" placeholder="Contaseña" required="required" />
        <button type="submit" class="btn btn-primary btn-block btn-large">Iniciar sesión</button>
    </form>
</div>
    </body>
</html>