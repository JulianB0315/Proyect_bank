
package GUI;

import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Window;
import java.net.URI;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Desktop;
import DB.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class interfazEmpleado extends javax.swing.JFrame {
private String idEmpleado;
    public interfazEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
        initComponents();
        this.setTitle("Interfaz de empleados");
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/logo.png"));
        Image logo = icon.getImage();
        setIconImage(logo);
        saludo(idEmpleado,lblsaludo);
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
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblsaludo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        nmSalir = new javax.swing.JMenu();
        itmCrearClientes = new javax.swing.JMenuItem();
        itmBuscar = new javax.swing.JMenuItem();
        mnEmpleados = new javax.swing.JMenu();
        itmCrearEmpleado = new javax.swing.JMenuItem();
        itmBuscarEmpleado = new javax.swing.JMenuItem();
        nmSalir2 = new javax.swing.JMenu();
        itmCrearCuentas = new javax.swing.JMenuItem();
        itmAlterarCuentas = new javax.swing.JMenuItem();
        nmSalir3 = new javax.swing.JMenu();
        itmHistorial = new javax.swing.JMenuItem();
        itmMovientos = new javax.swing.JMenuItem();
        nmAcercade = new javax.swing.JMenu();
        itmProgramador = new javax.swing.JMenuItem();
        itmGitHub = new javax.swing.JMenuItem();
        nmSalir1 = new javax.swing.JMenu();
        itemCerrar1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 53, 102));

        jPanel2.setBackground(new java.awt.Color(230, 230, 230));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 53, 102), 2));

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inicio-Interfaz.png"))); // NOI18N

        lblsaludo.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        lblsaludo.setForeground(new java.awt.Color(0, 53, 102));
        lblsaludo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 53, 102)));

        jLabel8.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 53, 102));
        jLabel8.setText("¿Que haremos hoy?");
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 53, 102)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblsaludo, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(78, 78, 78)))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(lblsaludo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Serif", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(212, 175, 55));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo02.png"))); // NOI18N
        jLabel1.setText("                   Nueva Banco Perú");
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jMenuBar1.setBackground(new java.awt.Color(230, 230, 230));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 53, 102)));
        jMenuBar1.setForeground(new java.awt.Color(0, 53, 102));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        nmSalir.setForeground(new java.awt.Color(0, 53, 102));
        nmSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hombre-avatar-icon.png"))); // NOI18N
        nmSalir.setText("Clientes");

        itmCrearClientes.setBackground(new java.awt.Color(230, 230, 230));
        itmCrearClientes.setForeground(new java.awt.Color(0, 53, 102));
        itmCrearClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lista-de-verificacion-icon.png"))); // NOI18N
        itmCrearClientes.setText("Crear Cliente");
        itmCrearClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCrearClientesActionPerformed(evt);
            }
        });
        nmSalir.add(itmCrearClientes);

        itmBuscar.setBackground(new java.awt.Color(230, 230, 230));
        itmBuscar.setForeground(new java.awt.Color(0, 53, 102));
        itmBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar-icon.png"))); // NOI18N
        itmBuscar.setText("Buscar Clientes");
        itmBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmBuscarActionPerformed(evt);
            }
        });
        nmSalir.add(itmBuscar);

        jMenuBar1.add(nmSalir);

        mnEmpleados.setForeground(new java.awt.Color(0, 53, 102));
        mnEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/empleado-icon.png"))); // NOI18N
        mnEmpleados.setText("Empleados");

        itmCrearEmpleado.setBackground(new java.awt.Color(230, 230, 230));
        itmCrearEmpleado.setForeground(new java.awt.Color(0, 53, 102));
        itmCrearEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/empleado-crear-icon.png"))); // NOI18N
        itmCrearEmpleado.setText("Crear empleados ");
        itmCrearEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCrearEmpleadoActionPerformed(evt);
            }
        });
        mnEmpleados.add(itmCrearEmpleado);

        itmBuscarEmpleado.setBackground(new java.awt.Color(230, 230, 230));
        itmBuscarEmpleado.setForeground(new java.awt.Color(0, 53, 102));
        itmBuscarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar-empleado-icon.png"))); // NOI18N
        itmBuscarEmpleado.setText("Buscar empleado");
        itmBuscarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmBuscarEmpleadoActionPerformed(evt);
            }
        });
        mnEmpleados.add(itmBuscarEmpleado);

        jMenuBar1.add(mnEmpleados);

        nmSalir2.setForeground(new java.awt.Color(0, 53, 102));
        nmSalir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cuenta-bancaria-icon.png"))); // NOI18N
        nmSalir2.setText("Cuentas");

        itmCrearCuentas.setBackground(new java.awt.Color(230, 230, 230));
        itmCrearCuentas.setForeground(new java.awt.Color(0, 53, 102));
        itmCrearCuentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tarjeta-de-credito-icon.png"))); // NOI18N
        itmCrearCuentas.setText("Crear Cuenta");
        itmCrearCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCrearCuentasActionPerformed(evt);
            }
        });
        nmSalir2.add(itmCrearCuentas);

        itmAlterarCuentas.setBackground(new java.awt.Color(230, 230, 230));
        itmAlterarCuentas.setForeground(new java.awt.Color(0, 53, 102));
        itmAlterarCuentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cuenta-icon.png"))); // NOI18N
        itmAlterarCuentas.setText("Alterar Cuentas");
        itmAlterarCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAlterarCuentasActionPerformed(evt);
            }
        });
        nmSalir2.add(itmAlterarCuentas);

        jMenuBar1.add(nmSalir2);

        nmSalir3.setForeground(new java.awt.Color(0, 53, 102));
        nmSalir3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transferencia-de-dinero-icon.png"))); // NOI18N
        nmSalir3.setText("Transferancias");

        itmHistorial.setBackground(new java.awt.Color(230, 230, 230));
        itmHistorial.setForeground(new java.awt.Color(0, 53, 102));
        itmHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historial-de-transacciones-icon.png"))); // NOI18N
        itmHistorial.setText("Historial");
        itmHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmHistorialActionPerformed(evt);
            }
        });
        nmSalir3.add(itmHistorial);

        itmMovientos.setBackground(new java.awt.Color(230, 230, 230));
        itmMovientos.setForeground(new java.awt.Color(0, 53, 102));
        itmMovientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Registro-icon.png"))); // NOI18N
        itmMovientos.setText("Movimientos bancarios");
        itmMovientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMovientosActionPerformed(evt);
            }
        });
        nmSalir3.add(itmMovientos);

        jMenuBar1.add(nmSalir3);

        nmAcercade.setForeground(new java.awt.Color(0, 53, 102));
        nmAcercade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pregunta-icon.png"))); // NOI18N
        nmAcercade.setText("Acerca de");

        itmProgramador.setBackground(new java.awt.Color(230, 230, 230));
        itmProgramador.setForeground(new java.awt.Color(0, 53, 102));
        itmProgramador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/programador-icon.png"))); // NOI18N
        itmProgramador.setText("Programdor:Julian Burga Bracamonte");
        itmProgramador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmProgramadorActionPerformed(evt);
            }
        });
        nmAcercade.add(itmProgramador);

        itmGitHub.setBackground(new java.awt.Color(230, 230, 230));
        itmGitHub.setForeground(new java.awt.Color(0, 53, 102));
        itmGitHub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/github-icon.png"))); // NOI18N
        itmGitHub.setText("Github");
        itmGitHub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmGitHubActionPerformed(evt);
            }
        });
        nmAcercade.add(itmGitHub);

        jMenuBar1.add(nmAcercade);

        nmSalir1.setForeground(new java.awt.Color(0, 53, 102));
        nmSalir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salida-icon.png"))); // NOI18N
        nmSalir1.setText("Salir");

        itemCerrar1.setBackground(new java.awt.Color(230, 230, 230));
        itemCerrar1.setForeground(new java.awt.Color(0, 53, 102));
        itemCerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x - copia.png"))); // NOI18N
        itemCerrar1.setText("Cerrar todo");
        itemCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCerrar1ActionPerformed(evt);
            }
        });
        nmSalir1.add(itemCerrar1);

        jMenuBar1.add(nmSalir1);

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

    private void itmCrearClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCrearClientesActionPerformed
       CrearCliente pCrearCliente = new CrearCliente(idEmpleado);
       pCrearCliente.setVisible(true);
       pCrearCliente.setLocationRelativeTo(null);
    }//GEN-LAST:event_itmCrearClientesActionPerformed

    private void itemCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCerrar1ActionPerformed
        Window[] windows = Window.getWindows();
        for (Window window : windows) {
            window.dispose();
        }
        System.exit(0);
    }//GEN-LAST:event_itemCerrar1ActionPerformed

    private void itmCrearCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCrearCuentasActionPerformed
        CrearCuenta pCrearCuenta = new CrearCuenta(idEmpleado);
       pCrearCuenta.setVisible(true);
       pCrearCuenta.setLocationRelativeTo(null);
    }//GEN-LAST:event_itmCrearCuentasActionPerformed

    private void itmHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmHistorialActionPerformed
        historialTransaccion pHistorialTransaccion = new historialTransaccion(idEmpleado);
        pHistorialTransaccion.setVisible(true);
        pHistorialTransaccion.setLocationRelativeTo(null);
    }//GEN-LAST:event_itmHistorialActionPerformed

    private void itmBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmBuscarActionPerformed
        buscarBaseCliente pCliente  = new buscarBaseCliente(idEmpleado);
        pCliente.setVisible(true);
        pCliente.setLocationRelativeTo(null);
    }//GEN-LAST:event_itmBuscarActionPerformed

    private void itmAlterarCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAlterarCuentasActionPerformed
        borrarCuenta pBorrarCuenta = new borrarCuenta(idEmpleado);
        pBorrarCuenta.setVisible(true);
        pBorrarCuenta.setLocationRelativeTo(null);
    }//GEN-LAST:event_itmAlterarCuentasActionPerformed

    private void itmMovientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMovientosActionPerformed
        operacionesEmpleado pTranferenciaEmpleado = new operacionesEmpleado(idEmpleado);
        pTranferenciaEmpleado.setVisible(true);
        pTranferenciaEmpleado.setLocationRelativeTo(null);
    }//GEN-LAST:event_itmMovientosActionPerformed

    private void itmProgramadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmProgramadorActionPerformed
        try {
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                URI uri = new URI("https://julianb0315.github.io/");
                Desktop.getDesktop().browse(uri);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_itmProgramadorActionPerformed

    private void itmGitHubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmGitHubActionPerformed
        try {
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            URI uri = new URI("https://github.com/JulianB0315");
            Desktop.getDesktop().browse(uri);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_itmGitHubActionPerformed

    private void itmCrearEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCrearEmpleadoActionPerformed
        CrearEmpleado pCrearEmpleado = new CrearEmpleado(idEmpleado);
        pCrearEmpleado.setVisible(true);
        pCrearEmpleado.setLocationRelativeTo(null);
    }//GEN-LAST:event_itmCrearEmpleadoActionPerformed

    private void itmBuscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmBuscarEmpleadoActionPerformed
        BuscarEmpleado nBuscarEmpleado = new BuscarEmpleado(idEmpleado);
        nBuscarEmpleado.setVisible(true);
        nBuscarEmpleado.setLocationRelativeTo(null);
    }//GEN-LAST:event_itmBuscarEmpleadoActionPerformed
    private void saludo(String idEmpleado,JLabel lblsaludo){
        String sql="SELECT NOMBRE FROM EMPLEADO WHERE IDEMPLEADO = ?";
        String Nombre =null;
        try(Connection conn = DBConnection.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, idEmpleado);
            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
                Nombre=rs.getString("NOMBRE");
                lblsaludo.setText("Hola "+Nombre+" un gusto verte");
            }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Algo salio mal", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemCerrar1;
    private javax.swing.JMenuItem itmAlterarCuentas;
    private javax.swing.JMenuItem itmBuscar;
    private javax.swing.JMenuItem itmBuscarEmpleado;
    private javax.swing.JMenuItem itmCrearClientes;
    private javax.swing.JMenuItem itmCrearCuentas;
    private javax.swing.JMenuItem itmCrearEmpleado;
    private javax.swing.JMenuItem itmGitHub;
    private javax.swing.JMenuItem itmHistorial;
    private javax.swing.JMenuItem itmMovientos;
    private javax.swing.JMenuItem itmProgramador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblsaludo;
    private javax.swing.JMenu mnEmpleados;
    private javax.swing.JMenu nmAcercade;
    private javax.swing.JMenu nmSalir;
    private javax.swing.JMenu nmSalir1;
    private javax.swing.JMenu nmSalir2;
    private javax.swing.JMenu nmSalir3;
    // End of variables declaration//GEN-END:variables
}
