/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.53
 * Generated at: 2020-05-22 04:39:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminPanel_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Perfect One || Admin Panel</title>\r\n");

	//In case, if Editor session is not set, redirect to Login page
	if ((request.getSession(false).getAttribute("Admin") == null)) {

      out.write('\r');
      out.write('\n');
      if (true) {
        _jspx_page_context.forward("/Login.jsp");
        return;
      }
      out.write('\r');
      out.write('\n');

	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"icon\" href=\"img/favicon.png\">\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("<!-- animate CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/animate.css\">\r\n");
      out.write("<!-- owl carousel CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\r\n");
      out.write("<!-- themify CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/themify-icons.css\">\r\n");
      out.write("<!-- flaticon CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/flaticon.css\">\r\n");
      out.write("<!-- font awesome CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\r\n");
      out.write("<!-- swiper CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/swiper.min.css\">\r\n");
      out.write("<!-- style CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/registration.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/panel.css\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!--::header part start::-->\r\n");
      out.write("\t<header class=\"header_area\">\r\n");
      out.write("\t\t<div class=\"sub_header\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row align-items-center\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 col-xl-6\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"logo\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"Home.jsp\"><img src=\"img/logo.png\" alt=\"\" title=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-8 col-xl-6\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"sub_header_social_icon float-right\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><i class=\"flaticon-phone\"></i>+94 777 123 456</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div style=\"text-align: right\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/LogoutServlet\">Logout</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"main_menu\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t\t\t<nav class=\"navbar navbar-expand-lg navbar-light\">\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"navbar-toggler\" type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-toggle=\"collapse\" data-target=\"#navbarSupportedContent\"\r\n");
      out.write("\t\t\t\t\t\t\t\taria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("\t\t\t\t\t\t\t\taria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item active\"><a class=\"nav-link active\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"Home.jsp\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item\"><a href=\"gallery.jsp\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"nav-link\">gallery</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item dropdown\"><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\taria-expanded=\"false\"> Pages </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"elements.jsp\">Elements</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item\"><a href=\"about.jsp\" class=\"nav-link\">About\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tus</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item\"><a href=\"Contact.jsp\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"nav-link\">Contact</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"header_social_icon d-none d-lg-block\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"ti-facebook\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> <i class=\"ti-twitter\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"ti-instagram\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"ti-skype\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"header_social_icon d-block d-lg-none\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"ti-facebook\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"> <i class=\"ti-twitter\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"ti-instagram\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"ti-skype\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t<!-- Header part end-->\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("                <div class=\"note\">\r\n");
      out.write("                    <p style=\"color:white;font-size:25pt;\">Admin Panel</p>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"container register-form\">\r\n");
      out.write("\t\t\t<div class=\"form-content\">\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"row\">\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6\">\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\t\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"ListUsers.jsp\">User Management</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\t\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"container register-form\">\r\n");
      out.write("\t\t\t<div class=\"form-content\">\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"row\">\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6\">\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\t\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"url\">Package Management</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\t\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"container register-form\">\r\n");
      out.write("\t\t\t<div class=\"form-content\">\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"row\">\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6\">\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\t\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"url\">Supplier Management</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\t\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<footer class=\"copyright_part\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row align-items-center\">\r\n");
      out.write("\t\t\t\t<p class=\"footer-text m-0 col-lg-8 col-md-12\">\r\n");
      out.write("\t\t\t\t\tCopyright &copy;\r\n");
      out.write("\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\tdocument.write(new Date().getFullYear());\r\n");
      out.write("\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\tAll rights reserved | Perfectone.lk\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\tclass=\"col-lg-4 col-md-12 text-center text-lg-right footer-social\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\"><i class=\"ti-facebook\"></i></a> <a href=\"#\"> <i\r\n");
      out.write("\t\t\t\t\t\tclass=\"ti-twitter\"></i>\r\n");
      out.write("\t\t\t\t\t</a> <a href=\"#\"><i class=\"ti-instagram\"></i></a> <a href=\"#\"><i\r\n");
      out.write("\t\t\t\t\t\tclass=\"ti-skype\"></i></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("\t<!-- footer part end-->\r\n");
      out.write("\r\n");
      out.write("\t<!-- jquery plugins here-->\r\n");
      out.write("\t<!-- jquery -->\r\n");
      out.write("\t<script src=\"js/jquery-1.12.1.min.js\"></script>\r\n");
      out.write("\t<!-- popper js -->\r\n");
      out.write("\t<script src=\"js/popper.min.js\"></script>\r\n");
      out.write("\t<!-- bootstrap js -->\r\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<!-- aos js -->\r\n");
      out.write("\t<script src=\"js/aos.js\"></script>\r\n");
      out.write("\t<!-- easing js -->\r\n");
      out.write("\t<script src=\"js/jquery.magnific-popup.js\"></script>\r\n");
      out.write("\t<!-- swiper js -->\r\n");
      out.write("\t<script src=\"js/masonry.pkgd.js\"></script>\r\n");
      out.write("\t<!-- particles js -->\r\n");
      out.write("\t<script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("\t<!-- carousel js -->\r\n");
      out.write("\t<script src=\"js/swiper.min.js\"></script>\r\n");
      out.write("\t<!-- custom js -->\r\n");
      out.write("\t<script src=\"js/custom.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
