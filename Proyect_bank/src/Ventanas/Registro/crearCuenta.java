
package Ventanas.Registro;

// Importa la clase DBConnection para gestionar la conexión con la base de datos
import Ventanas.DBConnection;
// Permite manejar eventos de ventana, como abrir o cerrar
import java.awt.event.WindowAdapter;
// Maneja eventos específicos de la ventana, como cuando se cierra
import java.awt.event.WindowEvent;
// Interfaz gráfica, clase base para crear ventanas
import javax.swing.JFrame;
// Muestra cuadros de diálogo con mensajes y botones
import javax.swing.JOptionPane;
// Maneja la conexión a la base de datos
import java.sql.Connection;
// Permite ejecutar sentencias SQL preparadas para mayor seguridad y eficiencia
import java.sql.PreparedStatement;
// Maneja excepciones relacionadas con la base de datos
import java.sql.SQLException;
// Genera números aleatorios, útil para crear identificadores únicos
import java.util.Random;

public class crearCuenta extends javax.swing.JFrame {
        private String idCliente;// Traer idCliente de la clienteRegistro
        public crearCuenta(String idCliente) {
                this.idCliente = idCliente;// Traer el idCliente como una variable para despues usarla 
                initComponents();
                //Da titulo a la Interfaz
                this.setTitle("Creacion de cuenta");
                //Quita los label
                ver.setVisible(false);
                verConfirmar.setVisible(false);
                //Cambia el simbolo de los passField
                passConfirmar.setEchoChar('*');
                passContraseña.setEchoChar('*');
                //Metodo para cerrar
                cerrar();
        }
        // No Tocar en Visual
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                gruopTipoTarjeta = new javax.swing.ButtonGroup();
                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                jLabel13 = new javax.swing.JLabel();
                jLabel14 = new javax.swing.JLabel();
                jLabel15 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                passConfirmar = new javax.swing.JPasswordField();
                passContraseña = new javax.swing.JPasswordField();
                jPanel4 = new javax.swing.JPanel();
                buttonCredito = new javax.swing.JRadioButton();
                ButtonDebito = new javax.swing.JRadioButton();
                oculto = new javax.swing.JLabel();
                ver = new javax.swing.JLabel();
                ocultoConfirmar = new javax.swing.JLabel();
                verConfirmar = new javax.swing.JLabel();
                buttonCancelar = new javax.swing.JButton();
                buttonFinalizar = new javax.swing.JButton();
                jPanel2 = new javax.swing.JPanel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));
                jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 51, 51));
                jLabel1.setText("Nuevo");

                jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N

                jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N

                jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
                jLabel13.setText(" ");

                jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
                jLabel14.setForeground(new java.awt.Color(255, 51, 51));
                jLabel14.setText("Bank");

                jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
                jLabel15.setText("Peru");

                jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
                jLabel2.setText("Tipo de cuenta:");

                jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
                jLabel4.setText("Contraseña:");

                jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
                jLabel5.setText("Confirmar contraseña:");

                passConfirmar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

                passContraseña.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

                jPanel4.setBackground(new java.awt.Color(255, 51, 51));
                jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

                javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
                jPanel4.setLayout(jPanel4Layout);
                jPanel4Layout.setHorizontalGroup(
                                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 148, Short.MAX_VALUE));
                jPanel4Layout.setVerticalGroup(
                                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 0, Short.MAX_VALUE));

                gruopTipoTarjeta.add(buttonCredito);
                buttonCredito.setText("Credito");
                buttonCredito.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                buttonCreditoActionPerformed(evt);
                        }
                });

                gruopTipoTarjeta.add(ButtonDebito);
                ButtonDebito.setText("Debito");
                ButtonDebito.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                ButtonDebitoActionPerformed(evt);
                        }
                });

                oculto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ocultar.png"))); // NOI18N
                oculto.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                ocultoMouseClicked(evt);
                        }
                });

                ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ver.png"))); // NOI18N
                ver.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                verMouseClicked(evt);
                        }
                });

                ocultoConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ocultar.png"))); // NOI18N
                ocultoConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                ocultoConfirmarMouseClicked(evt);
                        }
                });

                verConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ver.png"))); // NOI18N
                verConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                verConfirmarMouseClicked(evt);
                        }
                });

                buttonCancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                buttonCancelar.setText("Cancelar");
                buttonCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                buttonCancelarActionPerformed(evt);
                        }
                });

                buttonFinalizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                buttonFinalizar.setText("Finalizar");
                buttonFinalizar.setBorder(
                                new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                buttonFinalizar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                buttonFinalizarActionPerformed(evt);
                        }
                });

                jPanel2.setBackground(new java.awt.Color(255, 51, 51));
                jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 151, Short.MAX_VALUE));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 0, Short.MAX_VALUE));

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(180, 180, 180)
                                                                .addComponent(jLabel3)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jPanel4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel5)
                                                                                                                .addComponent(jLabel4))
                                                                                                .addGap(28, 28, 28)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(passContraseña,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                150,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(passConfirmar,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                150,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(ocultoConfirmar)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(verConfirmar,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addGap(6, 6, 6))
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(oculto)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(ver,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE)))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jLabel13)
                                                                                                .addGap(13, 13, 13))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(21, 21, 21)
                                                                                                                                .addComponent(jLabel1))
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(jLabel2)))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(6, 6, 6)
                                                                                                                                .addComponent(ButtonDebito)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addComponent(buttonCredito)
                                                                                                                                .addGap(58, 58, 58))
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(jLabel15)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(jLabel14)))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(103, 103, 103)
                                                                                                .addComponent(buttonCancelar,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                119,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(buttonFinalizar,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                119,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(72, 72, 72)))
                                                                .addComponent(jPanel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel8)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addContainerGap()
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                                                                                .addComponent(passContraseña,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                                .addGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                                jPanel1Layout
                                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                jLabel1)
                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                jLabel15)
                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                jLabel14))
                                                                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                                                .addGroup(
                                                                                                                                                                                                                                jPanel1Layout
                                                                                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                                                                                .addGap(32,
                                                                                                                                                                                                                                                                32,
                                                                                                                                                                                                                                                                32)
                                                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                                                jLabel13))
                                                                                                                                                                                                                .addGroup(
                                                                                                                                                                                                                                jPanel1Layout
                                                                                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                                                                                .addGap(54,
                                                                                                                                                                                                                                                                54,
                                                                                                                                                                                                                                                                54)
                                                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                                                jLabel4))
                                                                                                                                                                                                                .addGroup(
                                                                                                                                                                                                                                jPanel1Layout
                                                                                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                                                                                .addGap(49,
                                                                                                                                                                                                                                                                49,
                                                                                                                                                                                                                                                                49)
                                                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                                                ver))
                                                                                                                                                                                                                .addGroup(
                                                                                                                                                                                                                                jPanel1Layout
                                                                                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                                                                                .addGap(49,
                                                                                                                                                                                                                                                                49,
                                                                                                                                                                                                                                                                49)
                                                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                                                oculto))))
                                                                                                                                                                .addGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                                jPanel1Layout
                                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                                .addGap(72, 72, 72)
                                                                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                ButtonDebito)
                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                buttonCredito)
                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                jLabel2))))
                                                                                                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                                                .addComponent(jLabel8)
                                                                                                                                                .addGap(199, 199,
                                                                                                                                                                199))
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                                                .addGap(20, 20, 20)
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                                                                                .addComponent(jLabel5)
                                                                                                                                                                                .addComponent(passConfirmar,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                                                false)
                                                                                                                                                                                .addComponent(ocultoConfirmar,
                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                                .addComponent(verConfirmar,
                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                Short.MAX_VALUE)))
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                                                                .addComponent(buttonFinalizar,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                57,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addComponent(buttonCancelar,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                57,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                .addGap(37, 37, 37))))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jPanel4,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jPanel2,
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                                .addComponent(jLabel3)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 822,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                340,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE)));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonCancelarActionPerformed
                // Boton cancelar
                int confirmar = JOptionPane.showConfirmDialog(this,"¿Está seguro de que quiero salir?, se borrar también el registro.","Confirmar eliminación", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
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

        private void ocultoMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_ocultoMouseClicked
                // Label con Evento de Mouse
                oculto.setVisible(false);
                //Si se presiona el label se oculta y se muestra el otro 
                ver.setVisible(true);
                //Quita la censura a la contraseña
                passContraseña.setEchoChar((char) 0);
        }// GEN-LAST:event_ocultoMouseClicked

        private void verMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_verMouseClicked
                // Label con Evento de Mouse
                oculto.setVisible(true);
                //Si se presiona el label se oculta y se muestra el otro 
                ver.setVisible(false);
                //Pone la Censura a la contraseña
                passContraseña.setEchoChar('*');
        }// GEN-LAST:event_verMouseClicked

        private void ocultoConfirmarMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_ocultoConfirmarMouseClicked
                // Label con Evento de Mouse
                ocultoConfirmar.setVisible(false);
                //Si se presiona el label se oculta y se muestra el otro 
                verConfirmar.setVisible(true);
                //Quita la censura a la contraseña
                passConfirmar.setEchoChar((char) 0);
        }// GEN-LAST:event_ocultoConfirmarMouseClicked

        private void verConfirmarMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_verConfirmarMouseClicked
                // Label con Evento de Mouse
                ocultoConfirmar.setVisible(true);
                //Si se presiona el label se oculta y se muestra el otro 
                verConfirmar.setVisible(false);
                //Pone la Censura a la contraseña
                passConfirmar.setEchoChar('*');
        }// GEN-LAST:event_verConfirmarMouseClicked

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
        private javax.swing.JButton buttonCancelar;
        private javax.swing.JRadioButton buttonCredito;
        private javax.swing.JButton buttonFinalizar;
        private javax.swing.ButtonGroup gruopTipoTarjeta;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel15;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JLabel oculto;
        private javax.swing.JLabel ocultoConfirmar;
        private javax.swing.JPasswordField passConfirmar;
        private javax.swing.JPasswordField passContraseña;
        private javax.swing.JLabel ver;
        private javax.swing.JLabel verConfirmar;
        // End of variables declaration//GEN-END:variables
}
