package IteracaoFor;

import java.util.Scanner;

public class ExercicioFor {
    Scanner sc = new Scanner(System.in);
    
    public void exercicio1() {
        int vetor[]=new int[5];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor");
            vetor[i]=sc.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor["+i+"]="+vetor[i]);
        }
    }
}
