package Ventanas.cliente;

import Ventanas.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import javax.swing.JOptionPane;

public class clienteCuenta extends javax.swing.JFrame {
    private String idCuenta;

    public clienteCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
        initComponents();
        this.setTitle("Bienvenido!!");

        cargarDatos();
    }

    private void cargarDatos() {
        try (Connection conn = DBConnection.getConnection()) {
            // Consulta SQL para obtener el saldo de la cuenta
            String sql = "SELECT saldo FROM cuenta WHERE idCuenta = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, this.idCuenta); // Asignar el idCuenta al parámetro de la consulta
            ResultSet rs = stmt.executeQuery();

            // Verificar si se obtuvo un resultado
            if (rs.next()) {
                // Obtener el saldo de la base de datos
                String saldo = rs.getString("saldo");
                // Mostrar el idCuenta y saldo en las JLabel
                idCuentaDar.setText(this.idCuenta);
                cuentaSaldoDar.setText("S/. " + saldo);
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private double obtenerSaldoRecibir() {
        double saldo = 0.0;
        try {
            // Obtener el texto del JTextField y convertirlo a double
            saldo = Double.parseDouble(txtCuenta.getText());
        } catch (NumberFormatException e) {
            // Manejo de errores si el texto no es un número válido
            JOptionPane.showMessageDialog(null, "El valor ingresado no es un número válido.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        return saldo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Deposito = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCuenta = new javax.swing.JTextField();
        Transacion = new javax.swing.JButton();
        cuentaSaldoDar = new javax.swing.JLabel();
        idCuentaDar = new javax.swing.JLabel();
        saldoRecibir = new javax.swing.JTextField();
        actulizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Nuevo");

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 148, Short.MAX_VALUE));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE));

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 148, Short.MAX_VALUE));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 51, 51));
        jLabel14.setText("Bank");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel15.setText("Peru");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel4.setText("Transacción ");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setText("N° Cuenta:");

        Deposito.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Deposito.setText("Deposito ami cuenta");
        Deposito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Deposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setText("Saldo actual:");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel7.setText("Datos de la cuenta:");

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel9.setText("N° Cuenta:");

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel10.setText("Dinero a transferir:");

        txtCuenta.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCuentaActionPerformed(evt);
            }
        });

        Transacion.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Transacion.setText("Realizar Transacción ");
        Transacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Transacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransacionActionPerformed(evt);
            }
        });

        cuentaSaldoDar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        cuentaSaldoDar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        idCuentaDar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        idCuentaDar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        saldoRecibir.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        saldoRecibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldoRecibirActionPerformed(evt);
            }
        });

        actulizar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        actulizar.setText("Actualizar datos");
        actulizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        actulizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actulizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(jLabel3))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel7)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addGap(23, 23, 23)
                                                                .addComponent(jLabel15)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel14))
                                                        .addComponent(jLabel4)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(53, 53, 53)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel9)
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(jLabel5))
                                                                .addGap(76, 76, 76)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                        false)
                                                                        .addComponent(cuentaSaldoDar,
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                        .addComponent(idCuentaDar,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                        .addComponent(txtCuenta,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                162,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel8))
                                                        .addGroup(jPanel1Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                        false)
                                                                .addComponent(Transacion,
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jLabel10)
                                                                        .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(saldoRecibir,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                162,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addComponent(Deposito,
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(actulizar,
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46,
                                        Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(idCuentaDar, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(cuentaSaldoDar, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(83, 83, 83)
                                                .addComponent(jLabel8))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel9)
                                                        .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(saldoRecibir, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addComponent(Transacion)
                                .addGap(18, 18, 18)
                                .addComponent(Deposito)
                                .addGap(18, 18, 18)
                                .addComponent(actulizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57,
                                        Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCuentaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtCuentaActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtCuentaActionPerformed

    private void DepositoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_DepositoActionPerformed
        Deposito pDeposito = new Deposito(idCuenta);
        pDeposito.setVisible(true);
        pDeposito.setLocationRelativeTo(null);
        this.dispose();
    }// GEN-LAST:event_DepositoActionPerformed

    private void TransacionActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_TransacionActionPerformed
        Connection conn = null;
        double montoDeposito;
        String idCuentaRecibir = txtCuenta.getText();
        try {
            // Obtener la conexión
            conn = DBConnection.getConnection();

            String idTransaccion = generateidTransaccion();
            String idEmpleado = "WEB00001";
            String tipoTransaccion = "Transferencia";
            String descripcion = "Por Banca Web aprobada por el Cliente";

            // Consultar el tipo de cuenta
            String tipoCuentaQuery = "SELECT tipoCuenta, saldo FROM cuenta WHERE idCuenta = ?";
            PreparedStatement psTipoCuenta = conn.prepareStatement(tipoCuentaQuery);
            psTipoCuenta.setString(1, idCuenta);
            ResultSet rsTipoCuenta = psTipoCuenta.executeQuery();

            if (!rsTipoCuenta.next()) {
                JOptionPane.showMessageDialog(this, "Cuenta no encontrada.");
                return;
            }

            String tipoCuenta = rsTipoCuenta.getString("tipoCuenta");
            double saldoActual = rsTipoCuenta.getDouble("saldo");

            // Convertir saldoRecibir a double
            try {
                montoDeposito = Double.parseDouble(saldoRecibir.getText().trim());
                if (montoDeposito <= 0) {
                    JOptionPane.showMessageDialog(this, "El monto debe ser mayor que 0.");
                    return;
                }

                // Validar saldo para cuentas de débito
                if ("debito".equals(tipoCuenta) && montoDeposito > saldoActual) {
                    JOptionPane.showMessageDialog(this,
                            "El monto a retirar excede el saldo disponible.");
                    return;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingrese un monto válido.");
                return;
            }

            // Restar dinero de la cuenta actual
            String queryRestar = "UPDATE cuenta SET saldo = saldo - ? WHERE idCuenta = ?";
            PreparedStatement psRestar = conn.prepareStatement(queryRestar);
            psRestar.setDouble(1, montoDeposito);
            psRestar.setString(2, idCuenta);
            psRestar.executeUpdate();

            // Sumar dinero a la cuenta que recibe
            String querySumar = "UPDATE cuenta SET saldo = saldo + ? WHERE idCuenta = ?";
            PreparedStatement psSumar = conn.prepareStatement(querySumar);
            psSumar.setDouble(1, montoDeposito);
            psSumar.setString(2, idCuentaRecibir);
            psSumar.executeUpdate();

            // Insertar la transacción en la tabla TRANSACCION
            String queryInsert = "INSERT INTO TRANSACCION (IDTRANSACCION, IDCUENTA, IDEMPLEADO, TIPOTRANSACCION, DESCRIPCION, MONTO, CUENTARECIBE) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement psInsert = conn.prepareStatement(queryInsert);
            psInsert.setString(1, idTransaccion);
            psInsert.setString(2, idCuenta);
            psInsert.setString(3, idEmpleado);
            psInsert.setString(4, tipoTransaccion);
            psInsert.setString(5, descripcion);
            psInsert.setDouble(6, montoDeposito);
            psInsert.setString(7, idCuentaRecibir);
            psInsert.executeUpdate();

            // Mostrar mensaje de éxito en un JPanel
            JOptionPane.showMessageDialog(this, "Depósito realizado exitosamente.");
            ticket Boleta = new ticket(idTransaccion, idCuenta, idEmpleado, tipoTransaccion, descripcion,
                    montoDeposito,
                    idCuentaRecibir);
            Boleta.setVisible(true);
            Boleta.setLocationRelativeTo(null);
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de errores
            JOptionPane.showMessageDialog(null, "Error en la transacción: " + e.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
        } finally {
            // Cerrar la conexión si está abierta
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }// GEN-LAST:event_TransacionActionPerformed

    private void saldoRecibirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_saldoRecibirActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_saldoRecibirActionPerformed

    private void actulizarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_actulizarActionPerformed
        cargarDatos();
    }// GEN-LAST:event_actulizarActionPerformed
     // Método para generar idTransaccion

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
    private javax.swing.JButton Deposito;
    private javax.swing.JButton Transacion;
    private javax.swing.JButton actulizar;
    private javax.swing.JLabel cuentaSaldoDar;
    private javax.swing.JLabel idCuentaDar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField saldoRecibir;
    private javax.swing.JTextField txtCuenta;
    // End of variables declaration//GEN-END:variables
}
