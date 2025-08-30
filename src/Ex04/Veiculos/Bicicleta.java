package Ex04.Veiculos;

public class Bicicleta implements Veiculos{

    private int velocidadeMax;
    private int velocidadeAtul;
    private String modelo;
    private String cor;

    public Bicicleta(int velocidadeMax, int velocidadeAtual, String modelo, String cor) {
        this.velocidadeMax = velocidadeMax;
        this.velocidadeAtul = velocidadeAtual;
        this.modelo = modelo;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return  "Modelo: " + modelo + " | Cor; " + cor + " | Velocidade Maxima: " + velocidadeMax + "Km/h";
    }

    @Override
    public void acelerar(){
        System.out.println("A bicicleta está acelerando!");
    }

    @Override
    public void frear(){
        System.out.println("A bicicleta está freando!");
    }

    @Override
    public void ligarMotor(){
        System.out.println("Bicicleta não tem motor!");

    }


}