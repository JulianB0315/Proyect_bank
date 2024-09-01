package Ventanas.cliente;

import Ventanas.DBConnection;
import Ventanas.cliente.clienteCuenta;
import Ventanas.inicioGuia;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class inicioSession extends javax.swing.JFrame {

    public inicioSession() {
        initComponents();
        cerrar();
        this.setTitle("Inicio de Session");
        Contraseña.setEchoChar('*');
        ver.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
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
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ButtonVolver = new javax.swing.JButton();
        ButtonSession = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        TXTDNI = new javax.swing.JTextField();
        Contraseña = new javax.swing.JPasswordField();
        ver = new javax.swing.JLabel();
        ocultar = new javax.swing.JLabel();

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
                        .addGap(0, 348, Short.MAX_VALUE));

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 148, Short.MAX_VALUE));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 348, Short.MAX_VALUE));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel12.setText("Ingresar datos:");

        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel13.setText(" Bienvenido otra vez!!");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 51, 51));
        jLabel14.setText("Bank");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel15.setText("Peru");

        ButtonVolver.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ButtonVolver.setText("Volver");
        ButtonVolver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVolverActionPerformed(evt);
            }
        });

        ButtonSession.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ButtonSession.setText("Iniciar sesion");
        ButtonSession.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ButtonSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSessionActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel16.setText("DNI:");

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel17.setText("Contraseña:");

        TXTDNI.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        TXTDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTDNIActionPerformed(evt);
            }
        });

        Contraseña.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñaActionPerformed(evt);
            }
        });

        ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ver.png"))); // NOI18N
        ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verMouseClicked(evt);
            }
        });

        ocultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ocultar.png"))); // NOI18N
        ocultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(jLabel3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                .createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49,
                                                        Short.MAX_VALUE)
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel15)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel14)
                                                .addGap(67, 67, 67))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(265, 265, 265)
                                                                .addComponent(jLabel8))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel12))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(30, 30, 30)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(ButtonVolver,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        150,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        Short.MAX_VALUE)
                                                                                .addComponent(ButtonSession,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        150,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGroup(jPanel1Layout
                                                                                        .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(12, 12, 12)
                                                                                                .addComponent(jLabel16)
                                                                                                .addGroup(jPanel1Layout
                                                                                                        .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                false)
                                                                                                        .addGroup(
                                                                                                                jPanel1Layout
                                                                                                                        .createSequentialGroup()
                                                                                                                        .addGap(75,
                                                                                                                                75,
                                                                                                                                75)
                                                                                                                        .addComponent(
                                                                                                                                jLabel13)
                                                                                                                        .addGap(41,
                                                                                                                                41,
                                                                                                                                41))
                                                                                                        .addGroup(
                                                                                                                jPanel1Layout
                                                                                                                        .createSequentialGroup()
                                                                                                                        .addGap(91,
                                                                                                                                91,
                                                                                                                                91)
                                                                                                                        .addComponent(
                                                                                                                                TXTDNI)
                                                                                                                        .addGap(12,
                                                                                                                                12,
                                                                                                                                12))))
                                                                                        .addGroup(
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanel1Layout
                                                                                                        .createSequentialGroup()
                                                                                                        .addComponent(
                                                                                                                jLabel17)
                                                                                                        .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                        .addComponent(
                                                                                                                Contraseña,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                200,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                                                                .addComponent(ver)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(ocultar)
                                                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                                .addGap(41, 41, 41)))
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel14)
                                                        .addComponent(jLabel15))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel13)
                                                .addGap(7, 7, 7)
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel16)
                                                        .addComponent(TXTDNI))
                                                .addGap(30, 30, 30)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel17)
                                                                .addComponent(Contraseña,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(ver)
                                                        .addComponent(ocultar))
                                                .addGap(21, 21, 21)
                                                .addComponent(jLabel8)
                                                .addGap(21, 21, 21)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(ButtonSession,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 45,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ButtonVolver,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 45,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(124, 124, 124))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jLabel3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTDNIActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_TXTDNIActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_TXTDNIActionPerformed

    private void ContraseñaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ContraseñaActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_ContraseñaActionPerformed

    private void verMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_verMouseClicked
        ocultar.setVisible(true);
        ver.setVisible(false);
        Contraseña.setEchoChar('*');
    }// GEN-LAST:event_verMouseClicked

    private void ocultarMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_ocultarMouseClicked
        ocultar.setVisible(false);
        ver.setVisible(true);
        Contraseña.setEchoChar((char) 0);
    }// GEN-LAST:event_ocultarMouseClicked

    // Funcion de salir
    public void cerrar() {
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    JOptionPane.showMessageDialog(null, "Gracias por visitarnos", "Vuelva pronto",
                            JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }
            });
            this.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void ButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ButtonVolverActionPerformed
        inicioGuia pantallaGuia = new inicioGuia();
        pantallaGuia.setVisible(true);
        pantallaGuia.setLocationRelativeTo(null);
        this.dispose();
    }// GEN-LAST:event_ButtonVolverActionPerformed

    private void ButtonSessionActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ButtonSessionActionPerformed
        // Obtener los datos del formulario
        String dni = TXTDNI.getText();
        // Convertir la contraseña insertada aun string
        char[] contraseñaIngresadaArray = Contraseña.getPassword();
        String contraseñaIngresada = new String(contraseñaIngresadaArray);

        try (Connection conn = DBConnection.getConnection()) {
            // Paso 1: Obtener el idCliente usando el DNI
            String sql = "SELECT idCliente FROM cliente WHERE dni = ?";
            String idCliente = null;
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, dni);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        idCliente = rs.getString("idCliente");
                    } else {
                        JOptionPane.showMessageDialog(null, "Datos Incorrectos!!", "Advertencia",
                                JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
            }

            // Paso 2: Obtener la contraseña y el idCuenta usando el idCliente
            sql = "SELECT contraseña, idCuenta FROM cuenta WHERE idCliente = ?";
            String idCuenta = null;
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, idCliente);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        String contraseñaAlmacenada = rs.getString("contraseña");
                        idCuenta = rs.getString("idCuenta");
                        // Comparar la contraseña con la contraseña en la base de datos
                        if (contraseñaIngresada.equals(contraseñaAlmacenada)) {
                            // Mandar el idCuenta
                            JFrame clienteCuenta = new clienteCuenta(idCuenta);
                            clienteCuenta.setVisible(true);
                            clienteCuenta.setLocationRelativeTo(null);
                            this.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "Datos Incorrectos!!", "Advertencia",
                                    JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Datos Incorrectos!!", "Advertencia",
                                JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error: " + e.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }// GEN-LAST:event_ButtonSessionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonSession;
    private javax.swing.JButton ButtonVolver;
    private javax.swing.JPasswordField Contraseña;
    private javax.swing.JTextField TXTDNI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel ocultar;
    private javax.swing.JLabel ver;
    // End of variables declaration//GEN-END:variables
}
