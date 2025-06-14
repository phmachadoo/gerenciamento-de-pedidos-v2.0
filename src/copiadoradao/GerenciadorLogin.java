
package copiadoradao;

import copiadoraview.MenuPrincipal;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerenciadorLogin {
   private static ArrayList<Login> log = new ArrayList<>();

    public static ArrayList<Login> getLog() {
        return log;
    }
   
   
   public boolean entrarLogin(Login login, MenuPrincipal mp){
       for (int i = 0; i < log.size(); i++) {
           String nome = "";
           if(log.get(i).getEmail().equals(login.getEmail()) 
                   && log.get(i).getSenha().equals(login.getSenha()) ){
               JOptionPane.showMessageDialog(null,"ACESSO LIBERADO!\n"
                       + "BEM-VINDO, " + log.get(i).getNome().toUpperCase()+"!");
               mp.chamarNome("<html>OLÁ,<br>"+ log.get(i).getNome().toUpperCase()+"!</html>");
               return true;  
           }
       }
   
   JOptionPane.showMessageDialog(null,"ACESSO NEGADO!\n"
           + "NÃO ENCONTRAMOS O SEU CADASTRO!\nTENTE NOVAMENTE."); 
   return false;
   
   }
   
   public boolean cadastrarLogin(Login login){
       String gmail = "@gmail.com";
       for (int i = 0; i < log.size(); i++) {
           if(log.get(i).getEmail().equals(login.getEmail()) 
                   && log.get(i).getSenha().equals(login.getSenha())){
                   JOptionPane.showMessageDialog(null,"NÃO FOI POSSIVEL COMPLETAR O CADASTRO,\n"
                           + "POIS JÁ EXISTE UM USUÁRIO COM AS MESMAS INFORMAÇÕES.\nTENTE NOVAMENTE.");
           return false;
           }
       }
       
       if(login.getSenha().length() >= 4 && login.getSenha().length() < 9 &&
               login.getEmail().contains(gmail)) 
       {JOptionPane.showMessageDialog(null,"VOCÊ FOI CADASTRADO!\n"
               + "BEM-VINDO, " + login.getNome().toUpperCase()+"!");
       log.add(login);
       return true;} else {
       JOptionPane.showMessageDialog(null, "POR FAVOR, O 'EMAIL' NECESSITA DE '@gmail.com' E\n"
               + "A SENHA DEVE CONTER DE 5 A 8 CARACTERES!");
       return false;
       }
       
       
   }
   
    
    
}
