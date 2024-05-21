package com.chopchop;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class servlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        //System.out.println("The servlet is working!!");

        res.setContentType("text/html");

        PrintWriter out=res.getWriter();
        out.println("<h1><b>Hello World!</b></h1>");
    }
}