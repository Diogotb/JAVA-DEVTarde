package EstruturaDecisaoIfElse;

import java.util.Scanner;

public class DecisaoIfElse {

    Scanner sc = new Scanner(System.in);
    //If Desencadeado
    public void decisaoIf(){
        System.out.println("Informe o Preço do Produto");
        double precoProduto = sc.nextDouble();
        double desconto = 0.0;
        //se precoProduto>=100  < 200 então desconto=5
        if(precoProduto>=100 && precoProduto<200){
            desconto = 5.0;
        }
        //se precoproduto>=200 <300 então desconto =10
        if(precoProduto>=200 && precoProduto<300){
            desconto = 10;
        }
        //se precoProduto>=300 entao dexsconto 15
        if(precoProduto>=300){
            desconto = 15;
        }
        //realizar a Conta
        double valorDesconto = precoProduto*desconto/100;
        double precoFinal = precoProduto-valorDesconto;
        System.out.println("O valo do Produto é R$ "
        +precoFinal);

    }
    // If Encadeado (If-Else)
    public void decisaoIfElse() {
        System.out.println("Informe o Preço do Produto");
        double precoProduto = sc.nextDouble();
        double desconto;
        //Estrutura de decisaõ encadeada if-else
        if (precoProduto>=300){ // 1º
            desconto = 15;
        }else if(precoProduto>=200){  // 2º
            desconto = 10;
        }else if (precoProduto>=100){ // 3º
            desconto = 5;
        }else{
            desconto=0;
        }
        //realizar a Conta
        double valorDesconto = precoProduto*desconto/100;
        double precoFinal = precoProduto-valorDesconto;
        System.out.println("O valo do Produto é R$ "
        +precoFinal);
    }
}