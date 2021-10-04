/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulos;

import admin_gestion_cliente.gestion_de_cliente;
import admin_gestion_empleado.gestion_de_empleado;
import admin_gestion_sedes.gestion_de_sedes;
import java.awt.Dialog.ModalityType;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author juandiazvillota
 */
public class menu_admin extends javax.swing.JFrame {

    /**
     * Creates new form menu_admin
     */
    public menu_admin() {
        initComponents();
        this.setLocationRelativeTo(null);
        imagenes();
    }

    public void imagenes(){
        ImageIcon imagenusuarios = new ImageIcon("src/imagenes/empleado.png");new ImageIcon("src/imagenes/cliente.png");
        Image usr = imagenusuarios.getImage();
        Image imgusr = usr.getScaledInstance(80,80, Image.SCALE_SMOOTH);
        ImageIcon imagen_usuario = new ImageIcon(imgusr);
        this.jLabel_GESTION_empleado.setIcon(imagen_usuario);
        this.jLabel_GESTION_empleado.setText("");
        
        ImageIcon imagencliente = new ImageIcon("src/imagenes/cliente.png");
        Image cli = imagencliente.getImage();
        Image imgcli = cli.getScaledInstance(80,80, Image.SCALE_SMOOTH);
        ImageIcon imagen_Clientes = new ImageIcon(imgcli);
        this.jLabel_Usuarios.setIcon(imagen_Clientes);
        this.jLabel_Usuarios.setText("");
        
        ImageIcon imagensedes = new ImageIcon("src/imagenes/sedes.png");
        Image sede = imagensedes.getImage();
        Image imgsede = sede.getScaledInstance(80,80, Image.SCALE_SMOOTH);
        ImageIcon imagen_sede = new ImageIcon(imgsede);
        this.jLabel_GESTION_SEDES.setIcon(imagen_sede);
        this.jLabel_GESTION_SEDES.setText("");
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
        jLabel_TITULO = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton_GESTION_USUARIOS = new javax.swing.JButton();
        jLabel_GESTION_empleado = new javax.swing.JLabel();
        jLabel_GESTION_SEDES = new javax.swing.JLabel();
        jButton_GESTION_SEDES = new javax.swing.JButton();
        jButton_getsion_empleado = new javax.swing.JButton();
        jLabel_Usuarios = new javax.swing.JLabel();
        jButton_atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel_TITULO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TITULO.setText("Menu");

        jButton_GESTION_USUARIOS.setText("Gestionar Usuarios");
        jButton_GESTION_USUARIOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GESTION_USUARIOSActionPerformed(evt);
            }
        });

        jLabel_GESTION_empleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_GESTION_empleado.setText("EMPLEADOS");
        jLabel_GESTION_empleado.setMaximumSize(new java.awt.Dimension(16, 16));
        jLabel_GESTION_empleado.setMinimumSize(new java.awt.Dimension(16, 16));

        jLabel_GESTION_SEDES.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_GESTION_SEDES.setText("SEDES");

        jButton_GESTION_SEDES.setText("Gestionar Sedes");
        jButton_GESTION_SEDES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GESTION_SEDESActionPerformed(evt);
            }
        });

        jButton_getsion_empleado.setText("Gestionar Empleados");
        jButton_getsion_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_getsion_empleadoActionPerformed(evt);
            }
        });

        jLabel_Usuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Usuarios.setText("USUARIOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_GESTION_USUARIOS)
                    .addComponent(jLabel_Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_getsion_empleado)
                    .addComponent(jLabel_GESTION_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton_GESTION_SEDES)
                    .addComponent(jLabel_GESTION_SEDES, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton_GESTION_SEDES, jButton_GESTION_USUARIOS, jButton_getsion_empleado});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_GESTION_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_GESTION_SEDES)
                    .addComponent(jLabel_Usuarios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_GESTION_USUARIOS)
                    .addComponent(jButton_GESTION_SEDES)
                    .addComponent(jButton_getsion_empleado))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel_CONTENIDOLayout = new javax.swing.GroupLayout(jPanel_CONTENIDO);
        jPanel_CONTENIDO.setLayout(jPanel_CONTENIDOLayout);
        jPanel_CONTENIDOLayout.setHorizontalGroup(
            jPanel_CONTENIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_TITULO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CONTENIDOLayout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel_CONTENIDOLayout.setVerticalGroup(
            jPanel_CONTENIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CONTENIDOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_TITULO, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jButton_atras.setText("Cerrar Sesion");
        jButton_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_atrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_atras)
                    .addComponent(jPanel_CONTENIDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_atras)
                .addGap(18, 18, 18)
                .addComponent(jPanel_CONTENIDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_GESTION_USUARIOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GESTION_USUARIOSActionPerformed
        gestion_de_cliente admin_usr;
        admin_usr = new gestion_de_cliente();
        admin_usr.setAlwaysOnTop (true);
        admin_usr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_GESTION_USUARIOSActionPerformed

    private void jButton_GESTION_SEDESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GESTION_SEDESActionPerformed
        gestion_de_sedes admin_sede;
        admin_sede = new gestion_de_sedes();
        admin_sede.setAlwaysOnTop (true);
        admin_sede.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_GESTION_SEDESActionPerformed

    private void jButton_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_atrasActionPerformed
        Inicio log = new Inicio();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_atrasActionPerformed

    private void jButton_getsion_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_getsion_empleadoActionPerformed
        // TODO add your handling code here:
        gestion_de_empleado admin_usr;
        admin_usr = new gestion_de_empleado();
        admin_usr.setAlwaysOnTop (true);
        admin_usr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_getsion_empleadoActionPerformed

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
            java.util.logging.Logger.getLogger(menu_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_GESTION_SEDES;
    private javax.swing.JButton jButton_GESTION_USUARIOS;
    private javax.swing.JButton jButton_atras;
    private javax.swing.JButton jButton_getsion_empleado;
    private javax.swing.JLabel jLabel_GESTION_SEDES;
    private javax.swing.JLabel jLabel_GESTION_empleado;
    private javax.swing.JLabel jLabel_TITULO;
    private javax.swing.JLabel jLabel_Usuarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_CONTENIDO;
    // End of variables declaration//GEN-END:variables
}
