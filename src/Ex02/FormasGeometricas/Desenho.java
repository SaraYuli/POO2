package Ex02.FormasGeometricas;

import java.util.ArrayList;
import java.util.List;



public class Desenho {

    private List<Forma> formas;

    public Desenho() {
        this.formas = new ArrayList<>();
    }

    public void adicionarForma(Forma forma){
        formas.add(forma);
    }

    public double calcularAreaTotal(){
         double areaTotal = 0;
        for (Forma forma : formas){
        areaTotal += forma.calcularArea();
     }

    return areaTotal;
}


}