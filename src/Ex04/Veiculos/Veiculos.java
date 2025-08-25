package Ex04.Veiculos;

public interface Veiculos {
    public void acelerar();
    public void frear();

    default void ligarMotor() {
        System.out.println("Motor ligado!");

    }

}
