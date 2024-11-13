package Home;

import PatinsController.AluguelController;
import PatinsController.PatinsController;
import entidades.Patins;
import javax.swing.JOptionPane;
import navegation.AceitaPatins;
import navegation.Alugados;
import navegation.FecharCaixa;

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
        btnAlugar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnConsultarAlugados = new javax.swing.JButton();
        btnFinalizarAluguel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnFecharCaixa = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("N° do calçado:");

        numeroPatins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroPatinsActionPerformed(evt);
            }
        });

        btnAlugar.setText("Alugar");
        btnAlugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlugarActionPerformed(evt);
            }
        });

        jLabel2.setText("Consultar patins alugados:");

        btnConsultarAlugados.setText("Consultar");
        btnConsultarAlugados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarAlugadosActionPerformed(evt);
            }
        });

        btnFinalizarAluguel.setText("Finalizar Aluguel");
        btnFinalizarAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarAluguelActionPerformed(evt);
            }
        });

        jLabel3.setText("Aluguel de patins");

        jLabel4.setText("Abaixo, alugue ou finalize um aluguel em andamento.");

        jLabel5.setText("Você pode também, consultar quais patins tem alugado");

        jLabel6.setText("Fechar Caixa do dia:");

        btnFecharCaixa.setText("Fechar Caixa");
        btnFecharCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharCaixaActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnFinalizarAluguel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAlugar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(numeroPatins, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnSair)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnFecharCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                        .addComponent(btnConsultarAlugados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(numeroPatins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlugar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFinalizarAluguel)
                .addGap(37, 37, 37)
                .addComponent(jLabel5)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultarAlugados)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btnFecharCaixa))
                .addGap(18, 18, 18)
                .addComponent(btnSair)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numeroPatinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroPatinsActionPerformed
        
    }//GEN-LAST:event_numeroPatinsActionPerformed

    private void btnAlugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlugarActionPerformed
        try {
            int patinsNumero = Integer.parseInt(this.numeroPatins.getText());
            Patins patins = patinsController.selecionarPatinsPorTamanho(patinsNumero);

            if (patins != null && patins.isDisponivel()) {
                float valorAluguel = patins.getValor();
                AceitaPatins aceitaPatins = new AceitaPatins(valorAluguel, patinsNumero);
                aceitaPatins.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Patins do tamanho: " + patinsNumero + " não está disponível.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, insira um número de calçado válido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAlugarActionPerformed

    private void btnConsultarAlugadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarAlugadosActionPerformed
        Alugados alugados = new Alugados();
        alugados.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnConsultarAlugadosActionPerformed

    private void btnFinalizarAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarAluguelActionPerformed
        try {
            int patinsNumero = Integer.parseInt(this.numeroPatins.getText());

            String valorDanoStr = JOptionPane.showInputDialog(this, "Informe o valor do dano (se houver):", "0");
            if (valorDanoStr == null) {
                JOptionPane.showMessageDialog(this, "Operação cancelada.");
                return;
            }
            float valorDano = Float.parseFloat(valorDanoStr);

            String[] opcoesPagamento = {"Cartão", "Dinheiro", "Pix"};
            String formaPagamento = (String) JOptionPane.showInputDialog(this, "Selecione a forma de pagamento:", "Forma de pagamento", JOptionPane.QUESTION_MESSAGE, null, opcoesPagamento, opcoesPagamento[0]);
            if (formaPagamento == null) {
                JOptionPane.showMessageDialog(this, "Operação cancelada.");
                return;
            }

            AluguelController.finalizarAluguel(patinsNumero, valorDano, formaPagamento);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, insira um número de patins válido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnFinalizarAluguelActionPerformed

    private void btnFecharCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCaixaActionPerformed
       FecharCaixa fecharCaixa = new FecharCaixa();
       fecharCaixa.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnFecharCaixaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlugar;
    private javax.swing.JButton btnConsultarAlugados;
    private javax.swing.JButton btnFecharCaixa;
    private javax.swing.JButton btnFinalizarAluguel;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField numeroPatins;
    // End of variables declaration//GEN-END:variables
}
