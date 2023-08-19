package javaWeb.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import javaWeb.entities.Person;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Map;

@WebServlet(urlPatterns = "/hello4")
public class HelloController4 extends HttpServlet {
    public final ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Person person = this.objectMapper().readValue(req.getReader(), Person.class);
        Map<String, Object> response = Map.of(
                "name", person.getName(),
                "address", person.getAddress());
        String json = this.objectMapper().writeValueAsString(response);
        resp.getWriter().println(json);

    }
}
