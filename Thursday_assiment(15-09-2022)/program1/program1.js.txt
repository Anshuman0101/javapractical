var store="";

    function save(){
    var nm=document.getElementById('name').value;
    var mail=document.getElementById('mail').value;
    var ph=document.getElementById('no').value;
    var hob=document.getElementById('hb').value;
    var edu=document.getElementById('ed').value;

    
    store+= "Name : "+nm+", Email : "+mail+", Phone Number : "+ph+", Hobby : "+hob+", Education : "+edu+"<br>";
   document.getElementById("output").innerHTML=store;

   
    document.getElementById('name').value=null;
    document.getElementById('mail').value=null;
    document.getElementById('no').value=null;
    document.getElementById('hb').value=null;
    document.getElementById('ed').value=null;

   document.getElementById("out").innerHTML="User Details"
}


function myfunc(){
          document.getElementById("output").innerHTML="";
          document.getElementById("out").innerHTML="Your Details is Remove";

        //      a.remove();
     
}