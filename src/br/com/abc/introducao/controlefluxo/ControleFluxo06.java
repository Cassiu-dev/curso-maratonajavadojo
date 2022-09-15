package br.com.abc.introducao.controlefluxo;

public class ControleFluxo06 {
    public static void main (String[] args ){

        double valorTotal = 30000;

        for (int parcela = (int) valorTotal;parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Quantidade de parcelas " + parcela + "o valor é R$ " + valorParcela);
        }
    }
}
