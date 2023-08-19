package javaWeb.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
//disini untuk mengetes bahwa class controller itu singleton, maka dibutuhkan java thread untuk menunda beberapa detik eksekusi http request dari browser
//ketika running web app di browser.
@WebServlet(urlPatterns = "/hello2")
public class HelloController2 extends HttpServlet {
    private String response = "";

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");//request url parameter for response data
        Long sleep = Long.parseLong(req.getParameter("sleep"));//request url parameter for await or sleep

        //sleep used to stop the execution of the program code below/ atau berhenti sejenak eksekusi code program, jadi code program di bawah statement
        //thread sleep tidak akan di eksekusi dahulu samapai waktu yang di tentukan pada statement thread sleep;
        this.response = "Hello " + name;
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        resp.getWriter().println(this.response);//response data
    }
}
