package EX09.GenericoComComparacao;

public class Main {

    public static void main (String [] args ){

        Integer n1 = 4;
        Integer n2 = 31;
        System.out.println("Maior (Integer): " + MetodoGenerico.maior(n1 , n2));

        String s1 = "Kiwi";
        String s2 = "Manga";
        System.out.println("Maior (String): " + MetodoGenerico.maior(s1, s2));


    }
}
