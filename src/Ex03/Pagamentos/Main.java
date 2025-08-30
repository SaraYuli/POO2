package Ex03.Pagamentos;

public class Main {

    public static void main (String []args){

        double valorProduto = 100;


        CartaoCredito cartaoCredito = new CartaoCredito();
        Pix pix = new Pix();
        Dinheiro dinheiro = new Dinheiro();

        dinheiro.pagar(valorProduto);
        pix.pagar(valorProduto);
        cartaoCredito.pagar(valorProduto);



    }
}
