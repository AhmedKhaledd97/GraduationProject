<%@page import="DBClass.DB"%>
<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <!-- IE compatbility meta-->
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <!--first mobile meta-->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Community</title>
        <link rel="stylesheet" href="cssp/bootstrap.css"/> 
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
        <link rel="stylesheet" href="cssp/style.css"/> 
        <link rel="stylesheet" href="cssp2/hover.css"/>
        <link rel="stylesheet" href="cssp/animate.min.css"/>
        <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">

         <!--[if lt IE 9]>
            <script src="js/html5shiv.min.js"></script>
            <script src="js/respond.min.js"></script>
        <![endif]-->
         <%!
          String mail = "";
          ResultSet rs = null;
          ResultSet re = null;
         %>
         <%
             HttpSession ss = request.getSession(false);
             mail = (String)ss.getAttribute("email");
             DB db = new DB();
             rs = db.selectbyMailAll(mail);
             re = db.selectbyMailAll(mail);
         %>
    </head>
    <body>
    
      <!--start navbar -->
      <nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="container">
          <!-- Brand and toggle get grouped for better mobile display -->
          <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand hvr-grow wow bounce" data-wow-duration="2s" href="index.html">CO<span>MM</span>UNITY</a>
          </div>

          <ul class="profile-page-info list-unstyled">
              <%while (re.next()) {%>
           <li> <img src="imagees/<%= re.getString("nimage") %>"> <span>Dr <%= re.getString("fname")%> <%= re.getString("lname")%></span> </li>
           <%}%>
           <a href="edit.jsp"> Edit profile </a>
           <a href="delete.jsp"> Delete profile </a>
           <li> log out </li>
          </ul>
      
        </div><!-- /.container-fluid -->
      </nav>
    <!--end navbar -->

           <!-- start person body-->
           <section class="doctors-body person-body">

                <div class="overlay-person"></div>
                <%while (rs.next()) {%>
                <div class="person">
                  <img src="imagees/<%= rs.getString("nimage") %>">
                  <span>Doctor</span> <span> <%= rs.getString("fname")%> <%= rs.getString("lname")%> </span>
                  <ul>
                      <li><%= rs.getString("specialist")%></li>
                      <li><%= rs.getString("location")%> <%= rs.getString("Adress")%></li>
                      <li>Fees : <%= rs.getString("price")%> EGP</li>
                      <li>Phone : <%= rs.getString("phone")%></li>
                  </ul>
                </div>
                <%}%>
    
              </section>
            <!-- end person body-->



    <!--start section footer-->
        <section class="copyright text-center">
        <p class="lead">copyright &copy; 2019 <span>Community</span></p> 
        </section>
    <!--end section footer-->



        <script
        src="https://code.jquery.com/jquery-1.12.0.min.js"
        integrity="sha256-Xxq2X+KtazgaGuA2cWR1v3jJsuMJUozyIXDB3e793L8="
        crossorigin="anonymous"></script>
        <script src="../js1/bootstrap.min.js"></script>
        <script src="../js1/file.js"></script>
        <script src="../js1/wow.min.js"></script>
        <script src="../js1SS/jquery.nicescroll.min.js"></script>
        <script> new WOW().init(); </script>
    </body>
</html> 
