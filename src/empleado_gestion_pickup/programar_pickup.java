/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado_gestion_pickup;

import Metodos_postgresql.metodosBD;
import modulos.menu_operador;

/**
 *
 * @author juandiazvillota
 */
public class programar_pickup extends javax.swing.JDialog {

    /**
     * Creates new form programar_pickup
     */
    public programar_pickup(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    metodosBD metodos = new metodosBD();
    public Boolean permitido = false;

    public boolean solonumeros(String cadena) {
        boolean respuesta = false;
        try {
            Integer.parseInt(cadena);
            respuesta = true;
        } catch (NumberFormatException x) {
            this.jLabel_mensaje.setText("Error: Campos numericos con letras");
        }
        return respuesta;
    }

    public void autofill_remitente() {
        if (this.jTextField_cedula_remitente.getText().isEmpty()) {
            this.jLabel_mensaje.setText("Error: por favor rellene los campos auto-fill");
        } else {
            if (metodos.buscar_persona(this.jTextField_cedula_remitente.getText().toString()) == null) {
                this.jLabel_mensaje.setText("Remitente no encontrado, por favor registrelo");
            } else {
                String[] resultado_busqueda_remitente = metodos.buscar_persona(this.jTextField_cedula_remitente.getText().toString());
                this.jTextField_cedula_remitente.setText(resultado_busqueda_remitente[0]);
                this.jTextField_nombre_remitente.setText(resultado_busqueda_remitente[1]);
                this.jTextField_celular_remitente.setText(resultado_busqueda_remitente[2]);
                this.jTextField_direccion_remitente.setText(resultado_busqueda_remitente[3]);
                this.jTextField_apellido1_remitente.setText(resultado_busqueda_remitente[4]);
                this.jTextField_apellido2_remitente.setText(resultado_busqueda_remitente[5]);
                this.jTextField_correo_remitente.setText(resultado_busqueda_remitente[6]);

                this.jLabel_mensaje.setText("Remitente encontrado");
                if (!(jTextField_nombre_destinatario == null) && !(jTextField_nombre_remitente == null)) {
                    permitido = true;
                }
            }
        }
    }

    public void autofill_destinatario() {
        if (this.jTextField_cedula_destinatario.getText().isEmpty()) {
            this.jLabel_mensaje.setText("Error: por favor rellene los campos auto-fill");
        } else {
            if (metodos.buscar_persona(this.jTextField_cedula_destinatario.getText().toString()) == null) {
                this.jLabel_mensaje.setText("Destinatario no encontrado, por favor registrelo");
            } else {
                String[] resultado_busqueda_destinatario = metodos.buscar_persona(this.jTextField_cedula_destinatario.getText().toString());
                this.jTextField_cedula_destinatario.setText(resultado_busqueda_destinatario[0]);
                this.jTextField_nombre_destinatario.setText(resultado_busqueda_destinatario[1]);
                this.jTextField_celular_destinatario.setText(resultado_busqueda_destinatario[2]);
                this.jTextField_direccion_destinatario.setText(resultado_busqueda_destinatario[3]);
                this.jTextField_apellido1_destinatario.setText(resultado_busqueda_destinatario[4]);
                this.jTextField_apellido2_destinatario.setText(resultado_busqueda_destinatario[5]);
                this.jTextField_correo_destinatario.setText(resultado_busqueda_destinatario[6]);

                this.jLabel_mensaje.setText("Destinatario encontrado");
                if (!(jTextField_nombre_destinatario == null) && !(jTextField_nombre_remitente == null)) {
                    permitido = true;
                }
            }
        }
    }

    public String generar_factura() {
        String texto = "";
        if (this.jTextField_cedula_remitente.getText().isEmpty()) {
            this.jLabel_mensaje.setText("Error: por favor rellene los campos auto-fill");
        } else {
            if (metodos.buscar_persona(this.jTextField_cedula_destinatario.getText().toString()) == null) {
                this.jLabel_mensaje.setText("Destinatario no encontrado, por favor registrelo");
            } else {
                String[] resultado_busqueda_destinatario = metodos.buscar_persona(this.jTextField_cedula_destinatario.getText().toString());
                this.jTextField_cedula_destinatario.setText(resultado_busqueda_destinatario[0]);
                this.jTextField_nombre_destinatario.setText(resultado_busqueda_destinatario[1]);
                this.jTextField_celular_destinatario.setText(resultado_busqueda_destinatario[2]);
                this.jTextField_direccion_destinatario.setText(resultado_busqueda_destinatario[3]);
                this.jTextField_apellido1_destinatario.setText(resultado_busqueda_destinatario[4]);
                this.jTextField_apellido2_destinatario.setText(resultado_busqueda_destinatario[5]);
                this.jTextField_correo_destinatario.setText(resultado_busqueda_destinatario[6]);

                this.jLabel_mensaje.setText("Destinatario encontrado");
                if (!(jTextField_nombre_destinatario == null) && !(jTextField_nombre_remitente == null)) {
                    permitido = true;
                }
            }
        }
        return texto;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_tarjetas = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jLabelnombre_remi = new javax.swing.JLabel();
        jLabel_direccion = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField_apellido2_remitente = new javax.swing.JTextField();
        jTextField_direccion_remitente = new javax.swing.JTextField();
        jTextField_celular_remitente = new javax.swing.JTextField();
        jTextField_correo_remitente = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel_id1 = new javax.swing.JLabel();
        jTextField_cedula_remitente = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jTextField_nombre_remitente = new javax.swing.JTextField();
        jLabelnombre_remi1 = new javax.swing.JLabel();
        jLabelnombre_remi2 = new javax.swing.JLabel();
        jTextField_apellido1_remitente = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabelnombre_remi3 = new javax.swing.JLabel();
        jLabel_direccion1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField_apellido2_destinatario = new javax.swing.JTextField();
        jTextField_direccion_destinatario = new javax.swing.JTextField();
        jTextField_celular_destinatario = new javax.swing.JTextField();
        jTextField_correo_destinatario = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel_id2 = new javax.swing.JLabel();
        jTextField_cedula_destinatario = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jTextField_nombre_destinatario = new javax.swing.JTextField();
        jLabelnombre_remi4 = new javax.swing.JLabel();
        jLabelnombre_remi5 = new javax.swing.JLabel();
        jTextField_apellido1_destinatario = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel_descripcion = new javax.swing.JLabel();
        jLabel_peso = new javax.swing.JLabel();
        jLabel_dimensiones = new javax.swing.JLabel();
        jTextField_descripcion = new javax.swing.JTextField();
        jTextField_dim2 = new javax.swing.JTextField();
        jTextField__dim1 = new javax.swing.JTextField();
        jTextField_dim3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton_seguro = new javax.swing.JRadioButton();
        jLabel_valor_declarado = new javax.swing.JLabel();
        jTextField_valor_declarado = new javax.swing.JTextField();
        jSpinner_pesokg = new javax.swing.JSpinner();
        jSpinner_cantidad = new javax.swing.JSpinner();
        jLabel_cantidad = new javax.swing.JLabel();
        jLabel_valor_declarado1 = new javax.swing.JLabel();
        jTextField_valor_declarado1 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jButton_atras = new javax.swing.JButton();
        jButton_generar_factura = new javax.swing.JButton();
        jLabel_mensaje = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion del Remitente"));

        jLabelnombre_remi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelnombre_remi.setText("Segundo Apellido:");

        jLabel_direccion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_direccion.setText("Direccion:");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Celular:");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Correo:");

        jTextField_direccion_remitente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel_id1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_id1.setText("Cedula:");

        jTextField_cedula_remitente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_cedula_remitenteActionPerformed(evt);
            }
        });

        jButton4.setText("Auto-fill");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(jLabel_id1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_cedula_remitente, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextField_cedula_remitente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton4)
                .addComponent(jLabel_id1))
        );

        jLabelnombre_remi1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelnombre_remi1.setText("Nombres:");

        jLabelnombre_remi2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelnombre_remi2.setText("Primer apellido:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelnombre_remi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelnombre_remi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_apellido2_remitente, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(jTextField_nombre_remitente)
                    .addComponent(jTextField_correo_remitente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelnombre_remi2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_celular_remitente, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(jTextField_apellido1_remitente)
                    .addComponent(jTextField_direccion_remitente))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_nombre_remitente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelnombre_remi1)
                    .addComponent(jTextField_apellido1_remitente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelnombre_remi2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelnombre_remi)
                    .addComponent(jTextField_apellido2_remitente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_direccion)
                    .addComponent(jTextField_direccion_remitente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField_correo_remitente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField_celular_remitente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion del Destinatario"));

        jLabelnombre_remi3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelnombre_remi3.setText("Segundo Apellido:");

        jLabel_direccion1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_direccion1.setText("Direccion:");

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Celular:");

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Correo:");

        jTextField_direccion_destinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_direccion_destinatariojTextField2ActionPerformed(evt);
            }
        });

        jLabel_id2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_id2.setText("Cedula:");

        jTextField_cedula_destinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_cedula_destinatarioActionPerformed(evt);
            }
        });

        jButton5.setText("Auto-fill");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(jLabel_id2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_cedula_destinatario, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextField_cedula_destinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton5)
                .addComponent(jLabel_id2))
        );

        jLabelnombre_remi4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelnombre_remi4.setText("Nombres:");

        jLabelnombre_remi5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelnombre_remi5.setText("Primer apellido:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelnombre_remi4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelnombre_remi3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_apellido2_destinatario, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(jTextField_nombre_destinatario)
                    .addComponent(jTextField_correo_destinatario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelnombre_remi5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_direccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_celular_destinatario, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(jTextField_apellido1_destinatario)
                    .addComponent(jTextField_direccion_destinatario))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_nombre_destinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelnombre_remi4)
                    .addComponent(jTextField_apellido1_destinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelnombre_remi5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelnombre_remi3)
                    .addComponent(jTextField_apellido2_destinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_direccion1)
                    .addComponent(jTextField_direccion_destinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jTextField_correo_destinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jTextField_celular_destinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion del Paquete"));

        jLabel_descripcion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_descripcion.setText("Descripcion Corta (max 100 letras):");

        jLabel_peso.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_peso.setText("Peso (Kg):");

        jLabel_dimensiones.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_dimensiones.setText("Dimensiones:");

        jTextField_dim2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_dim2ActionPerformed(evt);
            }
        });

        jTextField__dim1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField__dim1ActionPerformed(evt);
            }
        });

        jTextField_dim3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_dim3ActionPerformed(evt);
            }
        });

        jLabel1.setText("x");

        jLabel2.setText("x");

        jRadioButton_seguro.setText("Incluir Seguro");
        jRadioButton_seguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_seguroActionPerformed(evt);
            }
        });

        jLabel_valor_declarado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_valor_declarado.setText("Tiempo de entrega aprox:");

        jTextField_valor_declarado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_valor_declaradoActionPerformed(evt);
            }
        });

        jLabel_cantidad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_cantidad.setText("Cantidad:");

        jLabel_valor_declarado1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_valor_declarado1.setText("Valor Declarado:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel_descripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_descripcion))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel_dimensiones, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                    .addComponent(jLabel_peso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jSpinner_pesokg, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSpinner_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jTextField__dim1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField_dim2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField_dim3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton_seguro))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel_valor_declarado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_valor_declarado, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel_valor_declarado1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jTextField_valor_declarado1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_descripcion)
                    .addComponent(jTextField_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_peso)
                    .addComponent(jSpinner_pesokg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_cantidad)
                    .addComponent(jSpinner_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_dimensiones)
                    .addComponent(jTextField_dim2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField__dim1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_dim3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jRadioButton_seguro))
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_valor_declarado)
                    .addComponent(jTextField_valor_declarado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_valor_declarado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_valor_declarado1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton_atras.setText("Atras");
        jButton_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_atrasActionPerformed(evt);
            }
        });

        jButton_generar_factura.setText("Generar Factura");
        jButton_generar_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_generar_facturaActionPerformed(evt);
            }
        });

        jLabel_mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_atras)
                        .addGap(114, 114, 114)
                        .addComponent(jButton_generar_factura)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel_mensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton_atras, jButton_generar_factura});

        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_atras)
                    .addComponent(jButton_generar_factura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Programar Pickup");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_generar_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_generar_facturaActionPerformed
        this.generar_factura();
    }//GEN-LAST:event_jButton_generar_facturaActionPerformed

    private void jButton_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_atrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_atrasActionPerformed

    private void jTextField_valor_declaradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_valor_declaradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_valor_declaradoActionPerformed

    private void jRadioButton_seguroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_seguroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_seguroActionPerformed

    private void jTextField_dim3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_dim3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_dim3ActionPerformed

    private void jTextField__dim1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField__dim1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField__dim1ActionPerformed

    private void jTextField_dim2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_dim2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_dim2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField_cedula_remitenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_cedula_remitenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_cedula_remitenteActionPerformed

    private void jTextField_direccion_destinatariojTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_direccion_destinatariojTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_direccion_destinatariojTextField2ActionPerformed

    private void jTextField_cedula_destinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_cedula_destinatarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_cedula_destinatarioActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.autofill_remitente();// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.autofill_destinatario();// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(programar_pickup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(programar_pickup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(programar_pickup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(programar_pickup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                programar_pickup dialog = new programar_pickup(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup grupo_tarjetas;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton_atras;
    private javax.swing.JButton jButton_generar_factura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_cantidad;
    private javax.swing.JLabel jLabel_descripcion;
    private javax.swing.JLabel jLabel_dimensiones;
    private javax.swing.JLabel jLabel_direccion;
    private javax.swing.JLabel jLabel_direccion1;
    private javax.swing.JLabel jLabel_id1;
    private javax.swing.JLabel jLabel_id2;
    private javax.swing.JLabel jLabel_mensaje;
    private javax.swing.JLabel jLabel_peso;
    private javax.swing.JLabel jLabel_valor_declarado;
    private javax.swing.JLabel jLabel_valor_declarado1;
    private javax.swing.JLabel jLabelnombre_remi;
    private javax.swing.JLabel jLabelnombre_remi1;
    private javax.swing.JLabel jLabelnombre_remi2;
    private javax.swing.JLabel jLabelnombre_remi3;
    private javax.swing.JLabel jLabelnombre_remi4;
    private javax.swing.JLabel jLabelnombre_remi5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton_seguro;
    private javax.swing.JSpinner jSpinner_cantidad;
    private javax.swing.JSpinner jSpinner_pesokg;
    private javax.swing.JTextField jTextField__dim1;
    private javax.swing.JTextField jTextField_apellido1_destinatario;
    private javax.swing.JTextField jTextField_apellido1_remitente;
    private javax.swing.JTextField jTextField_apellido2_destinatario;
    private javax.swing.JTextField jTextField_apellido2_remitente;
    private javax.swing.JTextField jTextField_cedula_destinatario;
    private javax.swing.JTextField jTextField_cedula_remitente;
    private javax.swing.JTextField jTextField_celular_destinatario;
    private javax.swing.JTextField jTextField_celular_remitente;
    private javax.swing.JTextField jTextField_correo_destinatario;
    private javax.swing.JTextField jTextField_correo_remitente;
    private javax.swing.JTextField jTextField_descripcion;
    private javax.swing.JTextField jTextField_dim2;
    private javax.swing.JTextField jTextField_dim3;
    private javax.swing.JTextField jTextField_direccion_destinatario;
    private javax.swing.JTextField jTextField_direccion_remitente;
    private javax.swing.JTextField jTextField_nombre_destinatario;
    private javax.swing.JTextField jTextField_nombre_remitente;
    private javax.swing.JTextField jTextField_valor_declarado;
    private javax.swing.JTextField jTextField_valor_declarado1;
    // End of variables declaration//GEN-END:variables

}
