package Ex03.Pagamentos;

public class Dinheiro implements Pagamento{
    @Override

    public void pagar(double valor){
        System.out.println("Pagamento de R$" + valor + " realizado em dinheiro.");
    }
}
