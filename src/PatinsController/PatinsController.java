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
        
        listPatins.add(new Patins(10, 20));
        listPatins.add(new Patins(23, 25));
        listPatins.add(new Patins(32, 30));
        listPatins.add(new Patins(35, 35));
        listPatins.add(new Patins(38, 40));
        listPatins.add(new Patins(40, 45));    
    }
    
    public Patins selecionarPatinsPorTamanho(int numeroPatins){
        for(Patins patins : listPatins){
            if(patins.getNumeroPatins() == numeroPatins)
                return patins;
        }         
        
        return null;
    }
 
}
    
