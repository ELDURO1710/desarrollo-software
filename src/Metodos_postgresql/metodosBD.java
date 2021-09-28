/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos_postgresql;

//import Dashboard1.Entidades.Persona;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable; //añadido recien jda
import javax.swing.table.DefaultTableModel;
import Dashboard1.tablaPersona;

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

    public int guardar_persona(String nombres, String apellido1, String apellido2, String celular, String direccion, String correo) {
        int resultado = 0;
        Connection conexion;

        String sentencia_guardar = ("INSERT INTO persona (nombre,apellido1,apellido2,celular,direccion,correo) VALUES  (?,?,?,?,?,?)");

        try {
            conexion = (Connection) ConexionBD.Conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1, nombres);
            sentencia_preparada.setString(2, apellido1);
            sentencia_preparada.setString(3, apellido2);
            sentencia_preparada.setString(4, celular);
            sentencia_preparada.setString(5, direccion);
            sentencia_preparada.setString(6, correo);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return resultado;
    }
    
    
    public int buscar_persona(String ID, String contrasena) {
        int resultado = 0;
        int cargo=0;//cargo 0 es no encontrado, cargo 1 es cliente, cargo 2 es operador y cargo 3 es admin
        Connection conexion;

        String sentencia_buscar = ("SELECT  e.id,e.id_cargo,e.contrasena FROM empleado e WHERE e.id LIKE (?) && e.contrasena like (?)");

        try {
            conexion = (Connection) ConexionBD.Conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_buscar);
            sentencia_preparada.setString(1, ID);
            sentencia_preparada.setString(2, contrasena);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return resultado;
    }
    
    public int actualizar_persona (String nombres, String apellido1, String apellido2, String celular, String direccion, String correo){
        
        int resultado = 0;
        Connection conexion;
        
        String sentencia_Actualizar = ("UPDATE persona (nombre = ?,apellido1 = ?, apellido2 =?, celular = ?,direccion =?,correo =?) WHERE id = ?");
        
        try{
            conexion =(Connection) ConexionBD.Conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_Actualizar);
            sentencia_preparada.setString(1, nombres);
            sentencia_preparada.setString(2, apellido1);
            sentencia_preparada.setString(3, apellido2);
            sentencia_preparada.setString(4, celular);
            sentencia_preparada.setString(5, direccion);
            sentencia_preparada.setString(6, correo);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    
        return resultado;
    
    }
    
//MOSTRARA TODAS LAS TABLAS DE LA BD, UTILIZANDO EL COMBOBOX
 
    /*public void listarPersona(JTable tbPersona, int id ){
        int resultado = 0;
        Connection conexion;
        //DefaultTableModel modelPersona = null;
        DefaultTableModel modelPersona = new DefaultTableModel() ;
        String [] columPersona= {"ID", "NOMBRE"};
        modelPersona = new DefaultTableModel(null, columPersona);
       String sentencia_MostrarPersona = "SELECT * FROM persona WHERE id=' "+id+"'";
       
        //ArrayList<String[]> tablaPersona = new ArrayList<>();
           try{
            conexion =(Connection) ConexionBD.Conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_MostrarPersona);
            //sentencia_preparada.setString(1, nombres);
            //sentencia_preparada.setString(2, apellido1);
            //sentencia_preparada.setString(3, apellido2);
            //sentencia_preparada.setString(4, celular);
            //sentencia_preparada.setString(5, direccion);
            //sentencia_preparada.setString(6, correo);
            modelPersona.addColumn(columPersona);
            

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
 
    } */
}
