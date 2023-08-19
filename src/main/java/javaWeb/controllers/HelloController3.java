package javaWeb.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/hello3")
public class HelloController3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("method " + req.getMethod());
        resp.getWriter().println("query string " + req.getQueryString());
        resp.getWriter().println("request url " + req.getRequestURI());
        resp.getWriter().println("context path " + req.getContextPath());
    }
}
