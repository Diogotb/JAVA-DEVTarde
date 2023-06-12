package ProjetoBanco.Conta;

public class ContaPJ extends Conta {
    //atributos
    String nCnpj;
    //métodos
    //construtos
    public ContaPJ(String nome, double saldo, int numeroConta, String nCnpj) {
        super(nome, saldo, numeroConta);
        this.nCnpj = nCnpj;
    }
    public ContaPJ(String nCnpj) {
        this.nCnpj = nCnpj;
    }
    //get and set
    public String getnCnpj() {
        return nCnpj;
    }
    public void setnCnpj(String nCnpj) {
        this.nCnpj = nCnpj;
    }
}
