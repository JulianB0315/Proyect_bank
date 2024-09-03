package Ventanas.Registro;


// Maneja la conexión con la base de datos a través de una clase personalizada
import Ventanas.DBConnection;
// Importa la clase personalizada inicioGuia para manejar una ventana o funcionalidad específica
import Ventanas.inicioGuia;
// Genera números aleatorios
import java.util.Random;
// Establece una conexión con la base de datos
import java.sql.Connection;
// Permite ejecutar consultas SQL parametrizadas
import java.sql.PreparedStatement;
// Proporciona acceso a los resultados de una consulta SQL
import java.sql.ResultSet;
// Maneja errores relacionados con la base de datos
import java.sql.SQLException;
// Maneja eventos de ventanas, como el cierre de la ventana
import java.awt.event.WindowAdapter;
// Maneja eventos específicos de ventanas, como el evento de cierre de ventana
import java.awt.event.WindowEvent;
// Define la ventana principal en la interfaz gráfica de usuario (GUI)
import javax.swing.JFrame;
// Muestra cuadros de diálogo en la interfaz gráfica de usuario (GUI) para mensajes y advertencias
import javax.swing.JOptionPane;
// Formatea y analiza fechas y horas
import java.text.SimpleDateFormat;
// Proporciona la fecha y hora actuales
import java.util.Calendar;
// Representa un objeto de fecha y hora
import java.util.Date;
// Permite trabajar con expresiones regulares para buscar y manipular texto
import java.util.regex.Matcher;
// Permite trabajar con expresiones regulares para buscar y manipular texto
import java.util.regex.Pattern;

public class clienteRegistro extends javax.swing.JFrame {

    public clienteRegistro() {
        initComponents();
        //Da titulo a  la Interfaz
        this.setTitle("Registro de datos del nuevo cliente");
        cerrar();
    }

    @SuppressWarnings("unchecked")
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
        buttonMostrar = new javax.swing.JButton();

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
                        .addGap(0, 149, Short.MAX_VALUE));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE));

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

        buttonMostrar.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        buttonMostrar.setText("Previzualizar Registro");
        buttonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMostrarActionPerformed(evt);
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
                                                .addGap(39, 39, 39)
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel15)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel14))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel12)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                false)
                                                                                .addComponent(jLabel7,
                                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(
                                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                                        jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel1Layout
                                                                                                        .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                        .addComponent(
                                                                                                                jLabel2)
                                                                                                        .addComponent(
                                                                                                                jLabel4)
                                                                                                        .addComponent(
                                                                                                                jLabel5)
                                                                                                        .addComponent(
                                                                                                                jLabel6))
                                                                                                .addGap(23, 23, 23)
                                                                                                .addGroup(jPanel1Layout
                                                                                                        .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                        .addComponent(
                                                                                                                TxtDNI)
                                                                                                        .addComponent(
                                                                                                                TXTNombres)
                                                                                                        .addComponent(
                                                                                                                TXTApellidos)
                                                                                                        .addGroup(
                                                                                                                jPanel1Layout
                                                                                                                        .createSequentialGroup()
                                                                                                                        .addGroup(
                                                                                                                                jPanel1Layout
                                                                                                                                        .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                        .addComponent(
                                                                                                                                                Nacimiento,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                156,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                        .addGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                jPanel1Layout
                                                                                                                                                        .createSequentialGroup()
                                                                                                                                                        .addComponent(
                                                                                                                                                                Masculino)
                                                                                                                                                        .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                                        .addComponent(
                                                                                                                                                                Femenino)
                                                                                                                                                        .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                        .addComponent(
                                                                                                                                                                otros)))
                                                                                                                        .addGap(0,
                                                                                                                                70,
                                                                                                                                Short.MAX_VALUE))))
                                                                                .addGroup(jPanel1Layout
                                                                                        .createSequentialGroup()
                                                                                        .addGroup(jPanel1Layout
                                                                                                .createParallelGroup(
                                                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jLabel9)
                                                                                                .addComponent(jLabel10)
                                                                                                .addComponent(jLabel11))
                                                                                        .addGap(28, 28, 28)
                                                                                        .addGroup(jPanel1Layout
                                                                                                .createParallelGroup(
                                                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(
                                                                                                        TXTtelefono,
                                                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                .addComponent(TXTcorreo)
                                                                                                .addComponent(
                                                                                                        TXTdireccion)))
                                                                                .addGroup(
                                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                                        jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(
                                                                                                        ButtonVolver,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        133,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                        Short.MAX_VALUE)
                                                                                                .addComponent(
                                                                                                        ButtonRegistro1,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        126,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addGap(64, 64, 64)
                                                                .addComponent(jLabel8)))
                                                .addContainerGap(134, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(30, 30, 30)
                                                                .addComponent(jLabel3)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel1Layout.createSequentialGroup()
                                                                        .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                51, Short.MAX_VALUE)
                                                                        .addComponent(buttonMostrar,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                379,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                47, Short.MAX_VALUE)))
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(TxtDNI,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(74, 74, 74))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabel2)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(jPanel1Layout
                                                                                        .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(jLabel4)
                                                                                        .addComponent(TXTNombres,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(jPanel1Layout
                                                                                        .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(jLabel5)
                                                                                        .addComponent(TXTApellidos,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                        7, Short.MAX_VALUE)
                                                                                .addGroup(jPanel1Layout
                                                                                        .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(jLabel6)
                                                                                        .addComponent(Masculino)
                                                                                        .addComponent(otros)
                                                                                        .addComponent(Femenino))))
                                                                .addGap(2, 2, 2)
                                                                .addComponent(jLabel7))
                                                        .addComponent(Nacimiento,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel9)
                                                        .addComponent(TXTdireccion,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel10)
                                                        .addComponent(TXTtelefono,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel11)
                                                        .addComponent(TXTcorreo, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(29, 29, 29)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(ButtonVolver,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 45,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ButtonRegistro1,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 45,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(buttonMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(33, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addGap(132, 132, 132)
                                                .addComponent(jLabel8)
                                                .addGap(75, 237, Short.MAX_VALUE)
                                                .addComponent(jLabel3)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        Short.MAX_VALUE)))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonRegistro1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ButtonRegistro1ActionPerformed
        // Obtener los datos del formulario
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
        String direccion = TXTdireccion.getText();

        Date fechaNacimientoDate = Nacimiento.getDate();// JCalendario no es error solo importe los paneles
        if (fechaNacimientoDate == null) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fecha de nacimiento válida.");
            return;
        }

        // Validar que el DNI tenga 8 dígitos y no sean letras
        String dni = TxtDNI.getText();
        if (!dni.matches("\\d{8}")) {
            JOptionPane.showMessageDialog(null, "DNI invalido.");
            return;
        }
        if (isDniRegistered(dni)) {
            JOptionPane.showMessageDialog(null, "El DNI ya está registrado.");
            return;
        }

        // Validar que el teléfono tenga 9 dígitos
        String telefono = TXTtelefono.getText();
        if (!telefono.matches("\\d{9}")) {
            JOptionPane.showMessageDialog(null, "Numero teléfono invalido.");
            return;
        }

        // Validar el formato del correo electrónico
        String email = TXTcorreo.getText();
        if (!validarEmail(email)) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un correo electrónico válido.");
            return;
        }

        // Validar que la fecha no sea futura, no sea demasiado antigua, y que sea mayor edad
        //Obtiene la fecha de nacimiento y se guarda en una variable Date
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
        // Validar que el nombre solo contenga letras
        //[a-zA-Z]: Permite letras mayúsculas y minúsculas.
        //áéíóúÁÉÍÓÚ: Permite letras con acentos (tildes) tanto en minúsculas como en mayúsculas
        //\\s: Permite espacios en blanco.
        //+: Indica que la cadena debe tener al menos un carácter válido (letra o espacio).
        if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) {
            JOptionPane.showMessageDialog(null, "El nombre solo debe contener letras y espacios.");
            return;//Sale del metodo si no se escribe bien el nombre
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

            // Mandar el id Cliente crearCuenta y abrir la interfaz
            crearCuenta pantallaCuenta = new crearCuenta(idCliente);
            pantallaCuenta.setVisible(true);
            pantallaCuenta.setLocationRelativeTo(null);
            this.dispose();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:No se completo el registro");
        }
    }// GEN-LAST:event_ButtonRegistro1ActionPerformed

    private void FemeninoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_FemeninoActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_FemeninoActionPerformed

    private void MasculinoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_MasculinoActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_MasculinoActionPerformed

    private void TXTApellidosActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_TXTApellidosActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_TXTApellidosActionPerformed

    private void TxtDNIActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_TxtDNIActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_TxtDNIActionPerformed

    private void ButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ButtonVolverActionPerformed
        inicioGuia pantallaGuia = new inicioGuia();
        pantallaGuia.setVisible(true);
        pantallaGuia.setLocationRelativeTo(null);
        this.dispose();
    }// GEN-LAST:event_ButtonVolverActionPerformed

    private void buttonMostrarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonMostrarActionPerformed
        //Traer de los textField los datos escritos
        String nombre = TXTNombres.getText();
        String apellido = TXTApellidos.getText();
        //Dependiendo de boton seleccionado cambia la variable
        String sexo = "";
        if (Masculino.isSelected()) {
            sexo = "masculino";//Masculino
        } else if (Femenino.isSelected()) {
            sexo = "femenino";//Femenino
        } else if (otros.isSelected()) {
            sexo = "otros";//Otros
        }
        String direccion = TXTdireccion.getText();
        
        Date fechaNacimientoDate = Nacimiento.getDate();// JCalendario no es error solo importe los paneles
        //Se comprueba que no este vacio
        if (fechaNacimientoDate == null) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fecha de nacimiento válida.");
            return; // Sale del método si la fecha no es válida
        }
        // Validar que el DNI tenga 8 dígitos y no sean letras
        String dni = TxtDNI.getText();
        if (!dni.matches("\\d{8}")) {
            JOptionPane.showMessageDialog(null, "DNI invalido.");
            return;//Sale del metodo si el DNI no es valido
        }
        //Llama al metodo para comprobar que el dni no este registrado
        if (isDniRegistered(dni)) {
            JOptionPane.showMessageDialog(null, "El DNI ya está registrado.");
            return;// Sale del método si el DNI ya está registrado
        }
        // Validar que el teléfono tenga 9 dígitos
        String telefono = TXTtelefono.getText();
        //\d es un carácter de escape que representa cualquier dígito del 0 al 9 y si le agregamos otro \ se permite repetir digitos
        //El digito que esta dentro {} es el limite de veces que se permite
        if (!telefono.matches("\\d{9}")) {
            JOptionPane.showMessageDialog(null, "Numero teléfono invalido.");
            return;//Sale del metodo si el telefono no es valido
        }
        // Validar el formato del correo electrónico
        String email = TXTcorreo.getText();
        //Llama al metodo para validar que el correo este bien escrito
        if (!validarEmail(email)) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un correo electrónico válido.");
            return;//Sale del metodo si el correo esta mal escrito
        }
        // Validar que la fecha no sea futura, no sea demasiado antigua, y que sea mayor edad
        //Usa la variable Date para traer la fecha actual
        Date fechaActual = new Date();
        // Configura un objeto Calendar para calcular fechas límite
        Calendar cal = Calendar.getInstance();
        // Calcula la fecha límite para considerar una fecha de nacimiento como demasiado antigua (120 años atrás)
        cal.add(Calendar.YEAR, -120); // Hace 120 años desde hoy
        Date fechaLimiteAntigua = cal.getTime();
        cal = Calendar.getInstance();
        // Reconfigura el objeto Calendar para calcular la fecha límite para mayores de edad (18 años atrás)
        cal.add(Calendar.YEAR, -18); // Hace 18 años desde hoy
        Date fechaLimiteMayorEdad = cal.getTime();
        // Verifica si la fecha de nacimiento es en el futuro
        if (fechaNacimientoDate.after(fechaActual)) {
            JOptionPane.showMessageDialog(null, "La fecha de nacimiento no puede ser futura.");
            return;//Sale del metodo si la fecha es mayor a la actual
        // Verifica si la fecha de nacimiento es demasiado antigua
        } else if (fechaNacimientoDate.before(fechaLimiteAntigua)) {
            JOptionPane.showMessageDialog(null, "La fecha de nacimiento no puede ser tan antigua.");
            return;//Sale del metodo si la edad es de hace 120 años 
        // Verifica si la fecha de nacimiento indica que la persona es menor de 18 años
        } else if (fechaNacimientoDate.after(fechaLimiteMayorEdad)) {
            JOptionPane.showMessageDialog(null, "Debe ser mayor de 18 años para registrarse.");
            return;//Sale del metodo si no es mayor de edad
        }
        // Validar que el nombre solo contenga letras
        //[a-zA-Z]: Permite letras mayúsculas y minúsculas.
        //áéíóúÁÉÍÓÚ: Permite letras con acentos (tildes) tanto en minúsculas como en mayúsculas
        //\\s: Permite espacios en blanco.
        //+: Indica que la cadena debe tener al menos un carácter válido (letra o espacio).
        if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) {
            JOptionPane.showMessageDialog(null, "El nombre solo debe contener letras y espacios.");
            return;//Sale del metodo si el nombre esta mal escrito
        }
        // Validar que el apellido solo contenga letras y espacios
        if (!apellido.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) {
            JOptionPane.showMessageDialog(null, "El apellido solo debe contener letras y espacios.");
            return;//Sale del metodo si el apellido esta mal
        }
        // Crea un objeto SimpleDateFormat para formatear fechas en el formato "yyyy-MM-dd"
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd"); // Formato compatible con la base de datos
        //Convierte la fecha de nacimiento (fechaNacimientoDate) en una cadena de texto con el formato especificado
        String fechaNacimiento = formatoFecha.format(fechaNacimientoDate);
        // Validar que los datos esten completos
        if (dni.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || sexo.isEmpty()|| fechaNacimiento.isEmpty() || direccion.isEmpty() || telefono.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, completar todos los datos.");
            return;//Sale del metodo si no estan completos
        }
        // Crear y mostrar la ventana con los datos
        //Manda los datos a ver registro
        verRegistro pTicket = new verRegistro(dni, nombre, apellido, sexo, fechaNacimiento, telefono, email, direccion);
        pTicket.setVisible(true);
        pTicket.setLocationRelativeTo(null);
    }// GEN-LAST:event_buttonMostrarActionPerformed

    // Funcion de salidar
    public void cerrar() {
        try {
        //Altera la forma de salir en la interfaz para agregarle un metodo
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    Confirmar();//Este metodo manda una venta de confirmacion
                }
            });
            this.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Mensaje al confirmar
    public void Confirmar() {
        //Se muestra un panel 
        int salir = JOptionPane.showConfirmDialog(this,"¿Está seguro de salir se perderán los datos ingresados?","Salir", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        //Si la respuesta es positiva se cierra la interfaz
        if (salir == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Gracias por visitarnos", "Vuelva pronto!!!",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }

    // Método para generar idCliente
    private String generateIdCliente() {
        String prefix = "CL";// Prefijo para el ID del cliente "CL"
        String characters = "0123456789";// Conjunto de caracteres numéricos permitidos
        Random rnd = new Random();// Generador de números aleatorios
        StringBuilder sb = new StringBuilder(prefix); // Constructor de cadenas que comienza con el prefijo
        // Bucle que genera los 6 caracteres numéricos aleatorios
        while (sb.length() < 8) {
            int index = rnd.nextInt(characters.length()); // Selecciona un índice aleatorio en la cadena de caracteres
            sb.append(characters.charAt(index));// Agrega el carácter seleccionado a la cadena final
        }
        return sb.toString();//Retorna el String 
    }

    // Método para validar el formato del correo electrónico
    private boolean validarEmail(String email) {
        //^: Indica el inicio de la cadena.
        //[] es un conjunto de caracteres.
        //a-zA-Z0-9 permite letras mayúsculas y minúsculas, y dígitos.
        //_+&*- permite algunos caracteres especiales comunes en direcciones de correo electrónico.
        //(?:...) es un grupo de no captura. Esto significa que el grupo se evalúa, pero no se captura en los resultados.
        //\\. coincide con un punto literal (.).
        //[a-zA-Z0-9_+&*-]+ coincide con una secuencia de caracteres alfanuméricos o especiales como antes.
        // * indica que el grupo anterior (un punto seguido de caracteres) puede repetirse cero o más veces
        // @: Coincide con el símbolo arroba (@), que es obligatorio en todas las direcciones de correo electrónico.
        //$: Indica el final de la cadena.
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        // Compila la expresión regular en un patrón
        Pattern pattern = Pattern.compile(emailRegex);
        // Aplica el patrón a la cadena de correo electrónico proporcionada
        Matcher matcher = pattern.matcher(email);
        // Devuelve true si el correo electrónico coincide con el patrón, false en caso contrario
        return matcher.matches();
    }

    // Metodo para Validar si el DNI ya esta Registrado
    //Traemos el valor de DNI
    private boolean isDniRegistered(String dni) {
        //Se conecta a la base de datos 
        try (Connection conn = DBConnection.getConnection()) {
        //Crea el select COUNT para contrar todos los registro que considan con la consulta
            String sql = "SELECT COUNT(*) FROM Cliente WHERE dni = ?";
            PreparedStatement ps = conn.prepareStatement(sql);//Se manda a consulta
            ps.setString(1, dni);//El ? viene a ser el valor del DNI escrito
            ResultSet rs = ps.executeQuery();// Guarda el valor de resultados
            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0; // Retorna verdadero si el DNI ya está registrado
            }
        } catch (SQLException e) {
        // Si algo sale mal al consultar se manda 
            JOptionPane.showMessageDialog(null, "Error al verificar el DNI: " + e.getMessage());
        }
        return false;//Si el DNI no esta registrado retorna falso
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
    private javax.swing.JButton buttonMostrar;
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
