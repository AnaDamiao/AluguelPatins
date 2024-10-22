package entidades;

/**
 *
 * @author Ana Damião
 */
public class Patins {

    private int numeroPatins;
    private float valor;


    public Patins(int numeroPatins, float valor) {
        this.numeroPatins = numeroPatins;
        this.valor = valor;
    }
    public float getValor() {
        return valor;
    }

    public float isValor() {
        return valor;
    }
    
    public int getNumeroPatins() {
        return numeroPatins;
    }

    public void setNumeroPatins(int numeroPatins) {
        this.numeroPatins = numeroPatins;
    }
}
