package br.com.abc.javacore.introducaoclasses.modificadorestatico.classe;

public class Cliente {

    private static int[] parcelas;


    {
        System.out.println("Bloco de inicialização não estatico");
    }
    static  {
        System.out.println("Dentro do bloco inicialização");
        parcelas =new int[100];
        for(int i= 1; i <= 100; i++){
            parcelas[i-1] = i;
        }

    }

    static {
        System.out.println("Bloco de estatico 2");
    }

    static {
        System.out.println("Bloco de estatico 3");
    }

    public Cliente(){
        //System.out.println("Dentro do construtor");
       // for (int num : this.parcelas)
           // System.out.print(num + " ");
    }



    public static int[] getParcelas(){
        return parcelas;
    }


}
