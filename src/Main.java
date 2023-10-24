public class Main {

	public static void main(String[] args) {
		Cliente fabricio = new Cliente();
		fabricio.setNome("Fabricio");
		
		Conta cc = new ContaCorrente(fabricio);
		Conta poupanca = new ContaPoupanca(fabricio);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
