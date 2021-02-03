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
        <link rel="stylesheet" href="css/bootstrap.css"/> 
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
        <link rel="stylesheet" href="css/style.css"/> 
        <link rel="stylesheet" href="css/hover.css"/>
        <link rel="stylesheet" href="css/animate.min.css"/>
        <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">

         <!--[if lt IE 9]>
            <script src="js/html5shiv.min.js"></script>
            <script src="js/respond.min.js"></script>
        <![endif]-->
         
          <%!
          ResultSet set = null;
          ResultSet ss = null;
         %>
         <%
             DB db = new DB();
             set = db.selectallSpeDoc();
             ss = db.selectallLocationsDoc();
             
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
            <a class="navbar-brand hvr-grow wow bounce" data-wow-duration="2s" href="../index.html">CO<span>MM</span>UNITY</a>
            <input type="search" placeholder="Search Persons (e.g. Dentist in Zagazig)">
          </div>
      
          <!-- Collect the nav links, forms, and other content for toggling -->
          <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown dropdown-person">
                    <a href="#" class="dropdown-toggle"  id="#persons" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Persons<span class="caret"></span></a>
                    <ul class="dropdown-menu dropdown-person" style="width:340px">
                      <li><a href="doctorsSearch.jsp">Doctors</a></li>
                      <li><a href="teachSerach.jsp">Teachers</a></li>
                      <li><a href="engSearch.jsp">Engineers</a></li>
                      <li><a href="lawSearch.jsp">lawyers</a></li>
                    </ul>
                  </li>
              <li class="active"><a href="home.jsp">Home<span class="sr-only">(current)</span></a></li>
              <li><a href="login.jsp">Login</a></li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle dropdown-register"  id="#register" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Register<span class="caret"></span></a>
                <ul class="dropdown-menu dropdown-register">
                  <li><a href="regAsDoctor.jsp">Register As A Doctor </a></li>
                  <li><a href="regAsTech.jsp">Register As A Teacher</a></li>
                  <li><a href="regAsEng.jsp">Register As An Engineer</a></li>
                  <li><a href="regAsLaw.jsp">Register As A Lawyer</a></li>
                </ul>
              </li>
            </ul>
    
          </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
      </nav>
    <!--end navbar -->

        <!-- start person body-->
          <section class="doctors-body person-body">

            <div class="overlay-person"></div>

              <h2>Community Provides Best <span>Doctors</span> In Your Area</h2>

              <form action="docSearch" method="Post">

                <div class="specialty">
                  <label>Select a specialty</label>
                  <select name="spe">
                      
                    <%while (set.next()) {%>
                    <option value=<%= set.getString("specialist")%>><%=set.getString("specialist") %></option>
                    <%}%>
                  </select>
                </div>

                <div class="city">
                  <label>Select Your city</label>
                  <select name="loc">
                     <% while (ss.next()) {%>
                    <option value=<%= ss.getString("location")%>><%=ss.getString("location") %></option>
                    <%}%>
                  </select>
                </div>

               <input type="submit" value="serach">

               </form>

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
        <script src="js/bootstrap.min.js"></script>
        <script src="js/file.js"></script>
        <script src="js/wow.min.js"></script>
        <script src="js/jquery.nicescroll.min.js"></script>
        <script> new WOW().init(); </script>
    </body>
</html> 