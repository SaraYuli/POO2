package Ex04.Veiculos;

public class Carro implements Veiculos {

       private int velocidadeMax;
       private int velocidadeAtual;
       private String modelo;
       private String cor;
       private boolean motorLigado;

    public Carro(int velocidadeMax, int velocidadeAtual, String modelo, String cor, boolean motorLigado) {
        this.velocidadeMax = velocidadeMax;
        this.velocidadeAtual = velocidadeAtual;
        this.modelo = modelo;
        this.cor = cor;
        this.motorLigado = motorLigado;
    }

    @Override
    public String toString() {
        return  "Modelo: " + modelo + " | Cor: " + cor + " | Velocidade Maxima: " + velocidadeMax + "Km/h";
    }

    @Override
    public void acelerar() {
        if(!motorLigado){
            System.out.println("Não é possivel acelerar , o carro está desligado!");
            return;
        }
            if (velocidadeAtual < velocidadeMax) {
                velocidadeAtual += 10;
                System.out.println("O carro está acelerando. Velocidade atual: " + velocidadeAtual + "km/h");
            } else {
                System.out.println("O carro já está na velocidade máxima de " + velocidadeMax + "km/h");
            }
    }

    @Override
    public void frear(){
        if(velocidadeAtual > 0) {
            velocidadeAtual -= 10;
            System.out.println("O carro freou. Velocidade atual: " + velocidadeAtual + "km/h");
        } else {
            System.out.println("O carro já está parada!");
        }
    }

    @Override
    public void ligarMotor(){
        if (motorLigado){
            System.out.println("O Motor do carro está ligado!");
        } else {
            System.out.println("O motor do carro está desligado");
        }
    }


}
