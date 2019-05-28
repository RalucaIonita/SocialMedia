package webMethods;

import models.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "webMethods.Methods")
public class Methods extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        HttpSession session = request.getSession();
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        try {
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String firstName = request.getParameter("first_name");
            String lastName = request.getParameter("last_name");
            String username = request.getParameter("username");

            out.println(email + password + firstName + lastName + username);

            User newUser = new User(email, password, firstName, lastName, username);

            Admin.getInstance().addUser(newUser);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        response.sendRedirect("http://localhost:8080/SocialMedia_war_exploded/create_account.jsp");

    }

}
