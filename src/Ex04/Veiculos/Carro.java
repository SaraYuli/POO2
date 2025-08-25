package Ex04.Veiculos;

public class Carro implements Veiculos {

       private int velocidadeMax;
       private int velocidadeAtual;
       private String modelo;
       private String cor;
       private boolean motorLigado;

    public Carro(int velocidadeMax, int velocidadeAtual, String modelo, String cor, boolean carroLigado) {
        this.velocidadeMax = velocidadeMax;
        this.velocidadeAtual = velocidadeAtual;
        this.modelo = modelo;
        this.cor = cor;
        this.motorLigado = carroLigado;
    }

    @Override
    public void acelerar(){
        System.out.println("O carro está acelerando");
    }

    @Override
    public void frear(){
        System.out.println("O carro está Freando");
    }

    @Override
    public void ligarMotor(){
        if (motorLigado){
            System.out.println("Motor ligado!");
        } else {
            System.out.println("Motor desligado");
        }
    }


}
