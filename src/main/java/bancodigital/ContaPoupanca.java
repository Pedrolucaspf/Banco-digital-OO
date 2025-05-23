package bancodigital;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente titular, int agencia, double saldo) {
        super(titular, agencia, saldo);
    }
    
    @Override
    public void imprimirExtrato(){
        System.out.println("-Conta poupança-");
        super.printInfo();
    }
    
}
