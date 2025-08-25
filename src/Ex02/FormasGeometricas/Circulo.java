package Ex02.FormasGeometricas;

public class Circulo implements Forma {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea(){
        double area = Math.PI * raio * raio;
        return area;
        }
}
