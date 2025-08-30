package Ex04.Veiculos;

public class Main {

    public static void main (String [] args){

    Carro carro = new Carro(190,0,"Fusca","Roxo",true);
    Moto moto = new Moto(250,0,"Custom","Preto",true);
    Bicicleta bicicleta = new Bicicleta(25,0,"Bicicleta BMX","vermelha");


        System.out.println(bicicleta);
        System.out.println(carro);
        System.out.println(moto);


       moto.ligarMotor();
       moto.acelerar();
       moto.acelerar();
       moto.frear();
       moto.frear();
       moto.frear();








    }
}
