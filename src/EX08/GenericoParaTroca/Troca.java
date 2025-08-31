package EX08.GenericoParaTroca;

public class Troca {
    public static <T> void trocar (T[] array, int i, int j){

        T temp = array [i];
        array[i] = array [j];
        array[j] = temp;

    }
}
