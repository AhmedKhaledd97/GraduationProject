package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DBClass.DB;
import java.sql.ResultSet;
import DBClass.DB;

public final class resultEng_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


             String specialist="";
             String location = "";
             ResultSet set = null;
         
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
      response.setContentType("text/html");
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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <!-- IE compatbility meta-->\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <!--first mobile meta-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Community</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\"/> \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\" integrity=\"sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\"/> \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/hover.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.min.css\"/>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Raleway\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("         <!--[if lt IE 9]>\n");
      out.write("            <script src=\"js/html5shiv.min.js\"></script>\n");
      out.write("            <script src=\"js/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("         ");
      out.write("\n");
      out.write("         ");

             DB db = new DB();
             specialist = (String)request.getAttribute("sppDoc");
             location = (String) request.getAttribute("loccDoc");
             set = db.selectbyWhereEng(specialist, location);
         
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("      <!--start navbar -->\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("              <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("              <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("                  <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                  <span class=\"icon-bar\"></span>\n");
      out.write("                  <span class=\"icon-bar\"></span>\n");
      out.write("                  <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand hvr-grow wow bounce\" data-wow-duration=\"2s\" href=\"../index.html\">CO<span>MM</span>UNITY</a>\n");
      out.write("                <input type=\"search\" placeholder=\"Search Persons (e.g. Dentist in Zagazig)\">\n");
      out.write("              </div>\n");
      out.write("          \n");
      out.write("              <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("              <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\"  id=\"#persons\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Persons<span class=\"caret\"></span></a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                          <li><a href=\"Doctors.html\">Doctors</a></li>\n");
      out.write("                          <li><a href=\"../Teachers/Teachers.html\">Teachers</a></li>\n");
      out.write("                          <li><a href=\"../Engineers/Engineers.html\">Engineers</a></li>\n");
      out.write("                          <li><a href=\"../Lawyers/Lawyers.html\">lawyers</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                      </li>\n");
      out.write("                  <li class=\"active\"><a href=\"../index.html\">Home<span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("                  <li><a href=\"../login.html\">Login</a></li>\n");
      out.write("                  <li><a href=\"../register.html\">Register</a></li>\n");
      out.write("                </ul>\n");
      out.write("        \n");
      out.write("              </div><!-- /.navbar-collapse -->\n");
      out.write("            </div><!-- /.container-fluid -->\n");
      out.write("          </nav>\n");
      out.write("        <!--end navbar -->\n");
      out.write("\n");
      out.write("        <!-- start person body-->\n");
      out.write("          <section class=\"person-in-city\">\n");
      out.write("           <div class=\"container\">\n");
      out.write("           \n");
      out.write("             <h2>Best Dentists In Minya el Qamh .. </h2>\n");
      out.write("             \n");
      out.write("             ");
while (set.next()) {
      out.write("\n");
      out.write("             <div class=\"person\">\n");
      out.write("               <img src=\"imagees/");
      out.print( set.getString("nimage") );
      out.write("\">\n");
      out.write("               <span>Doctor</span> <span> ");
      out.print(set.getString("fname"));
      out.write(" &nbsp; ");
      out.print(set.getString("lname"));
      out.write(" </span>\n");
      out.write("               <ul>\n");
      out.write("                   <li>");
      out.print( set.getString("specialist"));
      out.write("</li>\n");
      out.write("                   <li>");
      out.print( set.getString("Adress"));
      out.write("</li>\n");
      out.write("                   <li>");
      out.print( set.getString("price"));
      out.write("</li>\n");
      out.write("                   <li>");
      out.print(set.getString("phone"));
      out.write("</li>\n");
      out.write("               </ul>\n");
      out.write("             </div>\n");
      out.write("             ");
} 
      out.write("\n");
      out.write("            \n");
      out.write("             \n");
      out.write("           \n");
      out.write("           \n");
      out.write("          </div>\n");
      out.write("          </section>\n");
      out.write("        <!-- end person body-->\n");
      out.write("          \n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--start section footer-->\n");
      out.write("         <section class=\"copyright text-center\">\n");
      out.write("          <p class=\"lead\">copyright &copy; 2019 <span>Community</span></p> \n");
      out.write("         </section>\n");
      out.write("        <!--end section footer-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script\n");
      out.write("        src=\"https://code.jquery.com/jquery-1.12.0.min.js\"\n");
      out.write("        integrity=\"sha256-Xxq2X+KtazgaGuA2cWR1v3jJsuMJUozyIXDB3e793L8=\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/file.js\"></script>\n");
      out.write("        <script src=\"js/wow.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.nicescroll.min.js\"></script>\n");
      out.write("        <script> new WOW().init(); </script>\n");
      out.write("    </body>\n");
      out.write("</html> \n");
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
