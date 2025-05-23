package bancodigital;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco("Banco Digital");
        System.out.println("Bem vindo ao " + banco.getNome());
        Scanner scanner = new Scanner(System.in);
        int option, agencia, tipoConta, numConta, numConta2;
        double saldo, val;
        String nomeCliente, cpfCliente;
        while(true){
            System.out.println(" ");
            System.out.println("Opcoes:");
            System.out.println("1.Criar conta");
            System.out.println("2.Depositar valor em conta");
            System.out.println("3.Sacar valor de conta");
            System.out.println("4.Imprimir extrato de conta");
            System.out.println("5.Transferir valor entre contas");
            System.out.println("6.Sair");
            System.out.print("Digite o numero da opcao que deseja:");
            option = scanner.nextInt();
            scanner.nextLine();
            if(option == 6){
                break;
            }
            switch(option){
                case(1):
                    System.out.print("Digite o nome do titular:");
                    nomeCliente = scanner.nextLine();
                    System.out.print("Digite o CPF do titular:");
                    cpfCliente = scanner.nextLine();
                    System.out.print("Digite o numero da agencia:");
                    agencia = scanner.nextInt();
                    System.out.print("Digite o saldo inicial a ser inserido:");
                    saldo = scanner.nextDouble();
                    while(true){
                        System.out.print("Insira 1 se a conta for corrente, e 2 se for uma conta poupança:");
                        tipoConta = scanner.nextInt();
                        if(tipoConta == 1){
                            banco.addContaCorrente(new Cliente(nomeCliente, cpfCliente), agencia, saldo);  
                            break;
                        }
                        else if(tipoConta == 2){
                            banco.addContaPoupanca(new Cliente(nomeCliente, cpfCliente), agencia, saldo);
                            break;
                        }
                        else{
                           System.out.println("Tipo de conta invalido.");
                        }
                    }
                    break;
                case(2):
                    System.out.print("Digite o numero da conta:");
                    numConta = scanner.nextInt();
                    System.out.print("Informe o valor a ser inserido:");
                    val = scanner.nextDouble();
                    banco.getConta(numConta).depositar(val);
                    break;
                case(3):
                    System.out.print("Digite o numero da conta:");
                    numConta = scanner.nextInt();
                    System.out.print("Informe o valor a ser sacado:");
                    val = scanner.nextDouble();
                    banco.getConta(numConta).sacar(val);
                    break;
                case(4):
                    System.out.print("Digite o numero da conta:");
                    numConta = scanner.nextInt();
                    banco.getConta(numConta).imprimirExtrato();
                    break;
                case(5):
                    System.out.print("Digite o numero da conta de origem:");
                    numConta = scanner.nextInt();
                    System.out.print("Digite o numero da conta de destino:");
                    numConta2 = scanner.nextInt();
                    System.out.print("Informe o valor a ser transferido:");
                    val = scanner.nextDouble();
                    banco.getConta(numConta).transferir(val, banco.getConta(numConta2));
                    break;
                default:
                    System.out.println("Operacao invalida.");
                    break;
            }
        }
    }
}
