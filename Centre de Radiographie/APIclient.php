<?php
class APIclient
{
    function call($method,$url,$data='',$auth=''){
        $curl=curl_init($url);
        curl_setopt($curl,CURLOPT_RETURNTRANSFER,true);
        switch($method){
            case "GET":
                curl_setopt($curl,CURLOPT_URL,$url);
                curl_setopt($curl,CURLOPT_CUSTOMREQUEST,"GET");
                break;
            case "POST":
                curl_setopt($curl,CURLOPT_HTTPHEADER,array('content-Type:application/json'));
                curl_setopt($curl,CURLOPT_POSTFIELDS,json_encode($data));
                curl_setopt($curl,CURLOPT_CUSTOMREQUEST,"POST");
                break;
            case "PUT":
                curl_setopt($curl,CURLOPT_HTTPHEADER,array('content-Type:application/json'));
                curl_setopt($curl,CURLOPT_POSTFIELDS,json_encode($data));
                curl_setopt($curl,CURLOPT_CUSTOMREQUEST,"PUT");
                break;
            case "DELETE":
                curl_setopt($curl,CURLOPT_CUSTOMREQUEST,"DELETE");
                curl_setopt($curl,CURLOPT_POSTFIELDS,json_encode($data));

                break;


        }
        $response=curl_exec($curl);
        $httpCode=curl_getinfo($curl,CURLINFO_HTTP_CODE);
        
        curl_close($curl);
        return array(
            'response'=>$response);
        
    }
}