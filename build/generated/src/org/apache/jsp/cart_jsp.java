package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<header>\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS/details_cart.css\">\n");
      out.write("</header>\n");
      out.write("<body>\n");
      out.write("    <div  style=\"padding-left: 6rem; padding-top: 4rem;\">\n");
      out.write("       <p class=\"headAddress\"><a style=\"color: dimgray;\" href=\"#\">Home</a></p>\n");
      out.write("       <p class=\"headAddress\" style=\"color: dimgray;\">/</p>\n");
      out.write("       <p class=\"headAddress\"><a style=\"color: dimgray;\" href=\"#\">Cart</a></p>\n");
      out.write("    </div>\n");
      out.write("    <h2 style=\"padding-left: 6rem\">Cart Details</h2>\n");
      out.write("<div class=\"container\" style=\"padding: 6rem; padding-top: 0;\">\n");
      out.write("                \n");
      out.write("                <div class=\"table-responsive\">\n");
      out.write("\t\t\t\t<table class=\"table table-bordered\" style=\"border: 1px solid black; border-collapse:collapse; text-align:center;\" width =\"100%\">\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<th width=\"30%\" style=\"border: 1px solid black; padding: 8px; font-size: 18px;\">Book Name</th>\n");
      out.write("                        <th width=\"30%\" style=\"border: 1px solid black; padding: 8px;font-size: 18px;\">Author Name</th>\n");
      out.write("\t\t\t\t\t\t<th width=\"20%\" style=\"border: 1px solid black; padding: 8px;font-size: 18px;\">Quantity</th>\n");
      out.write("\t\t\t\t\t\t<th width=\"20%\" style=\"border: 1px solid black; padding: 8px;font-size: 18px;\">Price</th>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td style=\"border: 1px solid black; padding: 4px; font-size: 15px;\">Book1</td>\n");
      out.write("\t\t\t\t\t\t<td style=\"border: 1px solid black; padding: 4px; font-size: 15px;\">Humayun Ahmed</td>\n");
      out.write("\t\t\t\t\t\t<td style=\"border: 1px solid black; padding: 4px; font-size: 15px;\">1</td>\n");
      out.write("\t\t\t\t\t\t<td style=\"border: 1px solid black; padding: 4px; font-size: 15px;\">120</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t</table>\n");
      out.write("\t\t\t</div>\n");
      out.write("            <div style=\"margin-top: 2rem;margin-bottom: 2rem;\">\n");
      out.write("            <h2 class=\"headAddress\">Total Price: </h2>\n");
      out.write("            <h3 id=\"totalAmount\" class=\"headAddress\" style=\"align-self: center\">120</h3>\n");
      out.write("            </div>\n");
      out.write("    \n");
      out.write("            <a class=\"continue\" href=\"#\">Continue To Buy</a>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
