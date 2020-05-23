package Frontera;

import Control.AutenticarEmpleado;
import Entidad.Empleado;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FronteraAutEmpleado extends javax.swing.JPanel {

    private AutenticarEmpleado empleado = new AutenticarEmpleado();

    public FronteraAutEmpleado() {
        initComponents();
        jlLogo.setSize(100, 100);
        jlLogo.setIcon(setImageBackground("/Recursos/logo.png", jlLogo));
    }

    private ImageIcon setImageBackground(String direccion, Component o) {
        ImageIcon imagen = new ImageIcon(this.getClass().getResource(direccion));
        imagen = new ImageIcon(imagen.getImage().getScaledInstance(o.getWidth(), o.getHeight(), Image.SCALE_SMOOTH));
        return imagen;
    }

    public void allSetEmpty() {
        txtContrasenia.setText("");
        txtUsuario.setText("");
        txtContrasenia.setBackground(Color.white);
        txtUsuario.setBackground(Color.white);

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        txtContrasenia = new javax.swing.JPasswordField();

        jlLogo.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel1.setFont(new java.awt.Font("Leelawadee", 0, 34)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("UNFarmApp");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setPreferredSize(new java.awt.Dimension(200, 50));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Usuario");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setPreferredSize(new java.awt.Dimension(120, 30));

        txtUsuario.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        txtUsuario.setPreferredSize(new java.awt.Dimension(200, 30));
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Contraseña");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setPreferredSize(new java.awt.Dimension(220, 30));

        btnIniciarSesion.setBackground(new java.awt.Color(0, 158, 15));
        btnIniciarSesion.setFont(new java.awt.Font("Leelawadee", 0, 20)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setText("Iniciar Sesion");
        btnIniciarSesion.setPreferredSize(new java.awt.Dimension(150, 40));
        btnIniciarSesion.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnIniciarSesion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(8, 83, 148));
        btnRegistrar.setFont(new java.awt.Font("Leelawadee", 0, 20)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrarse");
        btnRegistrar.setPreferredSize(new java.awt.Dimension(150, 40));
        btnRegistrar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnRegistrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txtContrasenia.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        txtContrasenia.setPreferredSize(new java.awt.Dimension(200, 30));
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(432, 432, 432)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(363, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(329, 329, 329))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        if (!txtUsuario.getText().equals("")) {
            if (empleado.validarLongitudCedula(txtUsuario.getText())
                    .equals("Número cedula no válido")) {
                JOptionPane.showMessageDialog(null,
                        "La cedula Debe Tener Entre 7 y 11 Caracteres",
                        "Número Cedula No Válido",
                        JOptionPane.ERROR_MESSAGE);
                txtUsuario.setBackground(Color.pink);

            }
        }
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        if (txtUsuario.getBackground().equals(Color.pink)) {
            txtUsuario.setBackground(Color.white);
            txtUsuario.setText("");
        }
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed

    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        String txtContrseniaArr = new String(txtContrasenia.getPassword());
        Empleado e = new Empleado();
        e.setCedulaEmpleado(txtUsuario.getText());
        e.setContraseniaEmpleado(txtContrseniaArr);
        if (empleado.verificarLogin(e).equals("Bienvenido")) {
            e = empleado.empleado.leer(e);
            JLabel lb = new JLabel();
            lb.setSize(50, 50);
            JOptionPane.showMessageDialog(null,
                    "Bienvenido " + e.getNombreEmpleado() + " "
                    + e.getApellidoEmpleado(),
                    "Bienvenido",
                    JOptionPane.CANCEL_OPTION,
                    setImageBackground("/recursos/exito.png", lb)
            );
            allSetEmpty();
            App.getInstance().ChangePanel(FramePrincipal.INTFronteraSplash);
            App.getInstance().framePrincipal.splash.showAgain();

        } else {
            JOptionPane.showMessageDialog(null,
                    "Algun Campo Esta Mal Diligenciado, Por Favor Verificarlos",
                    "Comprobar Campos",
                    JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        allSetEmpty();
        App.getInstance().ChangePanel(FramePrincipal.INTFronteraEmpleado);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseniaActionPerformed

    private void txtContraseniaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseniaKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetterOrDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtContraseniaKeyTyped

    private void txtContraseniaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseniaFocusLost
        String txtContrseniaArr = new String(txtContrasenia.getPassword());
        if (!txtContrseniaArr.equals("")) {
            if (empleado.validarLongitudContrasenia(txtContrseniaArr)
                    .equals("Longitud contraseña incorrecta")
                    || empleado.validarMayusculaContrasenia(txtContrseniaArr)
                            .equals("Mayúscula en contraseña incorrecto")
                    || empleado.validarNumeroContrasenia(txtContrseniaArr)
                            .equals("Número en contraseña incorrecto")) {
                JOptionPane.showMessageDialog(null,
                        "La Contraseña Debe Tener Entre 5 y 14 Caracteres,"
                        + "\n Ademas Debe Tener Una Mayuscula y Un Numero",
                        "Contraseña Incorrecta",
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jlLogo;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}