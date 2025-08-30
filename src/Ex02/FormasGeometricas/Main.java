package Ex02.FormasGeometricas;

public class Main {

    public static void main(String[] args){

        // Criando formas
        Quadrado quadrado = new Quadrado(1);
        Circulo circulo = new Circulo(1);


        // Criando um desenho
        Desenho desenho = new Desenho();

        desenho.adicionarForma(quadrado);
        desenho.adicionarForma(circulo);


        double areaTotal = desenho.calcularAreaTotal();
        System.out.println("Área total: " + areaTotal);

    }
}
