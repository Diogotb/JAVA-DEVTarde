package POOExercicio1;

import javax.swing.JOptionPane;

public class Pessoa {
    //declarar os atributos
    private String nome;
    private double altura;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    //métodos
    //construtor -  mesmo nome da classe
    public Pessoa(String nome, double altura, int diaNascimento, int mesNascimento, int anoNascimento) {
        this.nome = nome;
        this.altura = altura;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
    }
    //construtor vazio
    public Pessoa() {
    }
    //getters and setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public int getDiaNascimento() {
        return diaNascimento;
    }
    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }
    public int getMesNascimento() {
        return mesNascimento;
    }
    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    //métodos imprimir
    public void imprimir() {
        JOptionPane.showMessageDialog(null,"Nome: "+nome);
        JOptionPane.showMessageDialog(null, "Altura: "+altura);
        JOptionPane.showMessageDialog(null, 
                    "Nascimento:"+diaNascimento+"/"+mesNascimento+"/"+anoNascimento);
    }
    //método para calcular a idade
    public int idade(){
        int calculo;
        if(diaNascimento<=5 && mesNascimento<=6){
        calculo = 2023 - anoNascimento;
        } else{
        calculo = 2023 - anoNascimento - 1;
        }
        return calculo;
    }
    
    
    
}
