<%@ page import="models.Admin" %>

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
      width: 200px;
      text-align: center;
      position: absolute;
    }


    .center_hyperlink
    {
      left: 50%;
      top: 50%;
      margin-left: -115px;
      margin-top: -125px;
      width: 200px;
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
  <form method="get">
    Username <input type="text" name="username" id = "username"><br><br>
    Password <input type="password" name="password" id = "password"><br>
    <br>

    <input type="submit" value="Submit">

  </form>
  <%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    try {
      if (Admin.getInstance().searchByUsername(username))
      {
        request.getRequestDispatcher("profile.jsp").forward(request, response);
        out.println("Cont gasit");
      }
        else
      {
        out.println("Username invalid");
      }
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  %>
  <br>

  <a href="create_account.jsp"> Don't have an account? </a>

</div>


</body>
</html>