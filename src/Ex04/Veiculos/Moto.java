package Ex04.Veiculos;

public class Moto implements Veiculos {

    private int velocidadeMax;
    private int velocidadeAtual;
    private String modelo;
    private String cor;
    private boolean motorLigado;

    public Moto(int velocidadeMax, int velocidadeAtual, String modelo, String cor, boolean motorLigado) {
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
        if (!motorLigado) {
            System.out.println("Não é possível acelerar, a moto está desligada!");
            return;
        }
            if (velocidadeAtual < velocidadeMax) {
                velocidadeAtual += 15;
                System.out.println("A moto está acelerando. a velocidade atual: " + velocidadeAtual + "km/h");
            } else {
                System.out.println("A moto já está na velocidade máxima de " + velocidadeMax + "km/h");
            }
        }

    @Override
    public void frear() {
        if (velocidadeAtual > 0){
            velocidadeAtual -= 15;
            System.out.println("A moto freou. Velocidade atual: " + velocidadeAtual + "km/h");
        } else {
            System.out.println("A moto já está parada!");
        }
    }

    @Override
    public void ligarMotor() {
        if (motorLigado) {
            System.out.println("O motor da moto está ligado!");
        } else {
            System.out.println("O motor da moto está desligado!");

        }
    }
}
