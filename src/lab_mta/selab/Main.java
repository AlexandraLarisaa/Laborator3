package lab_mta.selab;

public class Main {
    public static void main(String[] args)
    {

        for ( int i =0; i< args.length; i++)
            System.out.println(args[i]);
        Carte carte= new Carte("1984" , "George", 1964, 243);
        System.out.println(carte.toString());

        Carte carte1=new Carte(  "Harry Potter and the Deathly Hallows", "J.K.Rowlings", 2011,600);
        System.out.println(carte1.toString());
        Biblioteca biblioteca=new Biblioteca();
        biblioteca.add(carte1);
        biblioteca.add(new Carte("Amintiri din copilarie","Ion Creanga",1932,200));
        biblioteca.add(new Carte("Game of Thrones","George R.R.Martins",2004,700));

        System.out.println(biblioteca.toString());
    }
}