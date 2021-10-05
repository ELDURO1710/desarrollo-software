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

    public String[] buscar_persona(String cedula) {
        ResultSet resultado = null;
        String[] respuesta_busqueda = {"", "", "", "", "", "", ""};
        Connection conexion;

        String sentencia_buscar = ("SELECT * FROM persona WHERE id=(?)");

        try {
            conexion = (Connection) ConexionBD.Conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_buscar);
            sentencia_preparada.setInt(1, Integer.parseInt(cedula));
            resultado = sentencia_preparada.executeQuery();
            if (resultado.next()) {
                respuesta_busqueda[0] = resultado.getArray(1).toString();//cedula
                respuesta_busqueda[1] = resultado.getArray(2).toString();//nombre
                respuesta_busqueda[2] = resultado.getArray(3).toString();//celular
                respuesta_busqueda[3] = resultado.getArray(4).toString();//direccion
                respuesta_busqueda[4] = resultado.getArray(5).toString();//apellido1
                respuesta_busqueda[5] = resultado.getArray(6).toString();//apellido2
                respuesta_busqueda[6] = resultado.getArray(7).toString();//correo
            } else {
                respuesta_busqueda = null;
            }
            sentencia_preparada.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return respuesta_busqueda;
    }

    public String[] buscar_empleado(String cedula) {
        ResultSet respuesta_servidor = null;
        String[] respuesta_busqueda = {"", "", "", "", "", ""};
        Connection conexion;

        String sentencia_buscar = ("SELECT * FROM empleado WHERE id_persona=(?)");

        try {
            conexion = (Connection) ConexionBD.Conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_buscar);
            sentencia_preparada.setInt(1, Integer.parseInt(cedula));
            respuesta_servidor = sentencia_preparada.executeQuery();
            if (respuesta_servidor.next()) {
                respuesta_busqueda[0] = respuesta_servidor.getArray(1).toString();//cedula
                respuesta_busqueda[1] = respuesta_servidor.getArray(2).toString();//sede
                respuesta_busqueda[2] = respuesta_servidor.getArray(3).toString();//cargo
                respuesta_busqueda[3] = respuesta_servidor.getArray(4).toString();//pass
                respuesta_busqueda[4] = respuesta_servidor.getArray(5).toString();//id_empleado
                respuesta_busqueda[5] = respuesta_servidor.getArray(6).toString();//estado
            } else {
                respuesta_busqueda = null;
            }
            sentencia_preparada.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return respuesta_busqueda;
    }

    public int buscar_personal(String contrasena, int user) {
        ResultSet resultado = null;
        int respuesta = 0;
        Connection conexion;

        String sentencia_buscar = ("SELECT id_cargo FROM empleado WHERE contrasena=(?) AND id_persona=(?)");

        try {
            conexion = (Connection) ConexionBD.Conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_buscar);
            sentencia_preparada.setString(1, contrasena);
            sentencia_preparada.setInt(2, user);
            resultado = sentencia_preparada.executeQuery();
            if (resultado.next());
            respuesta = resultado.getInt(1);
            sentencia_preparada.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return respuesta;
    }

    //Metodos de las sedes
    public int guardar_sede(String ID, String nombres, String direccion, String telefono) {
        ResultSet respuesta_servidor = null;
        int respuesta = 0;
        Connection conexion;

        String sentencia_guardar = ("INSERT INTO sedes (id,nombre, direccion, telefono) VALUES  (?,?,?,?)");

        try {
            conexion = (Connection) ConexionBD.Conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setInt(1, Integer.parseInt(ID));
            sentencia_preparada.setString(2, nombres);
            sentencia_preparada.setString(3, direccion);
            sentencia_preparada.setString(4, telefono);

            respuesta_servidor = sentencia_preparada.executeQuery();
            sentencia_preparada.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return respuesta;
    }

    public int actualizar_empleado(String cedula, String nombres, String celular, String direccion, String apellido1, String apellido2, String correo, String sede, String cargo, String contrasena, String IDCORP, String estado) {
        ResultSet respuesta_servidor = null;
        Connection conexion;
        int resultado = 0;

        String sentencia_update = ("UPDATE empleado SET id_sede=(?),id_cargo=(?),contrasena=(?),id_empleado=(?),estado=(?) WHERE id_persona=(?)");

        try {
            conexion = (Connection) ConexionBD.Conectar();
            this.actualizar_persona(cedula, nombres, celular, direccion, apellido1, apellido2, correo);
            sentencia_preparada = conexion.prepareStatement(sentencia_update);
            sentencia_preparada.setInt(1, Integer.parseInt(sede));
            sentencia_preparada.setInt(2, Integer.parseInt(cargo));
            sentencia_preparada.setString(3, contrasena);
            sentencia_preparada.setInt(4, Integer.parseInt(IDCORP));
            sentencia_preparada.setString(5, estado);
            sentencia_preparada.setInt(6, Integer.parseInt(cedula));
            resultado = 1;

            respuesta_servidor = sentencia_preparada.executeQuery();
            sentencia_preparada.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return resultado;
    }

    private void actualizar_persona(String cedula, String nombre, String celular, String direccion, String apellido1, String apellido2, String correo) {
        ResultSet respuesta_servidor = null;
        Connection conexion;

        String sentencia_update = ("UPDATE persona SET id=(?),nombre=(?),celular=(?),direccion=(?),apellido1=(?),apellido2=(?),correo=(?) WHERE id=(?)");

        try {
            conexion = (Connection) ConexionBD.Conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_update);
            sentencia_preparada.setInt(1, Integer.parseInt(cedula));
            sentencia_preparada.setString(2, nombre);
            sentencia_preparada.setInt(3, Integer.parseInt(celular));
            sentencia_preparada.setString(4, direccion);
            sentencia_preparada.setString(5, apellido1);
            sentencia_preparada.setString(6, apellido2);
            sentencia_preparada.setString(7, correo);
            sentencia_preparada.setInt(8, Integer.parseInt(cedula));
            
            respuesta_servidor = sentencia_preparada.executeQuery();
            sentencia_preparada.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
