/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.Usuario;
import Modelo.UsuarioDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jerson
 */
public class Controlador extends HttpServlet {
    UsuarioDAO udao=new UsuarioDAO();
    Usuario u=new Usuario();
    int cd;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      String menu=request.getParameter("menu");
      String accion=request.getParameter("accion");
        if (menu.equals("Principal")) {
        request.getRequestDispatcher("principal.jsp").forward(request, response);
        }
        if (menu.equals("producto")) {
        request.getRequestDispatcher("producto.jsp").forward(request, response);
        }
        if (menu.equals("RegistrarVenta")) {
        request.getRequestDispatcher("RegistrarVenta.jsp").forward(request, response);
        }
        if (menu.equals("Empleados")) {
            switch (accion){
                case "Listar":
                    List lista=udao.listar();
                    request.setAttribute("empleados", lista);
                    break;
                case "Agregar":
                    String cedula=request.getParameter("txtcedula");
                    String nombre=request.getParameter("txtnombre");
                  
                    String contraseña=request.getParameter("txtpass");
                    String rol=request.getParameter("Rol");
                   
                    u.setCedula(Integer.parseInt(cedula));
                    u.setUsuario(nombre);
                    u.setContraseña(contraseña);
                    u.setRol(Boolean.parseBoolean(rol));
                    udao.agregar(u);
                    request.getRequestDispatcher("Controlador?menu=Empleados&accion=Listar").forward(request, response);

                    break;    
                case "Editar":
                    cd=Integer.parseInt(request.getParameter("cedula"));
                    Usuario uu=udao.Listarcedula(cd);
                    
                    break;
                case "Delete":
                    break;  
                default:
                    throw new AssertionError();
            }
        request.getRequestDispatcher("Empleados.jsp").forward(request, response);
        }
        
      
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
