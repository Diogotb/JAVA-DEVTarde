
import javax.swing.JFrame;

public class JanelaP extends JFrame{
    public JanelaP() {
        super("Projeto");
        //add JtabbedPane a janela Principal
        this.add(new JanelaAbas());
        //set Frame
        //this.pack();
        this.setSize(500, 500);
        this.setResizable(false);
        this.setDefaultCloseOperation(2);
        this.setVisible(true);
    }
    
}