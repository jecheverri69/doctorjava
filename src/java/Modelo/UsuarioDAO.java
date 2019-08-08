/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jerson
 */
public class UsuarioDAO {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    
    
    public Usuario Validar(String user,String pass){
    
        Usuario us = new Usuario();
        String sql= "select * from usuarios where usuario=? and contraseña=?";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs= ps.executeQuery();
            while (rs.next()) {
               us.setCedula(rs.getInt("cedula"));
               us.setUsuario(rs.getString("usuario"));
               us.setContraseña(rs.getString("contraseña"));
               us.setRol(rs.getBoolean("rol"));                
            }
            
        } catch (SQLException e) {
        }
    
    
    return us;
    
    }
    
    //operaciones CRUD
    
    public List listar(){
    String sql="select * from usuarios";
    List<Usuario>lista=new ArrayList<>();
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
            Usuario u= new Usuario();
            u.setCedula(rs.getInt(1));
            u.setUsuario(rs.getString("usuario"));
            u.setContraseña(rs.getString("contraseña"));
            u.setRol(rs.getBoolean("rol")); 
            lista.add(u);
            
                
            }
        } catch (SQLException e) {
        }
        return lista;
    }
    public void agregar(Usuario u){
    String sql="insert into usuarios(cedula,usuario,contraseña,rol)values(?,?,?,?)";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
             ps.setInt(1, u.getCedula());
            ps.setString(2, u.getUsuario());
            ps.setString(3, u.getContraseña());
            ps.setBoolean(4, u.getRol());
         
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    
    
    }
    public Usuario Listarcedula(int cedula){
   Usuario u=new Usuario();
   String sql="select * from usuarios where cedula="+cedula;
     
        try {
            con=cn.Conexion();
     ps=con.prepareStatement(sql);
     rs=ps.executeQuery();
      while (rs.next()) {         
            u.setCedula(rs.getInt(1));
            u.setUsuario(rs.getString("usuario"));
            u.setContraseña(rs.getString("contraseña"));
            u.setRol(rs.getBoolean("rol")); 
        }
            
        } catch (SQLException e) {
        }
        return u;
    }
    
    
    public int actualizar(Usuario u){
    String sql="update usuarios set cedula=?,usuario=?,contraseña=?,rol=? where cedula=?";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
             ps.setInt(1, u.getCedula());
            ps.setString(2, u.getUsuario());
            ps.setString(3, u.getContraseña());
            ps.setBoolean(4, u.getRol());
            ps.executeUpdate();
        } catch (SQLException e) {
        }
    
    return r;
    
    
    }
    
    public void delete(int cedula){
            String sql="delete from usuario where cedula="+cedula;
            try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            
        } catch (SQLException e) {
        }
        }
    
}