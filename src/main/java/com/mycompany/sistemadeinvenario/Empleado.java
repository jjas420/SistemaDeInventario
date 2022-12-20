/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadeinvenario;

/**
 *
 * @author ayosu
 */
public class Empleado {
    private String nombre;
    private int cedulaDeIdentidad;
    private String direccion;
    private String numeroDeTelefono;
    private String cargo;
    public Empleado(){
        
    };
    public Empleado(String nombre, int cedulaDeIdentidad, String direccion, String NumeroDeTelefono,String Cargo) {
        this.nombre = nombre;
        this.cedulaDeIdentidad = cedulaDeIdentidad;
        this.direccion = direccion;
        this.numeroDeTelefono = NumeroDeTelefono;
        this.cargo=Cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedulaDeIdentidad() {
        return cedulaDeIdentidad;
    }

    public void setCedulaDeIdentidad(int cedulaDeIdentidad) {
        this.cedulaDeIdentidad = cedulaDeIdentidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    public void setNumeroDeTelefono(String NumeroDeTelefono) {
        this.numeroDeTelefono = NumeroDeTelefono;
    }
    
    
    
    
    
    
    
}
