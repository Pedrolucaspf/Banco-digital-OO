package bancodigital;

public abstract  class Conta implements InterfaceConta{
    private static int SEQUENCIAL = 1;
    
    private double saldo;
    private final int id;
    private final Cliente titular;
    private final int agencia;

    public Conta(Cliente titular, int agencia, double saldo) {
        this.saldo = saldo;
        this.id = SEQUENCIAL++;
        this.titular = titular;
        this.agencia = agencia;
    }
    
    @Override
    public void depositar(double val){
        saldo += val;
    }
    
    @Override
    public void sacar(double val){
        saldo -= val;
    }
    
    @Override
    public void transferir(double val, InterfaceConta destino){
       this.sacar(val);
       if(destino!= null){
            destino.depositar(val);
       }
    }
    
    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    
    public void printInfo(){
        this.titular.mostrarInfo();
        System.out.println("ID: " + this.id);
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Saldo: " + this.saldo);
    }

    /**
     * @return the agencia
     */
    public int getAgencia() {
        return agencia;
    }
}
