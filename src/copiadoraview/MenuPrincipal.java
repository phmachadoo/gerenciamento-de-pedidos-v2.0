package copiadoraview;
import copiadoradao.ClienteDao;
import copiadoradao.GerenciadorPedidosDao;
import copiadoradao.PedidoDao;
import copiadoradao.ProdutoDao;
import copiadoraview.MenuView;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MenuPrincipal extends javax.swing.JFrame {
GerenciadorPedidosDao gpd = new GerenciadorPedidosDao();    


public void adicionarMensagem (String mensagem){
txtArea.setText(mensagem);
}

public void chamarNome(String nome){
labelBemVindo.setText(nome);
}

    public MenuPrincipal() {
        initComponents();
        setResizable(false);
    }
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTelCliente = new javax.swing.JTextField();
        txtEmailCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTipoServico = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnAdicionar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAtualizar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        labelBemVindo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("NOME DO CLIENTE:");

        txtNomeCliente.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtNomeCliente.setForeground(new java.awt.Color(0, 0, 102));
        txtNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeClienteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("TELEFONE DO CLIENTE:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("EMAIL DO CLIENTE:");

        txtTelCliente.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtTelCliente.setForeground(new java.awt.Color(0, 0, 102));

        txtEmailCliente.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtEmailCliente.setForeground(new java.awt.Color(0, 0, 102));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("TIPO DE SERVIÇO:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("QUANTIDADE:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("PREÇO:");

        txtTipoServico.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtTipoServico.setForeground(new java.awt.Color(0, 0, 102));

        txtQuantidade.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtQuantidade.setForeground(new java.awt.Color(0, 0, 102));

        txtPreco.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtPreco.setForeground(new java.awt.Color(0, 0, 102));

        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtArea.setForeground(new java.awt.Color(0, 0, 102));
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        btnAdicionar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnAdicionar.setForeground(new java.awt.Color(0, 0, 102));
        btnAdicionar.setText("ADICIONAR");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnRemover.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnRemover.setForeground(new java.awt.Color(0, 0, 102));
        btnRemover.setText("REMOVER");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnListar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnListar.setForeground(new java.awt.Color(0, 0, 102));
        btnListar.setText("LISTAR PEDIDOS");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LOGO.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("DESCRIÇÃO:");

        btnAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(0, 0, 102));
        btnAtualizar.setText("ATUALIZAR PEDIDOS");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnSair.setForeground(new java.awt.Color(0, 0, 102));
        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        txtDescricao.setColumns(20);
        txtDescricao.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtDescricao.setForeground(new java.awt.Color(0, 0, 102));
        txtDescricao.setRows(5);
        jScrollPane2.setViewportView(txtDescricao);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("ID:");

        txtID.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtID.setForeground(new java.awt.Color(0, 0, 102));
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setText("STATUS:");

        txtStatus.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtStatus.setForeground(new java.awt.Color(0, 0, 102));

        labelBemVindo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelBemVindo.setForeground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(4, 4, 4))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNomeCliente)
                                    .addComponent(txtTelCliente)
                                    .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTipoServico)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPreco, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                                    .addComponent(txtQuantidade))
                                .addGap(2, 2, 2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(txtID))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAdicionar)
                        .addGap(32, 32, 32)
                        .addComponent(btnRemover)
                        .addGap(37, 37, 37)
                        .addComponent(btnListar)
                        .addGap(27, 27, 27)
                        .addComponent(btnAtualizar)
                        .addGap(60, 60, 60))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel10))
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnRemover)
                    .addComponent(btnListar)
                    .addComponent(btnAtualizar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeClienteActionPerformed
        
    }//GEN-LAST:event_txtNomeClienteActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
    String nomeCliente = txtNomeCliente.getText();
    String telCliente = txtTelCliente.getText();
    String emailCliente = txtEmailCliente.getText();
    String tipoServico = txtTipoServico.getText();
    String descricao = txtDescricao.getText();
    String strPreco = txtPreco.getText();
    String strQuantidade = txtQuantidade.getText();
        
      if(nomeCliente.isEmpty() || telCliente.isEmpty()||
              tipoServico.isEmpty() || descricao.isEmpty() ||
              strQuantidade.isEmpty() || strPreco.isEmpty()){
          
          txtArea.setText("POR FAVOR, PREENCHA OS CAMPOS!");
          
      }else{
        
        int resposta = JOptionPane.showConfirmDialog
        (null,"CLIENTE EFETUOU O PAGAMENTO?","Confirmação",JOptionPane.YES_NO_CANCEL_OPTION);
    
        if(resposta == JOptionPane.YES_OPTION){
            
            try {
            int quantidade = Integer.parseInt(strQuantidade);
            float preco = Float.parseFloat(strPreco);
            
            ClienteDao cliente = new ClienteDao(nomeCliente,telCliente,emailCliente);   
            ProdutoDao produto = new ProdutoDao(tipoServico,descricao,preco,quantidade);
            PedidoDao pedido = new PedidoDao(cliente,produto,"");
            float soma = preco*quantidade;
            gpd.adicionarPedido(pedido);
            
            pedido.setStatus("em produção.");
            txtArea.setText("Pedido " + pedido.getStatus() + " O valor total será de R$ " + soma + " reais." );
            
            txtNomeCliente.setText("");
            txtTelCliente.setText("");
            txtEmailCliente.setText("");
            txtTipoServico.setText("");
            txtDescricao.setText("");
            txtPreco.setText("");
            txtQuantidade.setText("");
            
            } catch (Exception e) {
               JOptionPane.showMessageDialog(null,"ERRO: QUANTIDADE E PREÇO NÃO PODEM SER CARACTERES, DEVEM SER NÚMEROS."); 
            }}
        
        else if(resposta == JOptionPane.NO_OPTION){
            
             try {
            int quantidade = Integer.parseInt(strQuantidade);
            float preco = Float.parseFloat(strPreco);
            float soma = preco*quantidade;
            ClienteDao cliente = new ClienteDao(nomeCliente,telCliente,emailCliente);   
            ProdutoDao produto = new ProdutoDao(tipoServico,descricao,preco,quantidade);
            PedidoDao pedido = new PedidoDao(cliente,produto,"");
            gpd.adicionarPedido(pedido);
            
            pedido.setStatus("aguardando pagamento.");
            txtArea.setText("Pedido " + pedido.getStatus() + " O valor total será de R$ " + soma + " reais." );
            
            txtNomeCliente.setText("");
            txtTelCliente.setText("");
            txtEmailCliente.setText("");
            txtTipoServico.setText("");
            txtDescricao.setText("");
            txtPreco.setText("");
            txtQuantidade.setText("");
            
            
                
            
            
            } catch (Exception e) {
               JOptionPane.showMessageDialog(null,"ERRO: QUANTIDADE E PREÇO NÃO PODEM SER CARACTERES, DEVEM SER NÚMEROS."); 
            }
        } 
      }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
    
 
    //precisa verificar a questao do trycatch. 
    //os 3 campos estiverem em brancos do 'o campo do id preciisa ser preenchido'
    String nome = txtNomeCliente.getText().toUpperCase();
    String tel = txtTelCliente.getText().toUpperCase();
    String strId = txtID.getText();
     
        if (nome.isEmpty() && tel.isEmpty() && strId.isEmpty()) {
            txtArea.setText("Preencha os campos necessários para a remoção.".toUpperCase());
        }else if(!nome.isEmpty() && !tel.isEmpty() && strId.isEmpty()){
                 gpd.removerPedido(nome, tel, this);
        } else if(nome.isEmpty() && tel.isEmpty() && !strId.isEmpty()){
            try {
                int id = Integer.parseInt(strId);
                 gpd.removerPedidoId(id,this);
            } catch (Exception e) {
               txtArea.setText("Id precisa ser números.");
            }
        } else txtArea.setText("Dados inválidos");
        
        
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
       String nome = txtNomeCliente.getText();
       
       if(nome.isEmpty()){
       txtArea.setText(gpd.getPedidos().toString());
       txtNomeCliente.setText("");
       } else{
           StringBuilder sb = new StringBuilder("Pedido(s) encontrado(s) no nome ".toUpperCase() + nome+":\n");
           for (int i = 0; i < gpd.getPedidos().size(); i++) {
               if (gpd.getPedidos().get(i).getCliente().getNome().toUpperCase().contains(nome.toUpperCase())) {
                  
               sb.append("NOME: "+gpd.getPedidos().get(i).getCliente().getNome().toUpperCase() +", TEL:"+ 
                       gpd.getPedidos().get(i).getCliente().getTelefone().toUpperCase() + " ,SERVIÇO: "+
                       gpd.getPedidos().get(i).getProduto().getQuantidade() + " "+
                       gpd.getPedidos().get(i).getProduto().getNome().toUpperCase()).append(",\n");
               }
           }
           txtArea.setText(sb.toString());
           txtNomeCliente.setText("");
       
       }
   
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        MenuView menu = new MenuView();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
    String nomeCliente = txtNomeCliente.getText().toUpperCase();
    String telCliente = txtTelCliente.getText().toUpperCase();
    String id = txtID.getText();
    String status = txtStatus.getText();
        
        if(nomeCliente.isEmpty() && telCliente.isEmpty() && id.isEmpty() && status.isEmpty()){
        
     txtArea.setText("POR FAVOR, PREENCHA OS CAMPOS!");
     
    } else if(!nomeCliente.isEmpty() && !telCliente.isEmpty() && id.isEmpty() && !status.isEmpty()){
            txtNomeCliente.setText("");
            txtTelCliente.setText("");
            txtID.setText("");
            txtStatus.setText("");
            gpd.atualizarPedido(nomeCliente, telCliente, status, this);

} else if(nomeCliente.isEmpty() && telCliente.isEmpty() && !id.isEmpty() && !status.isEmpty()){
        try {
                int identificador = Integer.parseInt(id);
                
            gpd.atualizarPedidoId(identificador, status, this);
            txtNomeCliente.setText("");
            txtTelCliente.setText("");
            txtID.setText("");
            txtStatus.setText("");
                
            } catch (Exception e) {
               txtArea.setText("ERRO: ID NÃO DEVE SER CARACTERES, DEVE SER NÚMEROS."); 
            }
        } else txtArea.setText("DADOS INVÁLIDOS");
        

    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelBemVindo;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtEmailCliente;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtTelCliente;
    private javax.swing.JTextField txtTipoServico;
    // End of variables declaration//GEN-END:variables

}