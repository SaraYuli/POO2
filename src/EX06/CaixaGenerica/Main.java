package EX06.CaixaGenerica;

public class Main {

    public static void main (String[] args){

        Caixa<String> obj = new Caixa<>();
        obj.guardar("Camisa");
        obj.recuperar();

        System.out.println(obj.recuperar());


        Caixa<Integer> obj1 = new Caixa<>();
        obj1.guardar(123);
        obj1.recuperar();

        System.out.println(obj1.recuperar());


    }
}
