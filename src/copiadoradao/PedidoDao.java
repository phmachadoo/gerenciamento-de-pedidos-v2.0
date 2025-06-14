
package copiadoradao;

public class PedidoDao {
    private ClienteDao cliente;
    private ProdutoDao produto;
    private String status;
    private static int contador = 0;
    private int id;
    
    public PedidoDao(ClienteDao cliente, ProdutoDao produto,String status) {
        this.cliente = cliente;
        this.produto = produto;
        this.status = status;
        this.id = ++contador;
        System.out.println("Numero do id " +this.id);
    }

    
    public PedidoDao() {
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        PedidoDao.contador = contador;
    }

 
    public ClienteDao getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDao cliente) {
        this.cliente = cliente;
    }

    public ProdutoDao getProduto() {
        return produto;
    }

    public void setProduto(ProdutoDao produto) {
        this.produto = produto;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    

    @Override
    public String toString() {
        return   "Pedido: " +cliente + produto + "\nstatus=" + status + " | id=" + id+"\n";
    }

    
   
    
    
    
}
