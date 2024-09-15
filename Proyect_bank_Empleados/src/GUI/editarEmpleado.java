
package GUI;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import DB.DBConnection;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.Window;
import java.awt.Image;

public class editarEmpleado extends javax.swing.JFrame {
private String idEmpleado;
private String idEmpleadoEdit;
    public editarEmpleado(String idEmpleado, String idEmpleadoEdit) {
        initComponents();
        this.setTitle("Deposito a Cuenta");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/logo.png"));
        Image logo = icon.getImage();
        setIconImage(logo);
        passContraseña.setEchoChar('*');
        this.idEmpleado = idEmpleado;
        this.idEmpleadoEdit=idEmpleadoEdit;
        cargarDatosCliente(idEmpleadoEdit, txtNombres, txtApellidos, txtSalario, passContraseña, cbxcargo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btnEditar2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        btntVerOcultar = new javax.swing.JToggleButton();
        passContraseña = new javax.swing.JPasswordField();
        cbxcargo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itmVolver = new javax.swing.JMenuItem();
        nmSalir = new javax.swing.JMenu();
        itemCerrar = new javax.swing.JMenuItem();
        mnRestablecer = new javax.swing.JMenu();
        itemRestablecer = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(0, 53, 102));

        jPanel6.setBackground(new java.awt.Color(230, 230, 230));

        btnEditar2.setBackground(new java.awt.Color(230, 230, 230));
        btnEditar2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnEditar2.setForeground(new java.awt.Color(0, 53, 102));
        btnEditar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lapiz.png"))); // NOI18N
        btnEditar2.setText("Editar datos");
        btnEditar2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 3, 1, 3, new java.awt.Color(0, 53, 102)));
        btnEditar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar2ActionPerformed(evt);
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

        jLabel5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 53, 102));
        jLabel5.setText("   Apellidos       :");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        txtNombres.setBackground(new java.awt.Color(230, 230, 230));
        txtNombres.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        txtNombres.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 53, 102)));
        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });

        txtApellidos.setBackground(new java.awt.Color(230, 230, 230));
        txtApellidos.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        txtApellidos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 53, 102)));
        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 53, 102));
        jLabel6.setText("   Contraseña    :");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        jLabel8.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 53, 102));
        jLabel8.setText("   Salario           :");
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        txtSalario.setBackground(new java.awt.Color(230, 230, 230));
        txtSalario.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        txtSalario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 53, 102)));
        txtSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioActionPerformed(evt);
            }
        });

        btntVerOcultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ocultar.png"))); // NOI18N
        btntVerOcultar.setBorder(null);
        btntVerOcultar.setContentAreaFilled(false);
        btntVerOcultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btntVerOcultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntVerOcultarActionPerformed(evt);
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

        cbxcargo.setBackground(new java.awt.Color(230, 230, 230));
        cbxcargo.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        cbxcargo.setForeground(new java.awt.Color(0, 53, 102));
        cbxcargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "gerente", "cajero", "asesor", "administrador" }));

        jLabel9.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 53, 102));
        jLabel9.setText("   Contraseña    :");
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtSalario))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxcargo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(passContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btntVerOcultar))))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btnEditar2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 46, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addContainerGap(208, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addGap(265, 265, 265)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(passContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btntVerOcultar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbxcargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnEditar2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addComponent(jLabel10)
                    .addContainerGap(276, Short.MAX_VALUE)))
        );

        jLabel2.setFont(new java.awt.Font("Serif", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(212, 175, 55));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo02.png"))); // NOI18N
        jLabel2.setText("Nueva Banco Perú");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 1, 3, new java.awt.Color(212, 175, 55)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(230, 230, 230));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 53, 102)));
        jMenuBar1.setForeground(new java.awt.Color(0, 53, 102));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu1.setBackground(new java.awt.Color(230, 230, 230));
        jMenu1.setForeground(new java.awt.Color(0, 53, 102));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/volver.png"))); // NOI18N
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

        nmSalir.setForeground(new java.awt.Color(0, 53, 102));
        nmSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salida-icon.png"))); // NOI18N
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
        mnRestablecer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cargar-datos-icon.png"))); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar2ActionPerformed
        String Nombresedit = txtNombres.getText();
        String Apellidosedit = txtApellidos.getText();
        String saladarioString = txtSalario.getText();
        String contraseña = new String(passContraseña.getPassword());
        String cargo = (String) cbxcargo.getSelectedItem();

        if(Nombresedit.isEmpty()||Apellidosedit.isEmpty()||saladarioString.isEmpty()||contraseña.isEmpty()||cargo.isEmpty()){
            JOptionPane.showMessageDialog(null,"Por favor,Llenar todos los campos", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Double saladario = Double.parseDouble(saladarioString);
        try (Connection conn = DBConnection.getConnection()){
            String sql ="UPDATE EMPLEADO SET NOMBRE = ?, APELLIDO = ?, SALARIO = ?, CONTRASEÑA = ?, CARGO = ? WHERE IDEMPLEADO = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, Nombresedit);      
            ps.setString(2, Apellidosedit);    
            ps.setDouble(3, saladario);        
            ps.setString(4, contraseña);       
            ps.setString(5, cargo);            
            ps.setString(6, idEmpleadoEdit); 
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Se cambiaron los datos con exito","Felicidades",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en actualizar los datos", "Error",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEditar2ActionPerformed

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void itmVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmVolverActionPerformed
        interfazEmpleado pEmpleado = new interfazEmpleado(idEmpleado);
        pEmpleado.setVisible(true);
        pEmpleado.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_itmVolverActionPerformed

    private void itemCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCerrarActionPerformed
        Window[] windows = Window.getWindows();
        for (Window window : windows) {
            window.dispose();
        }
        System.exit(0);
    }//GEN-LAST:event_itemCerrarActionPerformed

    private void itemRestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRestablecerActionPerformed
    }//GEN-LAST:event_itemRestablecerActionPerformed

    private void txtSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioActionPerformed

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

    private void passContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passContraseñaActionPerformed

    }//GEN-LAST:event_passContraseñaActionPerformed
    private boolean cargarDatosCliente(String idEmpleadoEdit,JTextField txtNombres,JTextField txtApellidos,JTextField txtSalario,JPasswordField passContraseña,JComboBox<String> cbxcargo){
        String sql = "SELECT * FROM EMPLEADO WHERE IDEMPLEADO=?";
        String nombres = null;
        String apellidos = null;
        String saladario= null;
        String cargo = null;
        String contraseña=null;

        try (Connection conn = DBConnection.getConnection()){
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, idEmpleadoEdit);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            nombres = rs.getString("NOMBRE");
            apellidos = rs.getString("APELLIDO");
            saladario=rs.getString("SALARIO");
            cargo = rs.getString("CARGO");
            contraseña = rs.getString("CONTRASEÑA");

        }else{
            return false;
        }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error con Con la consulta de datos","Error",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        txtNombres.setText(nombres);
        txtApellidos.setText(apellidos);
        txtSalario.setText(saladario);
        cbxcargo.setSelectedItem(cargo);
        passContraseña.setText(contraseña);
        return true;
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar2;
    private javax.swing.JToggleButton btntVerOcultar;
    private javax.swing.JComboBox<String> cbxcargo;
    private javax.swing.JMenuItem itemCerrar;
    private javax.swing.JMenuItem itemRestablecer;
    private javax.swing.JMenuItem itmVolver;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JMenu mnRestablecer;
    private javax.swing.JMenu nmSalir;
    private javax.swing.JPasswordField passContraseña;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
