public class Cliente {
    private String nome;
    public String getNome(){ return nome; }
    public void setNome(String novoNome){ this.nome = novoNome; }

    private String cpf;
    public String getCPF() { return cpf; }
    public void setCpf(String novoCpf) { this.cpf = novoCpf; }

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public String toString() {
        return "Cliente{" +
                "nome= '" + nome + '\'' + 
                ", cpf= '" + cpf + '\'' +
                '}';
    }
}
