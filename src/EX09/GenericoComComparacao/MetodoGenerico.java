package EX09.GenericoComComparacao;

public class MetodoGenerico {
    public static <T extends Comparable <T>> T maior (T a, T b){
        return a.compareTo(b) >= 0 ? a:b;

    }
}
