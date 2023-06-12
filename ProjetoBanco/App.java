package ProjetoBanco;
import javax.swing.JOptionPane;

import ProjetoBanco.Conta.ContaPF;
import ProjetoBanco.Conta.ContaPJ;

public class App {
    public static void main(String[] args) {
        
    
    ContaPF contasPf[] = new ContaPF[10];
    ContaPJ contasPj[] = new ContaPJ[10];
    boolean agenciaAberta = true;
    int cont = 0;
    while(agenciaAberta){
        int acao1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a ação desejada:"
                        +"\n 1 - Criar Conta;"
                        +"\n 2 - Acessar Conta;"));
        if(acao1==1){
            //criar conta(vou fazer primeiro da PF)
            contasPf[cont] = new ContaPF();//obj criado
            //atribuir infos
            contasPf[cont].setNome(JOptionPane.showInputDialog("Informe o Nome:"));
            contasPf[cont].setNumeroConta(1000+cont+1);
            contasPf[cont].setSaldo(0);
            contasPf[cont].setnCpf(JOptionPane.showInputDialog("Informe o CPF:"));


        } else if (acao1 == 2) {
            //acessar conta

        } else{
            JOptionPane.showMessageDialog(null, "Digite uma ação válida");
        }
    }

}
}

