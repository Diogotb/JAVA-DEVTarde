package ExerciciosIfElse;

import java.util.Scanner;

public class ExerciciosExtras {
    Scanner sc = new Scanner(System.in);
    //resolucao exercicio extra 1 par impar
    public void exeExtra1() {
        System.out.println("Informe um nº inteiro:");
        int numero = sc.nextInt();
        // calcula o resto(operador %) da divisão por 2
        int restoDivisao2 = numero%2;
        if (restoDivisao2==0) {
            System.out.println(numero+" É Par");
        } else {
            System.out.println(numero+" É Ímpar");
        }
    }
    // resolução exe extra 2
    public void exeExtra2() {
        System.out.println("Informe sua nota:");
        int nota = sc.nextInt();
        if (nota>=7) {
            System.out.println("Aluno Aprovado");
        } else if(nota>=5){
            System.out.println("Aluno poderá fazer a Recuperação");
        }else{
            System.out.println("Aluno Reprovado");
        } 
    }
    // resolução exeExtra3
}
