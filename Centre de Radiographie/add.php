<?php
require_once 'ProductModel.php';
$productModel=new ProductModel();
if(isset($_POST['buttonSave'])){
 
    $productModel->create($_POST);
    header('Location:index.php');


}
  

?> 
<h3>add Product </h3>
<form method="post">
    <table>
        <tr>
            <td>ID</td>
            <td><input Type="text" name="id" required="required"/></td>
        </tr>
        <tr>
            <td>Name</td>
            <td><input Type="text" name="name" required="required"/></td>
        </tr> 
        <tr>
            <td>Price</td>
            <td><input Type="text" name="price" required="required"/></td>
        </tr>
        <tr>
            <td>Quantity</td>
            <td><input Type="text" name="quantity" required="required"/></td>
        </tr>
        <tr>
            <td>Status</td>
            <td><input Type="text" name="status" required="required"/></td>
        </tr>
        <tr>
            
            <td><input Type="submit" name="buttonSave" value="save"/></td>
        </tr>

    </table>
</form>
