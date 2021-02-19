package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bookDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS/book.css\">\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    \n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    <div class=\"container\">\n");
      out.write("        \n");
      out.write("    <div>\n");
      out.write("       <p class=\"headAddress\"><a style=\"color: dimgray; text-decoration: none;\" href=\"#\">Home</a></p>\n");
      out.write("       <p class=\"headAddress\" style=\"color: dimgray; text-decoration: none; \">/</p>\n");
      out.write("       <p class=\"headAddress\"><a style=\"color: dimgray; text-decoration: none;\" href=\"#\">Category</a></p>\n");
      out.write("       <p class=\"headAddress\" style=\"color: dimgray; text-decoration: none;\">/</p>\n");
      out.write("       <p class=\"headAddress\"><a style=\"color: dimgray; text-decoration: none;\" href=\"#\">BookDetail</a></p>\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("    <div class=\"row\" style=\"margin-top: 1.5rem;\">\n");
      out.write("        <div class=\"col-md-5\" style=\"align-items: center;\">\n");
      out.write("            <img class=\"mx-auto d-block\" src=\"https://images-na.ssl-images-amazon.com/images/I/41TUQh5crpL._SX328_BO1,204,203,200_.jpg\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-7\" style = \"margin-top: 4rem;\">\n");
      out.write("            <h2>Competitive Programming 3</h2>\n");
      out.write("            <h3>Steven Halim, Felix Halim</h3>\n");
      out.write("            <span> 4.5/5</span>\n");
      out.write("            <div class=\"row\"  style=\"margin-top: 15px;\">\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <span>Give a Rating : </span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-8\">\n");
      out.write("            <form>\n");
      out.write("            <div class=\"rating\">\n");
      out.write("            <input id=\"star5\" name=\"star\" type=\"radio\" value=\"5\" class=\"radio-btn hide\" />\n");
      out.write("            <label for=\"star5\" >☆</label>\n");
      out.write("            <input id=\"star4\" name=\"star\" type=\"radio\" value=\"4\" class=\"radio-btn hide\" />\n");
      out.write("            <label for=\"star4\" >☆</label>\n");
      out.write("            <input id=\"star3\" name=\"star\" type=\"radio\" value=\"3\" class=\"radio-btn hide\" />\n");
      out.write("            <label for=\"star3\" >☆</label>\n");
      out.write("            <input id=\"star2\" name=\"star\" type=\"radio\" value=\"2\" class=\"radio-btn hide\" />\n");
      out.write("            <label for=\"star2\" >☆</label>\n");
      out.write("            <input id=\"star1\" name=\"star\" type=\"radio\" value=\"1\" class=\"radio-btn hide\" />\n");
      out.write("            <label for=\"star1\" >☆</label>\n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("        </div>\n");
      out.write("                \n");
      out.write("    </form>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("            <div class=\"row no-gutters\">\n");
      out.write("            <div class=\"col-md-2\"  style=\"margin-right: 0; padding-right: 0;\">\n");
      out.write("                <h4>Price :</h4>\n");
      out.write("                </div>\n");
      out.write("            <div class=\"col-md-1\"  style=\"margin-right: 0; padding-right: 0; text-align: end;\">\n");
      out.write("                <span>Tk. </span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\" >\n");
      out.write("                    <span>100</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <form class=\"row\" style=\"margin-top: 1.5rem;\">\n");
      out.write("                <div class=\"col-md-3\" style=\"margin-right: 0; padding-right: 0;\">\n");
      out.write("                    <input  id=\"addtocart\" type=\"submit\" id=\"addtocart\" value=\"ADD TO CART\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-8\" style=\"margin-left: 0; padding-left: 0;\">\n");
      out.write("                    <input  type=\"number\" value=\"1\" min=\"1\" class=\"input\" style=\"padding:0.5rem; width:100px; height: 50px; padding-left: 15px;\">\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </div>\n");
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
