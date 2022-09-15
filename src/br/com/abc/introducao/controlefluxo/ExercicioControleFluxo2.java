package br.com.abc.introducao.controlefluxo;

public class ExercicioControleFluxo2 {
    public static void main (String[] args){
        char dia = 4;

        switch (dia){
            case 1 :
                System.out.println("Domingo");
                break;
            case 2 :
                System.out.println("Segunda");
                break;
            case 3 :
                System.out.println("Terça");
                break;
            case 4 :
                System.out.println("Quarta");
                break;
            case 5 :
                System.out.println("Quinta");
                break;
            case 6 :
                System.out.println("Sexta");
                break;
            case 7 :
                System.out.println("Sabado");
                break;

        }
            if(dia == 1 || dia == 7){
                System.out.println("Final de semana");
            }else{
                System.out.println("Dia util");
            }


    }
}
