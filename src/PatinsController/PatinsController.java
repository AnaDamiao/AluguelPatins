package PatinsController;

import entidades.Patins;
import java.util.ArrayList;

/**
 *
 * @author ana.damiao
 */
public class PatinsController {
    private ArrayList<Patins> listPatins;
    
    public PatinsController(){
        listPatins = new ArrayList<Patins>();
        
        listPatins.add(new Patins(10));
        listPatins.add(new Patins(23));
        listPatins.add(new Patins(32));
        listPatins.add(new Patins(35));
        listPatins.add(new Patins(38));
        listPatins.add(new Patins(40));    
    }
    
    public Patins selecionarPatinsPorTamanho(int numeroPatins){
        for(Patins patins : listPatins){
            if(patins.getNumeroPatins() == numeroPatins)
                return patins;
        }         
        
        return null;
    }
}
