package bancodigital;

public class Cliente {
    private String nome;
    private final String CPF;

    public Cliente(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }


    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCPF() {
        return CPF;
    }

    
    public void mostrarInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.CPF);
    }
}
