package javaWeb.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(urlPatterns = "/hello11")
public class HelloController11 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //cara membuat session
        String username = req.getParameter("username");
        HttpSession session = req.getSession(true);
        session.setAttribute("username", username);
        resp.getWriter().println("login with username " + username + " successfully");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(true);
        String username = (String) session.getAttribute("username");
        if (username != null) {
            resp.getWriter().println("session data username is " + username);
        } else {
            resp.getWriter().println("session data username is null");
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //cara hapus session
        HttpSession session = req.getSession(true);
        session.removeAttribute(req.getParameter("attribute-username"));//hapus satu session melalui nama attribute session nya
        if (req.getParameter("attribute-username") == null) {
            session.invalidate();//hapus semua session sekaligus.
        }
    }
}
