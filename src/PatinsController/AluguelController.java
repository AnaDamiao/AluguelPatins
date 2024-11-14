package PatinsController;

import entidades.Aluguel;
import entidades.Patins;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ana Damião
 */
public class AluguelController {
    private static ArrayList<Aluguel> alugueis = new ArrayList<>();
    
    
    public static ArrayList<Aluguel> getAlugueis() {
        return alugueis;
    }

    public static boolean registrarAluguel(String cpf, int numeroPatins, float valorPatins, String horaInicio) {
        Patins patins = PatinsController.selecionarPatinsPorTamanho(numeroPatins);
        if (patins != null) { 
            patins.setDisponivel(false); 
            Aluguel aluguel = new Aluguel(cpf, patins, horaInicio);
            alugueis.add(aluguel);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Patins número " + numeroPatins + " não encontrado.");
            return false;
        }
    }

    public static void finalizarAluguel(int numeroPatins, float valorDano, String formaPagamento) {
        for (Aluguel aluguel : alugueis) {
            if (aluguel.getNumeroPatins() == numeroPatins && !aluguel.isFinalizado()) {
                aluguel.setValorDano(valorDano);
                aluguel.setFormaPagamento(formaPagamento);
                aluguel.setFinalizado(true);

                Patins patins = aluguel.getPatins();
                patins.setDisponivel(true);

                JOptionPane.showMessageDialog(null, "Aluguel finalizado. Valor a ser pago: " + 
                        (aluguel.getValor() + valorDano) + " - Forma de pagamento: " + formaPagamento);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Aluguel não encontrado ou já finalizado para o patins número: " + numeroPatins);
    }
}
