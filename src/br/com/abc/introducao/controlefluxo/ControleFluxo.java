package br.com.abc.introducao.controlefluxo;

public class ControleFluxo {
    public static void main (String[] args) {
        // idade < 15 categoria infantil
        // idade >=15 && idade <18 juvenil
        // idade >=18 adulta
        
        int idade = 22;
        float salario = 2000f;
        String categoria;


        if (idade < 15) {
            categoria = "infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "juvenil";
        }else {
            categoria = "adulto";
        }
        System.out.println("Categoria " + categoria );
    }
}
