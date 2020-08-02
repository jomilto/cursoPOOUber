<?php
    require_once("car.php");
    require_once("uberX.php");
    require_once("account.php");

    $uberX = new UberX("ADS1232", new Account("Enrique Perez","1232ASD"),"VW","Sedan");
    $uberX->printDataCar();
?>