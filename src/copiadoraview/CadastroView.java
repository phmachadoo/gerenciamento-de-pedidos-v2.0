/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package copiadoraview;

import copiadoradao.GerenciadorLogin;
import copiadoradao.Login;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author TERMINAL 2
 */
public class CadastroView extends javax.swing.JFrame {

    GerenciadorLogin glogin = new GerenciadorLogin();
    int contador = 0;
    public CadastroView() {
        initComponents();
        setResizable(false);
        btnInfoEmail.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseEntered(MouseEvent e){
        btnInfoEmail.setToolTipText("O EMAIL DEVE CONTER '@GMAIL.COM'");
        }});
        
        btnInfoSenha.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e){
        btnInfoSenha.setToolTipText("A SENHA DEVE CONTER DE 4 A 8 CARACTERES");
        }});
        }
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jNome = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        jEmail = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        jSenha = new javax.swing.JLabel();
        textSenha = new javax.swing.JPasswordField();
        btnCadastrar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnInfoEmail = new javax.swing.JButton();
        btnInfoSenha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("CADASTRO");

        jNome.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jNome.setForeground(new java.awt.Color(0, 0, 102));
        jNome.setText("NOME:");

        textNome.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        textNome.setForeground(new java.awt.Color(0, 0, 102));
        textNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeActionPerformed(evt);
            }
        });

        jEmail.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jEmail.setForeground(new java.awt.Color(0, 0, 102));
        jEmail.setText("EMAIL:");

        textEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        textEmail.setForeground(new java.awt.Color(0, 0, 102));

        jSenha.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jSenha.setForeground(new java.awt.Color(0, 0, 102));
        jSenha.setText("SENHA:");

        textSenha.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        textSenha.setForeground(new java.awt.Color(0, 0, 102));

        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(0, 0, 102));
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(0, 0, 102));
        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnInfoEmail.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        btnInfoEmail.setForeground(new java.awt.Color(0, 0, 102));
        btnInfoEmail.setText("i");

        btnInfoSenha.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        btnInfoSenha.setForeground(new java.awt.Color(0, 0, 102));
        btnInfoSenha.setText("i");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCadastrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSenha)
                            .addComponent(jNome)
                            .addComponent(jEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnInfoSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInfoEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(103, 103, 103))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNome))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jEmail)
                            .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInfoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSenha)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(btnInfoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnVoltar))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeActionPerformed
    }//GEN-LAST:event_textNomeActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String nome = textNome.getText();
        String email = textEmail.getText();
        String senha = textSenha.getText();
        Login log = new Login(nome,email,senha);
        
        
        if(nome.isEmpty() && email.isEmpty() && senha.isEmpty()){
        JOptionPane.showMessageDialog(null,"POR FAVOR, PREENCHA OS CAMPOS!");
        } else{
        if(glogin.cadastrarLogin(log)){
        MenuView menu = new MenuView();
        menu.setVisible(true);
        dispose();}}
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
        MenuView mv = new MenuView();
        mv.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroView().setVisible(true);
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnInfoEmail;
    private javax.swing.JButton btnInfoSenha;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jEmail;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jNome;
    private javax.swing.JLabel jSenha;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textNome;
    private javax.swing.JPasswordField textSenha;
    // End of variables declaration//GEN-END:variables
}
