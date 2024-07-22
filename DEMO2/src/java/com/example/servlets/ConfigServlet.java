package com.example.servlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "ConfigServlet", urlPatterns = {"/config"})
public class ConfigServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Display the form for user input
        request.getRequestDispatcher("/configForm.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve form parameters
        String name = request.getParameter("name");
        String email = request.getParameter("email");

        // Set attributes to be used in JSP
        request.setAttribute("name", name);
        request.setAttribute("email", email);

        // Forward the request to the JSP for displaying the results
        request.getRequestDispatcher("/configResult.jsp").forward(request, response);
    }
}
