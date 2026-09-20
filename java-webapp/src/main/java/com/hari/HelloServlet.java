package com.hari;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        response.getWriter().println(
            "<html>" +
            "<body>" +
            "<h1>Hello from Java Web Application!</h1>" +
            "<h2>Running on Tomcat 9 + Java 17</h2>" +
            "</body>" +
            "</html>"
        );
    }
}