public class Main {
    public static void main(String[] args) throws Exception {
        Cliente ana = new Cliente("Ana", "653.970.550-51");
        Cliente fred = new Cliente("Fred", "901.346.788-77");

        Conta ccAna = new ContaPoupanca(ana);
        Conta poupFred = new ContaPoupanca(fred);


        ccAna.depositar(200.00);
        ccAna.sacar(10);
        ccAna.imprimirExtrato();
        System.out.println("\n");
        poupFred.imprimirExtrato();
        ccAna.transferir(poupFred, 20);
        poupFred.imprimirExtrato();
    }
}
