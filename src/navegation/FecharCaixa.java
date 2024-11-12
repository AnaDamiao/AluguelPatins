package navegation;

import PatinsController.AluguelController;
import entidades.Aluguel;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ana Damião
 */
public class FecharCaixa extends javax.swing.JFrame {

    private float totalDinheiro;
    private float totalCartao;
    private float totalPix;
    private float totalCaixa;
    private int quantidadeAlugueis;
    
    public FecharCaixa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        laTotalDinheiro = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        laTotalRecebido = new javax.swing.JLabel();
        btnFecharCaixa = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        laTotalCartao = new javax.swing.JLabel();
        laTotalPix = new javax.swing.JLabel();
        btnFecharCaixa1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        laTotalAlugueis = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Forma de pagamento em Dinheiro:");

        laTotalDinheiro.setText("R$");

        jLabel3.setText("Total:");

        laTotalRecebido.setText("R$:");

        btnFecharCaixa.setText("Consultar Fechamento do caixa");
        btnFecharCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharCaixaActionPerformed(evt);
            }
        });

        jLabel5.setText("Forma de pagamento em Cartão:");

        jLabel6.setText("Forma de pagamento em PIX:");

        laTotalCartao.setText("R$");

        laTotalPix.setText("R$");

        btnFecharCaixa1.setText("Fechar Caixa");
        btnFecharCaixa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharCaixa1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Total de Alugueis:");

        laTotalAlugueis.setText("R$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnFecharCaixa1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFecharCaixa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(laTotalRecebido))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(laTotalAlugueis))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(laTotalCartao))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(laTotalDinheiro)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(46, 46, 46)
                                .addComponent(laTotalPix)))))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(laTotalDinheiro))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(laTotalCartao))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(laTotalPix))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(laTotalAlugueis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(laTotalRecebido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFecharCaixa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFecharCaixa1)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCaixaActionPerformed
        
        try {
            totalDinheiro = 0;
            totalCartao = 0;
            totalPix = 0;

            for (Aluguel aluguel : AluguelController.getAlugueis()) {
                if (aluguel.isFinalizado()) {
                    quantidadeAlugueis++;
                    switch (aluguel.getFormaPagamento()) {
                        case "Dinheiro" -> totalDinheiro += aluguel.getValor();
                        case "Cartão" -> totalCartao += aluguel.getValor();
                        case "PIX" -> totalPix += aluguel.getValor();
                    }
                }
            }
            
            totalCaixa = totalDinheiro + totalCartao + totalPix;

            laTotalRecebido.setText(String.format("R$ %.2f", totalCaixa));
            laTotalDinheiro.setText(String.format("R$ %.2f", totalDinheiro));
            laTotalCartao.setText(String.format("R$ %.2f", totalCartao));
            laTotalPix.setText(String.format("R$ %.2f", totalPix));
            laTotalAlugueis.setText(String.format("%d", quantidadeAlugueis));


        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Erro ao fechar caixa: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnFecharCaixaActionPerformed

    private void btnFecharCaixa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCaixa1ActionPerformed
        float totalEsperado = totalDinheiro + totalCartao + totalPix;

        if (totalCaixa == totalEsperado) {
            JOptionPane.showMessageDialog(this, "Fechamento do caixa realizado com sucesso!", "Fechar Caixa", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "O total do caixa não coincide com a soma das formas de pagamento. Verifique os valores.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnFecharCaixa1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FecharCaixa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFecharCaixa;
    private javax.swing.JButton btnFecharCaixa1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel laTotalAlugueis;
    private javax.swing.JLabel laTotalCartao;
    private javax.swing.JLabel laTotalDinheiro;
    private javax.swing.JLabel laTotalPix;
    private javax.swing.JLabel laTotalRecebido;
    // End of variables declaration//GEN-END:variables
}
