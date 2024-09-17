
package GUI;

import DB.DBConnection;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import java.awt.Image;
import javax.swing.ImageIcon;

public class crearCuenta extends javax.swing.JFrame {
        private String idCliente;// Traer idCliente de la clienteRegistro
        public crearCuenta(String idCliente) {
                this.idCliente = idCliente;// Traer el idCliente como una variable para despues usarla 
                initComponents();
                //Da titulo a la Interfaz
                this.setTitle("Creacion de cuenta");
                //Cambia el simbolo de los passField
                passConfirmar.setEchoChar('*');
                passContraseña.setEchoChar('*');
                //Metodo para cerrar
                cerrar();
                ImageIcon icon = new ImageIcon(getClass().getResource("/img/logo.png"));
                Image logo = icon.getImage();
                setIconImage(logo);
        }
        // No Tocar en Visual
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gruopTipoTarjeta = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        passConfirmar = new javax.swing.JPasswordField();
        passContraseña = new javax.swing.JPasswordField();
        buttonCredito = new javax.swing.JRadioButton();
        ButtonDebito = new javax.swing.JRadioButton();
        buttonCancelar = new javax.swing.JButton();
        buttonFinalizar = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        btntgConfirmar = new javax.swing.JToggleButton();
        btntgContraseña = new javax.swing.JToggleButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 53, 102));

        jPanel1.setBackground(new java.awt.Color(230, 230, 230));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N

        passConfirmar.setBackground(new java.awt.Color(230, 230, 230));
        passConfirmar.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        passConfirmar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 53, 102)));

        passContraseña.setBackground(new java.awt.Color(230, 230, 230));
        passContraseña.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        passContraseña.setForeground(new java.awt.Color(0, 53, 102));
        passContraseña.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 53, 102)));

        gruopTipoTarjeta.add(buttonCredito);
        buttonCredito.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        buttonCredito.setForeground(new java.awt.Color(0, 53, 102));
        buttonCredito.setText("Credito");
        buttonCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCreditoActionPerformed(evt);
            }
        });

        gruopTipoTarjeta.add(ButtonDebito);
        ButtonDebito.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        ButtonDebito.setForeground(new java.awt.Color(0, 53, 102));
        ButtonDebito.setText("Debito");
        ButtonDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDebitoActionPerformed(evt);
            }
        });

        buttonCancelar.setBackground(new java.awt.Color(230, 230, 230));
        buttonCancelar.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        buttonCancelar.setForeground(new java.awt.Color(0, 53, 102));
        buttonCancelar.setText("Cancelar");
        buttonCancelar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 1, 2, new java.awt.Color(0, 53, 102)));
        buttonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        buttonFinalizar.setBackground(new java.awt.Color(230, 230, 230));
        buttonFinalizar.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        buttonFinalizar.setForeground(new java.awt.Color(0, 53, 102));
        buttonFinalizar.setText("Finalizar");
        buttonFinalizar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 1, 2, new java.awt.Color(0, 53, 102)));
        buttonFinalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFinalizarActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 53, 102));
        jLabel25.setText("    Tipo de Cuenta                 :");
        jLabel25.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        jLabel26.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 53, 102));
        jLabel26.setText("    Confirmar Contraseña     :");
        jLabel26.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        jLabel27.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 53, 102));
        jLabel27.setText("    Contraseña                       :");
        jLabel27.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        jLabel28.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 53, 102));
        jLabel28.setText("Soluciones financieras con confianza y claridad.");
        jLabel28.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 1, 3, new java.awt.Color(0, 53, 102)));

        btntgConfirmar.setBackground(new java.awt.Color(230, 230, 230));
        btntgConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ocultar.png"))); // NOI18N
        btntgConfirmar.setBorder(null);

        btntgContraseña.setBackground(new java.awt.Color(230, 230, 230));
        btntgContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ocultar.png"))); // NOI18N
        btntgContraseña.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel26)
                        .addGap(9, 9, 9)
                        .addComponent(passConfirmar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addGap(34, 34, 34)
                                .addComponent(ButtonDebito)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonCredito))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(passContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(160, 160, 160)
                                        .addComponent(jLabel3)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btntgContraseña)
                            .addComponent(btntgConfirmar)))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel28)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(buttonFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonCredito, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ButtonDebito, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btntgContraseña))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(passContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jLabel27))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(199, 199, 199))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(passConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel26))
                            .addComponent(btntgConfirmar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)))
                .addComponent(jLabel3))
        );

        jLabel11.setFont(new java.awt.Font("Serif", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(212, 175, 55));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/banco.png"))); // NOI18N
        jLabel11.setText("    Nueva Banco Perú  ");
        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 1, 3, new java.awt.Color(212, 175, 55)));

        jPanel6.setBackground(new java.awt.Color(212, 175, 55));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 294, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(212, 175, 55));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 294, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(20, 20, 20)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonCancelarActionPerformed
                // Boton cancelar
                int confirmar = JOptionPane.showConfirmDialog(this,"¿Está seguro de que quiero cancelar?, se borrar también el registro.","Confirmar eliminación", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                // Funcion para borra el ragistro
                if (confirmar == JOptionPane.YES_OPTION) {
                        eliminarRegistro(idCliente);//Se usa la variable antes traida
                }
        }// GEN-LAST:event_buttonCancelarActionPerformed

        private void buttonCreditoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonCreditoActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_buttonCreditoActionPerformed

        private void ButtonDebitoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ButtonDebitoActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_ButtonDebitoActionPerformed
        private void buttonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonFinalizarActionPerformed
                // Obtener los datos del formulario
                // Se puede hacer que con un if pero funciona igual dependiendo de si elije credito o debito cambia la variable tipoCuenta
                String tipoCuenta = buttonCredito.isSelected() ? "credito" : "debito";
                //Cambia las contraseña a un string sino seria incompatible
                String contraseña = new String(passContraseña.getPassword());
                String confirmarContraseña = new String(passConfirmar.getPassword());
                // Verificar tipo de cuenta que solo se permite de credito
                if (tipoCuenta.equals("credito")) {
                        JOptionPane.showMessageDialog(null, "Para abrir una cuenta de crédito necesita evaluación.");
                        return;
                }
                //Se almacena el metodo para generar IdCuenta
                String idCuenta = generateIdCuenta();
                // Solo se pueden crear cuenta de debito
                if (tipoCuenta.equals("debito")) {
                        // Validar la contraseña
                        //Manda los datos para comprobarse en un metodo boleano
                        if (validarContraseña(contraseña, confirmarContraseña)){
                                //Try para que el proceso se haga bien 
                                try (Connection conn = DBConnection.getConnection()) {
                                        String sqlCuenta = "INSERT INTO cuenta (idCuenta, idCliente, tipoCuenta, contraseña) VALUES (?, ?, ?, ?)";
                                        PreparedStatement psCuenta = conn.prepareStatement(sqlCuenta);
                                        psCuenta.setString(1, idCuenta);
                                        psCuenta.setString(2, idCliente); // Usamos el idCliente recibido antes
                                        psCuenta.setString(3, tipoCuenta);
                                        psCuenta.setString(4, contraseña);
                                        psCuenta.executeUpdate();
                                        JOptionPane.showMessageDialog(null, "Cuenta creada exitosamente.");
                                        conn.close();//Cierro la conexion
                                        this.dispose(); // Cierra la ventana después de crear la cuenta
                                } catch (SQLException e) {
                                        //Manda un mensaje si no se cumple el proceso correctamente
                                        JOptionPane.showMessageDialog(null, "Error al insertar los datos datos");//Al haber algun error en la conexion
                                }
                        }
                }
        }
        //metodo Bolean para validar la contraseña 
        private boolean validarContraseña(String contraseña, String confirmarContraseña) {
                //Retorna falso al cumplirse
                if (contraseña.isEmpty() || confirmarContraseña.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Debe ingresar y confirmar su contraseña.");
                        return false;
                }
                //Retorna falso al cumplirse
                if (contraseña.length() != 8) {
                        JOptionPane.showMessageDialog(null, "La contraseña debe tener exactamente 8 caracteres.");
                        return false;
                }
                //Retorna falso al cumplirse
                if (!contraseña.equals(confirmarContraseña)) {
                        JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden.");
                        return false;
                }
                //Si no se cumple ninguna se manda verdad y se puede continuar
                return true;
        }
        // Metodo para generar idCuenta
        private String generateIdCuenta() {
                //Establece lo que va usar
                String characters = "0123456789";
                Random rnd = new Random(); // Crea un objeto Random para generar números aleatorios
                StringBuilder sb = new StringBuilder(); // Usa StringBuilder para construir el ID de manera eficiente
                // Generar 8 dígitos aleatorios
                for (int i = 0; i < 8; i++) {
                // Obtiene un índice aleatorio dentro del rango de caracteres disponibles
                        int index = rnd.nextInt(characters.length());
                // Añade el carácter correspondiente al índice aleatorio al StringBuilder
                        sb.append(characters.charAt(index));
                }
                 // Retorna el ID de cuenta generado como una cadena 
                return sb.toString();
        }
        // Método para eliminar el registro
        private void eliminarRegistro(String idCliente) {
                try (Connection conn = DBConnection.getConnection()) {
                        String sqlEliminar = "DELETE FROM cliente WHERE idCliente = ?";//Un delete para eliminar
                        PreparedStatement psEliminar = conn.prepareStatement(sqlEliminar);//Se usa para preparar la sentencia SQL antes escrita
                        psEliminar.setString(1, idCliente);//Se borra el registo por el id Cliente
                        // El int se usa como un contador de registros eliminados por executeUpdate()
                        int rowsAffected = psEliminar.executeUpdate();
                        //Si se elimina 1 o mas registros 
                        if (rowsAffected > 0) {
                                JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente.");
                                // Cierra la ventana después de eliminar
                                this.dispose();
                        //Si no se elimina ningun registro
                        } else {
                                JOptionPane.showMessageDialog(null, "No se encontro registro del cliente");
                        }
                        conn.close();
                //Error al llevar a cabo el proceso
                } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Error al eliminar");
                }
        }
        // Metodo que cambia el comportamiento al cerrar la ventana
        private void cerrar() {
                // Configura la operación de cierre de la ventana para que no realice ninguna acción por defecto
                this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                //WindowListener para manejar el evento de cierre de la ventana
                addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosing(WindowEvent e) {
                                // Llama a eliminarRegistro y luego cierra la ventana
                                eliminarRegistro(idCliente);
                                dispose(); // Cierra la ventana
                        }
                });
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ButtonDebito;
    private javax.swing.JToggleButton btntgConfirmar;
    private javax.swing.JToggleButton btntgContraseña;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JRadioButton buttonCredito;
    private javax.swing.JButton buttonFinalizar;
    private javax.swing.ButtonGroup gruopTipoTarjeta;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPasswordField passConfirmar;
    private javax.swing.JPasswordField passContraseña;
    // End of variables declaration//GEN-END:variables
}
