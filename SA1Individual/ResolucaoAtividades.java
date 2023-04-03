package SA1Individual;

import java.util.Scanner;

public class ResolucaoAtividades {
    Scanner sc = new Scanner(System.in);

    public void exercico1() {
        //1. digitar o 1º nº
        System.out.println("Informe p 1º Valor");
        double n1 = sc.nextDouble();
        //2. digitar o 2º nº
        System.out.println("Informe p 2º Valor");
        double n2 = sc.nextDouble();
        //3. escolher a Operação
        System.out.println("Informe a Operação Desejada");
        System.out.println("1-Adição; 2-Subtração; 3-Multiplicação; 4-Divisão");
        int operacao = sc.nextInt();
        double resultado;
        if(operacao==1){
            resultado = n1+n2;
            System.out.println("O Resultado é"+resultado);
        }else if(operacao==2){
            resultado = n1-n2;
            System.out.println("O Resultado é"+resultado);
        }else if(operacao==3){
            resultado = n1*n2;
            System.out.println("O Resultado é"+resultado);
        }else if(operacao==4 && n2!=0){
            resultado = n1/n2;
            System.out.println("O Resultado é"+resultado);
        } else{
            System.out.println("Operação Inválida ou Valor Irregular");
        }
    }
    public void exercicio2() {
        //1. declare o nº de matricula
        System.out.println("Infomre seu nº de matrícula");
        int nMatricula = sc.nextInt();
        //dividir por 4 peagr o resto
        int grupo = nMatricula%4;
        if(grupo==0){ //grupo%4==0
            System.out.println("Time do Chris");
        }else if(grupo==1){//nMatricula%3==0
            System.out.println("Time do Greg");
        }else if(grupo==2){//nMatricula%2==0
            System.out.println("Time do Caruso");
        }else{
            System.out.println("Time do Jerome");
        }
    }

    public void exercicio3() {
        //1. Informa a q. de Frutas
        System.out.println("Kg de Morango");
        double kgMorango = sc.nextDouble();
        System.out.println("Kg de Maca");
        double kgMaca = sc.nextDouble();
        System.out.println("Kg de Banana");
        double kgBanana = sc.nextDouble();
        double pesoTotal = kgBanana+kgMaca+kgMorango;
        double valorTotal = kgBanana*1.8+kgMaca*2.3+kgMorango*3.5;
        if(pesoTotal>=15 || valorTotal>=30){
            valorTotal = valorTotal - valorTotal*0.1;

        }
        System.out.println("o Valor da Compra é R$"+valorTotal);
    }
}
