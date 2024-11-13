package entidades;

/**
 *
 * @author Ana Damião
 */
public class Patins {

    private int numeroPatins;
    private float valor;
    private boolean disponivel;

    public Patins(int numeroPatins, float valor) {
        this.numeroPatins = numeroPatins;
        this.valor = valor;
        this.disponivel = true;
    }
    public float getValor() {
        return valor;
    }

    public int getNumeroPatins() {
        return numeroPatins;
    }

    public void setNumeroPatins(int numeroPatins) {
        this.numeroPatins = numeroPatins;
    }
    
    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
}
