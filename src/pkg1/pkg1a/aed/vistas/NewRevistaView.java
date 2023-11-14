package pkg1.pkg1a.aed.vistas;

import pkg1.pkg1a.aed.modelos.BoletinPublicado;
import pkg1.pkg1a.aed.modelos.CheckErrors;
import pkg1.pkg1a.aed.modelos.RevistaPublicada;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class NewRevistaView extends javax.swing.JFrame {

    ArrayList<RevistaPublicada> nuevaRevistasPublicas = new ArrayList<>();
    ArrayList<BoletinPublicado> nuevosBoletinesPublicos = new ArrayList<>();

    public NewRevistaView() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public NewRevistaView(ArrayList<RevistaPublicada> array, ArrayList<BoletinPublicado> array2) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.nuevaRevistasPublicas = array;
        this.nuevosBoletinesPublicos = array2;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registroRevistaJPanel = new javax.swing.JPanel();
        registroRevistaJLabel = new javax.swing.JLabel();
        tituloRevistaJLabel = new javax.swing.JLabel();
        autorRevistaJLabel = new javax.swing.JLabel();
        editorialRevistaJLabel = new javax.swing.JLabel();
        mailDeContactoJLabel = new javax.swing.JLabel();
        numeroDePaginasJLabel = new javax.swing.JLabel();
        precioRevistaJLabel = new javax.swing.JLabel();
        formatoDeLaRevistaJLabel = new javax.swing.JLabel();
        tituloRevistaJTextfield = new javax.swing.JTextField();
        autorRevistaJTextField = new javax.swing.JTextField();
        editorialRevistaJTextField = new javax.swing.JTextField();
        correoRevistaJTextField = new javax.swing.JTextField();
        numeroDePaginasJTextField = new javax.swing.JTextField();
        precioRevistaJTextField = new javax.swing.JTextField();
        formatoDeLaRevistaJCOmbobox = new javax.swing.JComboBox<>();
        registrarRevistaJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Revistas");
        setMinimumSize(new java.awt.Dimension(530, 360));
        setResizable(false);

        registroRevistaJPanel.setMaximumSize(new java.awt.Dimension(530, 360));
        registroRevistaJPanel.setMinimumSize(new java.awt.Dimension(530, 360));
        registroRevistaJPanel.setPreferredSize(new java.awt.Dimension(530, 360));

        registroRevistaJLabel.setBackground(new java.awt.Color(60, 255, 0));
        registroRevistaJLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        registroRevistaJLabel.setForeground(new java.awt.Color(187, 255, 0));
        registroRevistaJLabel.setText("REGISTRO REVISTA");
        registroRevistaJLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tituloRevistaJLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tituloRevistaJLabel.setText("Titulo:");

        autorRevistaJLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        autorRevistaJLabel.setText("Autor:");

        editorialRevistaJLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        editorialRevistaJLabel.setText("Editorial:");

        mailDeContactoJLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mailDeContactoJLabel.setText("Mail de contacto:");

        numeroDePaginasJLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        numeroDePaginasJLabel.setText("Número de páginas:");

        precioRevistaJLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        precioRevistaJLabel.setText("Precio:");

        formatoDeLaRevistaJLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        formatoDeLaRevistaJLabel.setText("Formato de la revista:");

        formatoDeLaRevistaJCOmbobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DIGITAL", "IMPRESO" }));

        registrarRevistaJButton.setBackground(new java.awt.Color(78, 255, 0));
        registrarRevistaJButton.setText("REGISTRAR");
        registrarRevistaJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarRevistaJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registroRevistaJPanelLayout = new javax.swing.GroupLayout(registroRevistaJPanel);
        registroRevistaJPanel.setLayout(registroRevistaJPanelLayout);
        registroRevistaJPanelLayout.setHorizontalGroup(
            registroRevistaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registroRevistaJPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(registroRevistaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registroRevistaJLabel)
                    .addGroup(registroRevistaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(registroRevistaJPanelLayout.createSequentialGroup()
                            .addGroup(registroRevistaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(mailDeContactoJLabel)
                                .addComponent(numeroDePaginasJLabel))
                            .addGap(18, 18, 18)
                            .addGroup(registroRevistaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(correoRevistaJTextField)
                                .addGroup(registroRevistaJPanelLayout.createSequentialGroup()
                                    .addComponent(numeroDePaginasJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(precioRevistaJLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(precioRevistaJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(registroRevistaJPanelLayout.createSequentialGroup()
                            .addGroup(registroRevistaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(autorRevistaJLabel)
                                .addComponent(tituloRevistaJLabel))
                            .addGroup(registroRevistaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(registroRevistaJPanelLayout.createSequentialGroup()
                                    .addGap(36, 36, 36)
                                    .addComponent(autorRevistaJTextField))
                                .addGroup(registroRevistaJPanelLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tituloRevistaJTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registroRevistaJPanelLayout.createSequentialGroup()
                            .addComponent(editorialRevistaJLabel)
                            .addGap(18, 18, 18)
                            .addComponent(editorialRevistaJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(registroRevistaJPanelLayout.createSequentialGroup()
                            .addComponent(formatoDeLaRevistaJLabel)
                            .addGap(18, 18, 18)
                            .addComponent(formatoDeLaRevistaJCOmbobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(registrarRevistaJButton))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        registroRevistaJPanelLayout.setVerticalGroup(
            registroRevistaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registroRevistaJPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(registroRevistaJLabel)
                .addGap(33, 33, 33)
                .addGroup(registroRevistaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloRevistaJLabel)
                    .addComponent(tituloRevistaJTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registroRevistaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(autorRevistaJLabel)
                    .addComponent(autorRevistaJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registroRevistaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editorialRevistaJLabel)
                    .addComponent(editorialRevistaJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registroRevistaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mailDeContactoJLabel)
                    .addComponent(correoRevistaJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registroRevistaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroDePaginasJLabel)
                    .addComponent(numeroDePaginasJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precioRevistaJLabel)
                    .addComponent(precioRevistaJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registroRevistaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoDeLaRevistaJLabel)
                    .addComponent(formatoDeLaRevistaJCOmbobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrarRevistaJButton))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(registroRevistaJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registroRevistaJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarRevistaJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarRevistaJButtonActionPerformed

        boolean hayCamposVacios = false;

        RevistaPublicada nuevaRevistaPublicada = new RevistaPublicada();
        CheckErrors ex = new CheckErrors();
        String stringDelDialogo = "[i] Detectado varios errores:\n";
        

        if (!tituloRevistaJTextfield.getText().isEmpty()) {

            nuevaRevistaPublicada.setTitulo(tituloRevistaJTextfield.getText());

        } else {
            stringDelDialogo += " - El Titulo no puede estar vacio.\n";
            hayCamposVacios = true;
        }

        if (!autorRevistaJTextField.getText().isEmpty()
                && ex.comprobarNombres(autorRevistaJTextField.getText())) {

            nuevaRevistaPublicada.setNombreAutor(autorRevistaJTextField.getText());
        } else {

            stringDelDialogo += " - El nombre del autor, no puede contener numeros.\n";
            hayCamposVacios = true;

        }

        if (!editorialRevistaJTextField.getText().isEmpty()) {

            nuevaRevistaPublicada.setEditorial(editorialRevistaJTextField.getText());
        } else {

            stringDelDialogo += " - La Editorial no puede estar vacia.\n";
            hayCamposVacios = true;

        }

        if (!correoRevistaJTextField.getText().isEmpty()
                && ex.comprobarCorreoElectronico(correoRevistaJTextField.getText())) {

            nuevaRevistaPublicada.setCorreo(correoRevistaJTextField.getText());
        } else {

            stringDelDialogo += " - Formato de correo no valido. Solo punto (.), guion (-) y guion bajo (_).\n";
            hayCamposVacios = true;
        }

        if (formatoDeLaRevistaJCOmbobox.getSelectedItem().toString().equals("IMPRESO")) {

            nuevaRevistaPublicada.setFormato("Impreso");

        } else if (formatoDeLaRevistaJCOmbobox.getSelectedItem().toString().equals("DIGITAL")) {

            nuevaRevistaPublicada.setFormato("Digital");

        }

        if (!numeroDePaginasJTextField.getText().isEmpty()
                && ex.comprobarNumeroDePagina(numeroDePaginasJTextField.getText())
                && !ex.comprobarNumerosNegativos(Integer.parseInt(numeroDePaginasJTextField.getText()))) {

            nuevaRevistaPublicada.setNumeroDePaginas(Integer.parseInt(numeroDePaginasJTextField.getText()));

        } else {

            stringDelDialogo += " - El numero de paginas solo admite numero y no puede estar vacio.\n";
            hayCamposVacios = true;
        }

        if (!precioRevistaJTextField.getText().isEmpty()
                && ex.comprobarPrecioConComa(precioRevistaJTextField.getText())
                && !ex.comprobarNumerosNegativos(Float.parseFloat(precioRevistaJTextField.getText()))) {

            nuevaRevistaPublicada.setPrecio(Float.parseFloat(precioRevistaJTextField.getText()));

        } else {

            stringDelDialogo += " - El precio solo admite numeros, su formato es 0.0 y no puede estar vacio ni ser negativo.\n";
            hayCamposVacios = true;
        }

        if (hayCamposVacios) {
            JOptionPane.showMessageDialog(null, stringDelDialogo, "ERROR AL REGISTRAR REVISTA", JOptionPane.ERROR_MESSAGE);

        } else {

            stringDelDialogo = "";
            stringDelDialogo = "[i] Revista añadida con exito";
            this.nuevaRevistasPublicas.add(nuevaRevistaPublicada);
            MainView nuevaPantallaPrincipal = new MainView(nuevaRevistasPublicas, nuevosBoletinesPublicos);
            nuevaPantallaPrincipal.setVisible(true);
            JOptionPane.showMessageDialog(null, stringDelDialogo, "REVISTA CREADO", JOptionPane.INFORMATION_MESSAGE);

            this.dispose();
        }

    }//GEN-LAST:event_registrarRevistaJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel autorRevistaJLabel;
    private javax.swing.JTextField autorRevistaJTextField;
    private javax.swing.JTextField correoRevistaJTextField;
    private javax.swing.JLabel editorialRevistaJLabel;
    private javax.swing.JTextField editorialRevistaJTextField;
    private javax.swing.JComboBox<String> formatoDeLaRevistaJCOmbobox;
    private javax.swing.JLabel formatoDeLaRevistaJLabel;
    private javax.swing.JLabel mailDeContactoJLabel;
    private javax.swing.JLabel numeroDePaginasJLabel;
    private javax.swing.JTextField numeroDePaginasJTextField;
    private javax.swing.JLabel precioRevistaJLabel;
    private javax.swing.JTextField precioRevistaJTextField;
    private javax.swing.JButton registrarRevistaJButton;
    private javax.swing.JLabel registroRevistaJLabel;
    private javax.swing.JPanel registroRevistaJPanel;
    private javax.swing.JLabel tituloRevistaJLabel;
    private javax.swing.JTextField tituloRevistaJTextfield;
    // End of variables declaration//GEN-END:variables

   
}
