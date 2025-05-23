package bancodigital;

public class ContaCorrente extends Conta{
    
    public ContaCorrente(Cliente titular, int agencia, double saldo) {
        super(titular, agencia, saldo);
    }
    
    @Override
    public void imprimirExtrato(){
        System.out.println("-Conta corrente-");
        super.printInfo();
    }
    
}
