package Ex03.Pagamentos;

public class CartaoCredito implements Pagamento {


    @Override

    public void pagar(double valor){
        System.out.println("Pagamento de R$" + valor + " no cartão de crédito");
    }
}
