package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;

public final class grabaTarjeta_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilos.css\">\n");
      out.write("        <title>Zambrana´s GYM</title>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("  <body>\n");
      out.write("    ");

      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud3","root", "");
      Statement s = conexion.createStatement();

      request.setCharacterEncoding("UTF-8");
      
      // Comprueba la existencia del número de tarjeta introducido
      String consultaNumSocio = "SELECT * FROM estructura_gym WHERE gym_id="
                                + Integer.valueOf(request.getParameter("gym_id"));      
      
      ResultSet numeroDeSocios = s.executeQuery (consultaNumSocio);
      numeroDeSocios.last();
      
      if (numeroDeSocios.getRow() != 0) {
        out.println("Lo siento, no se ha podido dar de alta, ya existe un socio con el número "
                    + Integer.valueOf(request.getParameter("gym_id")) + ".");
      } else {
        String insercion = "INSERT INTO estructura_gym VALUES (" + Integer.valueOf(request.getParameter("gym_id"))
                           + ", '" + Integer.valueOf(request.getParameter("edad"))
                           + "', '" + Double.valueOf(request.getParameter("estatura"))
                           + "', '" + request.getParameter("nombre")
                           + "', " + Double.valueOf(request.getParameter("peso")) + ")";
        s.execute(insercion);
        out.println("Socio dado de alta correctamente.");
      }
      conexion.close();
    
      out.write("\n");
      out.write("    <br>\n");
      out.write("    <a href=\"index.jsp\"><span></span> Página principal</a>\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}