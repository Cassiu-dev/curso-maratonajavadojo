package br.com.abc.introducao.arrays;

public class Arrays02 {
    public static void main(String[] args) {

        String[] nomes = new String[4];

        nomes[0] = "Maria";
        nomes[1] = "Goku";
        nomes[2] = "Luffy";
        nomes[3] = "Clover";
        System.out.println(nomes.length);

        for(int i = 0; i <nomes.length; i++){
            System.out.println(nomes[i]);
        }

        nomes = new String[4];




        for(int i = 0; i <nomes.length; i++){
            System.out.println(nomes[i]);
        }

    }
}
