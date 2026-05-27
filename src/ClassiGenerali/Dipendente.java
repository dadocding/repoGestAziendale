package ClassiGenerali;

public class Dipendente {
    private String nome;
    private String badge_code;

    public enum Compito{
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

    public enum Stabilimento{
        A,
        B,
        C,
        D,
        E,
        F,
        G,
        H
    }

    private Stabilimento stabilimento;
    private Compito compito;

    public Dipendente(String nome, String badge_code, Stabilimento stabilimento, Compito compito) throws BadgeNonValidoException {
        this.nome = nome;
        if(badge_code.length() != 9){
            throw new BadgeNonValidoException("Badge code invalido");
        }

        this.badge_code = badge_code;
        this.stabilimento = stabilimento;
        this.compito = compito;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setBadgEcode(String badge_code){
        this.badge_code = badge_code;
    }
    public void setStabilimento(Stabilimento stabilimento){
        this.stabilimento = stabilimento;
    }
    public void setCompito(Compito compito){
        this.compito = compito;
    }

    public String getNome(){
        return this.nome;
    }
    public String getBadgeCode(){
        return this.badge_code;
    }
    public Stabilimento getStabilimento(){
        return this.stabilimento;
    }
    public Compito getCompito(){
        return this.compito;
    }

    public String toString(){
        return "Dipendente S2 Spa " + "\n" + "nome : "  + this.nome + "\n" + "badge code: " + this.badge_code + "\n" + "stabilimento: " + this.stabilimento + "\n" + "compito: " + this.compito;
    }
}
