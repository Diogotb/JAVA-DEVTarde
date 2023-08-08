package Exception;

import javax.swing.JOptionPane;

public class ExemploThrow {
    public static void main(String[] args) {
        boolean tenteNovamente = true;
        String senha, login, dataNascimento;
        String senhaLower=".*[a-z]+.*";
        String senhaUpper=".*[A-Z]+.*";
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
                if(senha.contains(dataNascimento)){
                    throw new Exception("Senha = Data de Nascimento");
                    }
                if(!senha.matches(senhaUpper)){
                    throw new Exception("Senha Fraca!!!Usar letras lower");
                }
                if(!senha.matches(senhaLower)){
                    throw new Exception("Senha Fraca!!!Usar letras Upper");
                }        
                tenteNovamente = false;
                JOptionPane.showMessageDialog(null, "Senha Cadastrada com Sucesso", "senha", 1);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Senha", 0);
            }
            // senha.contains([a-z]) || senha.contains([A-Z])
        }
    }
}
