package br.com.abc.introducao.controlefluxo;

public class ControleFluxo2 {
    public static void main(String[] args){
        int idade = 15;
        String status;

        //if(idade <18){
            //status = "não adulto";
        //}else{
            //status = "Adulto";
        //}
        boolean ok = false;
        status = ok ? "ok": "não ok";
        System.out.println(ok);
        status = idade <18 ? "não adulto": "adulto"; //Operador ternario
        System.out.println(status);
    }
}
