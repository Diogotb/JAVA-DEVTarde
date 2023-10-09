import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Exercicio2KeyEvent extends JFrame{
    //atributos
    private JPanel mainPanel;
    private JLabel letraDigitada;
    private JTextField caixaTexto;
    private JTextArea textoDigitado;
    
    //construtor
    public Exercicio2KeyEvent() {
        super("Exercicio 2");
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 300);
        mainPanel = new JPanel(new GridLayout(4,1));
        this.add(mainPanel);
        //add componentes
        letraDigitada = new JLabel("Letra Digitada: ");
        mainPanel.add(letraDigitada);
        mainPanel.add(new JLabel("Digite Seu Texto na Caixa Abaixo:"));
        caixaTexto = new JTextField();
        mainPanel.add(caixaTexto);
        textoDigitado = new JTextArea(3, 25);
        mainPanel.add(textoDigitado);
        caixaTexto.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                char typedKey = e.getKeyChar();
                letraDigitada.setText("Letra Digitada: "+typedKey);  
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                textoDigitado.setText(caixaTexto.getText());
            }
            
        });
    }
    public void run(){
        this.setVisible(true);
    }
}
