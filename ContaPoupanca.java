public class ContaPoupanca extends Conta{
    private static int SEQUENCIAL = 100;

    public ContaPoupanca(Cliente cliente) {
		super(cliente);
        super.conta = SEQUENCIAL++;
	}

    public void imprimirExtrato(){
        System.out.println("-- Extrato Conta Poupança --");
        super.imprimirInfo();
    }
}
