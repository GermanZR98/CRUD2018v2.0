package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.HashMap;

public final class sesion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <h1>LOGIN</h1>\n");
      out.write("        <form method=\"get\" action=\"login.jsp\">\n");
      out.write("            <center>\n");
      out.write("                <table border=\"1\" width=\"30%\" cellpadding=\"10\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Usuario</td>\n");
      out.write("                        <td><center><input type=\"text\" name=\"usuario\" />\n");
      out.write("\n");
      out.write("                    </center></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Contraseña</td>\n");
      out.write("                        <td><center><input type=\"password\" name=\"contrasena\" value=\"\" /></center></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><center><input type=\"submit\" value=\"Acceder\" /></center></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </center>\n");
      out.write("        </form>\n");
      out.write("        <br>\n");
      out.write("        ");


            HashMap<String, String> login = new HashMap();

            login.put("admin", "admin");
            login.put("usuario", "usuario");
            login.put("francis", "francis");
            
            String nombre = request.getParameter("usuario");
            String contraseña = request.getParameter("contrasena");

            if (login.containsKey(nombre)) {
                if (login.get(nombre).equals(contraseña)) {
                    session.setAttribute("nombre", nombre);
                    response.sendRedirect("index.jsp");

                } else {
                    out.println("<div class='alert alert-success' role='alert'>Contraseña incorrecta</div>");
                    out.println("<a href='index.jsp' class='btn btn-primary'><span class='glyphicon glyphicon-home'></span> Login </button></a>");
                }
            } else {
                out.println("<div class='alert alert-success' role='alert'>El usuario no existe</div>");
                out.println("<a href='index.jsp' class='btn btn-primary'><span class='glyphicon glyphicon-home'></span> Login</button></a>");
            }
        
      out.write(" \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
