package com.lqw.ServletDemo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 继承HTTPServlet
 * 2018/09/15
 * Author:lqw
 */


public class LoginServlet extends HttpServlet {
    //service方法会处理请求类型，再调用doGet方法或doPost方法
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取servletContext对象，一个项目只有一个，全部servlet共享
        ServletContext servletContext =this.getServletContext();
        servletContext.setAttribute("a",1);
        int i = (Integer) servletContext.getAttribute("a");
        //向浏览器输出
        PrintWriter printWriter =resp.getWriter();
        printWriter.print("<h1>"+i+"</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
