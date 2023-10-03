import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Exercicio5CardLayout extends JFrame{
    //atributo
    int pontuacao = 0;
    //construtor
    public Exercicio5CardLayout() {
        super("Exercicio 5 - Jogo");
        //criar um cardprincipal
        CardLayout cl  =  new CardLayout();
        JPanel mainPanel = new JPanel(cl);// set do layout no construtor
        this.add(mainPanel);//add ao Frame
        //criar os cards
        // card1 - Início
        JPanel card1 = new JPanel();
        card1.add(new JLabel("Início - Aperte Start Para Começar o Jogo"));
        JButton but1 = new JButton("Start");
        card1.add(but1);
        mainPanel.add(card1,"Start");
        //card2 - Primeira Pergunta
        JPanel card2 = new JPanel();
        card2.add(new JLabel("Quem Ganhou a Copa de 10?"));
        JTextField caixa1 = new JTextField(25);
        card2.add(caixa1);
        JButton but2 = new JButton("Next");
        card2.add(but2);
        mainPanel.add(card2,"P1");
        //card3 - Segunda Pergunta
        JPanel card3 = new JPanel();
        card3.add(new JLabel("Quem Onde Foi a Copa de 2018"));
        JTextField caixa2 = new JTextField(25);
        card3.add(caixa2);
        JButton but3 = new JButton("Next");
        card3.add(but3);
        mainPanel.add(card3,"P2");
        // card4 - Pontuacao
        JPanel card4 = new JPanel();
        card4.add(new JLabel("Resultado Final"));
        JLabel pontuacaoFinal = new JLabel();
        card4.add(pontuacaoFinal);
        JButton but4 = new JButton("Reiniciar");
        card4.add(but4);     
        mainPanel.add(card4,"Final"); 
        //set do frame
        this.setDefaultCloseOperation(2);
        this.setBounds(200, 200, 300, 300);
        this.setVisible(true);
        //tratamento de eventos
        but1.addActionListener(e->{
            cl.next(mainPanel);
        });
        but2.addActionListener(e->{
            if(caixa1.getText().toUpperCase().equals("ESPANHA")){
                pontuacao++;
            }
            caixa1.setText("");
            cl.next(mainPanel);
        });
        but3.addActionListener(e->{
            if(caixa2.getText().toUpperCase().equals("RÚSSIA")){
                pontuacao++;
            }
            caixa2.setText("");
            pontuacaoFinal.setText("Sua Pontução Foi de "+pontuacao);
            cl.next(mainPanel);
        });
        but4.addActionListener(e->{
            cl.first(mainPanel);
        });



    }
}
