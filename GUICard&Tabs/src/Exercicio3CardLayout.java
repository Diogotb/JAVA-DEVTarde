import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.*;

public class Exercicio3CardLayout extends JFrame {
    // construtor
    public Exercicio3CardLayout() {
        super("Exercicio 3 - CardLayout");
        // Adicionar um Painel ( main Panel -> CardLayout)
        JPanel mainPanel = new JPanel(); // caixa do baralho
        CardLayout cl = new CardLayout();
        mainPanel.setLayout(cl);// set do layout
        this.add(mainPanel);// add mainPanel ao Frame
        // Adicionar os Cards
        // card1 - Home
        JPanel card1 = new JPanel();
        card1.add(new JLabel("Página de Boas Vindas"));// mensagem do card
        JButton but1 = new JButton("Login");//
        JButton but2 = new JButton("Cadastro");//
        card1.add(but1);
        card1.add(but2);
        mainPanel.add(card1, "Home");// add do card ao painel principal
        // card2 - Login
        JPanel card2 = new JPanel();
        card2.add(new JLabel("Página de Login"));// mensagem do card
        JButton but3 = new JButton("Home");//
        JButton but4 = new JButton("Cadastro");//
        card2.add(but3);
        card2.add(but4);
        mainPanel.add(card2, "Login");// add do card ao painel principal
        // card3 - Login
        JPanel card3 = new JPanel();
        card3.add(new JLabel("Página de Cadastro"));// mensagem do card
        JButton but5 = new JButton("Home");//
        JButton but6 = new JButton("Login");//
        card3.add(but5);
        card3.add(but6);
        mainPanel.add(card3, "Cadastro");// add do card ao painel principal
        //set do frame
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 220, 220);
        this.setVisible(true);
        //funcionalidade dos but (tratamento de eventos)
        but1.addActionListener(e->{
            //troca do card
            cl.show(mainPanel,but1.getText());//vai navegar para o card "Login"
        });
        but2.addActionListener(e->{
            //troca do card
            cl.show(mainPanel,but2.getText());
        });
        but3.addActionListener(e->{
            //troca do card
            cl.show(mainPanel,but3.getText());
        });
        but4.addActionListener(e->{
            //troca do card
            cl.show(mainPanel,but4.getText());
        });
        but5.addActionListener(e->{
            //troca do card
            cl.show(mainPanel,but5.getText());
        });
        but6.addActionListener(e->{
            //troca do card
            cl.show(mainPanel,but6.getText());
        });
        
    }
}
