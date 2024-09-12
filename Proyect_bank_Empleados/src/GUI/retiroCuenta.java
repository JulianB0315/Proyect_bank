
package GUI;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Image;
import DB.DBConnection;

public class retiroCuenta extends javax.swing.JFrame {
private String idEmpleado;
    public retiroCuenta(String idEmpleado) {
        initComponents();
        passContraseña.setEchoChar('*');
        this.idEmpleado= idEmpleado;
        this.setTitle("Retiro de Cuenta");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/logo.png"));
        Image logo = icon.getImage();
        setIconImage(logo);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtCuentadar = new javax.swing.JTextField();
        passContraseña = new javax.swing.JPasswordField();
        btntVerOcultar = new javax.swing.JToggleButton();
        jLabel15 = new javax.swing.JLabel();
        lblsaldo = new javax.swing.JLabel();
        btnRealizar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtmonto = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lbltipoCuenta = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        btncargadatos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itmVolver = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itmLimpiar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 53, 102));

        jPanel2.setBackground(new java.awt.Color(230, 230, 230));

        jLabel14.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 53, 102));
        jLabel14.setText("   N° de Cuenta             :");
        jLabel14.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        txtCuentadar.setBackground(new java.awt.Color(230, 230, 230));
        txtCuentadar.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        txtCuentadar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 53, 102)));
        txtCuentadar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCuentadarActionPerformed(evt);
            }
        });

        passContraseña.setBackground(new java.awt.Color(230, 230, 230));
        passContraseña.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        passContraseña.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 53, 102)));
        passContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passContraseñaActionPerformed(evt);
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

        jLabel15.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 53, 102));
        jLabel15.setText("   Contraseña               :");
        jLabel15.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        lblsaldo.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        lblsaldo.setForeground(new java.awt.Color(0, 53, 102));
        lblsaldo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 53, 102)));

        btnRealizar.setBackground(new java.awt.Color(230, 230, 230));
        btnRealizar.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnRealizar.setForeground(new java.awt.Color(0, 53, 102));
        btnRealizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/retiro.png"))); // NOI18N
        btnRealizar.setText("Realizar retiro");
        btnRealizar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 3, 1, 3, new java.awt.Color(0, 53, 102)));
        btnRealizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRealizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 53, 102));
        jLabel17.setText("   Saldo                        :");
        jLabel17.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        txtmonto.setBackground(new java.awt.Color(230, 230, 230));
        txtmonto.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        txtmonto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 53, 102)));

        jLabel19.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 53, 102));
        jLabel19.setText("   Monto                      :");
        jLabel19.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dni.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dolar.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transferancia.png"))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 53, 102));
        jLabel20.setText("   Tipo de Cuenta         :");
        jLabel20.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        lbltipoCuenta.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        lbltipoCuenta.setForeground(new java.awt.Color(0, 53, 102));
        lbltipoCuenta.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 53, 102)));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cuenta.png"))); // NOI18N

        jLabel28.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 53, 102));
        jLabel28.setText("                   Retiros de Cuenta");
        jLabel28.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 1, 3, new java.awt.Color(0, 53, 102)));

        btncargadatos.setBackground(new java.awt.Color(230, 230, 230));
        btncargadatos.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btncargadatos.setForeground(new java.awt.Color(0, 53, 102));
        btncargadatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cargar.png"))); // NOI18N
        btncargadatos.setText("Cargar Datos");
        btncargadatos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 3, 1, 3, new java.awt.Color(0, 53, 102)));
        btncargadatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncargadatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncargadatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)
                                .addComponent(lbltipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addGap(18, 18, 18)
                                    .addComponent(passContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btntVerOcultar))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtCuentadar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel8)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel19)
                                    .addComponent(btnRealizar, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel11))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtmonto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel9))))
                            .addComponent(btncargadatos, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(txtCuentadar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(passContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15))
                    .addComponent(btntVerOcultar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbltipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblsaldo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtmonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRealizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncargadatos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        jLabel3.setFont(new java.awt.Font("Serif", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(212, 175, 55));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo02.png"))); // NOI18N
        jLabel3.setText("Nueva Banco Perú  ");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 1, 3, new java.awt.Color(212, 175, 55)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
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
        itmVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/volver.png"))); // NOI18N
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

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCuentadarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCuentadarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCuentadarActionPerformed

    private void passContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passContraseñaActionPerformed

    private void btntVerOcultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntVerOcultarActionPerformed
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
    }//GEN-LAST:event_btntVerOcultarActionPerformed

    private void btnRealizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarActionPerformed
        String idTransaccion = generateidTransaccion();
        String cuentaCliente = txtCuentadar.getText();
        String contraseñaCliente = new String(passContraseña.getPassword());
        String cuentaRemitente = "00001RET";
        String MontoString = txtmonto.getText();
        String tipoTransaccion = "Retiro";
        String descripcion = "Realizada por un empleado autorizado";
            if(!existeCuenta(cuentaCliente)){
                JOptionPane.showMessageDialog(null, "Cuenta no encontrada.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(!comprobarEstadoCuenta(cuentaCliente)){
            JOptionPane.showMessageDialog(null, "La cuenta se encuentra inactiva.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(!MontoString.matches("^\\d*\\.?\\d+$")){
                JOptionPane.showMessageDialog(null,"Ingresar un montos Valido","Error",JOptionPane.WARNING_MESSAGE);
                return;
            }
            double Monto = Double.parseDouble(MontoString);
            if(!comprobarSaldo(cuentaCliente, Monto)){
            JOptionPane.showMessageDialog(null, "Saldo insuficiente.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(!comprobarTransferencia(cuentaCliente, contraseñaCliente, lblsaldo, lbltipoCuenta)){
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(cuentaCliente.isEmpty()||contraseñaCliente.isEmpty()||MontoString.isEmpty()){
                JOptionPane.showMessageDialog(null, "Completar los campos.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try(Connection conn = DBConnection.getConnection()) {
                //Resta saldo
                String queryRestar = "UPDATE cuenta SET saldo = saldo - ? WHERE idCuenta = ?";
                PreparedStatement psRestar = conn.prepareStatement(queryRestar);
                psRestar.setDouble(1, Monto);
                psRestar.setString(2, cuentaCliente);
                psRestar.executeUpdate();

                //Inserta datos de Transferancia
                String queryInsert = "INSERT INTO TRANSACCION (IDTRANSACCION, IDCUENTA, IDEMPLEADO, TIPOTRANSACCION, DESCRIPCION, MONTO, CUENTARECIBE) VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement psInsert = conn.prepareStatement(queryInsert);
                psInsert.setString(1, idTransaccion);
                psInsert.setString(2, cuentaCliente);
                psInsert.setString(3, idEmpleado);
                psInsert.setString(4, tipoTransaccion);
                psInsert.setString(5, descripcion);
                psInsert.setDouble(6, Monto);
                psInsert.setString(7, cuentaRemitente);
                psInsert.executeUpdate();
                JOptionPane.showMessageDialog(null, "El retiro se realizada con éxito","Felicidades",JOptionPane.INFORMATION_MESSAGE);
                txtmonto.setText("");
                voucherPago pVoucherPago = new voucherPago(idTransaccion);
                pVoucherPago.setVisible(true);
                pVoucherPago.setLocationRelativeTo(null);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Algo salio mal :c","Error",JOptionPane.WARNING_MESSAGE);
            }            
    }//GEN-LAST:event_btnRealizarActionPerformed

    private void btncargadatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncargadatosActionPerformed
        String cuentaCliente = txtCuentadar.getText();
        String contraseñaCliente = new String(passContraseña.getPassword());
        if (!comprobarTransferencia(cuentaCliente, contraseñaCliente, lblsaldo, lbltipoCuenta)) {
            JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btncargadatosActionPerformed

    private void itmVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmVolverActionPerformed
        interfazEmpleado pEmpleado = new interfazEmpleado(idEmpleado);
        pEmpleado.setVisible(true);
        pEmpleado.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_itmVolverActionPerformed

    private void itmLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmLimpiarActionPerformed

    }//GEN-LAST:event_itmLimpiarActionPerformed
    private boolean existeCuenta(String cuenta) {
        String sql = "SELECT COUNT(*) FROM cuenta WHERE idcuenta = ?";
        try (Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, cuenta);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al verificar Cuenta: " + e.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        return true;
    }

    private boolean comprobarTransferencia(String cuenta, String contraseñaCliente, JLabel lblSaldo,
            JLabel lblTipoCuenta) {
        String sql = "SELECT CONTRASEÑA, SALDO, TIPOCUENTA FROM cuenta WHERE idCuenta = ?";
        String contraseña = null;
        String saldo = null;
        String tipoCuenta = null;

        try (Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, cuenta);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                contraseña = rs.getString("CONTRASEÑA");
                saldo = rs.getString("SALDO");
                tipoCuenta = rs.getString("TIPOCUENTA");
            } else {
                return false;
            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al consultar la cuenta: " + e.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (contraseñaCliente.equals(contraseña)) {
            lblSaldo.setText("S/" + saldo);
            lblTipoCuenta.setText(tipoCuenta);
            return true;
        } else {
            return false;
        }
    }

    private boolean comprobarSaldo(String cuenta, double monto) {
        String sql = "SELECT SALDO, TIPOCUENTA FROM cuenta WHERE idCuenta = ?";
        double saldo = 0.0;
        String tipoCuenta = "";
        try (Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, cuenta);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                saldo = rs.getDouble("SALDO");
                tipoCuenta = rs.getString("TIPOCUENTA");
            } else {
                return false;
            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al consultar la cuenta: " + e.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (tipoCuenta.equalsIgnoreCase("debito") && monto > saldo) {
            return false;
        }
        return true;
    }

    private boolean comprobarEstadoCuenta(String cuenta) {
        String sql = "SELECT ESTADO FROM cuenta WHERE idCuenta = ?";
        String estadoCuenta = "";

        try (Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, cuenta);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                estadoCuenta = rs.getString("ESTADO");
            } else {
                return false;
            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al consultar el estado de la cuenta: " + e.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!estadoCuenta.equalsIgnoreCase("activa")) {
            return false;
        }
        return true;
    }

    private String generateidTransaccion() {
        String prefix = "0000";
        String characters = "0123456789";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(prefix);
        while (sb.length() < 8) {
            int index = rnd.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRealizar;
    private javax.swing.JButton btncargadatos;
    private javax.swing.JToggleButton btntVerOcultar;
    private javax.swing.JMenuItem itmLimpiar;
    private javax.swing.JMenuItem itmVolver;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblsaldo;
    private javax.swing.JLabel lbltipoCuenta;
    private javax.swing.JPasswordField passContraseña;
    private javax.swing.JTextField txtCuentadar;
    private javax.swing.JTextField txtmonto;
    // End of variables declaration//GEN-END:variables
}
