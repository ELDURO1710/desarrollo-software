/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos_postgresql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author juandiazvillota
 */
public class metodosBD {

    public static ConexionBD conexion = new ConexionBD();

    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero = 0;

    
    
    public int guardar_persona(String cedula, String nombres, String celular, String direccion, String apellido1, String apellido2, String correo) {
        int resultado = 0;
        Connection conexion;

        String sentencia_guardar = ("INSERT INTO persona (id,nombre,celular,direccion,apellido1,apellido2,correo) VALUES  (?,?,?,?,?,?,?)");

        try {
            conexion = (Connection) ConexionBD.Conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setInt(1, Integer.parseInt(cedula));
            sentencia_preparada.setString(2, nombres);
            sentencia_preparada.setInt(3, Integer.parseInt(celular));
            sentencia_preparada.setString(4, direccion);
            sentencia_preparada.setString(5, apellido1);
            sentencia_preparada.setString(6, apellido2);
            sentencia_preparada.setString(7, correo);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return resultado;
    }
    
    public int agregar_empleado(String cedula, String nombres, String celular, String direccion, String apellido1, String apellido2, String correo, String sede, String cargo, String contrasena, String IDCORP, String estado) {
        ResultSet resultado = null;
        int resultadito = 0;
        Connection conexion;
        this.guardar_persona(cedula, nombres, celular, direccion, apellido1, apellido2, correo);

        String sentencia_guardar = ("INSERT INTO empleado VALUES  (?,?,?,?,?,?)");

        try {
            conexion = (Connection) ConexionBD.Conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setInt(1, Integer.parseInt(cedula));
            sentencia_preparada.setInt(2, Integer.parseInt(sede));
            sentencia_preparada.setInt(3, Integer.parseInt(cargo));
            sentencia_preparada.setString(4, contrasena);
            sentencia_preparada.setInt(5, Integer.parseInt(IDCORP));
            sentencia_preparada.setString(6, estado);

            resultado = sentencia_preparada.executeQuery();
            resultado.next();
            sentencia_preparada.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return resultadito;
    }
    
    /*public String buscar_persona(String cedula){
        ResultSet resultado = null;
        String resultadito="";
        Connection conexion;

        String sentencia_buscar = ("SELECT * FROM persona WHERE id=(?)");

        try {
            conexion = (Connection) ConexionBD.Conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_buscar);
            sentencia_preparada.setInt(1, Integer.parseInt(cedula));
            resultado = sentencia_preparada.executeQuery();
            if(resultado.next());
                resultadito= "empleado de cedula "+resultado.getString(1);
                
            sentencia_preparada.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return resultadito;
    }*/
    
    
    public int buscar_personal(String contrasena, int user) {
        ResultSet resultado = null;
        int resultadito =0;
        Connection conexion;

        String sentencia_buscar = ("SELECT id_cargo FROM empleado WHERE contrasena=(?) AND id_persona=(?)");

        try {
            conexion = (Connection) ConexionBD.Conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_buscar);
            sentencia_preparada.setString(1, contrasena);
            sentencia_preparada.setInt(2, user);
            resultado = sentencia_preparada.executeQuery();
            if(resultado.next());
                resultadito=resultado.getInt(1);
            sentencia_preparada.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return resultadito;
    }
    
    //Metodos de las sedes
    
    public int guardar_sede(String ID, String nombres, String direccion, String telefono) {
            ResultSet resultado = null;
            int resultadito=0;
            Connection conexion;

            String sentencia_guardar = ("INSERT INTO sedes (id,nombre, direccion, telefono) VALUES  (?,?,?,?)");

            try {
                conexion = (Connection) ConexionBD.Conectar();
                sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
                sentencia_preparada.setInt(1, Integer.parseInt(ID));
                sentencia_preparada.setString(2, nombres);
                sentencia_preparada.setString(3, direccion);
                sentencia_preparada.setString(4, telefono);

                resultado = sentencia_preparada.executeQuery();
                sentencia_preparada.close();
                conexion.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }

            return resultadito;
        }
    
    public ArrayList<String[]> consultarSede(int id)
    {
        Connection conexion;
        ArrayList<String[]> tabla = new ArrayList<>();
        String sentencia_guardar= ("SELECT * FROM sedes WHERE id=?");
        try {
           conexion = (Connection) ConexionBD.Conectar();
            PreparedStatement sql = conexion.prepareStatement(sentencia_guardar);
        	sql.setInt(1, id);
            
                ResultSet rs = sql.executeQuery();
 
            while (rs.next()){
                String[] fila = new String[4];
                for (int i = 0; i < 4; i++) {
                    fila[i] = rs.getString(i+1);
                }
                tabla.add(fila);
            }
            
           
        } catch (SQLException ex) {
            
            System.out.println("Error: " + ex.getMessage());
            
        }
        return tabla;
    }
    
    public ArrayList<String[]> consultarEmpleado(int id)
    {
        Connection conexion;
        ArrayList<String[]> tabla = new ArrayList<>();
        String sentencia_guardar= ("SELECT * FROM usr_empleados_activos WHERE id= ?");
        try {
           conexion = (Connection) ConexionBD.Conectar();
            PreparedStatement sql = conexion.prepareStatement(sentencia_guardar);
        	sql.setInt(1, id);
            
                ResultSet rs = sql.executeQuery();
 
            while (rs.next()){
                String[] fila = new String[7];
                for (int i = 0; i < 7; i++) {
                    fila[i] = rs.getString(i+1);
                }
                tabla.add(fila);
            }
            
           
        } catch (SQLException ex) {
            
            System.out.println("Error: " + ex.getMessage());
            
        }
        return tabla;
    }
    
        public ArrayList<String[]> consultarCliente(int id)
    {
        Connection conexion;
        ArrayList<String[]> tabla = new ArrayList<>();
        String sentencia_guardar= ("SELECT * FROM clientes_act WHERE id_cliente= ?");
        try {
           conexion = (Connection) ConexionBD.Conectar();
            PreparedStatement sql = conexion.prepareStatement(sentencia_guardar);
        	sql.setInt(1, id);
            
                ResultSet rs = sql.executeQuery();
 
            while (rs.next()){
                String[] fila = new String[7];
                for (int i = 0; i < 7; i++) {
                    fila[i] = rs.getString(i+1);
                }
                tabla.add(fila);
            }
            
           
        } catch (SQLException ex) {
            
            System.out.println("Error: " + ex.getMessage());
            
        }
        return tabla;
    }
        
     public ArrayList<String[]> consultarPaquetes()
    {
        Connection conexion;
        ArrayList<String[]> tabla = new ArrayList<>();
        String sentencia_guardar= "SELECT * FROM estadoPaquete";
        try {
           conexion = (Connection) ConexionBD.Conectar();
            PreparedStatement sql = conexion.prepareStatement(sentencia_guardar);
        	//sql.setString(1, "");
                
            
                ResultSet rs = sql.executeQuery();
                //sql.getResultSet();
 
            while (rs.next()){
                String[] fila = new String[7];
                for (int i = 0; i < 7; i++) {
                    fila[i] = rs.getString(i+1);
                }
                tabla.add(fila);
            }
            
           
        } catch (SQLException ex) {
            
            System.out.println("Error: " + ex.getMessage());
            
        }
        return tabla;
    }
     
    

}
                
    

    

