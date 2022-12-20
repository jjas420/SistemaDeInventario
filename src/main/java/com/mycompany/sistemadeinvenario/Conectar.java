/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadeinvenario;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ayosu
 */
public class Conectar {
     Connection conectar = null;
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemadeinventario","root","");
            System.out.println("conexion exitosa");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return conectar;
    }
}
