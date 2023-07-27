package RevisaoFPOO;

import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import RevisaoFPOO.Cadastro.Animais;
import RevisaoFPOO.Cadastro.Cachorro;
import RevisaoFPOO.Cadastro.Gato;
import RevisaoFPOO.Cadastro.OutrosAnimais;

class App {
    public static void main(String[] args) {
        //armazenar os meus objetos
        Gato gatos[] = new Gato[10];
        Cachorro cachorros[] = new Cachorro[10];
        //ArrayList<OutrosAnimais> outros = new ArrayList<OutrosAnimais>();
        OutrosAnimais outroAnimais[] = new OutrosAnimais[10];
        // contador
        int contGatos = 0, contCachorros = 0, contOutros = 0;
        //criar o cadastro
        JOptionPane.showMessageDialog(null, "Bem-Vindo ao Consultario do Dr. Frankstein");
        boolean aberto = true;
        // if(java.time.LocalDateTime.now()>8 && LocalDateTime.now(null)<18){
        //     aberto=true;
        // }else{
        //     aberto = false;
        // }
        while (aberto) {
            int acao = Integer.parseInt(JOptionPane.showInputDialog("1-Cadastrar PET\n 2-Agendar Consulta\n 3-Sair"));
            if(acao == 1){
                int acao2 = Integer.parseInt(JOptionPane.showInputDialog("1-Gato\n 2-Cachorro\n 3-Outro"));
                if(acao2 ==1){
                    //Cadastro do Gato
                }else if( acao2 ==2){
                    //cadastro do Cachorro
                }else if(acao2 ==3){
                    //cadastro do outro Pet(peixe)
                }else{
                    //mensagem de erro
                    JOptionPane.showMessageDialog(null, "");
                }
            }else if(acao==2){
                //agendamento
            }
        }
    }
}