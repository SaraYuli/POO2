package EX10.GenericaImplementaçoes;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeAluno implements Repositorio<String> {

    private List<String> alunos = new ArrayList<>();

    @Override

    public void salvar(String aluno){
        alunos.add(aluno);
        System.out.println("Aluno salvo: " + aluno);
    }

    public List<String> getAlunos(){
        return alunos;
    }

}
