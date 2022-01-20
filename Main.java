
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente("001", "Venilton", "01234567890", "Rua Sem Saída, 100");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		System.out.println(venilton);
		
		System.out.println("");
		
		System.out.println(cc);
		
		System.out.println("");
		
		System.out.println(poupanca);
		//cc.imprimirExtrato();
		//poupanca.imprimirExtrato();
	}

}
