package com.example.springbootkeycloak.example.employeeController;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



    @WebServlet("/jsp/login")

    //   @ServletSecurity(@HttpConstraint(transportGuarantee = TransportGuarantee.NONE, rolesAllowed = {}))
    public class WebLogin extends HttpServlet {
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            // Forward to the login page
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }

    }

