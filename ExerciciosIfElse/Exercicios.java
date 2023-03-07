package ExerciciosIfElse;

import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        System.out.println("Informe o 1º Valor:");
        int valor1 = sc.nextInt();
        System.out.println("Informe o 2º Valor:");
        int valor2 = sc.nextInt();
        if (valor1 > valor2){
            System.out.println("O 1º valor é Maior "+valor1);
        }else{
            System.out.println("O 2º valor é Maior "+valor2);
        }
    }

    public void exercicio2() {
        
    }

    public void exercicio3() {
        
    }
    public void exercicio5() {
        System.out.println("Informe o 1º Valor:");
        int valor1 = sc.nextInt();
        System.out.println("Informe o 2º Valor:");
        int valor2 = sc.nextInt();
        System.out.println("Informe o 3º Valor:");
        int valor3 = sc.nextInt();
        ///123
        if (valor1<valor2 && valor2<valor3){
            System.out.println(" a Ordem é "+valor1+","+valor2+","+valor3);
        }//132
        else if(valor1<valor3 && valor3<valor2){
            System.out.println(" a Ordem é "+valor1+","+valor3+","+valor2);
        }//213
        else if(valor2<valor1 && valor1<valor3){
            System.out.println(" a Ordem é "+valor2+","+valor1+","+valor3);
        }//231
        else if(valor2<valor3 && valor3<valor1){
            System.out.println(" a Ordem é "+valor2+","+valor3+","+valor1);
        }//312
        else if(valor3<valor1 && valor1<valor2){
            System.out.println(" a Ordem é "+valor3+","+valor1+","+valor2);
        }//321
        else{
            System.out.println(" a Ordem é "+valor3+","+valor2+","+valor1);
        }
    }
}
