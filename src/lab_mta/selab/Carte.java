package lab_mta.selab;

public class Carte {
    private String titlu;
    private String autor;
    private int anPublicatie;
    private int nrPagini;

    public Carte(String titlu, String autor, int anPublicatie, int nrPagini) {
        this.titlu = titlu;
        this.autor = autor;
        this.anPublicatie = anPublicatie;
        this.nrPagini = nrPagini;
    }

    @Override
    public String toString() {
        return this.titlu+" "+this.autor+ " " + "  publicată în anul "+ this.anPublicatie;
    }
}