
package main;

import java.util.ArrayList;
import modell.Festmeny;
import modell.Galeria;
import modell.KiallitasiTargy;


public class Program {

   
    public static void main(String[] args) {
       
        Galeria galeria = new Galeria();
        
        
      
        KiallitasiTargy t1 = new Festmeny("Peti", "cim1");
        KiallitasiTargy t2 = new Festmeny("Peti", "cim2");
        KiallitasiTargy t3 = new Festmeny("Peti", "cim3");
        KiallitasiTargy t4 = new Festmeny("Peti", "cim4");
        KiallitasiTargy t5 = new Festmeny("Peti", "cim5");
        
        galeria.felvesz(t1);
        galeria.felvesz(t2);
        galeria.felvesz(t3);
        galeria.felvesz(t4);
        galeria.felvesz(t5);
        
        kiir(galeria);
        
        
        
       
        
      
    }
    public void kiir(Galeria galeria){
        for (KiallitasiTargy targy : galeria) {
             System.out.print(targy);
        }
    }
}
