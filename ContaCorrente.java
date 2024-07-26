public class ContaCorrente extends Conta {
    private static int SEQUENCIAL = 1;

    public ContaCorrente(Cliente cliente) {
		super(cliente);
        super.conta = SEQUENCIAL++;
	}
    public void imprimirExtrato(){
        System.out.println("-- Extrato Conta Corrente--");
        super.imprimirInfo();
    }
}
