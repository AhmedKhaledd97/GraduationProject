$(document).ready(function(){

  $("html").niceScroll({
    cursorcolor: "#e41b17",
    cursorborder: "1px solid #e41b17",
    scrollspeed: 60
  });

  $('.carousel').carousel({
      interval:4000
  });

// change theme main color
  $('.fa-cogs').click(function(){

    if($('.option-box').hasClass('bassem'))
    {
      $('.option-box').animate
      ({
        left : '-2px'
      },1000,function(){$('.option-box').removeClass('bassem')})
    }else{
      $('.option-box').animate
      ({
        left : '-120px' 
      },1000,function(){$('.option-box').addClass('bassem')})
    }

  });


//$(window).load(function(){
 // $('.spinner').fadeOut(100,function(){
  // $(this).parent().fadeOut(100);
 // });
//});

$(window).scroll(function(){
  $(this).scrollTop() > 200 ? $('.scroll-top').fadeIn(500) : $('.scroll-top').fadeOut(500);
});



$('.scroll-top').click(function(){
   $('html').animate({
    scrollTop: 0
   }, 2000);
});




  
});