/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin_gestion_empleado;

import Metodos_postgresql.metodosBD;
import modulos.*;

/**
 *
 * @author juandiazvillota
 */
public class actualizar_empleado extends javax.swing.JDialog {

    /**
     * Creates new form actualizar_usuario
     */
    public actualizar_empleado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    metodosBD metodos = new metodosBD();

    public boolean solonumeros(String cadena) {
        boolean respuesta=false;
        try {
            Integer.parseInt(cadena);
            respuesta= true;
        } catch (NumberFormatException x) {
            this.jLabel_mensaje.setText("Error: Campos numericos con letras");
        }
        return respuesta;
    }

    public boolean sololetras(String cadena) {
        boolean respuesta=true;
        for (int x = 0; x < cadena.length(); x++) {
            char c = cadena.charAt(x);
            // Si no está entre a y z, ni entre A y Z, ni es un espacio
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {
                this.jLabel_mensaje.setText("Error: Campos de texto con numeros");
                respuesta = false;
            }
        }
        return respuesta;
    }
    
    public boolean celulares(String cadena){
        boolean respuesta = false;
        if(this.solonumeros(cadena) && (cadena.length() < 13)){
            respuesta=true;
        }
        else{
            this.jLabel_mensaje.setText("Error: numero telefonico mayor a 10 digitos");
        }
        return respuesta;
    }

    public boolean escorreo(String cadena) {
        boolean resul = (cadena.endsWith(".com") && cadena.contains("@"));
        if(!resul){
            this.jLabel_mensaje.setText("Error: Direccion de correo invalida");
        }
        return resul;
    }
    
    public Boolean permitido=false;
    
    public void limpiar(){
        this.jTextField_NOMBRES.setText("");
        this.jTextField_telefono.setText("");
        this.jTextField_direccion1.setText("");
        this.jTextField_apellido1.setText("");
        this.jTextField_apellido2.setText("");
        this.jTextField_email.setText("");
        this.jTextField_Sede.setText("");
        this.jTextField_cargo.setText("");
        this.jTextField_password.setText("");
        this.jTextField_id_empleado.setText("");
        this.jTextField_estado.setText("");
        this.jTextField_cedula.setText("");
    }
    
    public void autofill(){
        if(this.jTextField_cedula.getText().isEmpty())
        {
            this.jLabel_mensaje.setText("Error: por favor rellene el campo auto-fill");
        }
        else
        {
            if(metodos.buscar_persona(this.jTextField_cedula.getText().toString())==null){
                this.jLabel_mensaje.setText("Cedula no encontrada");
            }
            else{
                String[] resultado_busqueda_persona = metodos.buscar_persona(this.jTextField_cedula.getText().toString());
                String[] resultado_busqueda_empleado = metodos.buscar_empleado(this.jTextField_cedula.getText().toString());
                this.jTextField_cedula.setText(resultado_busqueda_persona[0]);
                this.jTextField_NOMBRES.setText(resultado_busqueda_persona[1]);
                this.jTextField_telefono.setText(resultado_busqueda_persona[2]);
                this.jTextField_direccion1.setText(resultado_busqueda_persona[3]);
                this.jTextField_apellido1.setText(resultado_busqueda_persona[4]);
                this.jTextField_apellido2.setText(resultado_busqueda_persona[5]);
                this.jTextField_email.setText(resultado_busqueda_persona[6]);
                this.jTextField_Sede.setText(resultado_busqueda_empleado[1]);
                this.jTextField_cargo.setText(resultado_busqueda_empleado[2]);
                this.jTextField_password.setText(resultado_busqueda_empleado[3]);
                this.jTextField_id_empleado.setText(resultado_busqueda_empleado[4]);
                this.jTextField_estado.setText(resultado_busqueda_empleado[5]);
                
                this.jLabel_mensaje.setText("Cedula encontrada");
                permitido = true;
            }
        }
    }
    
    public void actualizar(){
        String nombres = this.jTextField_NOMBRES.getText();
        String apellido1 = this.jTextField_apellido1.getText();
        String apellido2 = this.jTextField_apellido2.getText();
        String cedula = this.jTextField_cedula.getText();
        String celular = this.jTextField_telefono.getText();
        String direccion = this.jTextField_direccion1.getText();
        String correo = this.jTextField_email.getText();
        String cargo = this.jTextField_cargo.getText();
        String sede = this.jTextField_Sede.getText();
        String contrasena = this.jTextField_password.getText();
        String IDCORP = this.jTextField_id_empleado.getText();
        String estado = this.jTextField_estado.getText();
        
        if (this.escorreo(correo) && this.sololetras(nombres) && this.sololetras(apellido1) && this.sololetras(apellido2) && this.celulares(celular) && this.solonumeros(cedula) && this.solonumeros(cargo) && this.solonumeros(sede) && this.solonumeros(IDCORP)) {
            metodos.actualizar_empleado(cedula, nombres, celular, direccion, apellido1, apellido2, correo, sede, cargo, contrasena, IDCORP, estado);
            this.jLabel_mensaje.setText("Datos Actualizados");
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

        jButton1 = new javax.swing.JButton();
        jPanel_CONTENIDO = new javax.swing.JPanel();
        jLabel_TITULO = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel_id = new javax.swing.JLabel();
        jTextField_cedula = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel_mensaje = new javax.swing.JLabel();
        jButton_atras = new javax.swing.JButton();
        jButton_ACTUALIZAR = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel_nombre1 = new javax.swing.JLabel();
        jTextField_NOMBRES = new javax.swing.JTextField();
        jLabel_id1 = new javax.swing.JLabel();
        jTextField_id_empleado = new javax.swing.JTextField();
        jLabel_direccion1 = new javax.swing.JLabel();
        jTextField_direccion1 = new javax.swing.JTextField();
        jLabel_celular1 = new javax.swing.JLabel();
        jTextField_telefono = new javax.swing.JTextField();
        jLabel_sueldo1 = new javax.swing.JLabel();
        jTextField_email = new javax.swing.JTextField();
        jLabel_rol = new javax.swing.JLabel();
        jLabel_apellidos = new javax.swing.JLabel();
        jTextField_apellido1 = new javax.swing.JTextField();
        jLabel_apellidos1 = new javax.swing.JLabel();
        jTextField_apellido2 = new javax.swing.JTextField();
        jTextField_cargo = new javax.swing.JTextField();
        jLabel_rol1 = new javax.swing.JLabel();
        jTextField_Sede = new javax.swing.JTextField();
        jTextField_password = new javax.swing.JTextField();
        jLabel_rol2 = new javax.swing.JLabel();
        jLabel_rol3 = new javax.swing.JLabel();
        jTextField_estado = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel_TITULO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TITULO.setText("Actualizar Empleado");

        jLabel_id.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_id.setText("Cedula:");

        jTextField_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_cedulaActionPerformed(evt);
            }
        });

        jButton2.setText("Auto-fill");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_cedula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextField_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton2)
                .addComponent(jLabel_id))
        );

        jLabel_mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_mensaje.setText("Mensajito");

        jButton_atras.setText("Atras");
        jButton_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_atrasActionPerformed(evt);
            }
        });

        jButton_ACTUALIZAR.setText("Actualizar");
        jButton_ACTUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ACTUALIZARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_mensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton_atras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_ACTUALIZAR)))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton_ACTUALIZAR, jButton_atras});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_atras)
                    .addComponent(jButton_ACTUALIZAR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_mensaje)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel_nombre1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_nombre1.setText("Nombres:");

        jTextField_NOMBRES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NOMBRESActionPerformed(evt);
            }
        });

        jLabel_id1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_id1.setText("ID de empleado:");

        jTextField_id_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_id_empleadoActionPerformed(evt);
            }
        });

        jLabel_direccion1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_direccion1.setText("Direccion:");

        jLabel_celular1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_celular1.setText("Celular:");

        jLabel_sueldo1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_sueldo1.setText("Correo:");

        jTextField_email.setToolTipText("");

        jLabel_rol.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_rol.setText("Cargo:");

        jLabel_apellidos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_apellidos.setText("Primer apellido:");

        jTextField_apellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_apellido1ActionPerformed(evt);
            }
        });

        jLabel_apellidos1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_apellidos1.setText("Segundo apellido:");

        jTextField_apellido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_apellido2ActionPerformed(evt);
            }
        });

        jLabel_rol1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_rol1.setText("Sede:");

        jLabel_rol2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_rol2.setText("Contraseña:");

        jLabel_rol3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_rol3.setText("Estado:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel_rol3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_apellidos1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(jLabel_apellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_sueldo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_celular1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_direccion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_id1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_nombre1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_rol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_rol1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_rol2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_password)
                    .addComponent(jTextField_Sede)
                    .addComponent(jTextField_apellido1)
                    .addComponent(jTextField_apellido2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_telefono)
                            .addComponent(jTextField_email)
                            .addComponent(jTextField_NOMBRES)
                            .addComponent(jTextField_id_empleado)
                            .addComponent(jTextField_direccion1, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(jTextField_cargo))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextField_estado))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_NOMBRES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_nombre1))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_apellidos))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_apellidos1))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_id1)
                    .addComponent(jTextField_id_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_direccion1)
                    .addComponent(jTextField_direccion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_celular1)
                    .addComponent(jTextField_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_sueldo1)
                    .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_rol)
                    .addComponent(jTextField_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_rol1)
                    .addComponent(jTextField_Sede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_rol2)
                    .addComponent(jTextField_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_rol3)
                    .addComponent(jTextField_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel_CONTENIDOLayout = new javax.swing.GroupLayout(jPanel_CONTENIDO);
        jPanel_CONTENIDO.setLayout(jPanel_CONTENIDOLayout);
        jPanel_CONTENIDOLayout.setHorizontalGroup(
            jPanel_CONTENIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CONTENIDOLayout.createSequentialGroup()
                .addGroup(jPanel_CONTENIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_TITULO, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                    .addGroup(jPanel_CONTENIDOLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_CONTENIDOLayout.setVerticalGroup(
            jPanel_CONTENIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CONTENIDOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_TITULO, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_CONTENIDO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_CONTENIDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_cedulaActionPerformed

    private void jButton_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_atrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_atrasActionPerformed

    private void jButton_ACTUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ACTUALIZARActionPerformed
        
        if(permitido){
            this.actualizar();
        }
        else{
            this.jLabel_mensaje.setText("Error: Primero busque la cedula en Auto-fill");
            this.limpiar();
        }
        
    }//GEN-LAST:event_jButton_ACTUALIZARActionPerformed

    private void jTextField_NOMBRESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NOMBRESActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NOMBRESActionPerformed

    private void jTextField_id_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_id_empleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_id_empleadoActionPerformed

    private void jTextField_apellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_apellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_apellido1ActionPerformed

    private void jTextField_apellido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_apellido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_apellido2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.autofill();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(actualizar_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(actualizar_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(actualizar_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(actualizar_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                actualizar_empleado dialog = new actualizar_empleado(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_ACTUALIZAR;
    private javax.swing.JButton jButton_atras;
    private javax.swing.JLabel jLabel_TITULO;
    private javax.swing.JLabel jLabel_apellidos;
    private javax.swing.JLabel jLabel_apellidos1;
    private javax.swing.JLabel jLabel_celular1;
    private javax.swing.JLabel jLabel_direccion1;
    private javax.swing.JLabel jLabel_id;
    private javax.swing.JLabel jLabel_id1;
    private javax.swing.JLabel jLabel_mensaje;
    private javax.swing.JLabel jLabel_nombre1;
    private javax.swing.JLabel jLabel_rol;
    private javax.swing.JLabel jLabel_rol1;
    private javax.swing.JLabel jLabel_rol2;
    private javax.swing.JLabel jLabel_rol3;
    private javax.swing.JLabel jLabel_sueldo1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel_CONTENIDO;
    private javax.swing.JTextField jTextField_NOMBRES;
    private javax.swing.JTextField jTextField_Sede;
    private javax.swing.JTextField jTextField_apellido1;
    private javax.swing.JTextField jTextField_apellido2;
    private javax.swing.JTextField jTextField_cargo;
    private javax.swing.JTextField jTextField_cedula;
    private javax.swing.JTextField jTextField_direccion1;
    private javax.swing.JTextField jTextField_email;
    private javax.swing.JTextField jTextField_estado;
    private javax.swing.JTextField jTextField_id_empleado;
    private javax.swing.JTextField jTextField_password;
    private javax.swing.JTextField jTextField_telefono;
    // End of variables declaration//GEN-END:variables
}
