package bancodigital;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }
        
    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Conta getConta(int num) {
        for(Conta c: contas){
            if(c.getId() == num){
                return c;
            }
        }
        System.out.println("Num. Conta invalido.");
        return null;
    }

    public void addContaCorrente(Cliente titular, int agencia, double saldo) {
        this.contas.add(new ContaCorrente(titular, agencia, saldo));
        System.out.println("Conta adicionada. Numero:" + this.contas.size());
    }
        
    public void addContaPoupanca(Cliente titular, int agencia, double saldo) {
        this.contas.add(new ContaPoupanca(titular, agencia, saldo));
        System.out.println("Conta adicionada. Numero:" + this.contas.size());
    }
}
