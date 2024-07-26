public abstract class Conta implements IConta{
    protected static final int CONTA_PADRAO = 1;
    
    protected int agencia, conta;
    protected double saldo;
    private Cliente cliente;


    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0;
        this.agencia = Conta.CONTA_PADRAO;
    }

    public int getAgencia(){ return agencia; }
    public int getConta(){ return conta; }
    public double getSaldo(){ return saldo; }

    public void sacar(double valor){
        this.saldo -= valor; 
    }
    public void depositar(double valor){
        this.saldo += valor; 
    }
    public void transferir(Conta contaDestinatario, double valor){
        this.sacar(valor);
        contaDestinatario.depositar(valor);
    }
    protected void imprimirInfo(){
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.getAgencia()));
        System.out.println(String.format("Numero da Conta: %d", this.getConta()));
        System.out.println(String.format("Saldo: %.2f", this.getSaldo()));
    }
}
