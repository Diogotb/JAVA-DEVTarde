import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploConcatNome extends JFrame{
    //construtor
    public ExemploConcatNome() {
        super("Exemplo 1 - Evento");
        JPanel mainP = new JPanel(new GridLayout(3,2));
        this.add(mainP);//add mainP ao frame
        //add elementos/componentes ao Painel
        mainP.add(new JLabel("Nome: "));
        JTextField caixaNome = new JTextField();
        mainP.add(caixaNome);
        mainP.add(new JLabel("Sobrenome: "));
        JTextField caixaSobrenome = new JTextField();
        mainP.add(caixaSobrenome);
        JButton botao = new JButton("Enviar");
        mainP.add(botao);
        JLabel nomeSobrenome = new JLabel();
        mainP.add(nomeSobrenome);
        //Set do Frame
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 150);
        this.setVisible(true);
        //Tratamento de Evento encurtado
        // botao.addActionListener(e->{
        //     nomeSobrenome.setText(caixaNome.getText()+" "+caixaSobrenome.getText());
        //     caixaNome.setText("");
        //     caixaSobrenome.setText("");
        // }); 
        //tratamento de Evento Normal
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            nomeSobrenome.setText(caixaNome.getText()+" "+caixaSobrenome.getText());
            caixaNome.setText("");
            caixaSobrenome.setText("");
            }});
    }
    
}