package com.lqw.ServletDemo;

import javax.servlet.*;
import java.io.IOException;

/**
 * 实现最原始的Servlet接口
 * 2018/09/15
 * Author:lqw
 */


public class OriginalServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
