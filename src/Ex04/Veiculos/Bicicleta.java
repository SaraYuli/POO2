package Ex04.Veiculos;

public class Bicicleta implements Veiculos{

    private int velocidadeMax;
    private int velocidadeAtul;
    private String modelo;
    private String cor;

    public Bicicleta(int velocidadeMax, int velocidadeAtul, String modelo, String cor) {
        this.velocidadeMax = velocidadeMax;
        this.velocidadeAtul = velocidadeAtul;
        this.modelo = modelo;
        this.cor = cor;
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
        System.out.println("Bicicleta não tem motor");

    }


}