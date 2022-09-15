package br.com.abc.javacore.introducaoclasses.blocodeinicialização.classes;

public class Cliente {

    private int[] parcelas;

    {
        System.out.println("Dentro do bloco inicialização");
        parcelas =new int[100];
        for(int i= 1; i <= 100; i++){
            parcelas[i-1] = i;
        }
    }

    public Cliente(){
        System.out.println("Dentro do construtor");
        for (int num : this.parcelas)
            System.out.print(num + " ");
    }


    public void setParcelas(int[] parcelas){
        this.parcelas = parcelas;
    }

    public int[] getParcelas(){
        return parcelas;
    }


}
