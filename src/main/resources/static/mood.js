   var emojis = ['😠','😦','😑','😀','😍'];

   $("input").mousemove(function(){
   	var i = $(this).val();
   	$(".emoji").html(emojis[i]);
   });