/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadeinvenario;

/**
 *
 * @author ayosu
 */
public class Usuario extends Empleado {
    private String usuario;
    private String contraseña;

    public Usuario(String usuario, String contraseña, String nombre, int cedulaDeIdentidad, String direccion, String NumeroDeTelefono, String Cargo) {
        super(nombre, cedulaDeIdentidad, direccion, NumeroDeTelefono, Cargo);
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        
        return ", nombres=" + super.getNombre()  +  " cedula=" + super.getCedulaDeIdentidad() +  "\n cargo=" + super.getCargo()  +  "usuario=" + usuario  + ", contraseña=" + contraseña +'}';
    }
    
    
    
   
    
    
    
    
}
