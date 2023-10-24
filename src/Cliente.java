public class Cliente {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;

    public Cliente(String nome, String endereco, String telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    // Construtor vazio
    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Método para atualizar informações de contato
    public void atualizarInformacoesDeContato(String novoEndereco, String novoTelefone, String novoEmail) {
        if (novoEndereco != null) {
            this.endereco = novoEndereco;
        }
        if (novoTelefone != null) {
            this.telefone = novoTelefone;
        }
        if (novoEmail != null) {
            this.email = novoEmail;
        }
    }
}
