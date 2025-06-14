
package copiadoradao;

import copiadoraview.MenuPrincipal;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerenciadorPedidosDao {
    private static ArrayList<PedidoDao> pedidos = new ArrayList<>(); 
    
    
    
      public GerenciadorPedidosDao() {
    }
      
        public static ArrayList<PedidoDao> getPedidos() {
        return pedidos;
    }

    
    public void adicionarPedido(PedidoDao pedido){
       pedidos.add(pedido); 
           }
      
 public void removerPedido(String nomeRemover, String telefone, MenuPrincipal mp){
     PedidoDao ped = new PedidoDao();
     
     for (int i = 0; i <pedidos.size(); i++) {
         if(pedidos.get(i).getCliente().getNome().toUpperCase().equals(nomeRemover.toUpperCase()) &&
            pedidos.get(i).getCliente().getTelefone().toUpperCase().equals(telefone.toUpperCase())){
             
             int resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover?");
             
             if(resposta == JOptionPane.YES_OPTION){
             pedidos.remove(i);
             mp.adicionarMensagem("Pedido removido com sucesso");
             System.out.println("Pedido removido com sucesso");
              break;
             } else if(resposta == JOptionPane.NO_OPTION){
              mp.adicionarMensagem("Não foi possivel remover o pedido");
               System.out.println("Não foi possivel remover o pedido");
             }
         }
         
        
     }
    
    }
    
  public void removerPedidoId(int id, MenuPrincipal mp){
     PedidoDao ped = new PedidoDao();
     
    for (int i = 0; i < pedidos.size(); i++) {
         if (pedidos.get(i).getId()==id) {
             
             int resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover?");
             
             if(resposta == JOptionPane.YES_OPTION){
             pedidos.remove(i);
             mp.adicionarMensagem("Pedido removido com sucesso");
                 System.out.println("Pedido removido com sucesso");
                 break;
             } else if(resposta == JOptionPane.NO_OPTION){
                 mp.adicionarMensagem("Não foi possivel remover o pedido");
                  System.out.println("Não foi possivel remover o pedido");
             }
         }
         
     }
  
  }
    
    public void atualizarPedidoId(int id,String status,MenuPrincipal mp){
        for (int i = 0; i < pedidos.size(); i++) {
            if(pedidos.get(i).getId() == id && status.equalsIgnoreCase("Concluido")){
            pedidos.get(i).setStatus(status);
            mp.adicionarMensagem("PEDIDO: " + pedidos.get(i).getCliente().getNome()+ ", " +
                    pedidos.get(i).getProduto().getQuantidade() +" "+
                    pedidos.get(i).getProduto().getNome() + 
                    " - " + pedidos.get(i).getStatus());
            break;
            } else if(pedidos.get(i).getId() == id && status.equalsIgnoreCase("Em produção")){
            pedidos.get(i).setStatus(status);
            mp.adicionarMensagem("PEDIDO: " + pedidos.get(i).getCliente().getNome()+ ", " +
                    pedidos.get(i).getProduto().getQuantidade() +" "+
                    pedidos.get(i).getProduto().getNome() + 
                    " - " + pedidos.get(i).getStatus());
            break;
            }
            else{
            mp.adicionarMensagem("Não foi possível modificar o status do pedido.");
            }
         
        }
    }
    
    public void atualizarPedido(String nome, String tel, String status, MenuPrincipal mp){
        for (int i = 0; i < pedidos.size(); i++) {
            if(pedidos.get(i).getCliente().getNome().toUpperCase().equals(nome.toUpperCase()) && 
                    pedidos.get(i).getCliente().getTelefone().toUpperCase().equals(tel.toUpperCase()) 
                    && status.equalsIgnoreCase("Concluido")){
        pedidos.get(i).setStatus(status);
        mp.adicionarMensagem("PEDIDO: " + pedidos.get(i).getCliente().getNome()+ ", " +
                    pedidos.get(i).getProduto().getQuantidade() +" "+
                    pedidos.get(i).getProduto().getNome() + 
                    " - " + pedidos.get(i).getStatus());
        break;
        }else if(pedidos.get(i).getCliente().getNome().toUpperCase().equals(nome.toUpperCase()) && 
                    pedidos.get(i).getCliente().getTelefone().toUpperCase().equals(tel.toUpperCase()) 
                && status.equalsIgnoreCase("Em produção")){
            pedidos.get(i).setStatus(status);
            mp.adicionarMensagem("PEDIDO: " + pedidos.get(i).getCliente().getNome()+ ", " +
                    pedidos.get(i).getProduto().getQuantidade() +" "+
                    pedidos.get(i).getProduto().getNome() + 
                    " - " + pedidos.get(i).getStatus());
            break;
        }else mp.adicionarMensagem("Não foi possível modificar o status do pedido.");
        }
    }
    
    
    
}

