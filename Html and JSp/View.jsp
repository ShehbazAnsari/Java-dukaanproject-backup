<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.13/css/all.css" integrity="sha384-DNOHZ68U8hZfKXOrtjWvjxusGo9WQnrNx2sqG0tfsghAvtVlRW3tvkXWZh58N9jp"
    crossorigin="anonymous">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
    crossorigin="anonymous">
  <link rel="stylesheet" href="css/style.css">
  <title>Silver Oxy</title>
  <style>
    .background {
     background-size: auto;
     background-image: url("viewbackground.jpg");
    }
  </style>
</head>

<body>

  <nav class="navbar navbar-expand-sm bg-dark navbar-dark" id="main-nav">
    <div class="container">
      <a href="index.html" class="navbar-brand"><i class="far fa-address-book text-success"> </i> SilverOxy</a>
      <button class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarCollapse">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item">
            <a href="main.html" class="nav-link"><span class="text-success">Add</span><span class="text-white"> Chalan</span></a>
          </li>
          <li class="nav-item">
            <a href="ViewChalanServlet" class="nav-link"><span class="text-success">View</span><span class="text-white"> Chalan</span></a>
          </li>
          <li class="nav-item">
            <a href="addStock.html" class="nav-link"><span class="text-success">Add</span><span class="text-white"> Stock</span></a>
          </li>
          <li class="nav-item">
            <a href="ViewStockServlet" class="nav-link"><span class="text-success">View</span><span class="text-white"> Stock</span></a>
          </li>
          <li class="nav-item">
            <a href="#share-head-section" class="nav-link"><span class="text-success">Contact</span><span class="text-white"> Us</span></a>
          </li>
          <li class="nav-item">
            <a href="index.html" class="nav-link"><span class="text-success">Log</span><span class="text-white">out</span></a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
<div class=" background container">
  <div class="row">
    <div class="col-sm-12">
      <h4 class="text-white pt-2 text-center mt-2">Total Product Count</h4>
    </div>
    <div class="col-sm-12 shadow-lg">
      <table class="table table-hover mt-3">
        <thead class="thead-dark">
          <tr>
            <th>Product</th>
            <th>Total</th>
          </tr>
        </thead>
        <tbody>  
          <tr class="table-primary">
            <td>500ml</td>
            <td><%=request.getAttribute("500ml")%></td>
          </tr>
          <tr class="table-success">
            <td>1Litre</td>
            <td><%=request.getAttribute("1Litre")%></td>
          </tr>
          <tr class="table-danger">
            <td>Bigcola</td>
            <td><%=request.getAttribute("Bigcola")%></td>
          </tr>
          <tr class="table-info">
            <td>New Bigcola</td>
            <td><%=request.getAttribute("NewBigcola")%></td>
          </tr>
          <tr class="table-warning">
            <td>250ml</td>
            <td><%=request.getAttribute("250ml")%></td>
          </tr>
          <tr class="table-secondary">
            <td>600ml</td>
            <td><%=request.getAttribute("600ml")%></td>
          </tr>     
          <tr class="table-primary">
            <td>1.25 Litre</td>
            <td><%=request.getAttribute("1.25litre")%></td>
          </tr>
          <tr class="table-success">
            <td>2.5 Litre</td>
            <td><%=request.getAttribute("2.5litre")%></td>
          </tr>
          <tr class="table-danger">
            <td>Tetra</td>
            <td><%=request.getAttribute("Tetra")%></td>
          </tr>
          <tr class="table-info">
            <td>Soda</td>
            <td><%=request.getAttribute("Soda")%></td>
          </tr>
          <tr class="table-warning">
            <td>2Litre Bisleri</td>
            <td><%=request.getAttribute("2litreBisleri")%></td>
          </tr>
          <tr class="table-secondary">
            <td>200ml Zeera</td>
            <td><%=request.getAttribute("200mlZeera")%></td>
          </tr>
          <tr class="table-primary">
            <td>300ml Zeera</td>
            <td><%=request.getAttribute("300mlZeera")%></td>
          </tr>
          <tr class="table-success">
            <td>Glass</td>
            <td><%=request.getAttribute("Glass")%></td>
          </tr>
          <tr class="table-danger">
            <td>200ml Paani</td>
            <td><%=request.getAttribute("200mlBadaPaani")%></td>
          </tr>
          <tr class="table-info">
            <td>200ml Paani (135rs)</td>
            <td><%=request.getAttribute("200mlChotaPaani")%></td>
          </tr>
          <tr class="table-warning">
            <td>Other1</td>
            <td><%=request.getAttribute("Others1")%></td>
          </tr>
          <tr class="table-secondary">
            <td>Others2</td>
            <td><%=request.getAttribute("Others2")%></td>
          </tr>      
        </tbody>
      </table>
      </div>
    </div>
   </div>


<script language="JavaScript" type="text/javascript">
window.history.forward(1);
</script>
  <script src="http://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
    crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
    crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T"
    crossorigin="anonymous"></script>
</body>

</html>