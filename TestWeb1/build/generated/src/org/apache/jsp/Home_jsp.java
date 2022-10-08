package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      \n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <a href=\"\" class=\"logo\">\n");
      out.write("                <img src=\"assets/logo.png\" alt=\"\">\n");
      out.write("            </a>\n");
      out.write("            <div id=\"menu\">\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <a href=\"home\">Trang chủ</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <a href=\"\">Sản phẩm</a>\n");
      out.write("                </div>\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                 \n");
      out.write("             \n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <a href=\"https://www.facebook.com/profile.php?id=100084342767074\">Liên hệ</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <form action=\"search\" class=\"inner-form\" >\n");
      out.write("                <div class=\"input-field\">\n");
      out.write("                    <input id=\"search\" name=\"txt\" type=\"text\" placeholder=\"search\"  />\n");
      out.write("                    <button class=\"btn-search\" type=\"submit\">\n");
      out.write("                      <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\">\n");
      out.write("                        <path d=\"M15.5 14h-.79l-.28-.27C15.41 12.59 16 11.11 16 9.5 16 5.91 13.09 3 9.5 3S3 5.91 3 9.5 5.91 16 9.5 16c1.61 0 3.09-.59 4.23-1.57l.27.28v.79l5 4.99L20.49 19l-4.99-5zm-6 0C7.01 14 5 11.99 5 9.5S7.01 5 9.5 5 14 7.01 14 9.5 11.99 14 9.5 14z\"></path>\n");
      out.write("                      </svg>\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <div id=\"actions\">\n");
      out.write("                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <a href=\"Cart.jsp\"><img src=\"assets/cart.png\" alt=\"\"></a>\n");
      out.write("                </div>\n");
      out.write("               ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                 \n");
      out.write("                ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"banner\">\n");
      out.write("            <div class=\"box-left\">\n");
      out.write("                <h2>\n");
      out.write("                    <span>THỨC ĂN</span>\n");
      out.write("                    <br>\n");
      out.write("                    <span>THƯỢNG HẠNG</span>\n");
      out.write("                </h2>\n");
      out.write("                <p>Chuyên cung cấp các món ăn đảm bảo dinh dưỡng\n");
      out.write("                    hợp vệ sinh đến người dùng,phục vụ người dùng 1 cái\n");
      out.write("                    hoàn hảo nhất</p>\n");
      out.write("                <button>Mua ngay</button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"box-right\">\n");
      out.write("                <img src=\"assets/img_1.png\" alt=\"\">\n");
      out.write("                <img src=\"assets/img_2.png\" alt=\"\">\n");
      out.write("                <img src=\"assets/img_3.png\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"to-bottom\">\n");
      out.write("                <a href=\"\">\n");
      out.write("                    <img src=\"assets/to_bottom.png\" alt=\"\">\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"wp-products\">\n");
      out.write("            <h2>SẢN PHẨM CỦA CHÚNG TÔI</h2>\n");
      out.write("            <ul id=\"list-products\">\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                \n");
      out.write("            </ul>\n");
      out.write("            <div class=\"list-page\">\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <a href=\"\">1</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <a href=\"\">2</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <a href=\"\">3</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <a href=\"\">4</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"saleoff\">\n");
      out.write("            <div class=\"box-left\">\n");
      out.write("                <h1>\n");
      out.write("                    <span>GIẢM GIÁ LÊN ĐẾN</span>\n");
      out.write("                    <span>45%</span>\n");
      out.write("                </h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"box-right\"></div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"comment\">\n");
      out.write("            <h2>NHẬN XÉT CỦA KHÁCH HÀNG</h2>\n");
      out.write("            <div id=\"comment-body\">\n");
      out.write("                <div class=\"prev\">\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <img src=\"assets/prev.png\" alt=\"\">\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <ul id=\"list-comment\">\n");
      out.write("                    <li class=\"item\">\n");
      out.write("                        <div class=\"avatar\">\n");
      out.write("                            <img src=\"assets/avatar_1.png\" alt=\"\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"stars\">\n");
      out.write("                            <span>\n");
      out.write("                                <img src=\"assets/star.png\" alt=\"\">\n");
      out.write("                            </span>\n");
      out.write("                            <span>\n");
      out.write("                                <img src=\"assets/star.png\" alt=\"\">\n");
      out.write("                            </span>\n");
      out.write("                            <span>\n");
      out.write("                                <img src=\"assets/star.png\" alt=\"\">\n");
      out.write("                            </span>\n");
      out.write("                            <span>\n");
      out.write("                                <img src=\"assets/star.png\" alt=\"\">\n");
      out.write("                            </span>\n");
      out.write("                            <span>\n");
      out.write("                                <img src=\"assets/star.png\" alt=\"\">\n");
      out.write("                            </span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"name\">Nguyễn Đình Vũ</div>\n");
      out.write("\n");
      out.write("                        <div class=\"text\">\n");
      out.write("                            <p>Lorem Ipsum is simply dummy text of the printing and\n");
      out.write("                                typesetting industry. Lorem Ipsum has been the industry's\n");
      out.write("                                standard dummy text ever since the 1500s, when an unknown\n");
      out.write("                                printer took a galley of type and scrambled it to make a type\n");
      out.write("                                specimen book.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"item\">\n");
      out.write("                        <div class=\"avatar\">\n");
      out.write("                            <img src=\"assets/avatar_1.png\" alt=\"\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"stars\">\n");
      out.write("                            <span>\n");
      out.write("                                <img src=\"assets/star.png\" alt=\"\">\n");
      out.write("                            </span>\n");
      out.write("                            <span>\n");
      out.write("                                <img src=\"assets/star.png\" alt=\"\">\n");
      out.write("                            </span>\n");
      out.write("                            <span>\n");
      out.write("                                <img src=\"assets/star.png\" alt=\"\">\n");
      out.write("                            </span>\n");
      out.write("                            <span>\n");
      out.write("                                <img src=\"assets/star.png\" alt=\"\">\n");
      out.write("                            </span>\n");
      out.write("                            <span>\n");
      out.write("                                <img src=\"assets/star.png\" alt=\"\">\n");
      out.write("                            </span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"name\">Trần Ngọc Sơn</div>\n");
      out.write("\n");
      out.write("                        <div class=\"text\">\n");
      out.write("                            <p>Lorem Ipsum is simply dummy text of the printing and\n");
      out.write("                                typesetting industry. Lorem Ipsum has been the industry's\n");
      out.write("                                standard dummy text ever since the 1500s, when an unknown\n");
      out.write("                                printer took a galley of type and scrambled it to make a type\n");
      out.write("                                specimen book.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"item\">\n");
      out.write("                        <div class=\"avatar\">\n");
      out.write("                            <img src=\"assets/avatar_1.png\" alt=\"\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"stars\">\n");
      out.write("                            <span>\n");
      out.write("                                <img src=\"assets/star.png\" alt=\"\">\n");
      out.write("                            </span>\n");
      out.write("                            <span>\n");
      out.write("                                <img src=\"assets/star.png\" alt=\"\">\n");
      out.write("                            </span>\n");
      out.write("                            <span>\n");
      out.write("                                <img src=\"assets/star.png\" alt=\"\">\n");
      out.write("                            </span>\n");
      out.write("                            <span>\n");
      out.write("                                <img src=\"assets/star.png\" alt=\"\">\n");
      out.write("                            </span>\n");
      out.write("                            <span>\n");
      out.write("                                <img src=\"assets/star.png\" alt=\"\">\n");
      out.write("                            </span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"name\">Nguyễn Trần Vi</div>\n");
      out.write("\n");
      out.write("                        <div class=\"text\">\n");
      out.write("                            <p>Lorem Ipsum is simply dummy text of the printing and\n");
      out.write("                                typesetting industry. Lorem Ipsum has been the industry's\n");
      out.write("                                standard dummy text ever since the 1500s, when an unknown\n");
      out.write("                                printer took a galley of type and scrambled it to make a type\n");
      out.write("                                specimen book.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <div class=\"next\">\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <img src=\"assets/next.png\" alt=\"\">\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"footer\">\n");
      out.write("            <div class=\"box\">\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <img src=\"assets/logo.png\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("                <p>Cung cấp sản phẩm với chất lượng an toàn cho quý khách</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"box\">\n");
      out.write("                <h3>NỘI DUNG</h3>\n");
      out.write("                <ul class=\"quick-menu\">\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <a href=\"\">Trang chủ</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <a href=\"\">Sản phẩm</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <a href=\"\">Blog</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <a href=\"\">Liên hệ</a>\n");
      out.write("                    </div>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"box\">\n");
      out.write("                <h3>LIÊN HỆ</h3>\n");
      out.write("                <form action=\"\">\n");
      out.write("                    <input type=\"text\" placeholder=\"Địa chỉ email\">\n");
      out.write("                    <button>Nhận tin</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("        <script src=\"JS/script.js\"></script>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listCC}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                     <div class=\"item\">\n");
          out.write("                    <a href=\"Category?cid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                </div>\n");
          out.write("                    \n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <div class=\"item\">\n");
        out.write("                        <a href=\"#\" style=\"color: black\">Hello, ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\n");
        out.write("                </div>\n");
        out.write("                        <div class=\"item\">\n");
        out.write("                    <a href=\"logout\" style=\"color: black\"><img src=\"assets/user.png\" alt=\"\"> Logout</a>\n");
        out.write("                </div>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <div class=\"item\">\n");
        out.write("                        <a href=\"Login.jsp\" style=\"color: black\"><img src=\"assets/user.png\" alt=\"\"> Login</a>\n");
        out.write("                    </div>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isAdmin == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <div class=\"item\">\n");
        out.write("                        <a href=\"#\" style=\"color: black\">Manager Account</a>\n");
        out.write("                </div>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isSell == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <div class=\"item\">\n");
        out.write("                        <a href=\"manager\" style=\"color: black\">Manager Product</a>\n");
        out.write("                </div>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listP}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("o");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \n");
          out.write("                    <div class=\"item\">\n");
          out.write("                   \n");
          out.write("                        <img style=\"width: 256px;height: 174px\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\n");
          out.write("                    <div class=\"stars\">\n");
          out.write("                        <span>\n");
          out.write("                            <img src=\"assets/star.png\" alt=\"\">\n");
          out.write("                        </span>\n");
          out.write("                        <span>\n");
          out.write("                            <img src=\"assets/star.png\" alt=\"\">\n");
          out.write("                        </span>\n");
          out.write("                        <span>\n");
          out.write("                            <img src=\"assets/star.png\" alt=\"\">\n");
          out.write("                        </span>\n");
          out.write("                        <span>\n");
          out.write("                            <img src=\"assets/star.png\" alt=\"\">\n");
          out.write("                        </span>\n");
          out.write("                        <span>\n");
          out.write("                            <img src=\"assets/star.png\" alt=\"\">\n");
          out.write("                        </span>\n");
          out.write("                    </div>\n");
          out.write("                    <div class=\"name\"> <a href=\"Detail?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" title=\"View Product\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a> </div>\n");
          out.write("                    <div class=\"desc\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\n");
          out.write("                    <div class=\"price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" $</div>\n");
          out.write("                   \n");
          out.write("                    \n");
          out.write("                    </div>\n");
          out.write("                \n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
