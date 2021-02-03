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
        <link rel="stylesheet" href="css2/bootstrap.css"/> 
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
        <link rel="stylesheet" href="css/style.css"/> 
        <link rel="stylesheet" href="css2/style.css"/> 
        <link rel="stylesheet" href="css2/hover.css"/>
        <link rel="stylesheet" href="css2/animate.min.css"/>
        
         <!--[if lt IE 9]>
            <script src="js/html5shiv.min.js"></script>
            <script src="js/respond.min.js"></script>
        <![endif]-->
         <script>
            function validateform() {
                var fname = document.myform.fname.value;
                var lname = document.myform.lname.value;
                var fees = document.myform.fees.value;
                var Address = document.myform.address.value;
                var phone = document.myform.phone.value;
                var mail = document.myform.mail.value;
                var password = document.myform.pass.value;
                var imagee = document.myform.img.value;


                if (fname == null || fname == "") {
                    alert("please enter all information requierd");
                    document.myform.fname.focus();
                    return false;
                }
                 else if (lname == null || lname == "") {
                    alert("please enter all information requierd");
                    document.myform.lname.focus();
                    return false;
                }
                
                 else if (fees == null || fees == "") {
                    alert("please enter all information requierd");
                    document.myform.fees.focus();
                    return false;
                }
                 else if (Address == null || Address == "") {
                    alert("please enter all information requierd");
                    document.myform.address.focus();
                    return false;}
                 else if (phone == null || phone == "") {
                    alert("please enter all information requierd");
                    document.myform.phone.focus();
                    return false;
                }
                 else if (mail == null || mail == "") {
                    alert("please enter all information requierd");
                    document.myform.mail.focus();
                    return false;
                }
                
                else if (password == null || password == "") {
                    alert("please enter all information requierd");
                    document.myform.pass.focus();
                    return false;
                }
            
                else if (imagee == null || imagee == "") {
                    alert("please enter all information requierd");
                    document.myform.img.focus();
                    return false;
                }
               
            }
        </script>
         <%!
           ResultSet set = null;
           ResultSet ss = null;
         String msg= "";
         %>
         <%
             DB db = new DB();
             set = db.selecoEngCatagory();
             ss= db.selecoEngCatagory();
             msg = (String)request.getAttribute("msgEng");
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
            <a class="navbar-brand hvr-grow wow bounce" data-wow-duration="2s" href="index.html">CO<span>MM</span>UNITY</a>
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
     
        <!-- start register page -->
          <div class="overlay"></div>


          
          <div class="register">
              <form class="form text-center" name="myform" onsubmit="return validateform()" action="regAsEngServ" method="POST" enctype="multipart/form-data" >
                    <i class="fas fa-pencil-alt"></i>
                    <h2 class="text-center">register</h2> 
                    
                    <div class="or">
                     <hr>  <hr>
                    </div>
                    <div class="upload-image">
                      <label>Choose a profile picture:</label>
                      <input type="file" accept="image/png, image/jpeg" name="img">
                  </div>
                    <input type="text" placeholder="First name" name="fname">
                    <input type="text" placeholder="Last name" name="lname">


                    
                <div class="drop-downs">


                    <select class="job-specialization" name="spe">
                      <%while (set.next()) {%>
                      <option value=<%= set.getString("specialist")%>><%= set.getString("specialist")%></option>
                      <%}%>
                      
                  </select>

                      <select class="job-location" name="location">
                     <%while (ss.next()) {%>
                    <option value=<%= ss.getString("location")%>><%= ss.getString("location")%></option>
                    <%}%>
                  </select>


                </div>
                  
                  <input type="number" placeholder="Fees" name="fees">
                  <input type="text" placeholder="Address" name="address">
                  <input type="number" placeholder="Phone Number" name="phone">
                  <input type="email" placeholder="Email address" name="mail">
                  <input type="password" placeholder="Password" name="pass">
                    <input type="submit" value="Create Account">
                   <div class="ms" style="color: red ; font-size: 18px"> <%= msg%></div>
                    <a href="login.jsp">already a member? login here</a>
                </form>
            </div>

        <!-- end register page -->

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
