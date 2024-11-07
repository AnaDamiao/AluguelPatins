package PatinsController;

import entidades.Patins;
import java.util.ArrayList;

/**
 *
 * @author Ana Damião
 */
public class PatinsController {
    private ArrayList<Patins> listPatins;
    
    public PatinsController(){
        listPatins = new ArrayList<Patins>();
        
        listPatins.add(new Patins(10, 20, false));
        listPatins.add(new Patins(23, 20, false));
        listPatins.add(new Patins(32, 20, false));
        listPatins.add(new Patins(35, 20, false));
        listPatins.add(new Patins(38, 20, false));
        listPatins.add(new Patins(40, 20, false));    
    }
    
    public Patins selecionarPatinsPorTamanho(int numeroPatins){
        for(Patins patins : listPatins){
            if(patins.getNumeroPatins() == numeroPatins)
                return patins;
        }         
        
        return null;
    }
    
    public void atualizarStatusAlugado(int numeroPatins, boolean alugado) {
    for (Patins patins : listPatins) {
        if (patins.getNumeroPatins() == numeroPatins) {
            patins.setAlugado(alugado);
            break;
        }
    }
}
    
}
