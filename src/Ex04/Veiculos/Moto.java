package Ex04.Veiculos;

public class Moto implements Veiculos {

    private int velocidadeMax;
    private int velocidadeAtul;
    private String modelo;
    private String cor;
    private boolean motorLigado;

    public Moto(int velocidadeMax, int velocidadeAtul, String modelo, String cor, boolean motoLigada) {
        this.velocidadeMax = velocidadeMax;
        this.velocidadeAtul = velocidadeAtul;
        this.modelo = modelo;
        this.cor = cor;
        this.motorLigado = motoLigada;
    }

    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando");
    }

    @Override
    public void frear() {
        System.out.println("A moto está freando");
    }

    @Override
    public void ligarMotor() {
        if (motorLigado) {
            System.out.println("Motor está ligado!");
        } else {
            System.out.println("Motor está desligado!");

        }
    }
}
