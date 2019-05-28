<%--
  Created by IntelliJ IDEA.
  User: Panda
  Date: 5/26/2019
  Time: 7:30 PM
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
  <form action="profile.jsp" method="post">
    Username <input type="text" name="username" id = "usernameInput"><br><br>
    Password <input type="password" name="password" id = "passwordInput"><br>
    <br>

    <input type="submit" value="Submit">

  </form>
  <br>

  <a href="create_account.jsp"> Don't have an account? </a>

</div>


</body>
</html>