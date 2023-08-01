package RevisaoFPOO;

import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import RevisaoFPOO.Agenda.Agendamento;
import RevisaoFPOO.Cadastro.Animais;
import RevisaoFPOO.Cadastro.Cachorro;
import RevisaoFPOO.Cadastro.Gato;
import RevisaoFPOO.Cadastro.OutrosAnimais;

class App {
    public static void main(String[] args) {
        // armazenar os meus objetos
        Gato gatos[] = new Gato[10];
        Cachorro cachorros[] = new Cachorro[10];
        // ArrayList<OutrosAnimais> outros = new ArrayList<OutrosAnimais>();
        OutrosAnimais outroAnimais[] = new OutrosAnimais[10];
        Agendamento agendamentos[] = new Agendamento[100];// vetor dos agendamentos
        // contador
        int contGatos = 0, contCachorros = 0, contOutros = 0, contAgenda = 0;
        // criar o cadastro
        JOptionPane.showMessageDialog(null, "Bem-Vindo ao Consultario do Dr. Frankstein");
        boolean aberto = true;
        // if(java.time.LocalDateTime.now()>8 && LocalDateTime.now(null)<18){
        // aberto=true;
        // }else{
        // aberto = false;
        // }
        while (aberto) {
            int acao = Integer.parseInt(JOptionPane.showInputDialog("1-Cadastrar PET\n 2-Agendar Consulta\n 3-Sair"));
            if (acao == 1) {
                int acao2 = Integer.parseInt(JOptionPane.showInputDialog("1-Gato\n 2-Cachorro\n 3-Outro"));
                if (acao2 == 1) {
                    // Cadastro do Gato
                    // criar o obj
                    gatos[contGatos] = new Gato();
                    // preencher os atributos do obj
                    gatos[contGatos].setProprietario(JOptionPane.showInputDialog("Informe o Nome do Proprietário"));
                    gatos[contGatos].setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe o Peso do Gato")));
                    // aumentar o contador +1
                    contGatos++;
                } else if (acao2 == 2) {
                    // cadastro do Cachorro
                    // criar o obj
                    cachorros[contCachorros] = new Cachorro();
                    // preencher os atributos do obj
                    cachorros[contCachorros]
                            .setProprietario(JOptionPane.showInputDialog("Informe o Nome do Proprietário"));
                    cachorros[contCachorros]
                            .setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe o Peso do Cachorro")));
                    // aumentar o contador +1
                    contCachorros++;
                } else if (acao2 == 3) {
                    // cadastro do outro Pet(peixe)
                    // criar o obj
                    outroAnimais[contOutros] = new OutrosAnimais();
                    // preencher os atributos do obj
                    outroAnimais[contOutros]
                            .setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe o Peso do Cachorro")));
                    // aumentar o contador +1
                    contOutros++;
                } else {
                    // mensagem de erro
                    JOptionPane.showMessageDialog(null, "Erro");
                }
            } else if (acao == 2) {
                // agendamento
                // Verificar se já existe o cadastro
                boolean cadastroOk = true;
                while (cadastroOk) {

                    String proprietarioAgenda = JOptionPane.showInputDialog("Informe o Nome do Dono do PET");
                    //
                    for (int i = 0; i < contGatos; i++) {
                        if (gatos[i].getProprietario().equals(proprietarioAgenda)) {
                            JOptionPane.showMessageDialog(null, "Cadastro Encontrado");
                            cadastroOk = false;
                            break;
                        }
                    }
                    for (int i = 0; i < contCachorros; i++) {
                        if (cachorros[i].getProprietario().equals(proprietarioAgenda)) {
                            JOptionPane.showMessageDialog(null, "Cadastro Encontrado");
                            cadastroOk = false;
                            break;
                        }
                    }
                    for (int i = 0; i < contOutros; i++) {
                        if (outroAnimais[i].getProprietario().equals(proprietarioAgenda)) {
                            JOptionPane.showMessageDialog(null, "Cadastro Encontrado");
                            cadastroOk = false;
                            break;
                        }
                    }
                }
                // 1º verificação ok - cadastro realizado
                // 2º verificação
                boolean agendaOk = true;
                while (agendaOk) {
                    String dataAgenda = JOptionPane.showInputDialog("Informe a data do Agendamento");
                    String horaAgenda = JOptionPane.showInputDialog("Informe a hora do Agendamento");
                    if (contAgenda > 0) {
                        for (int i = 0; i < contAgenda; i++) {
                            if (agendamentos[i].getDataHora().equals(dataAgenda + horaAgenda)) {
                                JOptionPane.showMessageDialog(null, "Horario já Agendado, Escolha outro");
                            } else {
                                agendaOk = false;
                                JOptionPane.showMessageDialog(null, "agendamento Realizado");
                                agendamentos[contAgenda] = new Agendamento();
                                agendamentos[contAgenda].setData(dataAgenda);
                                agendamentos[contAgenda].setHora(horaAgenda);
                                contAgenda++;
                                break;
                            }
                        }
                    } else {
                        agendaOk = false;
                        JOptionPane.showMessageDialog(null, "agendamento Realizado");
                        agendamentos[contAgenda] = new Agendamento();
                        agendamentos[contAgenda].setData(dataAgenda);
                        agendamentos[contAgenda].setHora(horaAgenda);
                        contAgenda++;
                    }

                }
            }
        }
    }
}