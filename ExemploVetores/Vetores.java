package ExemploVetores;

import java.util.Scanner;
import java.lang.Math;

public class Vetores {
    Scanner sc = new Scanner(System.in);
    public void exemplo1() {
        // Criar um Vetor com 5 nº inteiros
        int vetorInt[] = new int[5];//vetor vazio
        int vetorInt2[] = new int[]{1,2,3,4,5};//vetor com valores preenchidos
        //preenchendo o vetorInt o 1º
        System.out.println("Preencha o vetor de 5 posições");
        vetorInt[0]=sc.nextInt();//1º posição índice 0
        vetorInt[1]=sc.nextInt();//2º posição índice 1
        vetorInt[2]=sc.nextInt();//3º posição índice 2
        vetorInt[3]=sc.nextInt();//4º posição índice 3
        vetorInt[4]=sc.nextInt();//5º posição índice 4
        System.out.println("o valor da 1º posição índice 0 é"+vetorInt[0]);
        System.out.println("o valor da 2º posição índice 1 é"+vetorInt[1]);
        System.out.println("o valor da 3º posição índice 2 é"+vetorInt[2]);
        System.out.println("o valor da 4º posição índice 3 é"+vetorInt[3]);
        System.out.println("o valor da 5º posição índice 4 é"+vetorInt[4]);
        double raiz = Math.sqrt(vetorInt[1]);


    }
}
