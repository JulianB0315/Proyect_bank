
package GUI;

import javax.swing.ImageIcon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import DB.DBConnection;
import javax.swing.JOptionPane;
import java.util.Random;
import java.awt.Image;
import javax.swing.JFrame;
import java.awt.Window;

public class CrearCuenta extends javax.swing.JFrame {
private String idEmpleado;
    public CrearCuenta(String idEmpleado) {
        initComponents();
        passContraseñaConfirmar.setEchoChar('*');
        passContraseña.setEchoChar('*');
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Crear Cuentas");
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/logo.png"));
        Image logo = icon.getImage();
        setIconImage(logo);
        this.idEmpleado = idEmpleado;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpTipoCuenta = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtuserCliente = new javax.swing.JTextField();
        passContraseña = new javax.swing.JPasswordField();
        passContraseñaConfirmar = new javax.swing.JPasswordField();
        btntVerOcultar = new javax.swing.JToggleButton();
        btntVerOcultarConfrimar = new javax.swing.JToggleButton();
        btnCrearCuenta = new javax.swing.JButton();
        rdoCredito = new javax.swing.JRadioButton();
        rdoDebito = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itmVolver = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itmLimpiar = new javax.swing.JMenuItem();
        nmSalir = new javax.swing.JMenu();
        itemCerrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(0, 53, 102));

        jPanel2.setBackground(new java.awt.Color(230, 230, 230));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 53, 102));
        jLabel3.setText("   N° User                             :");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 53, 102));
        jLabel4.setText("   Tipo Cuenta                      :");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 53, 102));
        jLabel5.setText("   Contraseña                       :");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 53, 102));
        jLabel6.setText("   Confirmar Contraseña      :");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        jLabel7.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 53, 102));
        jLabel7.setText("                  Crear Cuenta ");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 1, 3, new java.awt.Color(0, 53, 102)));

        txtuserCliente.setBackground(new java.awt.Color(230, 230, 230));
        txtuserCliente.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        txtuserCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 53, 102)));

        passContraseña.setBackground(new java.awt.Color(230, 230, 230));
        passContraseña.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        passContraseña.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 53, 102)));
        passContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passContraseñaActionPerformed(evt);
            }
        });

        passContraseñaConfirmar.setBackground(new java.awt.Color(230, 230, 230));
        passContraseñaConfirmar.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        passContraseñaConfirmar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 53, 102)));
        passContraseñaConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passContraseñaConfirmarActionPerformed(evt);
            }
        });

        btntVerOcultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ocultar.png"))); // NOI18N
        btntVerOcultar.setBorder(null);
        btntVerOcultar.setContentAreaFilled(false);
        btntVerOcultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntVerOcultarActionPerformed(evt);
            }
        });

        btntVerOcultarConfrimar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ocultar.png"))); // NOI18N
        btntVerOcultarConfrimar.setBorder(null);
        btntVerOcultarConfrimar.setContentAreaFilled(false);
        btntVerOcultarConfrimar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntVerOcultarConfrimarActionPerformed(evt);
            }
        });

        btnCrearCuenta.setBackground(new java.awt.Color(230, 230, 230));
        btnCrearCuenta.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnCrearCuenta.setForeground(new java.awt.Color(0, 53, 102));
        btnCrearCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/realizar.png"))); // NOI18N
        btnCrearCuenta.setText("Crear Cuenta");
        btnCrearCuenta.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 3, 1, 3, new java.awt.Color(0, 53, 102)));
        btnCrearCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentaActionPerformed(evt);
            }
        });

        grpTipoCuenta.add(rdoCredito);
        rdoCredito.setForeground(new java.awt.Color(0, 53, 102));
        rdoCredito.setText("Credito");

        grpTipoCuenta.add(rdoDebito);
        rdoDebito.setForeground(new java.awt.Color(0, 53, 102));
        rdoDebito.setText("Debito");

        jLabel10.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 53, 102));
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dni.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mascota.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtuserCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel8))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(jLabel5))
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(rdoCredito)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rdoDebito))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(passContraseñaConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btntVerOcultarConfrimar))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(passContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btntVerOcultar))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(btnCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(43, 43, 43)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(227, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addGap(265, 265, 265)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3)
                    .addComponent(txtuserCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(rdoCredito)
                            .addComponent(rdoDebito))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(passContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btntVerOcultar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btntVerOcultarConfrimar)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(passContraseñaConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addComponent(jLabel10)
                    .addContainerGap(412, Short.MAX_VALUE)))
        );

        jLabel2.setFont(new java.awt.Font("Serif", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(212, 175, 55));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo02.png"))); // NOI18N
        jLabel2.setText("Nueva Banco Perú");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 1, 3, new java.awt.Color(212, 175, 55)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(230, 230, 230));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 53, 102)));
        jMenuBar1.setForeground(new java.awt.Color(0, 53, 102));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu1.setBackground(new java.awt.Color(230, 230, 230));
        jMenu1.setForeground(new java.awt.Color(0, 53, 102));
        jMenu1.setText("Volver");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        itmVolver.setBackground(new java.awt.Color(230, 230, 230));
        itmVolver.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        itmVolver.setForeground(new java.awt.Color(0, 53, 102));
        itmVolver.setText("Volver");
        itmVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmVolverActionPerformed(evt);
            }
        });
        jMenu1.add(itmVolver);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(0, 53, 102));
        jMenu2.setText("Limpiar");

        itmLimpiar.setBackground(new java.awt.Color(230, 230, 230));
        itmLimpiar.setForeground(new java.awt.Color(0, 53, 102));
        itmLimpiar.setText("Limpiar");
        itmLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmLimpiarActionPerformed(evt);
            }
        });
        jMenu2.add(itmLimpiar);

        jMenuBar1.add(jMenu2);

        nmSalir.setForeground(new java.awt.Color(0, 53, 102));
        nmSalir.setText("Salir");

        itemCerrar.setBackground(new java.awt.Color(230, 230, 230));
        itemCerrar.setForeground(new java.awt.Color(0, 53, 102));
        itemCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x - copia.png"))); // NOI18N
        itemCerrar.setText("Cerrar todo");
        itemCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCerrarActionPerformed(evt);
            }
        });
        nmSalir.add(itemCerrar);

        jMenuBar1.add(nmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmVolverActionPerformed
        interfazEmpleado pEmpleado = new interfazEmpleado(idEmpleado);
        pEmpleado.setVisible(true);
        pEmpleado.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_itmVolverActionPerformed

    private void itmLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmLimpiarActionPerformed
        txtuserCliente.setText("");
        passContraseña.setText("");
        passContraseñaConfirmar.setText("");
    }//GEN-LAST:event_itmLimpiarActionPerformed

    private void itemCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCerrarActionPerformed
        Window[] windows = Window.getWindows();
        for (Window window : windows) {
            window.dispose();
        }
        System.exit(0);
    }//GEN-LAST:event_itemCerrarActionPerformed

    private void passContraseñaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_passContraseñaActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_passContraseñaActionPerformed

    private void passContraseñaConfirmarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_passContraseñaConfirmarActionPerformed

    }// GEN-LAST:event_passContraseñaConfirmarActionPerformed

    private void btntVerOcultarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btntVerOcultarActionPerformed
        ImageIcon iconMostrar = new ImageIcon(getClass().getResource("/img/ver.png"));
        ImageIcon iconOcultar = new ImageIcon(getClass().getResource("/img/ocultar.png"));
        if (btntVerOcultar.isSelected()) {
            // Si está seleccionado, muestra la contraseña y cambia el ícono a "mostrar"
            passContraseña.setEchoChar((char) 0);
            btntVerOcultar.setIcon(iconMostrar);
        } else {
            // Si no está seleccionado, oculta la contraseña y cambia el ícono a "ocultar"
            passContraseña.setEchoChar('*');
            btntVerOcultar.setIcon(iconOcultar);
        }
    }// GEN-LAST:event_btntVerOcultarActionPerformed

    private void btntVerOcultarConfrimarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btntVerOcultarConfrimarActionPerformed
        ImageIcon iconMostrar = new ImageIcon(getClass().getResource("/img/ver.png"));
        ImageIcon iconOcultar = new ImageIcon(getClass().getResource("/img/ocultar.png"));
        if (btntVerOcultarConfrimar.isSelected()) {
            // Si está seleccionado, muestra la contraseña y cambia el ícono a "mostrar"
            passContraseñaConfirmar.setEchoChar((char) 0);
            btntVerOcultarConfrimar.setIcon(iconMostrar);
        } else {
            // Si no está seleccionado, oculta la contraseña y cambia el ícono a "ocultar"
            passContraseñaConfirmar.setEchoChar('*');
            btntVerOcultarConfrimar.setIcon(iconOcultar);
        }
    }// GEN-LAST:event_btntVerOcultarConfrimarActionPerformed

    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCrearCuentaActionPerformed
        String idCuenta = generateIdCuenta();
        String idCliente = txtuserCliente.getText();
        String contraseña = new String(passContraseña.getPassword());
        String contraseñaConfirmar = new String(passContraseñaConfirmar.getPassword());
        String tipoCuenta = rdoCredito.isSelected() ? "credito" : "debito";
        if (!existeCliente(idCliente)) {
            JOptionPane.showMessageDialog(null, "Cliente no registrado.");
            return;
        }
        if (validarContraseña(contraseña, contraseñaConfirmar)) {
            try (Connection conn = DBConnection.getConnection()) {
                String sqlCuenta = "INSERT INTO cuenta (idCuenta, idCliente, tipoCuenta, contraseña) VALUES (?, ?, ?, ?)";
                PreparedStatement psCuenta = conn.prepareStatement(sqlCuenta);
                psCuenta.setString(1, idCuenta);
                psCuenta.setString(2, idCliente);
                psCuenta.setString(3, tipoCuenta);
                psCuenta.setString(4, contraseña);
                psCuenta.executeUpdate();
                txtuserCliente.setText("");
                passContraseña.setText("");
                passContraseñaConfirmar.setText("");
                JOptionPane.showMessageDialog(null, "Cuenta creada exitosamente.Numero de Cuenta" + idCuenta,"Felicidades",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al insertar los datos datos");
            }
        }
    }// GEN-LAST:event_btnCrearCuentaActionPerformed

    private boolean existeCliente(String idCliente) {
        String sql = "SELECT COUNT(*) FROM CLIENTE WHERE IDCLIENTE = ?";
        try (Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, idCliente);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al verificar Cliente: " + e.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    private String generateIdCuenta() {
        // Establece lo que va usar
        String characters = "0123456789";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder();
        // Generar 8 dígitos aleatorios
        for (int i = 0; i < 8; i++) {
            int index = rnd.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    private boolean validarContraseña(String contraseña, String contraseñaConfirmar) {
        // Retorna falso al cumplirse
        if (contraseña.isEmpty() || contraseñaConfirmar.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar y confirmar su contraseña.");
            return false;
        }
        // Retorna falso al cumplirse
        if (contraseña.length() != 8) {
            JOptionPane.showMessageDialog(null, "La contraseña debe tener exactamente 8 caracteres.");
            return false;
        }
        // Retorna falso al cumplirse
        if (!contraseña.equals(contraseñaConfirmar)) {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden.");
            return false;
        }
        // Si no se cumple ninguna se manda verdad y se puede continuar
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JToggleButton btntVerOcultar;
    private javax.swing.JToggleButton btntVerOcultarConfrimar;
    private javax.swing.ButtonGroup grpTipoCuenta;
    private javax.swing.JMenuItem itemCerrar;
    private javax.swing.JMenuItem itmLimpiar;
    private javax.swing.JMenuItem itmVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu nmSalir;
    private javax.swing.JPasswordField passContraseña;
    private javax.swing.JPasswordField passContraseñaConfirmar;
    private javax.swing.JRadioButton rdoCredito;
    private javax.swing.JRadioButton rdoDebito;
    private javax.swing.JTextField txtuserCliente;
    // End of variables declaration//GEN-END:variables
}
