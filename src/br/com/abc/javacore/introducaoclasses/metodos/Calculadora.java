package br.com.abc.javacore.introducaoclasses.metodos;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(5 + 5);
    }

    public void subtrairDoisNumeros() {
        System.out.println(5 - 5);
    }

    public void multipliqueDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {

        return num1 / num2;
    }

    public double divideDoisNumeros2(double num3, double num4) {
        double divisao;
        if (num4 != 0) {
             divisao = num3/num4;
        } else {
            System.out.println("Essa conta é invalida não é possivel dividir um numero por 0");

        }
        return 0;


    }

    public void imprimiDoisNumerosDivididos(double num1, double num2){
        if(num2 != 0){
            System.out.println(num1/num2);
            return;
        }
        System.out.println("Não é possivel dividir por 0");

    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 30;
        num2 = 40;

        System.out.println("Dentro do altera dois numeros");
        System.out.println("num1 =  "+ num1);
        System.out.println("num2 = "+ num2);


    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num : numeros){
            soma+= num;
        }

        System.out.println(soma);

    }

    public void somaVarargs(int... numeros){
        int soma =0;

        for(int aux : numeros){
            soma += aux;
        }
        System.out.println(soma);
    }

}

