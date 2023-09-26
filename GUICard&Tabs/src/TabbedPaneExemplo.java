
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class TabbedPaneExemplo extends JFrame{
    //cosntrutor
    public TabbedPaneExemplo() {
        super("Exemplo JTabbedPane");
        JTabbedPane janelaAbas = new JTabbedPane();
        //aba1 3 botões
        JPanel aba1 = new JPanel();
        aba1.add(new JButton("Botão 1"));
        aba1.add(new JButton("Botão 2"));
        aba1.add(new JButton("Botão 3"));
        //aba2 1 textfield
        JPanel aba2 = new JPanel();
        aba2.add(new JTextField("",20));
        //add Abas ao JtabbedPane
        janelaAbas.add("Aba JButtons",aba1);
        janelaAbas.add("Aba JTextField",aba2);
        //add JtabbedPane ao Frame
        this.add(janelaAbas);
        //set do Frame
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);


        
    }
    
}
