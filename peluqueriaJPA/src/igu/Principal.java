package igu;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import logica.Controladora;


public class Principal extends javax.swing.JFrame {
    
        
    ImagenFondo fondo = new ImagenFondo();
    // variable que me servira para retornar los valores de los campos, dentro del método btnGuardarActionPerformed.
    Controladora control;
   
    public Principal(Controladora control) {
        // cargo el fondo antes de inicializar los componentes porque sino los tapa
        this.setContentPane(fondo);
        initComponents();
        // asigno la variable control proveniente de PeluqueriaJPA a mi variable global control.
        this.control = control;
        
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnlInputs = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblAlergia = new javax.swing.JLabel();
        lblRaza = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblEspecial = new javax.swing.JLabel();
        lblDuenio = new javax.swing.JLabel();
        lblObs = new javax.swing.JLabel();
        lblCel = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        cmbAlergia = new javax.swing.JComboBox<>();
        txtDuenio = new javax.swing.JTextField();
        txtCel = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaObs = new javax.swing.JTextArea();
        cmbEspecial = new javax.swing.JComboBox<>();
        pnlImg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlBotones = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(643, 661));
        setResizable(false);

        pnlTitulo.setMaximumSize(new java.awt.Dimension(561, 148));
        pnlTitulo.setOpaque(false);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 51, 153));
        lblTitulo.setText("Pelúqueria Canina");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/huella_ur.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/huella_ul.png"))); // NOI18N

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTituloLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(132, 132, 132)
                .addComponent(jLabel2))
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(19, 19, 19))
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addGroup(pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlInputs.setMaximumSize(new java.awt.Dimension(464, 528));
        pnlInputs.setOpaque(false);

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 51, 153));
        lblNombre.setText("Nombre:");

        lblCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(0, 51, 153));
        lblCliente.setText("Cliente N°:");

        lblAlergia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAlergia.setForeground(new java.awt.Color(0, 51, 153));
        lblAlergia.setText("Alérgico:");

        lblRaza.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRaza.setForeground(new java.awt.Color(0, 51, 153));
        lblRaza.setText("Raza:");

        lblColor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblColor.setForeground(new java.awt.Color(0, 51, 153));
        lblColor.setText("Color:");

        lblEspecial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEspecial.setForeground(new java.awt.Color(0, 51, 153));
        lblEspecial.setText("Atención Especial:");

        lblDuenio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDuenio.setForeground(new java.awt.Color(0, 51, 153));
        lblDuenio.setText("Nombre Dueño:");

        lblObs.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblObs.setForeground(new java.awt.Color(0, 51, 153));
        lblObs.setText("Observaciones:");

        lblCel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCel.setForeground(new java.awt.Color(0, 51, 153));
        lblCel.setText("Cel. Dueño:");

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        txtCliente.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        txtRaza.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        txtColor.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        cmbAlergia.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cmbAlergia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No" }));

        txtDuenio.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        txtCel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        txaObs.setColumns(20);
        txaObs.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txaObs.setRows(5);
        jScrollPane1.setViewportView(txaObs);

        cmbEspecial.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cmbEspecial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No" }));

        javax.swing.GroupLayout pnlInputsLayout = new javax.swing.GroupLayout(pnlInputs);
        pnlInputs.setLayout(pnlInputsLayout);
        pnlInputsLayout.setHorizontalGroup(
            pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInputsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInputsLayout.createSequentialGroup()
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombre))
                    .addGroup(pnlInputsLayout.createSequentialGroup()
                        .addGroup(pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblColor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblRaza, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAlergia, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtColor)
                            .addComponent(txtRaza)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInputsLayout.createSequentialGroup()
                        .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCliente))
                    .addGroup(pnlInputsLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbAlergia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 172, Short.MAX_VALUE))
                    .addGroup(pnlInputsLayout.createSequentialGroup()
                        .addGroup(pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblObs, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(txtCel)
                            .addComponent(txtDuenio))))
                .addGap(13, 13, 13))
        );
        pnlInputsLayout.setVerticalGroup(
            pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInputsLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRaza))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColor)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInputsLayout.createSequentialGroup()
                        .addGroup(pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAlergia)
                            .addComponent(cmbAlergia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEspecial))
                    .addComponent(cmbEspecial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDuenio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCel)
                    .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblObs)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlImg.setMinimumSize(null);
        pnlImg.setOpaque(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pichicho.png"))); // NOI18N

        javax.swing.GroupLayout pnlImgLayout = new javax.swing.GroupLayout(pnlImg);
        pnlImg.setLayout(pnlImgLayout);
        pnlImgLayout.setHorizontalGroup(
            pnlImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlImgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlImgLayout.setVerticalGroup(
            pnlImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlImgLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlBotones.setMaximumSize(new java.awt.Dimension(733, 111));
        pnlBotones.setOpaque(false);

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 51, 153));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 51, 153));
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setPreferredSize(new java.awt.Dimension(76, 35));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/huella_dl.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/huella_dr.png"))); // NOI18N

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(113, 113, 113)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotonesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlInputs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnlTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlInputs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        /*función que limpia los campos del formulario.
        */
        limpiarForm();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        /* función que envia los valores ingresados hacia mi controladora, por medio de mi variable control, para crear una mascota.
        */
        //Faltan todas las validaciones
        
        String num_cliente = txtCliente.getText();
        String nombre_perro = txtNombre.getText();
        String raza = txtRaza.getText();
        String color = txtColor.getText();
        String nombre_duenio = txtDuenio.getText();
        String celular_duenio = txtCel.getText();
        String observacion = txaObs.getText();
        
        //combo atencion especial
        boolean atencion_especial = false;
        
        String result_cmb_esp = cmbEspecial.getSelectedItem().toString();
        
        if (result_cmb_esp == "Si") {
            atencion_especial = true;
        }else{
            atencion_especial = false;
        }
        
        //combo alergias
        boolean alergico = false;
        
        String result_cmb_alerg = cmbAlergia.getSelectedItem().toString();
        
        if (result_cmb_alerg == "Si") {
            alergico = true;
        }else{
            alergico = false;
        }
        
       
        //============================================
        
        try {
            // intento guardar los valores ingresados
            control.crearMascota(num_cliente, nombre_perro, raza, color, alergico, atencion_especial, nombre_duenio, celular_duenio, observacion);
            
            // muestro un mensaje de guardado exitoso
            JOptionPane.showMessageDialog(null, "Mascota agregada correctamente", "Mascota agregada", JOptionPane.INFORMATION_MESSAGE);
            
            // limpio los campos
            limpiarForm();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ah ocurrido un error, la mascota no se ha agregado", "Error", JOptionPane.ERROR_MESSAGE);
        }
                       
        
    }//GEN-LAST:event_btnGuardarActionPerformed
    
    
    private void limpiarForm(){
        /* función que limpia los campos de la interfaz
        */
        txtCliente.setText("");
        txtNombre.setText("");
        txtRaza.setText("");
        txtColor.setText("");
        cmbAlergia.setSelectedItem("-");
        cmbEspecial.setSelectedItem("-");
        txtDuenio.setText("");
        txtCel.setText("");
        txaObs.setText("");
    }
    
     class ImagenFondo extends JPanel{
        /* clase que setea y gestiona el background del jFrame
        */
        private Image imagen;
        
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("../imagenes/bg.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbAlergia;
    private javax.swing.JComboBox<String> cmbEspecial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlergia;
    private javax.swing.JLabel lblCel;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblDuenio;
    private javax.swing.JLabel lblEspecial;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblObs;
    private javax.swing.JLabel lblRaza;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlImg;
    private javax.swing.JPanel pnlInputs;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JTextArea txaObs;
    private javax.swing.JTextField txtCel;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDuenio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables
}
