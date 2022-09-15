package br.com.abc.introducao.controlefluxo;

public class ExercicioFluxControleFluxo22 {
    public static void main(String[] args) {

        char dia = 12;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;

            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Util");
                break;
            default:
                System.out.println("Operação invalida");


        }
    }
}
