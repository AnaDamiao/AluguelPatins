package Home;

import PatinsController.PatinsController;
import entidades.Patins;
import javax.swing.JOptionPane;
import navegation.AceitaPatins;

/**
 *
 * @author Ana Damião
 */
public class Home extends javax.swing.JFrame {
    public PatinsController patinsController;

    public Home() {
        initComponents();
        patinsController = new PatinsController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        numeroPatins = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("N° do calçado:");

        numeroPatins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroPatinsActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnConsultar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numeroPatins, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(numeroPatins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnConsultar)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numeroPatinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroPatinsActionPerformed
        
    }//GEN-LAST:event_numeroPatinsActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
 
        int numeroPatins = Integer.parseInt(this.numeroPatins.getText());

        Patins patins = patinsController.selecionarPatinsPorTamanho(numeroPatins);

        boolean patinsAlugado = patins.isAlugado();
        if(patins != null){
            if(patinsAlugado == true){
                 JOptionPane.showMessageDialog(this, "Patins do tamanho: " + numeroPatins + " Está alugado.", "Erro", JOptionPane.ERROR_MESSAGE); 
                 return;
            }

            float valorAluguel = patins.getValor();

            AceitaPatins aceitaPatins = new AceitaPatins(valorAluguel, numeroPatins);
            aceitaPatins.setVisible(true);
            this.dispose(); 
        }else{
            JOptionPane.showMessageDialog(this, "Patins do tamanho: " + numeroPatins + " não disponível.", "Erro", JOptionPane.ERROR_MESSAGE);    
        }

    }//GEN-LAST:event_btnConsultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField numeroPatins;
    // End of variables declaration//GEN-END:variables
}
