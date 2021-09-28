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
    
    
    public int buscar_persona(String contrasena, int user) {
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
    
    public int guardar_sede(String nombres, String direccion, String telefono) {
            int resultado = 0;
            Connection conexion;

            String sentencia_guardar = ("INSERT INTO sedes (nombre, direccion, telefono) VALUES  (?,?,?)");

            try {
                conexion = (Connection) ConexionBD.Conectar();
                sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
                sentencia_preparada.setString(1, nombres);
                sentencia_preparada.setString(2, direccion);
                sentencia_preparada.setString(3, telefono);

                resultado = sentencia_preparada.executeUpdate();
                sentencia_preparada.close();
                conexion.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }

            return resultado;
        }
    
                
    

    
}
