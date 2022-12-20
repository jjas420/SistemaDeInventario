/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sistemadeinvenario;
 import javax.swing.JOptionPane;
/**
 *
 * @author ayosu
 */
public class SistemaDeInvenario {

    public static void main(String[] args) {
        System.out.println("Hello World!");
       Empleado emp = new Empleado();
       Conectar conectar = new Conectar();
       conectar.conexion();
       
       
       
        
       
       /*Login  login = new Login ();
       login.setLocationRelativeTo(null);
        login.setVisible(true);
        login.setTitle("login");*/
    }
}
