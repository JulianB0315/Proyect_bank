
package GUI;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Image;

public class editarCliente extends javax.swing.JFrame {
private String idEmpleado;
    public editarCliente(String idEmpleado2) {
        initComponents();
        this.idEmpleado= idEmpleado;
        this.setTitle("Deposito a Cuenta");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/logo.png"));
        Image logo = icon.getImage();
        setIconImage(logo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        passContraseñaConfirmar = new javax.swing.JPasswordField();
        passContraseñaConfirmar1 = new javax.swing.JPasswordField();
        passContraseñaConfirmar2 = new javax.swing.JPasswordField();
        passContraseñaConfirmar3 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itmVolver = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itmLimpiar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 53, 102));

        jPanel2.setBackground(new java.awt.Color(230, 230, 230));

        btnEditar.setBackground(new java.awt.Color(230, 230, 230));
        btnEditar.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(0, 53, 102));
        btnEditar.setText("Editar datos");
        btnEditar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 3, 1, 3, new java.awt.Color(0, 53, 102)));
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 53, 102));
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        jLabel7.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 53, 102));
        jLabel7.setText("          Editar  Datos del Cliente ");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 1, 3, new java.awt.Color(0, 53, 102)));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 53, 102));
        jLabel3.setText("   Nombres        :");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 53, 102));
        jLabel4.setText("   Correo          :");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 53, 102));
        jLabel5.setText("   Apellidos       :");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 53, 102));
        jLabel6.setText("   Direccion      :");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        passContraseñaConfirmar.setBackground(new java.awt.Color(230, 230, 230));
        passContraseñaConfirmar.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        passContraseñaConfirmar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 53, 102)));
        passContraseñaConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passContraseñaConfirmarActionPerformed(evt);
            }
        });

        passContraseñaConfirmar1.setBackground(new java.awt.Color(230, 230, 230));
        passContraseñaConfirmar1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        passContraseñaConfirmar1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 53, 102)));
        passContraseñaConfirmar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passContraseñaConfirmar1ActionPerformed(evt);
            }
        });

        passContraseñaConfirmar2.setBackground(new java.awt.Color(230, 230, 230));
        passContraseñaConfirmar2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        passContraseñaConfirmar2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 53, 102)));
        passContraseñaConfirmar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passContraseñaConfirmar2ActionPerformed(evt);
            }
        });

        passContraseñaConfirmar3.setBackground(new java.awt.Color(230, 230, 230));
        passContraseñaConfirmar3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        passContraseñaConfirmar3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 53, 102)));
        passContraseñaConfirmar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passContraseñaConfirmar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passContraseñaConfirmar1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passContraseñaConfirmar3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passContraseñaConfirmar2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passContraseñaConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(208, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addGap(265, 265, 265)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passContraseñaConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(passContraseñaConfirmar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(passContraseñaConfirmar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(passContraseñaConfirmar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addComponent(jLabel10)
                    .addContainerGap(247, Short.MAX_VALUE)))
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
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
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

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
    }//GEN-LAST:event_btnEditarActionPerformed

    private void passContraseñaConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passContraseñaConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passContraseñaConfirmarActionPerformed

    private void passContraseñaConfirmar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passContraseñaConfirmar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passContraseñaConfirmar1ActionPerformed

    private void passContraseñaConfirmar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passContraseñaConfirmar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passContraseñaConfirmar2ActionPerformed

    private void passContraseñaConfirmar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passContraseñaConfirmar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passContraseñaConfirmar3ActionPerformed

    private void itmVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmVolverActionPerformed
        interfazEmpleado pEmpleado = new interfazEmpleado(idEmpleado);
        pEmpleado.setVisible(true);
        pEmpleado.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_itmVolverActionPerformed

    private void itmLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmLimpiarActionPerformed
        
    }//GEN-LAST:event_itmLimpiarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JMenuItem itmLimpiar;
    private javax.swing.JMenuItem itmVolver;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField passContraseñaConfirmar;
    private javax.swing.JPasswordField passContraseñaConfirmar1;
    private javax.swing.JPasswordField passContraseñaConfirmar2;
    private javax.swing.JPasswordField passContraseñaConfirmar3;
    // End of variables declaration//GEN-END:variables
}
