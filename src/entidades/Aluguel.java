package entidades;

/**
 *
 * @author Ana Damião
 */

public class Aluguel {
    private String cpf;
    private Patins patins;
    private String horaInicio;
    private String horaFim;
    private float valorDano;
    private String formaPagamento;
    private boolean finalizado;

    public Aluguel(String cpf, Patins patins, String horaInicio) {
        this.cpf = cpf;
        this.patins = patins;
        this.horaInicio = horaInicio;
        this.horaFim = null;
        this.valorDano = 0.0f;
        this.formaPagamento = null;
        this.finalizado = false;
    }

    public String getCpf() {
        return cpf;
    }

    public Patins getPatins() {
        return patins;
    }

    public int getNumeroPatins() {
        return patins.getNumeroPatins();
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public String getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }

    public float getValorDano() {
        return valorDano;
    }

    public void setValorDano(float valorDano) {
        this.valorDano = valorDano;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public float getValor() {
        return patins.getValor();
    }
}