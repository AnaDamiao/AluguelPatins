package PatinsController;

import entidades.Patins;
import java.util.ArrayList;

/**
 *
 * @author Ana Damião
 */
public class PatinsController {
    private static ArrayList<Patins> patinsList = new ArrayList<>();
    
    
    public PatinsController(){        
        if (patinsList.isEmpty()) {
            patinsList.add(new Patins(10, 20));
            patinsList.add(new Patins(23, 25));
            patinsList.add(new Patins(32, 30));
            patinsList.add(new Patins(35, 35));
            patinsList.add(new Patins(38, 40));
            patinsList.add(new Patins(40, 45));    
        }    
    }
    
    public static Patins selecionarPatinsPorTamanho(int numeroPatins) {
        for(Patins patins : patinsList){
            if (patins.getNumeroPatins() == numeroPatins) {
                return patins;
            }         
        }
        return null;
    }
 
}
    
