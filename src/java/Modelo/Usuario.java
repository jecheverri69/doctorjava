/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author jerson
 */
public class Usuario {
    int cedula;
    String usuario;
    String contraseña;
    String Rol;

    public Usuario() {
    }

    public Usuario(int cedula, String usuario, String contraseña, String Rol) {
        this.cedula = cedula;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.Rol = Rol;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
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

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }
     
}

