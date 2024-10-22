package entidades;

/**
 *
 * @author Ana Damião
 */

public class Aluguel {
    private String cpf;
    private int numeroPatins;
    private String horaInicio;

    public Aluguel(String cpf, int numeroPatins, String horaInicio) {
        this.cpf = cpf;
        this.numeroPatins = numeroPatins;
        this.horaInicio = horaInicio;
    }

    public String getCpf() {
        return cpf;
    }

    public int getNumeroPatins() {
        return numeroPatins;
    }

    public String getHoraInicio() {
        return horaInicio;
    }
}