<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transfer Mony</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css"/>
<link rel="stylesheet" type="text/css" href="css/animate.css"/>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
<link rel="stylesheet" type="text/css" href="css/main.css"/>
<link rel="stylesheet" type="text/css" href="css/responsive.css"/>
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
<script type="text/javascript" src="js/bootstrap.js"></script>
<script type="text/javascript" src="js/jquery-3.1.1.slim.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/animate js.js"></script>
<script type="text/javascript" src="js/wow-spec.js"></script>
<style>
img {
  max-width: 100%;
  height: auto;
}
.button
 {
  background-color: #034f84; 
  border: none;
  color: white;
  padding: 20px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
  max-width: 100%;
  height: auto;
    text-shadow: 1px 1px 2px black, 0 0 25px blue, 0 0 5px darkblue;
}
.button4:hover {
  background:rgba(0,0,0,0.5);
  color: white;
}
.button4 {border-radius: 12px;}
#myVideo {
  position: fixed;
  right: 0;
  bottom: 0;
  min-width: 100%; 
  min-height: 100%;
}
h1 {
  color: white;
  text-shadow: 1px 1px 2px black, 0 0 25px blue, 0 0 5px darkblue;
}

</style>
</head>
<body>
<video autoplay muted loop id="myVideo">
  <source src="kk.mov">
 
</video>
<div class="container" style="background-color:#000;  background:rgba(0,0,0,0.7);margin-top:50px; box-shadow:    
                     0px 0PX 3px 2px #CCC;">
                     <div class="row">
    	<div class="col-md-12 text-center"">
        <h1>&nbsp;&nbsp;<font color="#FFFFFF";>Transfer Money </font></h1>
        </div>
    </div>
  </div>
  <br>
  <br>
<!---------------------------------Second row Start---------------------------------------->
  
<div class="container"  >

<form action="Transfer">
	<div class="row wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="600ms">
    	<div class="col-md-4">
        	
        </div>
        <div class="col-md-4" style="background-color:#000; background:rgba(0,0,0,0.7);box-shadow:0px 0px 10px 10px #CCC;">
        <fieldset class="col-md-12" style="margin-top:10px; "> 
         <legend>Money Transfer</legend>
         <br>

        	<div class="form-group">
    
    <input type="text" class="form-control" 
   required="required" placeholder="Enter the Saccount No "name="saccno">
  </div>
  <br>
  <div class="form-group">
    
    <input type="text" class="form-control" 
   required="required" placeholder="Enter the Father's Amount "name="amt">
  </div>
  <br>
   &nbsp; &nbsp;&nbsp;  &nbsp; &nbsp;&nbsp;  &nbsp; &nbsp;&nbsp; 
    &nbsp; &nbsp;&nbsp;  &nbsp; &nbsp;&nbsp; 
<button class="button button4">Send </button>
 

  </div>
        	

  </div>
           </div>
           <br><br>
    </div>
    </form>
    </fieldset>
</div>
<!---------------------------------Second row end---------------------------------------->

<!---------------------------------Second row end---------------------------------------->
</body>
</html>