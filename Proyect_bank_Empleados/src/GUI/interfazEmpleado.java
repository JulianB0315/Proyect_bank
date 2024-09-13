
package GUI;

import javax.swing.ImageIcon;
import java.awt.Image;

public class interfazEmpleado extends javax.swing.JFrame {
private String idEmpleado;
    public interfazEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
        initComponents();
        this.setTitle("Interfaz de empleados");
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
        btnHistorialTransacion = new javax.swing.JButton();
        btnBorrarCuenta = new javax.swing.JButton();
        btnCuentacrear = new javax.swing.JButton();
        btnTransaccion = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnBuscarCliente = new javax.swing.JButton();
        btnCrearClienta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        nmSalir = new javax.swing.JMenu();
        itemCerrar = new javax.swing.JMenuItem();
        mnRestablecer = new javax.swing.JMenu();
        itemRestablecer = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 53, 102));

        jPanel2.setBackground(new java.awt.Color(230, 230, 230));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 53, 102), 2));

        btnHistorialTransacion.setBackground(new java.awt.Color(230, 230, 230));
        btnHistorialTransacion.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnHistorialTransacion.setForeground(new java.awt.Color(0, 53, 102));
        btnHistorialTransacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tramite.png"))); // NOI18N
        btnHistorialTransacion.setText("Historial de Transacciones");
        btnHistorialTransacion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 3, 1, 3, new java.awt.Color(0, 53, 102)));
        btnHistorialTransacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHistorialTransacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialTransacionActionPerformed(evt);
            }
        });

        btnBorrarCuenta.setBackground(new java.awt.Color(230, 230, 230));
        btnBorrarCuenta.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnBorrarCuenta.setForeground(new java.awt.Color(0, 53, 102));
        btnBorrarCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ckeck.png"))); // NOI18N
        btnBorrarCuenta.setText("Alterar Cuentas");
        btnBorrarCuenta.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 3, 1, 3, new java.awt.Color(0, 53, 102)));
        btnBorrarCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarCuentaActionPerformed(evt);
            }
        });

        btnCuentacrear.setBackground(new java.awt.Color(230, 230, 230));
        btnCuentacrear.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnCuentacrear.setForeground(new java.awt.Color(0, 53, 102));
        btnCuentacrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cuenta.png"))); // NOI18N
        btnCuentacrear.setText("Crear Cuenta");
        btnCuentacrear.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 3, 1, 3, new java.awt.Color(0, 53, 102)));
        btnCuentacrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCuentacrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuentacrearActionPerformed(evt);
            }
        });

        btnTransaccion.setBackground(new java.awt.Color(230, 230, 230));
        btnTransaccion.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnTransaccion.setForeground(new java.awt.Color(0, 53, 102));
        btnTransaccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dolar.png"))); // NOI18N
        btnTransaccion.setText("Transaccion o Retiro");
        btnTransaccion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 3, 1, 3, new java.awt.Color(0, 53, 102)));
        btnTransaccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTransaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransaccionActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 53, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(212, 175, 55)));
        jPanel3.setPreferredSize(new java.awt.Dimension(40, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(0, 53, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(212, 175, 55)));
        jPanel4.setPreferredSize(new java.awt.Dimension(40, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnBuscarCliente.setBackground(new java.awt.Color(230, 230, 230));
        btnBuscarCliente.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnBuscarCliente.setForeground(new java.awt.Color(0, 53, 102));
        btnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        btnBuscarCliente.setText("Buscar Cliente");
        btnBuscarCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 3, 1, 3, new java.awt.Color(0, 53, 102)));
        btnBuscarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        btnCrearClienta.setBackground(new java.awt.Color(230, 230, 230));
        btnCrearClienta.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnCrearClienta.setForeground(new java.awt.Color(0, 53, 102));
        btnCrearClienta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        btnCrearClienta.setText("Crear Cliente");
        btnCrearClienta.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 3, 1, 3, new java.awt.Color(0, 53, 102)));
        btnCrearClienta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearClienta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearClientaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 384, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTransaccion, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCuentacrear, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearClienta, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHistorialTransacion, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(193, 193, 193)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCuentacrear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCrearClienta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBorrarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHistorialTransacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTransaccion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Serif", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(212, 175, 55));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo02.png"))); // NOI18N
        jLabel1.setText("                    Nueva Banco Perú");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 1, 3, new java.awt.Color(212, 175, 55)));

        jPanel5.setBackground(new java.awt.Color(212, 175, 55));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(212, 175, 55));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jMenuBar1.setBackground(new java.awt.Color(230, 230, 230));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 53, 102)));
        jMenuBar1.setForeground(new java.awt.Color(0, 53, 102));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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

        mnRestablecer.setForeground(new java.awt.Color(0, 53, 102));
        mnRestablecer.setText("Restablecer datos");

        itemRestablecer.setBackground(new java.awt.Color(230, 230, 230));
        itemRestablecer.setForeground(new java.awt.Color(0, 53, 102));
        itemRestablecer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cargar - copia.png"))); // NOI18N
        itemRestablecer.setText("Restaurar datos");
        itemRestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRestablecerActionPerformed(evt);
            }
        });
        mnRestablecer.add(itemRestablecer);

        jMenuBar1.add(mnRestablecer);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCuentacrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuentacrearActionPerformed
       CrearCuenta pCrearCuenta = new CrearCuenta(idEmpleado);
       pCrearCuenta.setVisible(true);
       pCrearCuenta.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCuentacrearActionPerformed

    private void btnBorrarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarCuentaActionPerformed
        borrarCuenta pBorrarCuenta = new borrarCuenta(idEmpleado);
        pBorrarCuenta.setVisible(true);
        pBorrarCuenta.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnBorrarCuentaActionPerformed

    private void btnHistorialTransacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialTransacionActionPerformed
        historialTransaccion pHistorialTransaccion = new historialTransaccion(idEmpleado);
        pHistorialTransaccion.setVisible(true);
        pHistorialTransaccion.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnHistorialTransacionActionPerformed

    private void btnTransaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransaccionActionPerformed
        operacionesEmpleado pTranferenciaEmpleado = new operacionesEmpleado(idEmpleado);
        pTranferenciaEmpleado.setVisible(true);
        pTranferenciaEmpleado.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnTransaccionActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        buscarBaseCliente pCliente  = new buscarBaseCliente(idEmpleado);
        pCliente.setVisible(true);
        pCliente.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnCrearClientaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearClientaActionPerformed
       CrearCliente pCrearCliente = new CrearCliente(idEmpleado);
       pCrearCliente.setVisible(true);
       pCrearCliente.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCrearClientaActionPerformed

    private void itemCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCerrarActionPerformed
        Window[] windows = Window.getWindows();
        for (Window window : windows) {
            window.dispose();
        }
        System.exit(0);
    }//GEN-LAST:event_itemCerrarActionPerformed

    private void itemRestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRestablecerActionPerformed
        cargarDatosCliente(idCliente, txtNombres, txtApellidos, txtCorreo, txtDireccion, txtTelefono);
    }//GEN-LAST:event_itemRestablecerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarCuenta;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnCrearClienta;
    private javax.swing.JButton btnCuentacrear;
    private javax.swing.JButton btnHistorialTransacion;
    private javax.swing.JButton btnTransaccion;
    private javax.swing.JMenuItem itemCerrar;
    private javax.swing.JMenuItem itemRestablecer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JMenu mnRestablecer;
    private javax.swing.JMenu nmSalir;
    // End of variables declaration//GEN-END:variables
}
