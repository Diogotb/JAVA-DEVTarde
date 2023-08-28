import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ContainerComponentes extends JFrame{
    //atributos
    int cont=0;
    public ContainerComponentes() {
        super("Janela Container");
        this.setBounds(500, 500, 500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Criar um outro container
        JPanel painel1 = new JPanel();
        this.add(painel1);
        //adicionar um Jbutton e um Jlabel -> painel1
        //criar o botão
        JButton botao1 = new JButton("Clique Aqui");
        JLabel texto1 = new JLabel("Nº de Cliques");
        painel1.add(botao1);
        painel1.add(texto1);
        //uma ação para o botão(addActionListener) e imprimir no JLabel
        botao1.addActionListener(e ->{
            cont++;
            texto1.setText("Nº de cliques é "+cont);
            
        });
        this.setVisible(true);
    }
}
