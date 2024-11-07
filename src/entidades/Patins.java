package entidades;

/**
 *
 * @author Ana Damião
 */
public class Patins {

    private int numeroPatins;
    private float valor;
    private boolean alugado;


    public Patins(int numeroPatins, float valor, boolean alugado) {
        this.numeroPatins = numeroPatins;
        this.valor = valor;
        this.alugado = alugado;
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
    
        public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }
    
}
