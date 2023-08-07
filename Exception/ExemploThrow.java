package Exception;

import javax.swing.JOptionPane;

public class ExemploThrow {
    public static void main(String[] args) {
        boolean tenteNovamente = true;
        String senha, login, dataNascimento;
        while (tenteNovamente) {
            try {
                login = JOptionPane.showInputDialog("Informe un login");
                senha = JOptionPane.showInputDialog("Informe uma senha");
                dataNascimento = JOptionPane.showInputDialog("Informe sua data de NAscimento [dd/mm/aaaa]");
                dataNascimento = dataNascimento.replace("/", "");
                if (senha.length() < 8) {
                    throw new Exception("Senha < 8 Caracteres");
                }
                if(senha.equals(login)){
                    throw new Exception("Senha = Login");
                }
                tenteNovamente = false;
                JOptionPane.showMessageDialog(null, "Senha Cadastrada com Sucesso", "senha", 1);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Senha", 0);
            }
        }
    }
}
