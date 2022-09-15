package br.com.abc.introducao.controlefluxo;

public class ControlFluxoExercicio {
    public static void main(String[] args){

       double salario = 2000;
       double salarioDeduzido;

        if(salario < 1000){
            salarioDeduzido = salario-(salario*0.05) ;
        } else if (salario >= 1000 && salario < 2000) {
            salarioDeduzido = salario-(salario*0.1);
        } else if (salario>=2000 && salario <4000) {
            salarioDeduzido = salario -(salario*0.15);
        }else {
            salarioDeduzido = salario -(salario*0.20);
        }
        System.out.println("O Salario liquido é = "+ salarioDeduzido  );
    }
}
