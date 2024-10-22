/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatinsController;

import entidades.Aluguel;
import java.util.ArrayList;

/**
 *
 * @author ana.damiao
 */
public class AluguelController {
    private static ArrayList<Aluguel> alugueis = new ArrayList<>();

    public static void registrarAluguel(String cpf, int numeroPatins, String horaInicio) {
        Aluguel aluguel = new Aluguel(cpf, numeroPatins, horaInicio);
        alugueis.add(aluguel);
    }

    public static ArrayList<Aluguel> getAlugueis() {
        return alugueis;
    }
}
