import java.util.Random;
import java.util.Scanner;

public class AtividadeFormativa {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random(0);
    //atividade 1 Matriz
    public void atividade1() {
        //pedir para usuario informar o tamanho da linha e coluna
        System.out.println("Informe o tamanho da linha:");
        int linha = sc.nextInt();
        System.out.println("Informe o tamanho da coluna:");
        int coluna = sc.nextInt();
        //criar a matriz
        int matriz[][]= new int[linha][coluna];
        //preencher a matriz  com random
        for (int i = 0; i <linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matriz[i][j]=rd.nextInt(10);
            }
        }
        //imprimir a matriz 
        for (int i = 0; i <linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        //preencher a matriz com a regra i e j
        for (int i = 0; i <linha; i++) {
            for (int j = 0; j < coluna; j++) {
                //condição para preenchimento
                if(i>j){
                    matriz[i][j]=1;
                } else if(i==j){
                    matriz[i][j]=0;
                } else{
                    matriz[i][j]=2;
                }
            }
        }
        //imprimir a nova matriz
        for (int i = 0; i <linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
    //atividade 2 - sorteio do nº
    public void atividade2() {
        int contador = 1;
        int nSorteado = rd.nextInt(1000)+1;
        System.out.println("Digite um nº");
        int nDigitado = sc.nextInt();
        while(nSorteado != nDigitado){
            contador++;
            System.out.println("Digite outro nº");
            nDigitado = sc.nextInt();
            //condição
            //se nDigitado == nSorteado
            if(nDigitado == nSorteado){
                System.out.println("Parabens vc acertou!!!");
                System.out.println("em "+contador+" tentativas");
            }else if(nDigitado>nSorteado){//se nDigitado > nSorteado
                System.out.println("Vc Errou o nº digitado é > do que o Sorteado");
            }  else{//se ndigitado < nSorteado
                System.out.println("Vc Errou o nº digitado é < do que o Sorteado");
            } 
        }
    }
    //atividade 3
    public void atividade3() {
        //criar um vetor
        int vetor[] = new int[rd.nextInt(900)+100];
        //preencher o vetor com valores aleatórios
        for (int i = 0; i < vetor.length; i++) {
            vetor[i]=rd.nextInt(100)+1;
        }
        //procurar os nº impares e imprimir
        int contImparNoPar = 0;
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i]%2==1){
                System.out.println(vetor[i]);
                if(i%2==1){
                    contImparNoPar++;
                }
            }
        }
        //procurar os nº pares e imprimir
        int contParNoImpar = 0;
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i]%2==0){
                System.out.println(vetor[i]);
                if(i%2==0){
                    contParNoImpar++;
                }
            }
        }
        System.out.println(contImparNoPar);
        System.out.println(contParNoImpar);
        //contar os pares nas posições impares
        contParNoImpar = 0;
        contImparNoPar = 0;
        for (int i = 0; i < vetor.length; i+=2) {
            if(vetor[i]%2==0){
                contParNoImpar++;
            }
        }
        //contar os impares nas posições pares
        for (int i = 1; i < vetor.length; i+=2) {
            if(vetor[i]%2==1){
                contImparNoPar++;
            }
        }
        System.out.println(contImparNoPar);
        System.out.println(contParNoImpar);
    }
}
