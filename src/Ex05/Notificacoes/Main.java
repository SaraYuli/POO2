package Ex05.Notificacoes;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main (String [] args){

     List<Notificacao> notificacaos = new ArrayList<>();
     notificacaos.add(new Email());
     notificacaos.add(new Sms());

     for (Notificacao n: notificacaos){
         n.enviarMensagem("Acho que a Sara merece um 10!");
     }


    }

}
