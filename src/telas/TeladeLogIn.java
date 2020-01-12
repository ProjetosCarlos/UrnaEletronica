
package telas;

//import Mesario.telaMesario;
import javax.swing.JOptionPane;


public class TeladeLogIn extends javax.swing.JFrame {

   
    public TeladeLogIn() {
        initComponents();
    }

    public boolean checkLogin (String login, String senha){  //Criação do metodo para senha e username
    return login.equals("administrador") && senha.equals("123"); //|| login.equals("mesario1") && senha.equals(""); //retorno do metodo criado com os dados do login
    }
       
    @SuppressWarnings("unchecked") //modulo gráfico
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/entrar botão.png"))); // NOI18N
        jButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton1.setMaximumSize(new java.awt.Dimension(0, 21));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(350, 370, 130, 30);

        txtUserName.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        txtUserName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUserName.setText("USERNAME");
        getContentPane().add(txtUserName);
        txtUserName.setBounds(290, 280, 250, 30);

        txtSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSenha.setText("sssssssss");
        getContentPane().add(txtSenha);
        txtSenha.setBounds(290, 320, 250, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Untitled-1.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(340, 110, 150, 140);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Untitled-1.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -90, 1010, 680);

        setSize(new java.awt.Dimension(867, 544));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  
        if (this.checkLogin(txtUserName.getText(), new String (txtSenha.getPassword()))){  //botão de log
            new telaAdministrador().setVisible(true) ; //redirecionamento para tela de admin apos senha 
            this.dispose();
            /*new telaMesario().setVisible(true);
              this.dispose();   
              }else if (this.checkLogin(txtUserName.getText(), new String (txtSenha.getPassword())){
              new telaMesario().setVisible(true);
             this.dispose();*/
        }else{
            JOptionPane.showMessageDialog(null, "Dados não Conferem");//mensagem de erro apos os dados de logs terem sido digitado errado.
        }   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        new telaAdministrador().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    
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
            java.util.logging.Logger.getLogger(TeladeLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeladeLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeladeLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeladeLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeladeLogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
