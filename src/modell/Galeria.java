package modell;

import java.util.ArrayList;
import java.util.Collections;


public class Galeria implements Cloneable{
    
    public ArrayList<KiallitasiTargy> targyak;

    public Galeria() {
        targyak = new ArrayList();
        
    }
    
    public ArrayList<KiallitasiTargy> cimRendez() {
        Collections.sort(targyak, new CimComparator());
        return (ArrayList<KiallitasiTargy>) targyak.clone();
    }
     public ArrayList<KiallitasiTargy> keszitoRendez() {
        Collections.sort(targyak, new KeszitoComparator());
        return (ArrayList<KiallitasiTargy>) targyak.clone();
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
