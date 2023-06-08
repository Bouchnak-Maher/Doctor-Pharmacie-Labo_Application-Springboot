<?php
require_once 'APIclient.php';
    class ProductModel{
        var $BASE_URL;
        var $apiClient;
        function __construct(){
            $this-> BASE_URL='http://localhost:8884/';
            $this->apiClient= new APIclient();
        }
        function findAll1(){
            return $this->apiClient->call('GET',$this->BASE_URL.'findall1');
        }
        function findAllpatient(){
            return $this->apiClient->call('GET',$this->BASE_URL.'findallpatient');
        }
        function find($id){
            return $this->apiClient->call('GET',$this->BASE_URL.'find/'.$id);
        }
        function findRadiographie($id){
            return $this->apiClient->call('GET',$this->BASE_URL.'findRadiographie/'.$id);
        }
        function create($product= array()){
            return $this->apiClient->call('POST',$this->BASE_URL.'create',$product);
        }
        function update($Radiographie= array()){
            return $this->apiClient->call('PUT',$this->BASE_URL.'updaterad',$Radiographie);
        }
        function delete($id){
            return $this->apiClient->call('DELETE',$this->BASE_URL.'delete/'.$id);
        }
}
?>