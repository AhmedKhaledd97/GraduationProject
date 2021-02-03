package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EditProfilee_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"csss/style.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"csss2/style.css\"/>  \n");
      out.write("        <link rel=\"stylesheet\" href=\"csss/hover.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"csss/animate.min.css\"/>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Raleway\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("         <!--[if lt IE 9]>\n");
      out.write("            <script src=\"js/html5shiv.min.js\"></script>\n");
      out.write("            <script src=\"js/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("      <!--start navbar -->\n");
      out.write("      <nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("          <div class=\"navbar-header\">\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("              <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("              <span class=\"icon-bar\"></span>\n");
      out.write("              <span class=\"icon-bar\"></span>\n");
      out.write("              <span class=\"icon-bar\"></span>\n");
      out.write("            </button>\n");
      out.write("            <a class=\"navbar-brand hvr-grow wow bounce\" data-wow-duration=\"2s\" href=\"index.html\">CO<span>MM</span>UNITY</a>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <a href=\"profile-page.html\" class=\"back\">\n");
      out.write("            <i class=\"fas fa-chevron-left\"></i> Back\n");
      out.write("          </a> \n");
      out.write("          \n");
      out.write("        </div><!-- /.container-fluid -->\n");
      out.write("      </nav>\n");
      out.write("    <!--end navbar -->\n");
      out.write("\n");
      out.write("    <!--start edit-->\n");
      out.write("\n");
      out.write("    <div class=\"register\">\n");
      out.write("        <form class=\"form text-center\">\n");
      out.write("            <i class=\"fas fa-pencil-alt\"></i>\n");
      out.write("            <h2 class=\"text-center\">Edit Your Info</h2> \n");
      out.write("\n");
      out.write("            <div class=\"upload-image\">\n");
      out.write("              <label>Choose a profile picture:</label>\n");
      out.write("              <input type=\"file\" accept=\"image/png, image/jpeg\">\n");
      out.write("          </div>\n");
      out.write("            <input type=\"text\" placeholder=\"First name\">\n");
      out.write("            <input type=\"text\" placeholder=\"Last name\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            \n");
      out.write("        <div class=\"drop-downs\">\n");
      out.write("\n");
      out.write("\n");
      out.write("          <select class=\"job-specialization\">\n");
      out.write("              <option value=\"Dentistry\">Dentistry</option>\n");
      out.write("              <option value=\"Brain\">Neurology</option>\n");
      out.write("              <option value=\"Child\">Pediatrics and New Born</option>\n");
      out.write("              <option value=\"Bones\">Orthopedics(Bones)</option>\n");
      out.write("              <option value=\"Ear\">Ear, Nose and Throat</option>\n");
      out.write("          </select>\n");
      out.write("\n");
      out.write("          <select class=\"job-location\">\n");
      out.write("            <option value=\"Zagazig\">Zagazig</option>\n");
      out.write("            <option value=\"Minya\">Minya el Qamh</option>\n");
      out.write("            <option value=\"Belbes\">Belbes</option>\n");
      out.write("            <option value=\"Hammad\">Abou Hammad</option>\n");
      out.write("            <option value=\"Faqus\">Faqus</option>\n");
      out.write("          </select>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("            <input type=\"text\" placeholder=\"Specialization\" >\n");
      out.write("            <input type=\"text\" placeholder=\"Fees\" >\n");
      out.write("            <input type=\"text\" placeholder=\"Address\" >\n");
      out.write("            <input type=\"number\" placeholder=\"Phone Number\" >\n");
      out.write("            <input type=\"email\"  placeholder=\"Email address\" readonly>\n");
      out.write("            <input type=\"password\" placeholder=\"Password\">\n");
      out.write("            <input type=\"submit\" value=\"Update\">\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!--end edit-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script\n");
      out.write("        src=\"https://code.jquery.com/jquery-1.12.0.min.js\"\n");
      out.write("        integrity=\"sha256-Xxq2X+KtazgaGuA2cWR1v3jJsuMJUozyIXDB3e793L8=\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"jsss/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"jsss/file.js\"></script>\n");
      out.write("        <script src=\"jsss/wow.min.js\"></script>\n");
      out.write("        <script src=\"jsss/jquery.nicescroll.min.js\"></script>\n");
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
