package navegation;

import Home.Home;
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
    private float totalDanos;
    
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
        btnConsultarFechamento = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        laTotalCartao = new javax.swing.JLabel();
        laTotalPix = new javax.swing.JLabel();
        btnFecharCaixa = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        laTotalAlugueis = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        laTotalDanos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Forma de pagamento em Dinheiro:");

        laTotalDinheiro.setText("R$");

        jLabel3.setText("Total:");

        laTotalRecebido.setText("R$:");

        btnConsultarFechamento.setText("Consultar Fechamento do caixa");
        btnConsultarFechamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarFechamentoActionPerformed(evt);
            }
        });

        jLabel5.setText("Forma de pagamento em Cartão:");

        jLabel6.setText("Forma de pagamento em PIX:");

        laTotalCartao.setText("R$");

        laTotalPix.setText("R$");

        btnFecharCaixa.setText("Fechar Caixa");
        btnFecharCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharCaixaActionPerformed(evt);
            }
        });

        jLabel9.setText("Total de Alugueis:");

        laTotalAlugueis.setText("R$");

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel10.setText("Total de Danos:");

        laTotalDanos.setText("R$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(laTotalDanos))
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
                                .addComponent(laTotalPix))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnVoltar)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnFecharCaixa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnConsultarFechamento, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(laTotalRecebido)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(laTotalDanos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(laTotalRecebido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultarFechamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFecharCaixa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVoltar)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarFechamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarFechamentoActionPerformed
        
        try {
            totalDinheiro = 0;
            totalCartao = 0;
            totalPix = 0;
            totalDanos = 0;

            for (Aluguel aluguel : AluguelController.getAlugueis()) {
                if (aluguel.isFinalizado()) {
                    quantidadeAlugueis++;
                    switch (aluguel.getFormaPagamento()) {
                        case "Dinheiro" -> totalDinheiro += aluguel.getValor();
                        case "Cartão" -> totalCartao += aluguel.getValor();
                        case "PIX" -> totalPix += aluguel.getValor();
                    }
                    totalDanos += aluguel.getValorDano();
                }
            }
            
            totalCaixa = totalDinheiro + totalCartao + totalPix + totalDanos;

            laTotalRecebido.setText(String.format("R$ %.2f", totalCaixa));
            laTotalDinheiro.setText(String.format("R$ %.2f", totalDinheiro));
            laTotalCartao.setText(String.format("R$ %.2f", totalCartao));
            laTotalPix.setText(String.format("R$ %.2f", totalPix));
            laTotalDanos.setText(String.format("R$ %.2f", totalDanos));
            laTotalAlugueis.setText(String.format("%d", quantidadeAlugueis));


        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Erro ao fechar caixa: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConsultarFechamentoActionPerformed

    private void btnFecharCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCaixaActionPerformed
        float totalEsperado = totalDinheiro + totalCartao + totalPix + totalDanos;

        if (totalCaixa == totalEsperado && totalCaixa > 0) {
            JOptionPane.showMessageDialog(this, "Fechamento do caixa realizado com sucesso!", "Fechar Caixa", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "O total do caixa não coincide com a soma das formas de pagamento, ou está zerado. Verifique os valores. Ou confirme se finalizou todos os alugueis", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnFecharCaixaActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new Home().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FecharCaixa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarFechamento;
    private javax.swing.JButton btnFecharCaixa;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel laTotalAlugueis;
    private javax.swing.JLabel laTotalCartao;
    private javax.swing.JLabel laTotalDanos;
    private javax.swing.JLabel laTotalDinheiro;
    private javax.swing.JLabel laTotalPix;
    private javax.swing.JLabel laTotalRecebido;
    // End of variables declaration//GEN-END:variables
}
