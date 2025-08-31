package EX10.GenericaImplementaçoes;

public class Main {
    public static void main (String[] args){

        Repositorio<String> repoAlunos = new RepositorioDeAluno();
        repoAlunos.salvar("Maria");
        repoAlunos.salvar("João");
        repoAlunos.salvar("Ana");


        Repositorio<Produto> repoProdutos = new RepositorioDeProdutos();
        repoProdutos.salvar(new Produto("Caneta", 2.50));
        repoProdutos.salvar(new Produto("Caderno", 15.00));
    }
    }

