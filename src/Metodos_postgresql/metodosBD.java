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
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public static String sesion_login = "nulo";

    //================================================================================================================================================================
    //GESTION DE PERSONAS
    //================================================================================================================================================================
    public int guardar_persona(String cedula, String nombres, String celular, String direccion, String apellido1, String apellido2, String correo) {
        int resultado = 0;
        Connection conexion;

        String sentencia_guardar = ("INSERT INTO persona (id_persona,nombre,celular,direccion,apellido1,apellido2,correo) VALUES  (?,?,?,?,?,?,?)");

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

    public String[] buscar_persona(String cedula) {
        ResultSet resultado = null;
        String[] respuesta_busqueda = {"", "", "", "", "", "", ""};
        Connection conexion;

        String sentencia_buscar = ("SELECT * FROM persona WHERE id_persona=(?)");

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

    private void actualizar_persona(String cedula, String nombre, String celular, String direccion, String apellido1, String apellido2, String correo) {
        ResultSet respuesta_servidor = null;
        Connection conexion;

        String sentencia_update = ("UPDATE persona SET id_persona=(?),nombre=(?),celular=(?),direccion=(?),apellido1=(?),apellido2=(?),correo=(?) WHERE id_persona=(?)");

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

    public int inactivar_persona(String cedula) {
        ResultSet respuesta_servidor = null;
        Connection conexion;
        int resultado = 0;

        String sentencia_inactivar = ("DELETE FROM persona WHERE id_persona=(?)");

        try {
            conexion = (Connection) ConexionBD.Conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_inactivar);
            sentencia_preparada.setInt(1, Integer.parseInt(cedula));
            resultado = 1;

            respuesta_servidor = sentencia_preparada.executeQuery();
            sentencia_preparada.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return resultado;
    }

    //================================================================================================================================================================
    //GESTION DE EMPLEADOS
    //================================================================================================================================================================
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

    public void set_sesion(String ID) {
        sesion_login = ID;
    }

    public String get_sesion() {
        return sesion_login;
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

    public int inactivar_empleado(String cedula) {
        ResultSet respuesta_servidor = null;
        Connection conexion;
        int resultado = 0;

        String sentencia_inactivar = ("UPDATE empleado SET estado=(?) WHERE id_persona=(?)");

        try {
            conexion = (Connection) ConexionBD.Conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_inactivar);
            sentencia_preparada.setString(1, "inactivo");
            sentencia_preparada.setInt(2, Integer.parseInt(cedula));
            resultado = 1;

            respuesta_servidor = sentencia_preparada.executeQuery();
            sentencia_preparada.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return resultado;
    }

    //================================================================================================================================================================
    //GESTION DE SEDES
    //================================================================================================================================================================
    //Metodos de las sedes
    public Boolean guardar_sede(String ID, String nombres, String direccion, String telefono) {
        ResultSet respuesta_servidor = null;
        Boolean respuesta_guardado = false;
        Connection conexion;

        String sentencia_guardar = ("INSERT INTO sedes (id_sede,nombre, direccion, telefono) VALUES  (?,?,?,?)");

        try {
            conexion = (Connection) ConexionBD.Conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setInt(1, Integer.parseInt(ID));
            sentencia_preparada.setString(2, nombres);
            sentencia_preparada.setString(3, direccion);
            sentencia_preparada.setString(4, telefono);
            respuesta_guardado = true;

            respuesta_servidor = sentencia_preparada.executeQuery();
            sentencia_preparada.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return respuesta_guardado;
    }

    public ArrayList<String[]> consultarSede(int id) {
        Connection conexion;
        ArrayList<String[]> tabla = new ArrayList<>();
        String sentencia_guardar = ("SELECT * FROM sedes WHERE id_sede=?");
        try {
            conexion = (Connection) ConexionBD.Conectar();
            PreparedStatement sql = conexion.prepareStatement(sentencia_guardar);
            sql.setInt(1, id);

            ResultSet rs = sql.executeQuery();

            while (rs.next()) {
                String[] fila = new String[4];
                for (int i = 0; i < 4; i++) {
                    fila[i] = rs.getString(i + 1);
                }
                tabla.add(fila);
            }

        } catch (SQLException ex) {

            System.out.println("Error: " + ex.getMessage());

        }
        return tabla;
    }

    public ArrayList<String[]> consultarCliente(int id) {
        Connection conexion;
        ArrayList<String[]> tabla = new ArrayList<>();
        String sentencia_guardar = ("SELECT * FROM clientes_act WHERE id_cliente= ?");
        try {
            conexion = (Connection) ConexionBD.Conectar();
            PreparedStatement sql = conexion.prepareStatement(sentencia_guardar);
            sql.setInt(1, id);

            ResultSet rs = sql.executeQuery();

            while (rs.next()) {
                String[] fila = new String[7];
                for (int i = 0; i < 7; i++) {
                    fila[i] = rs.getString(i + 1);
                }
                tabla.add(fila);
            }

        } catch (SQLException ex) {

            System.out.println("Error: " + ex.getMessage());

        }
        return tabla;
    }

    public ArrayList<String[]> consultarPaquetes() {
        Connection conexion;
        ArrayList<String[]> tabla = new ArrayList<>();
        String sentencia_guardar = "SELECT * FROM estadoPaquete";
        try {
            conexion = (Connection) ConexionBD.Conectar();
            PreparedStatement sql = conexion.prepareStatement(sentencia_guardar);
            //sql.setString(1, "");

            ResultSet rs = sql.executeQuery();
            //sql.getResultSet();

            while (rs.next()) {
                String[] fila = new String[7];
                for (int i = 0; i < 7; i++) {
                    fila[i] = rs.getString(i + 1);
                }
                tabla.add(fila);
            }

        } catch (SQLException ex) {

            System.out.println("Error: " + ex.getMessage());

        }
        return tabla;
    }

    public String[] buscar_sede(String ID_sede) {
        ResultSet respuesta_servidor = null;
        String[] respuesta_busqueda = {"", "", "", "", ""};
        Connection conexion;

        String sentencia_buscar_sede = ("SELECT * FROM sedes WHERE id=(?)");

        try {
            conexion = (Connection) ConexionBD.Conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_buscar_sede);
            sentencia_preparada.setInt(1, Integer.parseInt(ID_sede));
            respuesta_servidor = sentencia_preparada.executeQuery();
            if (respuesta_servidor.next()) {
                respuesta_busqueda[0] = respuesta_servidor.getArray(1).toString();//id_sede
                respuesta_busqueda[1] = respuesta_servidor.getArray(2).toString();//direccion
                respuesta_busqueda[2] = respuesta_servidor.getArray(3).toString();//nombre
                respuesta_busqueda[3] = respuesta_servidor.getArray(4).toString();//telefono
                respuesta_busqueda[4] = respuesta_servidor.getArray(5).toString();//estado
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

    public void actualizar_sede(String id_sede, String direccion, String nombre_sede, String telefono, String estado) {
        ResultSet respuesta_servidor = null;
        Connection conexion;

        String sentencia_update = ("UPDATE sedes SET direccion=(?),nombre=(?),telefono=(?),estado=(?) WHERE id=(?)");

        try {
            conexion = (Connection) ConexionBD.Conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_update);
            sentencia_preparada.setString(1, direccion);
            sentencia_preparada.setString(2, nombre_sede);
            sentencia_preparada.setInt(3, Integer.parseInt(telefono));
            sentencia_preparada.setString(4, estado);
            sentencia_preparada.setInt(5, Integer.parseInt(id_sede));

            respuesta_servidor = sentencia_preparada.executeQuery();
            sentencia_preparada.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public int inactivar_sede(String ID_sede) {
        ResultSet respuesta_servidor = null;
        Connection conexion;
        int resultado = 0;

        String sentencia_inactivar = ("UPDATE sedes SET estado=(?) WHERE id=(?)");

        try {
            conexion = (Connection) ConexionBD.Conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_inactivar);
            sentencia_preparada.setString(1, "inactivo");
            sentencia_preparada.setInt(2, Integer.parseInt(ID_sede));
            resultado = 1;

            respuesta_servidor = sentencia_preparada.executeQuery();
            sentencia_preparada.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return resultado;
    }

    public ArrayList<String[]> consultarEmpleado(int id) {
        Connection conexion;
        ArrayList<String[]> tabla = new ArrayList<>();
        String sentencia_guardar = ("SELECT * FROM usr_empleados_activos WHERE id= ?");
        try {
            conexion = (Connection) ConexionBD.Conectar();
            PreparedStatement sql = conexion.prepareStatement(sentencia_guardar);
            sql.setInt(1, id);

            ResultSet rs = sql.executeQuery();

            while (rs.next()) {
                String[] fila = new String[7];
                for (int i = 0; i < 7; i++) {
                    fila[i] = rs.getString(i + 1);
                }
                tabla.add(fila);
            }

        } catch (SQLException ex) {

            System.out.println("Error: " + ex.getMessage());

        }
        return tabla;
    }

    public ArrayList<String[]> consultarPersonas() {
        Connection conexion;
        ArrayList<String[]> tabla = new ArrayList<>();
        String sentencia_guardar = "SELECT * FROM persona";
        try {
            conexion = (Connection) ConexionBD.Conectar();
            PreparedStatement sql = conexion.prepareStatement(sentencia_guardar);
            //sql.setString(1, "");

            ResultSet rs = sql.executeQuery();
            //sql.getResultSet();

            while (rs.next()) {
                String[] fila = new String[7];
                for (int i = 0; i < 7; i++) {
                    fila[i] = rs.getString(i + 1);
                }
                tabla.add(fila);
            }

        } catch (SQLException ex) {

            System.out.println("Error: " + ex.getMessage());

        }
        return tabla;
    }

    //================================================================================================================================================================
    //GESTION DE FACTURA
    //================================================================================================================================================================
    public ArrayList<String[]> consultarFactura() {
        Connection conexion;
        ArrayList<String[]> tabla = new ArrayList<>();
        String sentencia_guardar = "SELECT * FROM factura";
        try {
            conexion = (Connection) ConexionBD.Conectar();
            PreparedStatement sql = conexion.prepareStatement(sentencia_guardar);
            //sql.setString(1, "");

            ResultSet rs = sql.executeQuery();
            //sql.getResultSet();

            while (rs.next()) {
                String[] fila = new String[7];
                for (int i = 0; i < 7; i++) {
                    fila[i] = rs.getString(i + 1);
                }
                tabla.add(fila);
            }

        } catch (SQLException ex) {

            System.out.println("Error: " + ex.getMessage());

        }
        return tabla;
    }
    

    public int crear_factura(String id_cliente, String medio_de_pago, String valor_a_pagar) {
        ResultSet resultado = null;
        int respuesta_funcion = 0;
        Connection conexion;

        String sentencia_guardar = ("INSERT INTO factura (id_cliente,medio_de_pago,valor_a_pagar,id_empleado) VALUES  (?,?,?,?)");

        try {
            conexion = (Connection) ConexionBD.Conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setInt(1, Integer.parseInt(id_cliente));
            sentencia_preparada.setInt(2, Integer.parseInt(medio_de_pago));
            sentencia_preparada.setInt(3, Integer.parseInt(valor_a_pagar));
            sentencia_preparada.setInt(4, Integer.parseInt(sesion_login));

            resultado = sentencia_preparada.executeQuery();
            resultado.next();
            sentencia_preparada.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        String sentencia_buscar_factura = ("SELECT num_factura FROM factura ORDER BY num_factura DESC LIMIT 1");

        try {
            conexion = (Connection) ConexionBD.Conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_buscar_factura);
            sentencia_preparada.setInt(1, Integer.parseInt(sesion_login));

            resultado = sentencia_preparada.executeQuery();
            resultado.next();
            respuesta_funcion = resultado.getInt(1);
            System.out.println("el numero de factura es " + respuesta_funcion);
            sentencia_preparada.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return respuesta_funcion;
    }

    public void agregar_paquete(String peso, String largo, String ancho, String alto, String valor_declarado, int tiempo_de_entrega, String desde, String hacia, int id_factura, boolean asegurado, String descripcion, String id_remitente, String id_destinatario) {
        ResultSet resultado = null;
        int respuesta_funcion = 0;
        Connection conexion;

        String sentencia_agregar_paquete = ("INSERT INTO paquete (peso,largo,ancho,alto,valor_declarado,tiempo_de_entrega,desde,hacia,id_factura,asegurado,descripcion,id_remitente,id_destinatario) VALUES  (?,?,?,?,?,?,?,?,?,?,?,?,?)");
        System.out.println("query insertar paquete");

        try {
            conexion = (Connection) ConexionBD.Conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_agregar_paquete);
            sentencia_preparada.setInt(1, Integer.parseInt(peso));
            sentencia_preparada.setInt(2, Integer.parseInt(largo));
            sentencia_preparada.setInt(3, Integer.parseInt(ancho));
            sentencia_preparada.setInt(4, Integer.parseInt(alto));
            sentencia_preparada.setInt(5, Integer.parseInt(valor_declarado));
            sentencia_preparada.setInt(6, tiempo_de_entrega);
            sentencia_preparada.setString(7, desde);
            sentencia_preparada.setString(8, hacia);
            sentencia_preparada.setInt(9, id_factura);
            sentencia_preparada.setBoolean(10, asegurado);
            sentencia_preparada.setString(11, descripcion);
            sentencia_preparada.setInt(12, Integer.parseInt(id_remitente));
            sentencia_preparada.setInt(13, Integer.parseInt(id_destinatario));

            resultado = sentencia_preparada.executeQuery();
            resultado.next();
            sentencia_preparada.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

}
