package IteracaoWhile;

import java.util.Random;
import java.util.Scanner;

public class ExemploWhile {
    Scanner sc = new Scanner(System.in);
    public void exemplo1() {
        int i = 0;
        while(i>-1){
            i++;
            System.out.println("o nº da Iteração é "+i);
            
        }
    }
    public void exemplo2() {
        int vetor[]=new int[10];
        int i=0;
        while(i<10){
            System.out.println("Informe o valor do índice"+i+" do vetor");
            vetor[i]=sc.nextInt();
            i++;
        }
        
        while(i>0){
            i--;
            System.out.println("O vetor["+i+"]="+vetor[i]);
            
        }
    }
    public void exemplo3() {
        Random rd = new Random();
        int valorSorteado = rd.nextInt(10);
        boolean tenteNovamente = true;
        while (tenteNovamente) {
            System.out.println("Digite um Nº");
            int nDigitado = sc.nextInt();
            if(nDigitado==valorSorteado){
                System.out.println("Acertouuuu!!!!!!!");
                tenteNovamente = false;
            } else{
                System.out.println("Errouuuu!!!");
            }
        }

    }
}
