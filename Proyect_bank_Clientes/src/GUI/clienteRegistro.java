package GUI;


import DB.DBConnection;
import java.util.Random;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.Image;
import javax.swing.ImageIcon;

public class clienteRegistro extends javax.swing.JFrame {

    public clienteRegistro() {
        initComponents();
        //Da titulo a  la Interfaz
        this.setTitle("Registro de nuevo usuario ");
        cerrar();
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/logo.png"));
        Image logo = icon.getImage();
        setIconImage(logo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLocaleChooser1 = new com.toedter.components.JLocaleChooser();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        ButtonRegistro1 = new javax.swing.JButton();
        Nacimiento = new com.toedter.calendar.JDateChooser();
        TxtDNI = new javax.swing.JTextField();
        buttonMostrar = new javax.swing.JButton();
        TXTNombres = new javax.swing.JTextField();
        TXTApellidos = new javax.swing.JTextField();
        TXTdireccion = new javax.swing.JTextField();
        TXTtelefono = new javax.swing.JTextField();
        TXTcorreo = new javax.swing.JTextField();
        Masculino = new javax.swing.JRadioButton();
        Femenino = new javax.swing.JRadioButton();
        otros = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itmVolver = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(0, 53, 102));

        jPanel5.setBackground(new java.awt.Color(230, 230, 230));

        ButtonRegistro1.setBackground(new java.awt.Color(230, 230, 230));
        ButtonRegistro1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        ButtonRegistro1.setForeground(new java.awt.Color(0, 53, 102));
        ButtonRegistro1.setText(" Registrarse ");
        ButtonRegistro1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 3, 1, 3, new java.awt.Color(0, 53, 102)));
        ButtonRegistro1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonRegistro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegistro1ActionPerformed(evt);
            }
        });

        Nacimiento.setBackground(new java.awt.Color(230, 230, 230));
        Nacimiento.setForeground(new java.awt.Color(0, 53, 102));
        Nacimiento.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N

        TxtDNI.setBackground(new java.awt.Color(230, 230, 230));
        TxtDNI.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        TxtDNI.setForeground(new java.awt.Color(0, 53, 102));
        TxtDNI.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 53, 102)));
        TxtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDNIActionPerformed(evt);
            }
        });

        buttonMostrar.setBackground(new java.awt.Color(230, 230, 230));
        buttonMostrar.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        buttonMostrar.setForeground(new java.awt.Color(0, 53, 102));
        buttonMostrar.setText("Previsualizar Registro ");
        buttonMostrar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 3, 1, 3, new java.awt.Color(0, 53, 102)));
        buttonMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMostrarActionPerformed(evt);
            }
        });

        TXTNombres.setBackground(new java.awt.Color(230, 230, 230));
        TXTNombres.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        TXTNombres.setForeground(new java.awt.Color(0, 53, 102));
        TXTNombres.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 53, 102)));

        TXTApellidos.setBackground(new java.awt.Color(230, 230, 230));
        TXTApellidos.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        TXTApellidos.setForeground(new java.awt.Color(0, 53, 102));
        TXTApellidos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 53, 102)));
        TXTApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTApellidosActionPerformed(evt);
            }
        });

        TXTdireccion.setBackground(new java.awt.Color(230, 230, 230));
        TXTdireccion.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        TXTdireccion.setForeground(new java.awt.Color(0, 53, 102));
        TXTdireccion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 53, 102)));

        TXTtelefono.setBackground(new java.awt.Color(230, 230, 230));
        TXTtelefono.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        TXTtelefono.setForeground(new java.awt.Color(0, 53, 102));
        TXTtelefono.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 53, 102)));

        TXTcorreo.setBackground(new java.awt.Color(230, 230, 230));
        TXTcorreo.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        TXTcorreo.setForeground(new java.awt.Color(0, 53, 102));
        TXTcorreo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 53, 102)));

        Masculino.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        Masculino.setForeground(new java.awt.Color(0, 53, 102));
        Masculino.setText("Masculino");
        Masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasculinoActionPerformed(evt);
            }
        });

        Femenino.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        Femenino.setForeground(new java.awt.Color(0, 53, 102));
        Femenino.setText("Femenino");
        Femenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemeninoActionPerformed(evt);
            }
        });

        otros.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        otros.setForeground(new java.awt.Color(0, 53, 102));
        otros.setText("Otros");

        jLabel17.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 53, 102));
        jLabel17.setText("    Correo                       :");
        jLabel17.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        jLabel18.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 53, 102));
        jLabel18.setText("    Dirección                    :");
        jLabel18.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        jLabel19.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 53, 102));
        jLabel19.setText("    Teléfono                     :");
        jLabel19.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        jLabel20.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 53, 102));
        jLabel20.setText("    Fecha de Nacimiento  :");
        jLabel20.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        jLabel21.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 53, 102));
        jLabel21.setText("    Sexo                           :");
        jLabel21.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        jLabel22.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 53, 102));
        jLabel22.setText("    Nombres                    :");
        jLabel22.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        jLabel23.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 53, 102));
        jLabel23.setText("   Apellidos                     :");
        jLabel23.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        jLabel24.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 53, 102));
        jLabel24.setText("    Datos personales                   :");
        jLabel24.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 1, 0, new java.awt.Color(0, 53, 102)));

        jLabel25.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 53, 102));
        jLabel25.setText("    DNI                            :");
        jLabel25.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        jLabel28.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 53, 102));
        jLabel28.setText("Soluciones financieras con confianza y claridad.");
        jLabel28.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 1, 3, new java.awt.Color(0, 53, 102)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dni.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendario.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/direccion.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telefono.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mail.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Nacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Masculino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Femenino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(otros)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLabel22)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(TXTNombres))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLabel23)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(TXTApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TxtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel18)
                                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel17)
                                                .addComponent(jLabel19)))
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(TXTdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(TXTtelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(TXTcorreo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(ButtonRegistro1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(buttonMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel28)))
                .addGap(20, 20, 20))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel25)
                                .addComponent(TxtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)))
                    .addComponent(jLabel4))
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23)
                        .addComponent(TXTApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(Masculino)
                    .addComponent(Femenino)
                    .addComponent(otros))
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel20)
                                    .addComponent(Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(TXTdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(TXTtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6))
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(TXTcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonRegistro1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel7))
                .addGap(30, 30, 30))
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
            .addGap(0, 551, Short.MAX_VALUE)
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
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jMenuBar1.setBackground(new java.awt.Color(230, 230, 230));
        jMenuBar1.setForeground(new java.awt.Color(0, 53, 102));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/volver.png"))); // NOI18N
        jMenu1.setText("Volver");

        itmVolver.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/volver.png"))); // NOI18N
        itmVolver.setText("Volver al Inicio");
        itmVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmVolverActionPerformed(evt);
            }
        });
        jMenu1.add(itmVolver);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmVolverActionPerformed
        inicioGuia pInicioGuia = new inicioGuia();
        pInicioGuia.setVisible(true);
        pInicioGuia.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_itmVolverActionPerformed

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
            JOptionPane.showMessageDialog(null, "Por favor, seleccionar una fecha de nacimiento válida.","Advertencia",JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Validar que el DNI tenga 8 dígitos y no sean letras
        String dni = TxtDNI.getText();
        if (!dni.matches("\\d{8}")) {
            JOptionPane.showMessageDialog(null, "El DNI es invalido, ingresar un DNI valido.","Advertencia",JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (isDniRegistered(dni)) {
            JOptionPane.showMessageDialog(null, "El DNI ya se encuentra registrado con otro usuario, por favor, ingresar otro.","Advertencia",JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Validar que el teléfono tenga 9 dígitos
        String telefono = TXTtelefono.getText();
        if (!telefono.matches("\\d{9}")) {
            JOptionPane.showMessageDialog(null, "El número de teléfono es invalido, por favor ingresar un número de teléfono valido.","Advertencia",JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Validar el formato del correo electrónico
        String email = TXTcorreo.getText();
        if (!validarEmail(email)) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un correo electrónico válido.","Advertencia",JOptionPane.WARNING_MESSAGE);
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
            JOptionPane.showMessageDialog(null, "La fecha de nacimiento no puede ser del futuro, por favor ingresar una fecha valida.","Advertencia",JOptionPane.WARNING_MESSAGE);
            return;
        } else if (fechaNacimientoDate.before(fechaLimiteAntigua)) {
            JOptionPane.showMessageDialog(null, "La fecha de nacimiento no puede ser tan antigua, por favor ingresar una fecha valida.","Advertencia",JOptionPane.WARNING_MESSAGE);
            return;
        } else if (fechaNacimientoDate.after(fechaLimiteMayorEdad)) {
            JOptionPane.showMessageDialog(null, "Debe ser mayor de 18 años para registrarse.","Advertencia",JOptionPane.WARNING_MESSAGE);
            return;
        }
        // Validar que el nombre solo contenga letras
        //[a-zA-Z]: Permite letras mayúsculas y minúsculas.
        //áéíóúÁÉÍÓÚ: Permite letras con acentos (tildes) tanto en minúsculas como en mayúsculas
        //\\s: Permite espacios en blanco.
        //+: Indica que la cadena debe tener al menos un carácter válido (letra o espacio).
        if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) {
            JOptionPane.showMessageDialog(null, "Nombre invalido, por favor ingresar un nombre valido, prueba solo usar letras.","Advertencia",JOptionPane.WARNING_MESSAGE);
            return;//Sale del metodo si no se escribe bien el nombre
        }
        // Validar que el apellido solo contenga letras
        if (!apellido.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) {
            JOptionPane.showMessageDialog(null, "Apellido invalido, por favor ingresar un apellido valido, prueba solo usar letras.","Advertencia",JOptionPane.WARNING_MESSAGE);
            return;
        }

        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd"); // Formato compatible con la base de datos
        String fechaNacimiento = formatoFecha.format(fechaNacimientoDate);

        // Validar que los datos esten completos
        if (dni.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || sexo.isEmpty()|| fechaNacimiento.isEmpty() || direccion.isEmpty() || telefono.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, completar todos los campos.","Advertencia",JOptionPane.WARNING_MESSAGE);
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

            JOptionPane.showMessageDialog(null, "Se completo el registro del nuevo usuario, ahora pasemos a crea una cuenta.","Felicidades",JOptionPane.INFORMATION_MESSAGE);

            // Mandar el id Cliente crearCuenta y abrir la interfaz
            crearCuenta pantallaCuenta = new crearCuenta(idCliente);
            pantallaCuenta.setVisible(true);
            pantallaCuenta.setLocationRelativeTo(null);
            this.dispose();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:No se completo el registro"+e.getMessage(),"Error",JOptionPane.WARNING_MESSAGE);
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
    private javax.swing.JMenuItem itmVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private com.toedter.components.JLocaleChooser jLocaleChooser1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton otros;
    // End of variables declaration//GEN-END:variables
}
