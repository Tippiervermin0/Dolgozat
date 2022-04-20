package modell;

import java.time.LocalDate;


public class Festmeny extends KiallitasiTargy{
    
    public String eleresiUt;

    public Festmeny(String keszito, String cim) {
        super(keszito, cim);
        
    }

    public Festmeny(String keszito, String cim, LocalDate myObj,String eleresiUt) {
        super(keszito, cim, myObj);
        this.eleresiUt = eleresiUt;
    }
    
    public void Megjelenit(){
        
    }

    @Override
    public String toString() {
        return "Festmeny{" + "eleresiUt=" + eleresiUt;
    }
    
    

    
    
}
