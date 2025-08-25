package Ex01.Animais;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Cachorro cachorro1 = new Cachorro();
        Gato gato1 = new Gato();


        List<Animais> animal = new ArrayList<>();

        animal.add(cachorro1);
        animal.add(gato1);

        for (Animais a: animal){
            a.emitirSom();

        }




    }

}
