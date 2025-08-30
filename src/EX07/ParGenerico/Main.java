package EX07.ParGenerico;

public class Main {
    public static void main (String [] args){

        Par<String,Integer> pessoa1 = new Par<>("Maria",35);
        System.out.println("Nome: " + pessoa1.getChave() + ", Idade: " + pessoa1.getValor());

        Par<Integer,String> aula = new Par<>(0411, "Biologia");
        System.out.println("Sala: " + aula.getChave() + " disciplina: " + aula.getValor());

    }
}
