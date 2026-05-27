package ClassiGenerali;

import java.util.ArrayList;

public class GestionaleAziendale {
    ArrayList<Dipendente> lista_dipendenti;

    public GestionaleAziendale() {
        lista_dipendenti = new ArrayList<>();
    }

    public Dipendente cercaDipendente(String badge_code) {
        for(Dipendente dipendente : lista_dipendenti){
           if(dipendente.getBadgeCode().equals(badge_code)){
              return dipendente;
           }
        }
        return null;
    }

    public void addDipendente(Dipendente dipendente) throws DipendentePresenteException {
        if (dipendente == null) {
            throw new IllegalArgumentException("Dipendente nullo");
        }
        if (cercaDipendente(dipendente.getBadgeCode()) == null) {
            lista_dipendenti.add(dipendente);
        } else {
            throw new DipendentePresenteException("Dipendente già presente");
        }
    }

    public void rimuoviDipendente(Dipendente dipendente) throws DipendentePresenteException{
        if(cercaDipendente(dipendente.getBadgeCode()) != null){
            lista_dipendenti.remove(dipendente);
        }else{
            throw new DipendentePresenteException("Dipendente non presente");
        }
    }

    public String toString(){
        String s = "";
        for(Dipendente dipendente : lista_dipendenti){
            s += dipendente.toString() + "\n" + "\n";
        }
        return s;
    }
}
