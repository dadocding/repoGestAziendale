package ClassiGenerali;

public class Dipendente {
    private String nome;
    private String badge_code;

    private char stabilimento; //divisione stabilimento
    private String compito; //divisione singolo compito nello stabilimento

    private enum compito{
        ACCETAZIONE,
        MULETTISTA,
        OPERAIO,
        CENTRALINISTA,
        CED,
        UFF_PREVENTIVI,
        UFF_ACQUISTI,
        UFF_HR,
        UFF_MARKETING
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setBadgEcode(String badge_code){
        this.badge_code = badge_code;
    }
    public void setStabilimento(char stabilimento){
        this.stabilimento = stabilimento;
    }
    public void setCompito(String compito){
        this.compito = compito;
    }

    public String getNome(){
        return this.nome;
    }
    public String getBadgeCode(){
        return this.badge_code;
    }
    public char getStabilimento(){
        return this.stabilimento;
    }
    public String getCompito(){
        return this.compito;
    }

    public String toString(){
        return "Dipendente S2 Spa " + "\n" + "nome : "  + this.nome + "\n" + "badge code: " + this.badge_code + "\n" + "stabilimento: " + this.stabilimento + "\n" + "compito: " + this.compito;
    }
}
