
package GUI;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import DB.DBConnection;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class CrearCliente extends javax.swing.JFrame {

    public CrearCliente() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Registro de Cliente");
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
        jPanel4 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtnombres = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        clrfechanacimiento = new com.toedter.calendar.JDateChooser();
        masculino = new javax.swing.JRadioButton();
        femenino = new javax.swing.JRadioButton();
        otros = new javax.swing.JRadioButton();
        btnCrearRegsitro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 53, 102));

        jPanel4.setBackground(new java.awt.Color(230, 230, 230));

        jLabel28.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 53, 102));
        jLabel28.setText("                   Crear Regsitro del Cliente");
        jLabel28.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 1, 3, new java.awt.Color(0, 53, 102)));

        txtdni.setBackground(new java.awt.Color(230, 230, 230));
        txtdni.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        txtdni.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 53, 102)));

        jLabel29.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 53, 102));
        jLabel29.setText("   DNI                           :");
        jLabel29.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        jLabel31.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 53, 102));
        jLabel31.setText("   Nombres                    :");
        jLabel31.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        jLabel32.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 53, 102));
        jLabel32.setText("   Apellidos                   :");
        jLabel32.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        jLabel33.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 53, 102));
        jLabel33.setText("   Sexo                          :");
        jLabel33.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        jLabel34.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 53, 102));
        jLabel34.setText("   Telefono                    :");
        jLabel34.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        jLabel35.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 53, 102));
        jLabel35.setText("   Fecha de nacimiento  :");
        jLabel35.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        jLabel36.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 53, 102));
        jLabel36.setText("   Direccion                   :");
        jLabel36.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        jLabel37.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 53, 102));
        jLabel37.setText("   Correo                       :");
        jLabel37.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        txtnombres.setBackground(new java.awt.Color(230, 230, 230));
        txtnombres.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        txtnombres.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 53, 102)));

        txtapellidos.setBackground(new java.awt.Color(230, 230, 230));
        txtapellidos.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        txtapellidos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 53, 102)));

        txttelefono.setBackground(new java.awt.Color(230, 230, 230));
        txttelefono.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        txttelefono.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 53, 102)));

        txtdireccion.setBackground(new java.awt.Color(230, 230, 230));
        txtdireccion.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        txtdireccion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 53, 102)));

        txtCorreo.setBackground(new java.awt.Color(230, 230, 230));
        txtCorreo.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        txtCorreo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 53, 102)));

        clrfechanacimiento.setBackground(new java.awt.Color(230, 230, 230));
        clrfechanacimiento.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(230, 230, 230)));
        clrfechanacimiento.setForeground(new java.awt.Color(0, 53, 102));
        clrfechanacimiento.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        clrfechanacimiento.setMaxSelectableDate(new java.util.Date(253370786470000L));

        masculino.setForeground(new java.awt.Color(0, 53, 102));
        masculino.setText("Masculino");
        masculino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        femenino.setForeground(new java.awt.Color(0, 53, 102));
        femenino.setText("Femenino");
        femenino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        otros.setForeground(new java.awt.Color(0, 53, 102));
        otros.setText("otros");
        otros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnCrearRegsitro.setBackground(new java.awt.Color(230, 230, 230));
        btnCrearRegsitro.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnCrearRegsitro.setForeground(new java.awt.Color(0, 53, 102));
        btnCrearRegsitro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuarios.png"))); // NOI18N
        btnCrearRegsitro.setText("      Crear Registro");
        btnCrearRegsitro.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 3, 1, 3, new java.awt.Color(0, 53, 102)));
        btnCrearRegsitro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearRegsitro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearRegsitroActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dni.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendario.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telefono.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mail.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/direccion.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(15, 15, 15)
                        .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(15, 15, 15)
                        .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(15, 15, 15)
                        .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(clrfechanacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addGap(15, 15, 15)
                                .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(masculino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(femenino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(otros))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(15, 15, 15)
                        .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCrearRegsitro, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addGap(15, 15, 15)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel7)))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel29)
                        .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel31)
                        .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel32)
                        .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(masculino)
                    .addComponent(femenino)
                    .addComponent(otros))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel35)
                            .addComponent(clrfechanacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel34)
                                .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel8))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel37)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btnCrearRegsitro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jLabel3.setFont(new java.awt.Font("Serif", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(212, 175, 55));
        jLabel3.setText("     Nueva Banco Perú  ");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 1, 3, new java.awt.Color(212, 175, 55)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearRegsitroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearRegsitroActionPerformed
        // Obtener los datos del formulario
        String nombre = txtnombres.getText();
        String apellido = txtapellidos.getText();
        String sexo = "";
        if (masculino.isSelected()) {
            sexo = "masculino";
        } else if (femenino.isSelected()) {
            sexo = "femenino";
        } else if (otros.isSelected()) {
            sexo = "otros";
        }
        String direccion = txtdireccion.getText();

        Date fechaNacimientoDate = clrfechanacimiento.getDate();
        if (fechaNacimientoDate == null) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fecha de nacimiento válida.");
            return;
        }


        String dni = txtdni.getText();
        if (!dni.matches("\\d{8}")) {
            JOptionPane.showMessageDialog(null, "DNI invalido.");
            return;
        }
        if (isDniRegistered(dni)) {
            JOptionPane.showMessageDialog(null, "El DNI ya está registrado.");
            return;
        }


        String telefono = txttelefono.getText();
        if (!telefono.matches("\\d{9}")) {
            JOptionPane.showMessageDialog(null, "Numero teléfono invalido.");
            return;
        }

        String email = txtCorreo.getText();
        if (!validarEmail(email)) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un correo electrónico válido.");
            return;
        }


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

        if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) {
            JOptionPane.showMessageDialog(null, "El nombre solo debe contener letras y espacios.");
            return;
        }
        // Validar que el apellido solo contenga letras
        if (!apellido.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) {
            JOptionPane.showMessageDialog(null, "El apellido solo debe contener letras y espacios.");
            return;
        }

        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd"); // Formato compatible con la base de datos
        String fechaNacimiento = formatoFecha.format(fechaNacimientoDate);

        // Validar que los datos esten completos
        if (dni.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || sexo.isEmpty()|| fechaNacimiento.isEmpty() || direccion.isEmpty() || telefono.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, completar todos los datos.");
            return;
        }

        // Generar idCliente
        String idCliente = generateIdCliente();
        // Insertar los datos en la base de datos
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "INSERT INTO Cliente (idCliente, dni, nombre, apellido, sexo, fechaNacimiento, direccion, telefono, email) VALUES (?, ?, ?, ?, ?, TO_DATE(?, 'YYYY-MM-DD'), ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, idCliente);
            ps.setString(2, dni);
            ps.setString(3, nombre);
            ps.setString(4, apellido);
            ps.setString(5, sexo);
            ps.setString(6, fechaNacimiento); 
            ps.setString(7, direccion);
            ps.setString(8, telefono);
            ps.setString(9, email);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro exitoso.");
            txtnombres.setText("");
            txtapellidos.setText("");
            txtdni.setText("");
            clrfechanacimiento.setDateFormatString(" ");
            txtdireccion.setText("");
            txttelefono.setText("");
            txtCorreo.setText("");


        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:No se completo el registro");
        }
    }//GEN-LAST:event_btnCrearRegsitroActionPerformed
    private String generateIdCliente() {
        String prefix = "CL";
        String characters = "0123456789";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(prefix); 
        while (sb.length() < 8) {
            int index = rnd.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();//Retorna el String 
    }

    // Método para validar el formato del correo electrónico
    private boolean validarEmail(String email) {
        // * indica que el grupo anterior (un punto seguido de caracteres) puede repetirse cero o más veces
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private boolean isDniRegistered(String dni) {
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "SELECT COUNT(*) FROM Cliente WHERE dni = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0; 
            }
        } catch (SQLException e) {
        
            JOptionPane.showMessageDialog(null, "Error al verificar el DNI: " + e.getMessage());
        }
        return false;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearRegsitro;
    private com.toedter.calendar.JDateChooser clrfechanacimiento;
    private javax.swing.JRadioButton femenino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton masculino;
    private javax.swing.JRadioButton otros;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}