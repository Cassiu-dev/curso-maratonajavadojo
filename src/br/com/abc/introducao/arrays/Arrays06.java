package br.com.abc.introducao.arrays;

public class Arrays06 {
    public static void main(String[] args) {
        int [] [] dias = new int [3][];

        dias[0] = new int[2];
        dias[1] = new int[] {1,2,3};
        dias[2] = new int[4];

        for(int[] un : dias){
            for(int one : un){
                System.out.println(one);
            }
        }

        System.out.println(dias[1][2]);
    }
}
