package EX08.GenericoParaTroca;

public class Main {
    public static void main(String[] args) {

        Integer[] trocaNumero = {1, 2, 3, 4};
        String[] trocaPalavra = {"familia", "Amor", "Deus"};


        System.out.println("Antes da troca:");
        for (int i = 0; i < trocaNumero.length; i++) {
            System.out.println(trocaNumero[i] + " ");
        }
        System.out.println();

        Troca.trocar(trocaNumero, 0,2);

        System.out.println("Depois da troca: ");
        for (int i = 0; i< trocaNumero.length; i++){
            System.out.println(trocaNumero[i] + " ");
        }

        System.out.println();


        System.out.println("Antes da troca:");
        for (int i = 0; i < trocaPalavra.length; i ++){
            System.out.println(trocaPalavra[i] + " ");
        }
        System.out.println();

        Troca.trocar(trocaPalavra, 0 , 2);

        System.out.println("Depois da troca");
        for (int i = 0; i <trocaPalavra.length; i ++){
            System.out.println(trocaPalavra[i] + " ");
        }

        System.out.println();
    }

}