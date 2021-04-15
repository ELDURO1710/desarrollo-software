/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulos;

import java.awt.Dialog.ModalityType;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDialog;

/**
 *
 * @author juandiazvillota
 */
public final class gestion_de_usuarios extends javax.swing.JFrame {

    
    
    public gestion_de_usuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
        imagenes();
    }
    
    public void imagenes(){
        ImageIcon imagenadd = new ImageIcon("src/imagenes/add.png");
        Image add = imagenadd.getImage();
        Image imgadd = add.getScaledInstance(80,80, Image.SCALE_SMOOTH);
        ImageIcon imagen_add = new ImageIcon(imgadd);
        this.jLabel_add.setIcon(imagen_add);
        this.jLabel_add.setText("");
        
        ImageIcon imagenactualizar = new ImageIcon("src/imagenes/actualizar.png");
        Image imagenupdate = imagenactualizar.getImage();
        Image imgupdate = imagenupdate.getScaledInstance(80,80, Image.SCALE_SMOOTH);
        ImageIcon imagen_actualizar = new ImageIcon(imgupdate);
        this.jLabel_actualizar.setIcon(imagen_actualizar);
        this.jLabel_actualizar.setText("");
        
        ImageIcon imagenbuscar = new ImageIcon("src/imagenes/buscar.png");
        Image imagensearch = imagenbuscar.getImage();
        Image imgsearch = imagensearch.getScaledInstance(80,80, Image.SCALE_SMOOTH);
        ImageIcon imagen_buscar = new ImageIcon(imgsearch);
        this.jLabel_buscar.setIcon(imagen_buscar);
        this.jLabel_buscar.setText("");
        
        ImageIcon imagenborrar = new ImageIcon("src/imagenes/borrar.png");
        Image imagendel = imagenborrar.getImage();
        Image imgdel = imagendel.getScaledInstance(80,80, Image.SCALE_SMOOTH);
        ImageIcon imagen_borrar = new ImageIcon(imgdel);
        this.jLabel_borrar.setIcon(imagen_borrar);
        this.jLabel_borrar.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_TITULO = new javax.swing.JLabel();
        jLabel_add = new javax.swing.JLabel();
        jLabel_buscar = new javax.swing.JLabel();
        jLabel_borrar = new javax.swing.JLabel();
        jLabel_actualizar = new javax.swing.JLabel();
        jButton_add = new javax.swing.JButton();
        jButton_search = new javax.swing.JButton();
        jButton_delete = new javax.swing.JButton();
        jButton_uodate = new javax.swing.JButton();
        jButton_atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_TITULO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TITULO.setText("GESTION DE USUARIOS");

        jLabel_add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_add.setText("ADD");
        jLabel_add.setMaximumSize(new java.awt.Dimension(16, 16));
        jLabel_add.setMinimumSize(new java.awt.Dimension(16, 16));

        jLabel_buscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_buscar.setText("SEARCH");

        jLabel_borrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_borrar.setText("DELETE");

        jLabel_actualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_actualizar.setText("UPDATE");

        jButton_add.setText("Agregar Usuario");
        jButton_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addActionPerformed(evt);
            }
        });

        jButton_search.setText("Consultar Usuarios");
        jButton_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_searchActionPerformed(evt);
            }
        });

        jButton_delete.setText("Borrar Usuario");
        jButton_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deleteActionPerformed(evt);
            }
        });

        jButton_uodate.setText("Actualizar Usuario");

        jButton_atras.setText("Atras");
        jButton_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_atrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel_add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_add)
                    .addComponent(jButton_uodate)
                    .addComponent(jLabel_actualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton_search)
                    .addComponent(jLabel_buscar)
                    .addComponent(jButton_delete)
                    .addComponent(jLabel_borrar))
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_TITULO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_atras)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_atras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_TITULO, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_add)
                    .addComponent(jButton_search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_borrar)
                    .addComponent(jLabel_actualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_uodate)
                    .addComponent(jButton_delete))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_searchActionPerformed
        consultar_usuario buscar;
        buscar = new consultar_usuario(this,true);
        buscar.setModal (true);
        buscar.setAlwaysOnTop (true);
        buscar.setModalityType (ModalityType.APPLICATION_MODAL);
        buscar.setVisible(true);
    }//GEN-LAST:event_jButton_searchActionPerformed

    private void jButton_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addActionPerformed
        agregar_usuario addusr;
        addusr = new agregar_usuario(this,true);
        addusr.setModal (true);
        addusr.setAlwaysOnTop (true);
        addusr.setModalityType (ModalityType.APPLICATION_MODAL);
        addusr.setVisible(true);
    }//GEN-LAST:event_jButton_addActionPerformed

    private void jButton_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_atrasActionPerformed
        login log = new login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_atrasActionPerformed

    private void jButton_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deleteActionPerformed
        borrar_usuario delusr;
        delusr = new borrar_usuario(this,true);
        delusr.setModal (true);
        delusr.setAlwaysOnTop (true);
        delusr.setModalityType (ModalityType.APPLICATION_MODAL);
        delusr.setVisible(true);
    }//GEN-LAST:event_jButton_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(gestion_de_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gestion_de_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gestion_de_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gestion_de_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gestion_de_usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_add;
    private javax.swing.JButton jButton_atras;
    private javax.swing.JButton jButton_delete;
    private javax.swing.JButton jButton_search;
    private javax.swing.JButton jButton_uodate;
    private javax.swing.JLabel jLabel_TITULO;
    private javax.swing.JLabel jLabel_actualizar;
    private javax.swing.JLabel jLabel_add;
    private javax.swing.JLabel jLabel_borrar;
    private javax.swing.JLabel jLabel_buscar;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
