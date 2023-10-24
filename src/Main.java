import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cliente fabricio = new Cliente();
        fabricio.setNome("Fabricio");

        Conta cc = new ContaCorrente(fabricio);
        Conta poupanca = new ContaPoupanca(fabricio);

        cc.depositar(1000);
        cc.imprimirExtrato();

        poupanca.depositar(100);
        poupanca.imprimirExtrato();

        // Menu de operações
        while (true) {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Sacar");
            System.out.println("2. Transferir");
            System.out.println("3. Sair");

            int escolha = Integer.parseInt(scanner.nextLine());

            switch (escolha) {
                case 1:
                    System.out.println("Digite o valor para sacar da Conta Corrente:");
                    double valorSaque = Double.parseDouble(scanner.nextLine());
                    cc.sacar(valorSaque);
                    cc.imprimirExtrato();
                    break;
                case 2:
                    System.out.println("Digite o valor para transferir da Conta Corrente para a Poupança:");
                    double valorTransferencia = Double.parseDouble(scanner.nextLine());
                    cc.transferir(valorTransferencia, poupanca);
                    cc.imprimirExtrato();
                    poupanca.imprimirExtrato();
                    break;
                case 3:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
