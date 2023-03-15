package ExerciciosIfElse;

import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    // resolução exercicios 1 IfElse Encadeado
    public void exercicio1() {
        System.out.println("Informe o 1º Valor:");
        int valor1 = sc.nextInt();
        System.out.println("Informe o 2º Valor:");
        int valor2 = sc.nextInt();
        if (valor1 > valor2) {
            System.out.println("O 1º valor é Maior " + valor1);
        } else if (valor2 > valor1) {
            System.out.println("O 2º valor é Maior " + valor2);
        } else {
            System.out.println("Os valores são Iguais");
        }
    }

    // resolução Exe1 If desencadeado
    public void exercicio1alt() {
        System.out.println("Informe o 1º Valor:");
        int valor1 = sc.nextInt();
        System.out.println("Informe o 2º Valor:");
        int valor2 = sc.nextInt();
        if (valor1 > valor2) {
            System.out.println("O 1º valor é Maior " + valor1);
        }
        if (valor2 > valor1) {
            System.out.println("O 2º valor é Maior " + valor2);
        }
        if (valor1 == valor2) {
            System.out.println(" os valores são iguais");
        }

    }

    // resolução exe2 IfElse
    public void exercicio2() {
        System.out.println("Informe seu ano de Nascimento:");
        int anoNascimento = sc.nextInt();
        int anoAtual = 2023;
        int idade = anoAtual - anoNascimento;
        if (idade >= 16) {
            System.out.println("Você Pode Votar");
        } else {
            System.out.println("Você NÃO Pode Votar");
        }
    }

    // resolução exe3 IfElse
    public void exercicio3() {
        System.out.println("Informe a Senha de Acesso");
        int senha = sc.nextInt();
        if (senha == 1234) {
            System.out.println("Acesso Permitido");
        } else {
            System.out.println("Acesso Negado");
        }

    }

    // resolução exe4 IfElse
    public void exercicio4() {
        System.out.println("Informe o nº de Maçãs");
        int nMacas = sc.nextInt();
        double valorMaca;
        if (nMacas < 12) {
            valorMaca = 0.30;
        } else {
            valorMaca = 0.25;
        }
        double valorCompra = nMacas * valorMaca;
        System.out.println("O valor da Compra é R$ " + valorCompra);
    }

    // resolução exe4 If desencadeado
    // obs. importancia de declarara variavel com valor
    public void exercicio4alt() {
        System.out.println("Informe o nº de Maçãs");
        int nMacas = sc.nextInt();
        // variavel dever ser declarada com valor
        double valorMaca = 0;
        if (nMacas < 12) {
            valorMaca = 0.30;
        }
        if (nMacas >= 12) {
            valorMaca = 0.25;
        }
        // caso a declaração seja feita sem valor(null)
        // por não conter else a conta posterior
        // ao if não pode ser feita(o compilador entende
        // que a variavel pode conter valores nulos)
        double valorCompra = nMacas * valorMaca;
        System.out.println("O valor da Compra é R$ " + valorCompra);
    }

    // resolução exe5 ifelse
    // para resolução do exercicios deve observar
    // as combinações possiveis entre 3 nº
    public void exercicio5() {
        System.out.println("Informe o 1º Valor:");
        int v1 = sc.nextInt();
        System.out.println("Informe o 2º Valor:");
        int v2 = sc.nextInt();
        System.out.println("Informe o 3º Valor:");
        int v3 = sc.nextInt();
        // v1<v2<v3
        if (v1 < v2 && v2 < v3) {
            System.out.println(" A Ordem é " + v1 + ", " + v2 + ", " + v3);
        } else if (v1 < v3 && v3 < v2) {// v1<v3<v2
            System.out.println(" A Ordem é " + v1 + ", " + v3 + ", " + v2);
        } else if (v2 < v1 && v1 < v3) {// v2<v1<v3
            System.out.println(" A Ordem é " + v2 + ", " + v1 + ", " + v3);
        } else if (v2 < v3 && v3 < v1) {// v2<v3<v1
            System.out.println(" A Ordem é " + v2 + ", " + v3 + ", " + v1);
        } else if (v3 < v1 && v1 < v2) { // v3<v1<v2
            System.out.println(" A Ordem é " + v3 + ", " + v1 + ", " + v2);
        } else {// v3<v2<v1
            System.out.println(" A Ordem é " + v3 + ", " + v2 + ", " + v1);
        }
    }

    // resolução exe6 IfElse
    public void exrcicio6() {
        System.out.println("Informe a altura");
        double altura = sc.nextDouble();
        System.out.println("Informe o sexo: 1- Feminino; 2-Masculino;");
        int sexo = sc.nextInt();
        double pesoIdeal;
        if (sexo == 1) {// Feminino
            pesoIdeal = 62.1 * altura - 44.7;
        } else { // Masculino
            pesoIdeal = 72.7 * altura - 58;
        }
        System.out.println("Seu peso idel é " + pesoIdeal + " Kg");

    }

    // exe7 - ler 2 notas e a frequencia de um aluno
    // calcular a média
    // se media > 50 e frequencia > 70- aluno aprovado
    public void exercicio7() {
        System.out.println("Informe a 1ª nota do aluno:");
        int nota1 = sc.nextInt();
        System.out.println("informe a 2ª notado aluno:");
        int nota2 = sc.nextInt();
        int media = (nota1 + nota2) / 2;
        System.out.println("a Média do aluno é " + media);
        System.out.println("Informe a frequencia do aluno:");
        int frequencia = sc.nextInt();
        if (media >= 50 && frequencia >= 75) {
            System.out.println("Aluno Aprovado");
        } else {
            System.out.println("Aluno Reprovado");
        }
    }
}
