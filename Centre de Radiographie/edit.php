<?php
require_once 'ProductModel.php';
$productModel=new ProductModel();
if(isset($_POST['buttonSave'])){
    $productModel->update($_POST);
    header('Location:index.php');


}
$result=$productModel->findRadiographie($_GET['id']);
$product=json_decode($result['response']);


?> 
<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/xhtml"
  xmlns:th="http://www.thymeleaf.org">
  <head>

	<link rel="icon" type="../vendor/image/png" href="Error/pic.jpg"/>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Centre de Radiographie page</title>
   

    <!-- Bootstrap core CSS-->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template-->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

    <!-- Page level plugin CSS-->
    <link href="vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="vendor/css/sb-admin.css" rel="stylesheet">

  </head>



  <body id="page-top">

    <nav class="navbar navbar-expand navbar-dark bg-dark static-top">

      <a class="navbar-brand mr-1" href="AdminHome.jsp">Centre de Radiographie Dashboard</a>

      <button class="btn btn-link btn-sm text-white order-1 order-sm-0" id="sidebarToggle" href="#">
        <i class="fas fa-bars"></i>
      </button>

      <!-- Navbar Search -->
      <form class="d-none d-md-inline-block form-inline ml-auto mr-0 mr-md-3 my-2 my-md-0">
        <div class="input-group">
         
        </div>
      </form> 

      <!-- Navbar -->
      <ul class="navbar-nav ml-auto ml-md-0">
        
       
        <li class="nav-item dropdown no-arrow">
          <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <i class="fas fa-user-circle fa-fw"></i>
          </a>
          <div class="dropdown-menu dropdown-menu-right" aria-labelledby="userDropdown">
            <div class="dropdown-divider"></div>
            <a class="dropdown-item" href="Logout" data-toggle="modal" data-target="#logoutModal">Logout</a>
          </div>
        </li>

      </ul>

    </nav>

    <div id="wrapper">

      <!-- Sidebar -->
      <ul class="sidebar navbar-nav">
  
       <li class="nav-item ">
        <a class="nav-link " href="patient.php" >
          
            <i class="fas fa-fw fa-tachometer-alt"></i>
            <span>Patient Details</span>
          </a>
        </li>
        <li class="nav-item active ">
	  <a class="nav-link " th:href="@{/admin/appointments}">
          
            <i class="fas fa-fw fa-tachometer-alt"></i>
            <span>Radiographie</span>
          </a>
        </li>
	
      </ul>

      <div id="content-wrapper">

        <div class="container-fluid">

          <!-- Breadcrumbs-->
          <ol class="breadcrumb">
            <li class="breadcrumb-item">
              <a href="AdminHome.jsp">Dashboard</a>
            </li>
            <li class="breadcrumb-item active">Overview</li>
          </ol>

	
	<form th:action="@{/process_register}" th:object="${prescription}" 
			method="post" style="max-width: 600px; margin: 0 auto;">
		<div class="m-3">
			
			
			<div class="form-group row">
				<label class="col-4 col-form-label">ID</label>
				<div class="col-8">
					<input Type="text" name="id_radiographie" required="required" value="<?php echo $product->id_radiographie;?>"/></td>
				</div>
			</div>
			<div class="form-group row">
				<label class="col-4 col-form-label">Name of Patient </label>
				<div class="col-8">
                <input Type="text" name="patient" required="required"  value="<?php echo $product->patient;?>"/>
				</div>
			</div>
      <div class="form-group row">
				<label class="col-4 col-form-label">Type Radiographie </label>
				<div class="col-8">
                <input Type="text" size="25"name="type_radiographie" required="required"  value="<?php echo $product->type_radiographie;?>"/>
				</div>
			</div>
			<div class="form-group row">
				<label class="col-4 col-form-label">Date </label>
				<div class="col-8">
                <input Type="date" name="date_radiographie" required="required"  value="<?php echo $product->date_radiographie;?>"/>
						

				</div>
			</div>
			<div class="form-group row">
				<label class="col-4 col-form-label">Resultat </label>
				<div class="col-8">
            <input Type="file" name="resultat"  value="<?php echo $product->resultat;?>"/>						

				</div>
			</div>
			
		
            

    </label>
			<div>
            <input Type="submit" class="btn btn-primary" name="buttonSave" valeur="Edit"/>
				 
			</div>
		</div>
		</form>
</div>

     
      </div>
      <!-- /.content-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
      <i class="fas fa-angle-up"></i>
    </a>

    <!-- Logout Modal-->
   
      <!-- /.content-wrapper -->

    </div>

    <!-- Logout Modal-->
   
   
    <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
            <button class="close" type="button" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">×</span>
            </button>
          </div>
          <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
          <div class="modal-footer">
          <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
          
            <form  th:action="@{/logout}"  method="POST">
					
	
			<button type="submit" class="btn btn-success">Logout</button>   </form>
          </div>
        </div>
      </div>
    </div>

   
   
   
    <!-- Bootstrap core JavaScript-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Page level plugin JavaScript-->
    <script src="vendor/chart.js/Chart.min.js"></script>
    <script src="vendor/datatables/jquery.dataTables.js"></script>
    <script src="vendor/datatables/dataTables.bootstrap4.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="vendor/js/sb-admin.min.js"></script>

    <!-- Demo scripts for this page-->
    <script src="vendor/js/demo/datatables-demo.js"></script>
    <script src="vendor/js/demo/chart-area-demo.js"></script>

  </body>

</html>

