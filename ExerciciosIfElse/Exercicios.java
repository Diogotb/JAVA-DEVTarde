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
        }else if(valor2>valor1){
            System.out.println("O 2º valor é Maior "+valor2);
        }else{
            System.out.println("Os valores são Iguais");
        }
    }
    public void exercicio1alt() {
        System.out.println("Informe o 1º Valor:");
        int valor1 = sc.nextInt();
        System.out.println("Informe o 2º Valor:");
        int valor2 = sc.nextInt();
        if (valor1 > valor2){
            System.out.println("O 1º valor é Maior "+valor1);
        }
        if (valor2>valor1){
            System.out.println("O 2º valor é Maior "+valor2);
        }
        if(valor1==valor2) {
            System.out.println(" os valores são iguais");
        }

    }

    public void exercicio2() {
        
    }

    public void exercicio3() {
        
    }

    public void exercicio4() {
        System.out.println("Informe o nº de Maçãs");
        int nMacas = sc.nextInt();
        double valorMaca; 
        if (nMacas<12){
            valorMaca = 0.30;
        }else{
            valorMaca = 0.25;
        }
        double valorCompra = nMacas*valorMaca;
        System.out.println("O valor da Compra é R$ "+valorCompra);
    }
    public void exercicio4alt() {
        System.out.println("Informe o nº de Maçãs");
        int nMacas = sc.nextInt();
        double valorMaca=0; 
        if (nMacas<12){
            valorMaca = 0.30;
        }
        if(nMacas>=12){
            valorMaca = 0.25;
        }
        double valorCompra = nMacas*valorMaca;
        System.out.println("O valor da Compra é R$ "+valorCompra);
    }






    public void exercicio5() {
        System.out.println("Informe o 1º Valor:");
        int v1 = sc.nextInt();
        System.out.println("Informe o 2º Valor:");
        int v2 = sc.nextInt();
        System.out.println("Informe o 3º Valor:");
        int v3 = sc.nextInt();
        //v1<v2<v3
        if(v1<v2 && v2<v3){
            System.out.println(" A Ordem é "+v1+", "+v2+", "+v3);
        } else if(v1<v3 && v3<v2){//v1<v3<v2
            System.out.println(" A Ordem é "+v1+", "+v3+", "+v2);
        } else if(v2<v1 && v1<v3){//v2<v1<v3
            System.out.println(" A Ordem é "+v2+", "+v1+", "+v3);
        } else if(v2<v3 && v3<v1){//v2<v3<v1
            System.out.println(" A Ordem é "+v2+", "+v3+", "+v1);
        } else if(v3<v1 && v1<v2){ //v3<v1<v2
            System.out.println(" A Ordem é "+v3+", "+v1+", "+v2);
        } else {//v3<v2<v1
            System.out.println(" A Ordem é "+v3+", "+v2+", "+v1);
        }       
    }

    public void exrcicio6() {
        System.out.println("Informe a altura");
        double altura = sc.nextDouble();
        System.out.println("Informe o sexo: 1- Feminino; 2-Masculino;");
        int sexo = sc.nextInt();
        double pesoIdeal;
        if (sexo==1){//Feminino
            pesoIdeal = 62.1*altura-44.7;
            } else{ //Masculino
                pesoIdeal = 72.7*altura-58;
            }
        System.out.println("Seu peso idel é "+pesoIdeal+" Kg");
        
    }
}
