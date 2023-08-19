package javaWeb.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/hello10")
public class HelloController10 extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //cara membuat cookie
        String cookieName = req.getParameter("name");
        String cookieValue = req.getParameter("value");
        Cookie cookie = new Cookie(cookieName, cookieValue);
        cookie.setPath("/");
        cookie.setMaxAge(60);//delete cookie
        resp.addCookie(cookie);
        resp.getWriter().println("cookie " + cookieName + " with value " + cookieValue + " has added");
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getCookies() != null) {
            for (Cookie cookie : req.getCookies()) {
                resp.getWriter().println("cookie name " + cookie.getName() + " value " + cookie.getValue());
            }
        } else {
            resp.getWriter().println("there not an cookie");
        }
    }

}
