package Ex05.Notificacoes;

public class Email implements Notificacao {

    @Override
    public void enviarMensagem(String mensagem){
        System.out.println("Enviando Email: " + mensagem);

    }

}
