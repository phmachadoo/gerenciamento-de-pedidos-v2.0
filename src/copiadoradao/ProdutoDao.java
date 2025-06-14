
package copiadoradao;

public class ProdutoDao {
    private String nome, descricao;
    private float preco;
    private int quantidade;
    

    public ProdutoDao() {
    }

    public ProdutoDao(String nome, String descricao, float preco, int quantidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

   
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Serviço=" + nome + " | descricao=" + descricao + " | preco=" + preco + " | quantidade=" + quantidade;
    }

   
    
    
    
    
    
    
}
