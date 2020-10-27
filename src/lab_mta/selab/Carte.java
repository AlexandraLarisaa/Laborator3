package lab_mta.selab;

public class Carte {
    private String titlu;
    private String autor;
    private int anAparitie;
    private int nrPagini;

    public Carte(String titlu, String autor, int anAparitie, int nrPagini) {
        this.titlu = titlu;
        this.autor = autor;
        this.anAparitie = anAparitie;
        this.nrPagini = nrPagini;
    }
    public void removeBook(Carte c){
        carti.remove(c);
    }
    @Override
    public String toString() {
        return this.titlu+" "+this.autor+ " " + "  publicată în anul "+ this.anAparitie;
    }
}