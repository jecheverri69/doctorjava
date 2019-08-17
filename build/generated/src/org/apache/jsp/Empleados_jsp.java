package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Empleados_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-2.1.3.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css\" integrity=\"sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"mycss/miestilo.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js\" integrity=\"sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--fontawesome-->\n");
      out.write("\n");
      out.write("        <script defer src=\"https://use.fontawesome.com/releases/v5.0.13/js/all.js\" integrity=\"sha384-xymdQtn1n3lH2wcu0qhcdaOpQwyoarkgLVxC/wZ5q7h9gHtxICrpcaSUfygqZGOe\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"d-flex\">\n");
      out.write("            <div class=\"card col-sm-6\" >\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <form action=\"Controlador?menu=Empleados\"   method=\"POST\" >\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Cedula</label>\n");
      out.write("                            <input type=\"text\" name=\"txtcedula\"  class=\"form-control\">                            \n");
      out.write("                        </div>\n");
      out.write("                      \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Nombres</label>\n");
      out.write("                            <input type=\"text\" name=\"txtnombre\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${uu.getUsuario()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\">                            \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Contraseña</label>\n");
      out.write("                            <input type=\"text\" name=\"txtpass\" class=\"form-control\">                            \n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Rol</label><br>\n");
      out.write("                            <select name=\"Rol\">\n");
      out.write("\n");
      out.write("                                <option value=\"true\">Admin</option>\n");
      out.write("                                <option value=\"false\">Empleado</option>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </select>                          \n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"submit\" name=\"accion\" value=\"Agregar\" class=\"btn btn-info\">                        \n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("                        <div class=\"col-sm-7\" style=\"border: #000\">\n");
      out.write("                <table class=\"table text-hover\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Cedula</th>\n");
      out.write("                            <th>Nombre</th>\n");
      out.write("                            <th>Rol</th>\n");
      out.write("                            <th>Acciones</th>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setVar("em");
      _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empleados}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                            <tr>\n");
            out.write("                                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${em.getCedula()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${em.getUsuario()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                                <td>");
 
                                     System.out.println(Boolean.parseBoolean(request.getParameter("Rol")));
                                    if(Boolean.parseBoolean(request.getParameter("Rol"))){
            out.write("\n");
            out.write("                                    <img src=\"img/unnamed.png\" alt=\"barman\"> \n");
            out.write("                                    ");
}else if(Boolean.parseBoolean(request.getParameter("Rol"))==false){
            out.write("<img src=\"img/administrador.png\" alt=\"admin\">");
}
                                    
            out.write("\n");
            out.write("                                </td>   \n");
            out.write("                                <td>\n");
            out.write("                                    <a class=\"btn btn-warning\" href=\"Controlador?menu=Empleados&accion=Editar&cedula=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${em.getCedula()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write(">Editar</a>\n");
            out.write("                                    <a class=\"btn btn-danger\"href=\"Controlador?menu=Empleados&accion=Delete&cedula=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${em.getCedula()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write(" >Delete</a>\n");
            out.write("                                </td>\n");
            out.write("                            </tr>\n");
            out.write("                        ");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("                ");
 boolean a=Boolean.parseBoolean(request.getParameter("Rol"));
                System.out.println("soy "+a);
                
      out.write("\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>      \n");
      out.write("\n");
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
