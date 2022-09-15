package br.com.abc.javacore.introducaoclasses.metodos.teste;

import br.com.abc.javacore.introducaoclasses.metodos.Calculadora;

import java.sql.SQLOutput;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();

        Calculadora calc2 = new Calculadora();
        calc.subtrairDoisNumeros();
        calc2.subtrairDoisNumeros();

        calc.multipliqueDoisNumeros(2,3);

        calc.divideDoisNumeros(5.2,5);
        System.out.println("Divisão de dois numeros" + calc.divideDoisNumeros(5,2));
        double resultado =calc2.divideDoisNumeros(111,2);
        System.out.println(resultado);


        System.out.println(calc.divideDoisNumeros2(555,0));

        calc.imprimiDoisNumerosDivididos(20,0);

        System.out.println("--------------------------------------");

        int numeros [] = new int[]{1,2,3,18,5,6};

        calc.somaArray(numeros);

        calc.somaVarargs(1,2,3,19,5,6);

    }


}
