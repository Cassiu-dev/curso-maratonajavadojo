package br.com.abc.introducao.controlefluxo;

public class ExercicioControleFluxo3 {
    public static void main(String[] args) {

        for (int i = 0; i <= 100000; i++) {
            if ((i % 2 != 0)) {
                System.out.println("Numero é par" + i);
            }
        }

    }
}
