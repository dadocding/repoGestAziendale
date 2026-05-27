package Main;

import ClassiGenerali.Dipendente;
import ClassiGenerali.GestionaleAziendale;

public class Main {
    public static void main(String[] args) {
        GestionaleAziendale g = new GestionaleAziendale();

        try{
            Dipendente d = new Dipendente("Davide", "09876431289873", Dipendente.Stabilimento.A, Dipendente.Compito.CED);
            g.addDipendente(d);
        }catch(Exception e){
            System.out.println(e);
        }

        try{
            Dipendente d1 = new Dipendente("Lorenzo", "123456789", Dipendente.Stabilimento.B, Dipendente.Compito.MULETTISTA);
            g.addDipendente(d1);
        }catch(Exception e){
            System.out.println(e);
        }

        System.out.println(g);

        //System.out.println(d);
    }
}
