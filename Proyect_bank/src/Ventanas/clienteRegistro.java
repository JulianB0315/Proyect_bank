package Ventanas;

//import para la generar in idcliente
import java.util.Random;
//import para la conexion
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import cierre de ventana
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class clienteRegistro extends javax.swing.JFrame {

        public clienteRegistro() {
                initComponents();
                cerrar();
                this.setTitle("Registro de datos del nuevo cliente");
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ButtonVolver = new javax.swing.JButton();
        TxtDNI = new javax.swing.JTextField();
        TXTNombres = new javax.swing.JTextField();
        TXTApellidos = new javax.swing.JTextField();
        TXTdireccion = new javax.swing.JTextField();
        TXTtelefono = new javax.swing.JTextField();
        TXTcorreo = new javax.swing.JTextField();
        Masculino = new javax.swing.JRadioButton();
        Femenino = new javax.swing.JRadioButton();
        otros = new javax.swing.JRadioButton();
        ButtonRegistro1 = new javax.swing.JButton();
        Nacimiento = new com.toedter.calendar.JDateChooser();

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
            .addGap(0, 148, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel2.setText("DNI:");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel4.setText("Nombres:");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel5.setText("Apellidos:");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel6.setText("Sexo:");

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel7.setText("Fecha de Nacimiento:");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel9.setText("Direccion:");

        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel10.setText("Telefono:");

        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel11.setText("Correo:");

        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel12.setText("Datos personales:");

        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel13.setText("Bienvenido ala familia de nuevo Peru Bank");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 51, 51));
        jLabel14.setText("Bank");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel15.setText("Peru");

        ButtonVolver.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ButtonVolver.setText("Volver");
        ButtonVolver.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVolverActionPerformed(evt);
            }
        });

        TxtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDNIActionPerformed(evt);
            }
        });

        TXTApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTApellidosActionPerformed(evt);
            }
        });

        Masculino.setText("Masculino");
        Masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasculinoActionPerformed(evt);
            }
        });

        Femenino.setText("Femenino");
        Femenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemeninoActionPerformed(evt);
            }
        });

        otros.setText("Otros");

        ButtonRegistro1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ButtonRegistro1.setText("Resgistarse");
        ButtonRegistro1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonRegistro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegistro1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113)
                                .addComponent(ButtonRegistro1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(19, 19, 19)
                                        .addComponent(Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(23, 23, 23)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TxtDNI)
                                            .addComponent(TXTNombres)
                                            .addComponent(TXTApellidos)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Masculino)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Femenino)
                                                .addGap(0, 13, Short.MAX_VALUE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11))
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TXTtelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(TXTcorreo)
                                            .addComponent(TXTdireccion))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(otros))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel13))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(4, 4, 4)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TxtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(TXTNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(TXTApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(Masculino)
                                    .addComponent(otros)
                                    .addComponent(Femenino))))
                        .addGap(2, 2, 2)
                        .addComponent(jLabel7))
                    .addComponent(Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TXTdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TXTtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(TXTcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonRegistro1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 511, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        // Funcion de salidar
        public void cerrar() {
                try {
                        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                        addWindowListener(new WindowAdapter() {
                                public void windowClosing(WindowEvent e) {
                                        Confirmar();
                                }
                        });
                        this.setVisible(true);
                } catch (Exception e) {
                        e.printStackTrace();
                }
        }

        // Mensaje al confirmar
        public void Confirmar() {
                int salir = JOptionPane.showConfirmDialog(this,
                                "¿Está seguro de salir se perderán los datos ingresados?",
                                "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (salir == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null, "Gracias por visitarnos", "Vuelva pronto!!!",
                                        JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                }
        }

        private void ButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ButtonVolverActionPerformed
                inicioGuia pantallaGuia = new inicioGuia();
                pantallaGuia.setVisible(true);
                pantallaGuia.setLocationRelativeTo(null);
                this.dispose();
        }// GEN-LAST:event_ButtonVolverActionPerformed

        private void TxtDNIActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_TxtDNIActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_TxtDNIActionPerformed

        private void TXTApellidosActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_TXTApellidosActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_TXTApellidosActionPerformed

        private void MasculinoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_MasculinoActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_MasculinoActionPerformed

        private void FemeninoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_FemeninoActionPerformed

        }// GEN-LAST:event_FemeninoActionPerformed

        private void ButtonRegistro1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ButtonRegistro1ActionPerformed
               // Obtener los datos del formulario
    String dni = TxtDNI.getText();
    String nombre = TXTNombres.getText();
    String apellido = TXTApellidos.getText();
    String sexo = "";
    if (Masculino.isSelected()) {
        sexo = "masculino";
    } else if (Femenino.isSelected()) {
        sexo = "femenino";
    } else if (otros.isSelected()) {
        sexo = "otros";
    }
    Date fechaNacimientoDate = Nacimiento.getDate();
    if (fechaNacimientoDate == null) {
        JOptionPane.showMessageDialog(null, "Por favor, seleccione una fecha de nacimiento válida.");
        return;
    }

    // Validar que el DNI tenga 8 dígitos
    if (dni.isEmpty() || dni.length() != 8) {
        JOptionPane.showMessageDialog(null, "El DNI debe tener exactamente 8 dígitos.");
        return;
    }

    // Validar que el teléfono tenga 9 dígitos
    String telefono = TXTtelefono.getText();
    if (telefono.isEmpty() || telefono.length() != 9) {
        JOptionPane.showMessageDialog(null, "El teléfono debe tener exactamente 9 dígitos.");
        return;
    }

    // Validar el formato del correo electrónico
    String email = TXTcorreo.getText();
    if (!validarEmail(email)) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un correo electrónico válido.");
        return;
    }

    // Validar que la fecha no sea futura, no sea demasiado antigua, y que sea mayor de edad
    Date fechaActual = new Date();
    Calendar cal = Calendar.getInstance();
    cal.add(Calendar.YEAR, -120); // Hace 120 años desde hoy
    Date fechaLimiteAntigua = cal.getTime();

    cal = Calendar.getInstance();
    cal.add(Calendar.YEAR, -18); // Hace 18 años desde hoy
    Date fechaLimiteMayorEdad = cal.getTime();

    if (fechaNacimientoDate.after(fechaActual)) {
        JOptionPane.showMessageDialog(null, "La fecha de nacimiento no puede ser futura.");
        return;
    } else if (fechaNacimientoDate.before(fechaLimiteAntigua)) {
        JOptionPane.showMessageDialog(null, "La fecha de nacimiento no puede ser tan antigua.");
        return;
    } else if (fechaNacimientoDate.after(fechaLimiteMayorEdad)) {
        JOptionPane.showMessageDialog(null, "Debe ser mayor de 18 años para registrarse.");
        return;
    }

    SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd"); // Formato compatible con la base de datos
    String fechaNacimiento = formatoFecha.format(fechaNacimientoDate);
    String direccion = TXTdireccion.getText();

    // Validar los datos
    if (dni.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || sexo.isEmpty()
            || fechaNacimiento.isEmpty() || direccion.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos obligatorios.");
        return;
    }
    
    String idCliente = generateIdCliente(); // Generar idCliente
    // Insertar los datos en la base de datos
    try (Connection conn = DBConnection.getConnection()) {
        String sql = "INSERT INTO Cliente (idCliente, dni, nombre, apellido, sexo, fechaNacimiento, direccion, telefono, email) VALUES (?, ?, ?, ?, ?, TO_DATE(?, 'YYYY-MM-DD'), ?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, idCliente); // Método para generar un ID único para idCliente
        ps.setString(2, dni);
        ps.setString(3, nombre);
        ps.setString(4, apellido);
        ps.setString(5, sexo);
        ps.setString(6, fechaNacimiento); // Asegúrate de que el formato de fecha sea 'YYYY-MM-DD'
        ps.setString(7, direccion);
        ps.setString(8, telefono);
        ps.setString(9, email);
        ps.executeUpdate();

        JOptionPane.showMessageDialog(null, "Registro exitoso.");

        crearCuenta pantallaCuenta = new crearCuenta(idCliente);
        pantallaCuenta.setVisible(true);
        pantallaCuenta.setLocationRelativeTo(null);
        this.dispose();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al insertar datos: " + e.getMessage());
    }
}

// Método para generar un ID único para idCliente
private String generateIdCliente() {
    String prefix = "CL";
    String characters = "0123456789";
    Random rnd = new Random();
    StringBuilder sb = new StringBuilder(prefix);
    while (sb.length() < 8) {
        int index = rnd.nextInt(characters.length());
        sb.append(characters.charAt(index));
    }
    return sb.toString();
}

// Método para validar el formato del correo electrónico
private boolean validarEmail(String email) {
    String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    Pattern pattern = Pattern.compile(emailRegex);
    Matcher matcher = pattern.matcher(email);
    return matcher.matches();
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonRegistro1;
    private javax.swing.JButton ButtonVolver;
    private javax.swing.JRadioButton Femenino;
    private javax.swing.JRadioButton Masculino;
    private com.toedter.calendar.JDateChooser Nacimiento;
    private javax.swing.JTextField TXTApellidos;
    private javax.swing.JTextField TXTNombres;
    private javax.swing.JTextField TXTcorreo;
    private javax.swing.JTextField TXTdireccion;
    private javax.swing.JTextField TXTtelefono;
    private javax.swing.JTextField TxtDNI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JRadioButton otros;
    // End of variables declaration//GEN-END:variables
}
