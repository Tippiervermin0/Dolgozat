package modell;

import java.util.ArrayList;


public class Galeria {
    
    public ArrayList<KiallitasiTargy> targyak;

    public Galeria() {
        targyak = new ArrayList();
        
    }
    
    
    
    
    public void felvesz(KiallitasiTargy tr) {
        targyak.add(tr);
    }

    public ArrayList<KiallitasiTargy> getTargyak() {
        return targyak;
    }

    @Override
    public String toString() {
        return "Galeria{" + "targyak=" + targyak;
    }

    

   
}
