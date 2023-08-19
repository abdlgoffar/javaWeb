package javaWeb.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/hello5")
public class HelloController5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String json = """
                {
                    "name": "abdul goffar",
                    "address": "jl. jaksa agung suprapto"
                }
                """;
        resp.setHeader("Content-Type", "application/json");
        resp.getWriter().println(json);
    }
}
