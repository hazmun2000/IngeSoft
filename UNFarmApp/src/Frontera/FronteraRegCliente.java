package Frontera;

import Control.RegistrarEmpleado;
import Entidad.Drogueria;
import Entidad.Empleado;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FronteraRegCliente extends javax.swing.JPanel {

    RegistrarEmpleado empleado = new RegistrarEmpleado();

    public FronteraRegCliente() {
        initComponents();
        jlLogo.setSize(100, 100);
        jlLogo.setIcon(setImageBackground("/Recursos/logo.png", jlLogo));
        jlKit.setSize(100, 100);
        jlKit.setIcon(setImageBackground("/Recursos/addUser.png", jlKit));

    }

    private ImageIcon setImageBackground(String direccion, Component o) {
        ImageIcon imagen = new ImageIcon(this.getClass().getResource(direccion));
        imagen = new ImageIcon(imagen.getImage().getScaledInstance(o.getWidth(), o.getHeight(), Image.SCALE_SMOOTH));
        return imagen;
    }

    private void allSetEmpty() {
        txtApellido.setText("");
        txtCedula.setText("");
        txtContrasenia.setText("");
        txtCorreo.setText("");
        txtDireccion.setText("");
        txtNombre.setText("");
        txtTelefono.setText("");
        txtVerContrasenia.setText("");
        txtApellido.setBackground(Color.white);
        txtCedula.setBackground(Color.white);
        txtContrasenia.setBackground(Color.white);
        txtCorreo.setBackground(Color.white);
        txtDireccion.setBackground(Color.white);
        txtNombre.setBackground(Color.white);
        txtTelefono.setBackground(Color.white);
        txtVerContrasenia.setBackground(Color.white);
    }

    @Override
    public void paintComponent(Graphics g) {
        ImageIcon imagen = new ImageIcon(getClass().getResource("/Recursos/fondo.png"));
        g.drawImage(imagen.getImage(), 0, 0, getWidth(), getHeight(), null);
        setOpaque(false);
        super.paintComponent(g);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlLogo = new javax.swing.JLabel();
        jlKit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtContrasenia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtVerContrasenia = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1030, 550));

        jlLogo.setPreferredSize(new java.awt.Dimension(100, 100));

        jlKit.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel1.setFont(new java.awt.Font("Leelawadee", 0, 34)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Editar Cliente");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setPreferredSize(new java.awt.Dimension(300, 50));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Nombre");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel2.setPreferredSize(new java.awt.Dimension(240, 30));

        txtNombre.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        txtNombre.setPreferredSize(new java.awt.Dimension(300, 30));
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Apellido");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel3.setPreferredSize(new java.awt.Dimension(240, 30));

        txtApellido.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        txtApellido.setPreferredSize(new java.awt.Dimension(300, 30));
        txtApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtApellidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidoFocusLost(evt);
            }
        });
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        txtContrasenia.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        txtContrasenia.setPreferredSize(new java.awt.Dimension(300, 30));
        txtContrasenia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContraseniaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContraseniaFocusLost(evt);
            }
        });
        txtContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseniaActionPerformed(evt);
            }
        });
        txtContrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraseniaKeyTyped(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Dirección");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel5.setPreferredSize(new java.awt.Dimension(240, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Celular/Telefono");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel6.setPreferredSize(new java.awt.Dimension(240, 30));

        txtVerContrasenia.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        txtVerContrasenia.setPreferredSize(new java.awt.Dimension(300, 30));
        txtVerContrasenia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtVerContraseniaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVerContraseniaFocusLost(evt);
            }
        });
        txtVerContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVerContraseniaActionPerformed(evt);
            }
        });
        txtVerContrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVerContraseniaKeyTyped(evt);
            }
        });

        txtDireccion.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        txtDireccion.setPreferredSize(new java.awt.Dimension(300, 30));
        txtDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDireccionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDireccionFocusLost(evt);
            }
        });
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Descripción");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel7.setPreferredSize(new java.awt.Dimension(240, 30));

        btnSalir.setBackground(new java.awt.Color(204, 0, 0));
        btnSalir.setFont(new java.awt.Font("Leelawadee", 0, 20)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setPreferredSize(new java.awt.Dimension(150, 40));
        btnSalir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(0, 158, 15));
        btnRegistrar.setFont(new java.awt.Font("Leelawadee", 0, 20)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setPreferredSize(new java.awt.Dimension(150, 40));
        btnRegistrar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnRegistrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlKit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(250, 250, 250)
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtVerContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 233, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlKit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtVerContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && c != 32) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && c != 32) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseniaActionPerformed

    }//GEN-LAST:event_txtContraseniaActionPerformed

    private void txtContraseniaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseniaKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetterOrDigit(c) && c != 32) {
            evt.consume();
        }
    }//GEN-LAST:event_txtContraseniaKeyTyped

    private void txtVerContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVerContraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVerContraseniaActionPerformed

    private void txtVerContraseniaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVerContraseniaKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetterOrDigit(c) && c != 32) {
            evt.consume();
        }
    }//GEN-LAST:event_txtVerContraseniaKeyTyped

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetterOrDigit(c) && c != '-' && c != '.') {
            evt.consume();
        }
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        allSetEmpty();
        App.getInstance().ChangePanel(FramePrincipal.INTFronteraAutEmpleado);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Empleado e = new Empleado();
        e.setApellidoEmpleado(txtApellido.getText());
        e.setCedulaEmpleado(txtCedula.getText());
        e.setContraseniaEmpleado(txtContrasenia.getText());
        e.setCorreoEmpleado(txtCorreo.getText());
        e.setDireccionEmpleado(txtDireccion.getText());
        e.setNombreEmpleado(txtNombre.getText());
        e.setTelefonoEmpleado(txtTelefono.getText());

        if (empleado.validarDatos(e).equals("Registro exitoso")) {
            JLabel lb = new JLabel();
            lb.setSize(50, 50);
            JOptionPane.showMessageDialog(null,
                    "Empleado Creado Exitosamente",
                    "Registro exitoso",
                    JOptionPane.CANCEL_OPTION,
                    setImageBackground("/recursos/exito.png", lb)
            );
            allSetEmpty();
            App.getInstance().ChangePanel(FramePrincipal.INTFronteraAutEmpleado);

        } else if(empleado.validarDatos(e).equals("El empleado ya está registrado")){
            JLabel lb = new JLabel();
            lb.setSize(50, 50);
            JOptionPane.showMessageDialog(null,
                    "El empleado ya está registrado",
                    "Registro Fallido",
                    JOptionPane.ERROR_MESSAGE
            );
        } 
        else {
            JOptionPane.showMessageDialog(null,
                    "Algun Campo Esta Mal Diligenciado, Por Favor Verificarlos",
                    "Comprobar Campos",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        if (!txtNombre.getText().equals("")) {
            if (empleado.validarNombre(txtNombre.getText())
                    .equals("Longitud nombre incorrecta")) {
                JOptionPane.showMessageDialog(null,
                        "El Nombre Debe Tener Entre 5 y 20 Caracteres",
                        "Longitud Nombre Incorrecta",
                        JOptionPane.ERROR_MESSAGE);
                txtNombre.setBackground(Color.pink);

            }
        }
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
        if (txtNombre.getBackground().equals(Color.pink)) {
            txtNombre.setBackground(Color.white);
            txtNombre.setText("");
        }
    }//GEN-LAST:event_txtNombreFocusGained

    private void txtApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidoFocusLost
        if (!txtApellido.getText().equals("")) {
            if (empleado.validarApellido(txtApellido.getText())
                    .equals("Longitud apellido incorrecta")) {
                JOptionPane.showMessageDialog(null,
                        "El Apellido Debe Tener Entre 5 y 20 Caracteres",
                        "Longitud Apellido Incorrecta",
                        JOptionPane.ERROR_MESSAGE);
                txtApellido.setBackground(Color.pink);

            }
        }
    }//GEN-LAST:event_txtApellidoFocusLost

    private void txtApellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidoFocusGained
        if (txtApellido.getBackground().equals(Color.pink)) {
            txtApellido.setBackground(Color.white);
            txtApellido.setText("");
        }
    }//GEN-LAST:event_txtApellidoFocusGained

    private void txtContraseniaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseniaFocusLost
        if (!txtContrasenia.getText().equals("")) {
            if (empleado.validarLongitudContrasenia(txtContrasenia.getText())
                    .equals("Longitud contraseña incorrecta")
                    || empleado.validarMayusculaContrasenia(txtContrasenia.getText())
                            .equals("Mayúscula en contraseña incorrecto")
                    || empleado.validarNumeroContrasenia(txtContrasenia.getText())
                            .equals("Número en contraseña incorrecto")) {
                JOptionPane.showMessageDialog(null,
                        "La Contraseña Debe Tener Entre 5 y 20 Caracteres,"
                        + "\n Ademas Debe Tener Una Mayuscula y Un Numero",
                        "Contraseña no válida",
                        JOptionPane.ERROR_MESSAGE);
                txtContrasenia.setBackground(Color.pink);

            }
        }
    }//GEN-LAST:event_txtContraseniaFocusLost

    private void txtContraseniaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseniaFocusGained
        if (txtContrasenia.getBackground().equals(Color.pink)) {
            txtContrasenia.setBackground(Color.white);
            txtContrasenia.setText("");
        }
    }//GEN-LAST:event_txtContraseniaFocusGained

    private void txtVerContraseniaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVerContraseniaFocusLost
        if (!txtVerContrasenia.getText().equals("")) {
            if (!(empleado.compararContrasenia(txtContrasenia.getText(),
                    txtVerContrasenia.getText()))) {
                JOptionPane.showMessageDialog(null,
                        "La Verificación Debe Ser La misma",
                        "Verificacion no válida",
                        JOptionPane.ERROR_MESSAGE);
                txtVerContrasenia.setBackground(Color.pink);

            }
        }
    }//GEN-LAST:event_txtVerContraseniaFocusLost

    private void txtVerContraseniaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVerContraseniaFocusGained
        if (txtVerContrasenia.getBackground().equals(Color.pink)) {
            txtVerContrasenia.setBackground(Color.white);
            txtVerContrasenia.setText("");
        }
    }//GEN-LAST:event_txtVerContraseniaFocusGained

    private void txtDireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionFocusLost
        if (!txtDireccion.getText().equals("")) {
            if (empleado.validarDireccion(
                    txtDireccion.getText()).equals("Longitud dirección incorrecta")) {
                JOptionPane.showMessageDialog(null,
                        "La Direccion Debe Tener Entre 12 y 32 Caracteres",
                        "Longitud Dirección Incorrecta",
                        JOptionPane.ERROR_MESSAGE);
                txtDireccion.setBackground(Color.pink);

            }
        }
    }//GEN-LAST:event_txtDireccionFocusLost

    private void txtDireccionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionFocusGained
        if (txtDireccion.getBackground().equals(Color.pink)) {
            txtDireccion.setBackground(Color.white);
            txtDireccion.setText("");
        }
    }//GEN-LAST:event_txtDireccionFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jlKit;
    private javax.swing.JLabel jlLogo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtContrasenia;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtVerContrasenia;
    // End of variables declaration//GEN-END:variables
}