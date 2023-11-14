package pkg1.pkg1a.aed.vistas;

import pkg1.pkg1a.aed.modelos.BoletinPublicado;
import pkg1.pkg1a.aed.modelos.RevistaPublicada;
import java.util.ArrayList;

public class BoletinesView extends javax.swing.JFrame {

    
    ArrayList<BoletinPublicado> nuevoBoletinPublicados = new ArrayList<>();
    ArrayList<RevistaPublicada> nuevaRevistaPublicadas = new ArrayList<>();
    
    public BoletinesView(ArrayList <BoletinPublicado> array, ArrayList <RevistaPublicada> array2) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.nuevoBoletinPublicados = array;
        this.nuevaRevistaPublicadas = array2;
        
        for (BoletinPublicado boletin : nuevoBoletinPublicados) {
        
            mostrarBoletinesJTextArea.append(boletin.toString());
            mostrarBoletinesJTextArea.append("__________________________\n\n");
            
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mostrarBoletinesJPanel = new javax.swing.JPanel();
        mostarBoletinesJLabel = new javax.swing.JLabel();
        nomstarBoletinesJScrollPanel = new javax.swing.JScrollPane();
        mostrarBoletinesJTextArea = new javax.swing.JTextArea();
        volverDeMostarBoletinesJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(605, 420));

        mostrarBoletinesJPanel.setMaximumSize(new java.awt.Dimension(605, 420));
        mostrarBoletinesJPanel.setMinimumSize(new java.awt.Dimension(605, 420));
        mostrarBoletinesJPanel.setPreferredSize(new java.awt.Dimension(605, 420));

        mostarBoletinesJLabel.setBackground(new java.awt.Color(60, 0, 255));
        mostarBoletinesJLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        mostarBoletinesJLabel.setForeground(new java.awt.Color(187, 0, 255));
        mostarBoletinesJLabel.setText("BOLETINES");

        nomstarBoletinesJScrollPanel.setMaximumSize(null);
        nomstarBoletinesJScrollPanel.setMinimumSize(null);
        nomstarBoletinesJScrollPanel.setName(""); // NOI18N

        mostrarBoletinesJTextArea.setEditable(false);
        mostrarBoletinesJTextArea.setColumns(20);
        mostrarBoletinesJTextArea.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        mostrarBoletinesJTextArea.setRows(5);
        nomstarBoletinesJScrollPanel.setViewportView(mostrarBoletinesJTextArea);

        volverDeMostarBoletinesJButton.setBackground(new java.awt.Color(78, 0, 255));
        volverDeMostarBoletinesJButton.setText("VOLVER");
        volverDeMostarBoletinesJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverDeMostarBoletinesJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mostrarBoletinesJPanelLayout = new javax.swing.GroupLayout(mostrarBoletinesJPanel);
        mostrarBoletinesJPanel.setLayout(mostrarBoletinesJPanelLayout);
        mostrarBoletinesJPanelLayout.setHorizontalGroup(
            mostrarBoletinesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mostrarBoletinesJPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(mostrarBoletinesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(volverDeMostarBoletinesJButton)
                    .addGroup(mostrarBoletinesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nomstarBoletinesJScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mostarBoletinesJLabel)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        mostrarBoletinesJPanelLayout.setVerticalGroup(
            mostrarBoletinesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mostrarBoletinesJPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(mostarBoletinesJLabel)
                .addGap(18, 18, 18)
                .addComponent(nomstarBoletinesJScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(volverDeMostarBoletinesJButton)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mostrarBoletinesJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mostrarBoletinesJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverDeMostarBoletinesJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverDeMostarBoletinesJButtonActionPerformed
        
        this.dispose();
        MainView nuevaPantallaPrincipal = new MainView(nuevaRevistaPublicadas,nuevoBoletinPublicados);
        nuevaPantallaPrincipal.setVisible(true);
    }//GEN-LAST:event_volverDeMostarBoletinesJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel mostarBoletinesJLabel;
    private javax.swing.JPanel mostrarBoletinesJPanel;
    private javax.swing.JTextArea mostrarBoletinesJTextArea;
    private javax.swing.JScrollPane nomstarBoletinesJScrollPanel;
    private javax.swing.JButton volverDeMostarBoletinesJButton;
    // End of variables declaration//GEN-END:variables
}
