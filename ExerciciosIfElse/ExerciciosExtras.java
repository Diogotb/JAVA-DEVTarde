package ExerciciosIfElse;

import java.util.Scanner;

public class ExerciciosExtras {
    Scanner sc = new Scanner(System.in);

    // resolucao exercicio extra 1 par impar
    public void exeExtra1() {
        System.out.println("Informe um nº inteiro:");
        int numero = sc.nextInt();
        // calcula o resto(operador %) da divisão por 2
        int restoDivisao2 = numero % 2;
        if (restoDivisao2 == 0) {
            System.out.println(numero + " É Par");
        } else {
            System.out.println(numero + " É Ímpar");
        }
    }

    // resolução exe extra 2 (nota digitada)
    public void exeExtra2() {
        System.out.println("Informe sua nota:");
        int nota = sc.nextInt();
        if (nota >= 7) {
            System.out.println("Aluno Aprovado");
        } else if (nota >= 5) {
            System.out.println("Aluno poderá fazer a Recuperação");
        } else {
            System.out.println("Aluno Reprovado");
        }
    }

    // resolução exeExtra3 (vogal Consoante)
    public void exeExtra3() {
        System.out.println("Digite uma letra");
        String letra = sc.nextLine();
        if (letra == "a" || letra == "e" || letra == "i" || letra == "o" || letra == "u") {
            System.out.println(letra + " É vogal");
        } else {
            System.out.println(letra + " É consoante");
        }
    }

    // resolução exeExtra4 (reajuste salário)
    public void exeExtra4() {
        System.out.println("Informe o salário");
        double salario = sc.nextDouble();
        if (salario <= 1280) {
            salario *= 1.20; // 20% de aumento usando uma operação de atribuição
        } else if (salario <= 1700) {
            salario *= 1.15; // 15% de aumento por operação de atribuição
        } else if (salario <= 2500) {
            salario *= 1.10; // 10% de aumento por operação de atribuição
        } else {
            salario *= 1.05; // 5% de aumennto por operação de atribuição
        }
    }

    // resolução exeExtra5 (calculo de impostos no salário)
    public void exeExtra5() {
        System.out.println("Informe o Valor Recebido por Hora Trabalhada");
        double valorHora = sc.nextDouble();
        System.out.println("Informe a Quant. de Horas Trabalhadas");
        int horasTrabalhadas = sc.nextInt();
        double salarioBruto = valorHora*horasTrabalhadas;
        int taxaIR;
        if (salarioBruto<900){
            taxaIR=0;//isento IR =0
        } else if(salarioBruto<=1500){
            taxaIR=5;//IR = 5%
        } else if(salarioBruto<=2500){
            taxaIR=10;//IR = 10%
        } else{
            taxaIR = 20;//IR = 20%
        }
        double calculoIR = salarioBruto*taxaIR/100;
        double taxaINSS = salarioBruto*10/100;
        double taxaFGTS = salarioBruto*11/100;
        double taxaImpSindical = salarioBruto*3/100;
        double totalDesconto = calculoIR+taxaINSS+taxaImpSindical;
        double salarioLiquido = salarioBruto-totalDesconto;
        System.out.println("Salario Bruto = R$ "+salarioBruto);
        System.out.println("Imposto de Renda = R$ "+calculoIR);
        System.out.println("INSS = R$ "+taxaINSS);
        System.out.println("FGTS = R$ "+taxaFGTS);
        System.out.println("Taxa Sindical = R$ "+taxaImpSindical);
        System.out.println("Salario Líquido = R$ "+salarioLiquido);
    }
}
