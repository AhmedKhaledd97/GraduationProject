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
                    <li class="dropdown-menu dropdown-person">
                        <a href="#" class="dropdown-toggle"  id="#persons" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Persons<span class="caret"></span></a>
                        <ul class="dropdown-menu dropdown-person" style="width:340px">
                         <li><a href="doctorsSearch.jsp">Doctors</a></li>
                      <li><a href="teachSerach.jsp">Teachers</a></li>
                      <li><a href="engSearch.jsp">Engineers</a></li>
                      <li><a href="lawSearch.jsp">lawyers</a></li>
                        </ul>
                      </li>
                 <li class="active"><a href="home.jsp">Home<span class="sr-only">(current)</span></a></li>
              <li><a href="login.jsp">Logout</a></li>
                  <li class="dropdown">
                    <a href="profile.jsp" class="dropdown-toggle dropdown-register">Profile</a>
                   
                  </li>
                </ul>
        
              </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
          </nav>
        <!--end navbar -->

        <!--start carousel -->
          <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
            <!-- Indicators -->
            <ol class="carousel-indicators">
              <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
              <li data-target="#carousel-example-generic" data-slide-to="1"></li>
              <li data-target="#carousel-example-generic" data-slide-to="2"></li>
              <li data-target="#carousel-example-generic" data-slide-to="3"></li>
            </ol>
          
            <!-- Wrapper for slides -->
            <div class="carousel-inner" role="listbox">
              <div class="item active">
                <div class="overlay-slider"></div>
                <img src="images/01.jpg" alt="pic-1">
                <div class="carousel-caption">
                  <h2 class="h1">Doctors</h2>
                  <p class="lead">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Architecto commodi id sequi minima nulla et, iure necessitatibus velit libero error suscipit facere optio voluptatum maiores cumque animi modi tenetur earum?
                  </p>
                </div>
              </div>
              <div class="item">
                  <div class="overlay-slider"></div>
                <img src="images/02.jpg" alt="pic-2">
                <div class="carousel-caption">
                  <h2 class="h1">Teachers</h2>
                  <p class="lead">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Architecto commodi id sequi minima nulla et, iure necessitatibus velit libero error suscipit facere optio voluptatum maiores cumque animi modi tenetur earum?
                  </p>
                </div>
              </div>
              <div class="item">
                  <div class="overlay-slider"></div>
                <img src="images/03.jpg" alt="pic-3">
                <div class="carousel-caption">
                  <h2 class="h1">Engineers</h2>
                  <p class="lead">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Architecto commodi id sequi minima nulla et, iure necessitatibus velit libero error suscipit facere optio voluptatum maiores cumque animi modi tenetur earum?
                  </p>
                </div>
              </div>
              <div class="item">
                  <div class="overlay-slider"></div>
                <img src="images/04.jpg" alt="pic-4">
                <div class="carousel-caption">
                  <h2 class="h1">lawyers</h2>
                  <p class="lead">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Architecto commodi id sequi minima nulla et, iure necessitatibus velit libero error suscipit facere optio voluptatum maiores cumque animi modi tenetur earum?
                  </p>
                </div>
              </div>
              
            </div>
          
            <!-- Controls -->
            <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
              <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
              <span class="sr-only">Previous</span>
            </a>
            <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
              <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
              <span class="sr-only">Next</span>
            </a>
          </div>
         <!--end carousel -->

         <!--start about -->
          <section class="about text-center wow bounceInDown" data-wow-duration="2s" data-wow-offset="200">
           <div class="container"> 
            <h1>meet our website <span>community</span></h1>
            <p class="lead">hello let me introduce our website created with all the love by <strong>Our Team</strong></p>
          </div>
          </section>
         <!--end about -->

          


        <!---start our team-->
         <section class="our-team text-center">
           <div class="overlay">
             <div class="container">
               <h2 class="h1">meet our awesome team</h2>
               <div class="row">
                 <div class="person col-lg-3 col-sm-6">
                   <img class="img-circle" src="images/team-1.jpg">
                   <h4>bassem desouki</h4>
                   <p>this is a description about the charachter and what he/she actually does </p>
                   <i class="fab fa-facebook-f"></i>
                   <i class="fab fa-twitter"></i>
                   <i class="fab fa-google-plus-g"></i>
                   <i class="fab fa-instagram"></i>
                 </div>
                 <div class="person col-lg-3 col-sm-6">
                  <img class="img-circle" src="images/team-2.jpg">
                  <h4>nourhan</h4>
                   <p>this is a description about the charachter and what he/she actually does </p>
                   <i class="fab fa-facebook-f"></i>
                   <i class="fab fa-twitter"></i>
                   <i class="fab fa-google-plus-g"></i>
                   <i class="fab fa-instagram"></i>
                 </div>
                 <div class="person col-lg-3 col-sm-6">
                  <img class="img-circle" src="images/team-3.jpg">
                  <h4>ahmed khaled</h4>
                   <p>this is a description about the charachter and what he/she actually does </p>
                   <i class="fab fa-facebook-f"></i>
                   <i class="fab fa-twitter"></i>
                   <i class="fab fa-google-plus-g"></i>
                   <i class="fab fa-instagram"></i>
                 </div>
                 <div class="person col-lg-3 col-sm-6">
                  <img class="img-circle" src="images/team-4.jpg">
                  <h4>walaa</h4>
                   <p>this is a description about the charachter and what he/she actually does </p>
                   <i class="fab fa-facebook-f"></i>
                   <i class="fab fa-twitter"></i>
                   <i class="fab fa-google-plus-g"></i>
                   <i class="fab fa-instagram"></i>
                 </div>
               </div>
             </div>
           </div>
         </section>
        <!--end our team-->

                <!--start testimonials -->
                <section class="testimonials text-center">
                    <div class="container">
                      <h2 class="h1">what our clients say</h2>
                       <!--start carousel -->
         
                   <div id="testimonials-carousel" class="carousel slide" data-ride="carousel">
               
                     <!-- Wrapper for slides -->
                     <div class="carousel-inner" role="listbox">
                       <div class="item active">
                           <p class="lead">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Architecto commodi id sequi minima nulla et, iure necessitatibus velit libero error suscipit facere optio voluptatum maiores cumque animi modi tenetur earum?
                           </p>
                           <span>"bassem desouki"</span>
                       </div>
                       <div class="item">
                         <p class="lead">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Architecto commodi id sequi minima nulla et, iure necessitatibus velit libero error suscipit facere optio voluptatum maiores cumque animi modi tenetur earum?
                         </p>
                         <span>"youstina"</span>
                       </div>
                       <div class="item">
                         <p class="lead">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Architecto commodi id sequi minima nulla et, iure necessitatibus velit libero error suscipit facere optio voluptatum maiores cumque animi modi tenetur earum?
                         </p>
                         <span>"ahmed khaled"</span>
                       </div>
                       <div class="item">
                         <p class="lead">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Architecto commodi id sequi minima nulla et, iure necessitatibus velit libero error suscipit facere optio voluptatum maiores cumque animi modi tenetur earum?
                         <span>"islam fawzy"</span>
                       </div>
                       
                     </div>
         
               <!-- Indicators -->
               <ol class="carousel-indicators">
                   <li data-target="#testimonials-carousel" data-slide-to="0" class="active">
                     <img src="images/client-1.png">
                   </li>
                   <li data-target="#testimonials-carousel" data-slide-to="1">
                       <img src="images/client-2.jpg">
                   </li>
                   <li data-target="#testimonials-carousel" data-slide-to="2">
                       <img src="images/client-3.png">
                   </li>
                   <li data-target="#testimonials-carousel" data-slide-to="3">
                       <img src="images/client-4.png">
                   </li>
                 </ol>
               
                    </div>
                  </section>
                 <!--end testimonials -->


        <!--start section statistics-->
         <section class="statistics text-center">
          <div class="overlay">
            <div class="container">
              <h2 class="h1">our main statistics</h2>
            <div class="row"></div>
              <div class="stat col-md-3 col-sm-6 col-xs-12">
                <i class="fas fa-users fa-5x"></i>
                <p>9,550</p>
                <span>satisfied users</span>
              </div>

              <div class="stat col-md-3 col-sm-6 col-xs-12">
                <i class="fas fa-comments fa-5x"></i>
                <p>25,600</p>
                <span>posted comments</span>
              </div>

              <div class="stat col-md-3 col-sm-6 col-xs-12">
                <i class="fas fa-project-diagram fa-5x"></i>
                <p>3,260</p>
                <span>projects done</span>
              </div>

              <div class="stat col-md-3 col-sm-6 col-xs-12">
                <i class="fas fa-check fa-5x"></i>
                <p>95,350</p>
                <span>tickets archievd</span>
              </div>
            </div>
            </div>
          </div>
         </section>
        <!--end section statistics-->

        <!--start section subscribe-->
        <section class="subscribe text-center">
            <div class="container">
              <h2 class="h1">keep in touch</h2>
              <p class="lead">sign up newsletter dont worry about spam we hate it too.</p>
              <form class="form-inline">
                <input class="form-control input-lg" type="text" placeholder="write your email">
                <button class="btn btn-danger btn-lg"><i class="far fa-edit"></i> subscribe</button>
              </form>
            </div>
          </section>
        <!--end section subscribe-->


        <!-- start section contact us -->
          <section class="contact-us text-center">
            <div class="overlay">
              <div class="container">
                <i class="fas fa-headphones fa-7x"></i>
                <h2 class="h1">tell us what you feel </h2>
                <p class="lead">feel free to contact us any time</p>
                <div class="row">

                  <div class="col-md-6">
                    <div class="form-group col">
                      <input type="text" class="form-control input-lg" placeholder="user name">
                    </div>
                    <div class="form-group">
                      <input type="text" class="form-control input-lg"  placeholder="email">
                    </div>
                    <div class="form-group">
                      <input type="text" class="form-control input-lg"  placeholder="phone nember">
                    </div>
                 </div>

                 <div class="col-md-6">
                   <div class="form-group col">
                      <textarea class="form-control" placeholder="your message"></textarea>
                    </div>
                    <button type="button" class="btn btn-danger btn-block btn-lg">contact us</button>
                 </div>

                </div>
              </div>
            </div>
          </section>
        <!-- end section contact us -->


        <!--start section footer-->
         <section class="copyright text-center">
          <p class="lead">copyright &copy; 2019 <span>Community</span></p> 
         </section>
        <!--end section footer-->


        <!--end section option box-->

        <!-- srart section loading screen 
         <section class="overlay-loading">
          <div class="spinner"></div>
         </section> -->



        <!-- srart section scroll to top-->
          <section class="scroll-top">
            <i class="fas fa-arrow-up"></i>
          </section>
        <!-- end section scroll to top-->
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
