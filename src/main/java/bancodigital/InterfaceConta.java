package bancodigital;

public interface InterfaceConta {
    
    void depositar(double val);
    
    void sacar(double val);
    
    void transferir(double val, InterfaceConta destino);
    
    void imprimirExtrato();
}
