
package copiadoradao;

public class ClienteDao {
    private String nome,telefone,email;

    public ClienteDao(){}
    
    public ClienteDao(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    @Override
    public String toString() {
        return "nome=" + nome + " | telefone=" + telefone + " | email=" + email+"|\n";
    }
    
    
    
    
    
    
    
}
