<%@ page import="models.*" %>
<%--
  Created by IntelliJ IDEA.
  User: Panda
  Date: 5/27/2019
  Time: 1:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>




<html>
<head>
    <style>
        * {
            margin: 0;
            padding: 0;
        }
        .imgbox {
            display: grid;
            height: 100%;
            position: relative;
        }

        .center
        {
            left: 50%;
            top: 50%;
            margin-left: -115px;
            margin-top: -125px;
            width: 175px;
            text-align: center;
            position: absolute;
        }








        #background {
            width: 100%;
            height: 100%;
            position: fixed;
            left: 0px;
            top: 0px;
            z-index: -1; /* Ensure div tag stays behind content; -999 might work, too. */
        }

        .stretch {
            width:100%;
            height:100%;
        }


    </style>
</head>
<body>


<div id="background">
    <img src="trees.png" class="stretch" alt="" />
</div>



<div class = "center">
    <form method = "get">

        First name <input type="text" name="first_name" id = "first_name" required><br><br>
        Last name <input type="text" name="last_name" id = "last_name" required><br><br>
        Username <input type="text" name="username" id = "username" required><br><br>
        Email <input type="text" name="email" id = "email" required><br><br>
        Password <input type="password" name="password" id = "password" required><br>
        <br>
        <input type="submit" value="Submit">
        <br>
    </form>
        <%
                String email = request.getParameter("email");
                out.print(email);
                String password = request.getParameter("password");
                String firstName = request.getParameter("first_name");
                String lastName = request.getParameter("last_name");
                String username = request.getParameter("username");

                User newUser = new User(email, password, firstName, lastName, username);

                out.println(newUser);
                try {
                    out.println(email + password + firstName + lastName + username);
                    if(email != null)
                    Admin.getInstance().addUser(newUser);
                    if(email != null)
                        request.getRequestDispatcher("index.jsp").forward(request, response);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
        %>


    <a href="index.jsp"> Already have an account? </a>

</div>

</body>
</html>