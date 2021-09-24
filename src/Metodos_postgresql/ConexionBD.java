/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos_postgresql;



import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author juandiazvillota
 */
public class ConexionBD {

    public static String user = "vrtxjhjlluxkxn";
    public static String pass = "e56c4f84d5f41a2f7582060f87533d2773ddc69d9989072eeab370f64aef8f8d";
    public static String url = "jdbc:postgresql://ec2-54-81-126-150.compute-1.amazonaws.com:5432/d5fr3fkrn09ap7";
    public static String clase = "org.postgresql.Driver";

    public static Connection Conectar() {
        Connection conexion = null;
        try {
            Class.forName(clase);
            conexion = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "lo sentimos, hubo un error en la conexion");
        }
        return conexion;
    }
    
    metodosBD metodos = new metodosBD();
    
    
}
