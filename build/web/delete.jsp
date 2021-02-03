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
        <link rel="stylesheet" href="cssp2/style.css"/>  
        <link rel="stylesheet" href="cssp/hover.css"/>
        <link rel="stylesheet" href="cssp/animate.min.css"/>
        <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">

         <!--[if lt IE 9]>
            <script src="js/html5shiv.min.js"></script>
            <script src="js/respond.min.js"></script>
        <![endif]-->
         <%!
          String mail = "";
          ResultSet rs = null;
          String msg = "";
         %>
         <%
             HttpSession ss = request.getSession(false);
             mail = (String)ss.getAttribute("email");
             DB db = new DB();
             rs = db.selectbyMailAll(mail);
              msg = (String)request.getAttribute("message");
              if(msg != null){
    
   
    }
    else{
    msg="";
    
    }
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
          </div>

          <a href="profile.jsp" class="back">
            <i class="fas fa-chevron-left"></i> Back
          </a> 
          
        </div><!-- /.container-fluid -->
      </nav>
    <!--end navbar -->

    <!--start edit-->

    <div class="register">
        <form class="form text-center" action="deleteServ" method="POST">
            <i class="fas fa-pencil-alt"></i>
            <h2 class="text-center">Delete Your Profile</h2> 

            
           


            
        
            <%while (rs.next()) {%>
          
            <input type="email"  placeholder="Email address" readonly value="<%=rs.getString("mail")%>">
            <%}%>
            <input type="password" placeholder="Password" name="pass">
            <input type="password" placeholder="Re-Password" name="repass">
            <input type="submit" value="Delete">
            <%= msg%>
        </form>
    </div>

    <!--end edit-->






        <script
        src="https://code.jquery.com/jquery-1.12.0.min.js"
        integrity="sha256-Xxq2X+KtazgaGuA2cWR1v3jJsuMJUozyIXDB3e793L8="
        crossorigin="anonymous"></script>
        <script src="../js1/bootstrap.min.js"></script>
        <script src="../js1/file.js"></script>
        <script src="../js1/wow.min.js"></script>
        <script src="../js1/jquery.nicescroll.min.js"></script>
        <script> new WOW().init(); </script>
    </body>
</html> 
