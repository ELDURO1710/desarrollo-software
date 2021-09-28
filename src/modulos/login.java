/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulos;

import Metodos_postgresql.*;
import cliente.menu_cliente;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import usuario_operador.menu_operador;

/**
 *
 * @author juandiazvillota
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form bienvenido
     */
    public login() {
        initComponents();
        this.setLocationRelativeTo(null);
        imagenes();
    }
    
    
    
    public void imagenes(){
        ImageIcon imagencaja = new ImageIcon("src/imagenes/caja.png");
        Image logo = imagencaja.getImage();
        Image imgcaja = logo.getScaledInstance(80,80, Image.SCALE_SMOOTH);
        ImageIcon imagen_caja = new ImageIcon(imgcaja);
        this.jLabel_LOGO.setIcon(imagen_caja);
        this.jLabel_LOGO.setText("");
    }
    
    public boolean solonumeros(String cadena){
        try{
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException x){
            return false;
        }
    }
    
    metodosBD metodos = new metodosBD();
    
    public void ingresar(){
        String usuario = this.jTextField_ID.getText();
        String pass = this.jTextField_contrasena.getText();
        if(solonumeros(this.jTextField_ID.getText())){
            switch (metodos.buscar_persona(usuario, pass)){
                case 0:
                    this.jLabel_mensaje.setText("Contraseña y/o usuario incorrectos");
                    break;
                case 1:
                    this.jLabel_mensaje.setText("Bienvenido a Easy eComerce!");//cliente
                    menu_cliente cliente;
                    cliente = new menu_cliente();
                    cliente.setVisible(true);
                    this.dispose();
                    break;
                case 2:
                    this.jLabel_mensaje.setText("Acceso Empleados");//empleados
                    menu_operador empleado;
                    empleado = new menu_operador();
                    empleado.setVisible(true);
                    this.dispose();
                    break;
                case 3:
                    this.jLabel_mensaje.setText("Acceso Administrador");//administradores
                    menu_admin admin;
                    admin = new menu_admin();
                    admin.setVisible(true);
                    this.dispose();
                    break;
            }
            this.jLabel_mensaje.setText(pass);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_CONTENIDO = new javax.swing.JPanel();
        jLabel_TITULO1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel_Usuario = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jLabel_password = new javax.swing.JLabel();
        jButton_ingresar = new javax.swing.JButton();
        jButton_Recuperarcontrasena = new javax.swing.JButton();
        jButton__atras = new javax.swing.JButton();
        jLabel_mensaje = new javax.swing.JLabel();
        jTextField_contrasena = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_TITULO = new javax.swing.JLabel();
        jLabel_LOGO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_TITULO1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TITULO1.setText("¡Tus paquetes al instante!");

        jLabel_Usuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Usuario.setText("Usuario:");

        jTextField_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IDActionPerformed(evt);
            }
        });

        jLabel_password.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_password.setText("Contraseña:");

        jButton_ingresar.setText("Siguiente");
        jButton_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ingresarActionPerformed(evt);
            }
        });
        jButton_ingresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton_ingresarKeyPressed(evt);
            }
        });

        jButton_Recuperarcontrasena.setText("Recuperar contraseña");
        jButton_Recuperarcontrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RecuperarcontrasenaActionPerformed(evt);
            }
        });

        jButton__atras.setText("Atras");
        jButton__atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton__atrasActionPerformed(evt);
            }
        });

        jLabel_mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_mensaje.setText("mensaje");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_ID, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jTextField_contrasena))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton__atras)
                .addGap(0, 0, 0)
                .addComponent(jButton_Recuperarcontrasena)
                .addGap(0, 0, 0)
                .addComponent(jButton_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Usuario)
                    .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_password)
                    .addComponent(jTextField_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_ingresar)
                    .addComponent(jButton_Recuperarcontrasena)
                    .addComponent(jButton__atras))
                .addGap(12, 12, 12)
                .addComponent(jLabel_mensaje)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel_TITULO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TITULO.setText("Easy eCommerce");

        jLabel_LOGO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_LOGO.setText("logo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_TITULO, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(jLabel_LOGO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_LOGO, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_TITULO)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_CONTENIDOLayout = new javax.swing.GroupLayout(jPanel_CONTENIDO);
        jPanel_CONTENIDO.setLayout(jPanel_CONTENIDOLayout);
        jPanel_CONTENIDOLayout.setHorizontalGroup(
            jPanel_CONTENIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_TITULO1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_CONTENIDOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_CONTENIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CONTENIDOLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel_CONTENIDOLayout.setVerticalGroup(
            jPanel_CONTENIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CONTENIDOLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel_TITULO1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel_CONTENIDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel_CONTENIDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IDActionPerformed

    private void jButton_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ingresarActionPerformed
        //ingresar(); //esta funcion se activara cuando resolvamos el login, mientras, ingrese 1 para cliente, 2 para operador y 3 para admin
        System.out.println(this.jTextField_ID.getText());
        if(this.jTextField_ID.getText() == ""){
            menu_cliente cliente;
            cliente = new menu_cliente();
            cliente.setVisible(true);
            this.dispose();
        }
        if(Integer.parseInt(this.jTextField_ID.getText()) == 1){
            menu_cliente cliente;
            cliente = new menu_cliente();
            cliente.setVisible(true);
            this.dispose();
        }
        if(Integer.parseInt(this.jTextField_ID.getText()) == 2){
            menu_operador empleado;
            empleado = new menu_operador();
            empleado.setVisible(true);
            this.dispose();
        }
        if(Integer.parseInt(this.jTextField_ID.getText()) == 3){
            menu_admin admin;
            admin = new menu_admin();
            admin.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton_ingresarActionPerformed

    private void jButton_ingresarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton_ingresarKeyPressed

    }//GEN-LAST:event_jButton_ingresarKeyPressed

    private void jButton_RecuperarcontrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RecuperarcontrasenaActionPerformed
        recupera recuperacion;
        recuperacion = new recupera(this,true);
        recuperacion.setAlwaysOnTop (true);
        recuperacion.setVisible(true);   
    }//GEN-LAST:event_jButton_RecuperarcontrasenaActionPerformed

    private void jButton__atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton__atrasActionPerformed
        Inicio atras = new Inicio();
        atras.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton__atrasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Recuperarcontrasena;
    private javax.swing.JButton jButton__atras;
    private javax.swing.JButton jButton_ingresar;
    private javax.swing.JLabel jLabel_LOGO;
    private javax.swing.JLabel jLabel_TITULO;
    private javax.swing.JLabel jLabel_TITULO1;
    private javax.swing.JLabel jLabel_Usuario;
    private javax.swing.JLabel jLabel_mensaje;
    private javax.swing.JLabel jLabel_password;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_CONTENIDO;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_contrasena;
    // End of variables declaration//GEN-END:variables
}
