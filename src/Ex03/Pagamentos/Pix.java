package Ex03.Pagamentos;

public class Pix implements Pagamento {

    @Override
    public void pagar(double valor){
        System.out.println("Pagamento de R$" + valor + " realizado via Pix.");
    }
}
