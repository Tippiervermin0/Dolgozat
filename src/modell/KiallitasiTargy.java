package modell;

import java.io.Serializable;
import java.time.LocalDate;


public abstract class KiallitasiTargy implements Comparable<KiallitasiTargy>{
    
    public LocalDate myObj;
    public String keszito, cim;
    
    public KiallitasiTargy(String keszito, String cim) {
        this.keszito = keszito;
        this.cim = cim;
        this.myObj = LocalDate.now();
    }

    public KiallitasiTargy(String keszito, String cim, LocalDate myObj) {
        this.keszito = keszito;
        this.cim = cim;
        this.myObj = myObj;
    }
    
     public static KeszitoComparator RendezKeszito() {
        return new KeszitoComparator();
    }

    public static CimComparator RendezCim() {
        return new CimComparator();
    }

    public String getKeszito() {
        return keszito;
    }

    public String getCim() {
        return cim;
    }
    
    

    @Override
    public String toString() {
        return "KiallitasiTargy{" + "myObj=" + myObj + ", keszito=" + keszito + ", cim=" + cim + '}';
    }
    
    @Override
    public int compareTo(KiallitasiTargy o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
    
    
}
