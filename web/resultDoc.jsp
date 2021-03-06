<%@page import="DBClass.DB"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="DBClass.DB"%>
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
         <style>
              
.rate {
                cursor: pointer;
                border-radius: 5px;
                border: none;
                
                
                padding: 8px 19px;
                font-size: 15px;
                font-weight: bold;
                display: block;
                margin-left: 300px;
            }

input[type="submit"]{
  cursor: pointer;
  border-radius: 5px;
  border: none;
  background: #e41b17;
  color: #fff;
  padding: 8px 19px;
  font-size: 15px;
  font-weight: bold;
  display: block;
  margin: -34px auto;
  
}
</style>
         <%!
             String specialist="";
             String location = "";
             ResultSet set = null;
         %>
         <%
             DB db = new DB();
             specialist = (String)request.getAttribute("sppDoc");
             location = (String) request.getAttribute("loccDoc");
             set = db.selectbyWhereDoc(specialist, location);
             boolean f = db.boolDoctorsSearch(specialist, location);
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
                <a class="navbar-brand hvr-grow wow bounce" data-wow-duration="2s" href="home.jsp">CO<span>MM</span>UNITY</a>
                <input type="search" placeholder="Search Persons (e.g. Dentist in Zagazig)">
              </div>
          
              <!-- Collect the nav links, forms, and other content for toggling -->
              <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle"  id="#persons" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Persons<span class="caret"></span></a>
                        <ul class="dropdown-menu">
                           <li><a href="doctorsSearch.jsp">Doctors</a></li>
                      <li><a href="teachSerach.jsp">Teachers</a></li>
                      <li><a href="engSearch.jsp">Engineers</a></li>
                      <li><a href="lawSearch.jsp">lawyers</a></li>
                        </ul>
                      </li>
                  <li class="active"><a href="home.jsp">Home<span class="sr-only">(current)</span></a></li>
              <li><a href="login.jsp">Login</a></li>
                  
                </ul>
        
              </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
          </nav>
        <!--end navbar -->

        <!-- start person body-->
          <section class="person-in-city">
           <div class="container">
           
             <h2>Best Doctors In Your location.. </h2>
             
             <%while (set.next()) {%>
             <div class="person">
               <img src="imagees/<%= set.getString("nimage") %>">
               <span>Doctor</span> <span> <%=set.getString("fname")%> &nbsp; <%=set.getString("lname")%> </span>
               <ul>
                   <li><%= set.getString("specialist")%></li>
                   <li><%= set.getString("Adress")%></li>
                   <li><%= set.getString("price")%></li>
                   <li><%=set.getString("phone")%></li>
               </ul>
             </div>
               <form action="rateDoc?name=<%=set.getString("mail") %>" method="POST">
                        <select name="rate" class="rate">
                   
                    <option value="">Rate Me</option>
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                  </select>    

	<input type="submit" value="SaveRate">
        
</form>
             <%} %>
            
             
           <%if (f == false) {%>
             <div class="personresult">

               No results Found
             </div>
             <%}%>
           
          </div>
             
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
