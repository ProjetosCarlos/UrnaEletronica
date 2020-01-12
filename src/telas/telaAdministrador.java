/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;


public class telaAdministrador extends javax.swing.JFrame {
    public telaAdministrador() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        btCriarEleicao = new javax.swing.JButton();
        btCadastrarMesario = new javax.swing.JButton();
        btCadastrarAdministrador = new javax.swing.JButton();
        btResultadoEleicao = new javax.swing.JButton();
        lbVoltar = new javax.swing.JLabel();
        lbResultadoEleicao = new javax.swing.JLabel();
        lbCadastrarAdministrador = new javax.swing.JLabel();
        lbCasdastrarMesario = new javax.swing.JLabel();
        lbCriarEleicao = new javax.swing.JLabel();
        lbEditarPerfilAdimin = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        btCriarEleicao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cadastrar eleição.png"))); // NOI18N
        btCriarEleicao.setBorder(null);
        btCriarEleicao.setOpaque(false);
        btCriarEleicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCriarEleicaoActionPerformed(evt);
            }
        });
        getContentPane().add(btCriarEleicao);
        btCriarEleicao.setBounds(240, 200, 60, 60);

        btCadastrarMesario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/mesario.png"))); // NOI18N
        btCadastrarMesario.setBorder(null);
        btCadastrarMesario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarMesarioActionPerformed(evt);
            }
        });
        getContentPane().add(btCadastrarMesario);
        btCadastrarMesario.setBounds(240, 270, 60, 60);

        btCadastrarAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/mesario.png"))); // NOI18N
        btCadastrarAdministrador.setBorder(null);
        btCadastrarAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarAdministradorActionPerformed(evt);
            }
        });
        getContentPane().add(btCadastrarAdministrador);
        btCadastrarAdministrador.setBounds(240, 340, 60, 60);

        btResultadoEleicao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/resultado.png"))); // NOI18N
        btResultadoEleicao.setBorder(null);
        btResultadoEleicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResultadoEleicaoActionPerformed(evt);
            }
        });
        getContentPane().add(btResultadoEleicao);
        btResultadoEleicao.setBounds(240, 410, 60, 60);

        lbVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/voltar.png"))); // NOI18N
        lbVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbVoltarMouseClicked(evt);
            }
        });
        getContentPane().add(lbVoltar);
        lbVoltar.setBounds(800, 20, 38, 40);

        lbResultadoEleicao.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 24)); // NOI18N
        lbResultadoEleicao.setForeground(new java.awt.Color(255, 255, 255));
        lbResultadoEleicao.setText("RESULTADO ELEIÇÃO");
        lbResultadoEleicao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbResultadoEleicaoMouseClicked(evt);
            }
        });
        getContentPane().add(lbResultadoEleicao);
        lbResultadoEleicao.setBounds(310, 400, 290, 60);

        lbCadastrarAdministrador.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 24)); // NOI18N
        lbCadastrarAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        lbCadastrarAdministrador.setText("CADASTRAR ADMINISTRADOR");
        lbCadastrarAdministrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCadastrarAdministradorMouseClicked(evt);
            }
        });
        getContentPane().add(lbCadastrarAdministrador);
        lbCadastrarAdministrador.setBounds(310, 330, 400, 60);

        lbCasdastrarMesario.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 24)); // NOI18N
        lbCasdastrarMesario.setForeground(new java.awt.Color(255, 255, 255));
        lbCasdastrarMesario.setText("CADASTRAR MESÁRIO");
        lbCasdastrarMesario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCasdastrarMesarioMouseClicked(evt);
            }
        });
        getContentPane().add(lbCasdastrarMesario);
        lbCasdastrarMesario.setBounds(310, 260, 300, 60);

        lbCriarEleicao.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 24)); // NOI18N
        lbCriarEleicao.setForeground(new java.awt.Color(255, 255, 255));
        lbCriarEleicao.setText("CRIAR ELEIÇÃO");
        lbCriarEleicao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCriarEleicaoMouseClicked(evt);
            }
        });
        getContentPane().add(lbCriarEleicao);
        lbCriarEleicao.setBounds(310, 190, 290, 60);

        lbEditarPerfilAdimin.setFont(new java.awt.Font("Microsoft YaHei", 0, 13)); // NOI18N
        lbEditarPerfilAdimin.setForeground(new java.awt.Color(255, 255, 255));
        lbEditarPerfilAdimin.setText("EDITAR PERFIL");
        lbEditarPerfilAdimin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEditarPerfilAdiminMouseClicked(evt);
            }
        });
        getContentPane().add(lbEditarPerfilAdimin);
        lbEditarPerfilAdimin.setBounds(90, 210, 110, 15);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Untitled-1.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 70, 150, 140);

        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 55)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ADMINISTRADOR");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 100, 520, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Untitled-1.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -90, 860, 690);

        setSize(new java.awt.Dimension(867, 544));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCriarEleicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCriarEleicaoActionPerformed
        new CadastrarEleicao().setVisible(true);  ////evento botão criar Eleição
    }//GEN-LAST:event_btCriarEleicaoActionPerformed

    private void btCadastrarMesarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarMesarioActionPerformed
        new CadastrarMesario().setVisible(true); //evento botão cadastrat Mesario
    }//GEN-LAST:event_btCadastrarMesarioActionPerformed

    private void btCadastrarAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarAdministradorActionPerformed
        new CadastrarAdministrador().setVisible(true);    //evento botão cadastrat Administrador
    }//GEN-LAST:event_btCadastrarAdministradorActionPerformed

    private void btResultadoEleicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResultadoEleicaoActionPerformed
        new ResultadoEleicao().setVisible(true);// Evento botão resultado eleição
    }//GEN-LAST:event_btResultadoEleicaoActionPerformed

    private void lbVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbVoltarMouseClicked
        new TeladeLogIn().setVisible(true);   //voltar
    }//GEN-LAST:event_lbVoltarMouseClicked

    private void lbEditarPerfilAdiminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEditarPerfilAdiminMouseClicked
       new EditarPerfilAdmin().setVisible(true); // Editar Perfil Administrador
    }//GEN-LAST:event_lbEditarPerfilAdiminMouseClicked

    private void lbCriarEleicaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCriarEleicaoMouseClicked
       new CadastrarEleicao().setVisible(true);        
    }//GEN-LAST:event_lbCriarEleicaoMouseClicked

    private void lbCasdastrarMesarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCasdastrarMesarioMouseClicked
       new CadastrarMesario().setVisible(true);  
    }//GEN-LAST:event_lbCasdastrarMesarioMouseClicked

    private void lbCadastrarAdministradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCadastrarAdministradorMouseClicked
       new CadastrarAdministrador().setVisible(true); 
    }//GEN-LAST:event_lbCadastrarAdministradorMouseClicked

    private void lbResultadoEleicaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbResultadoEleicaoMouseClicked
       new ResultadoEleicao().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_lbResultadoEleicaoMouseClicked

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
            java.util.logging.Logger.getLogger(telaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrarAdministrador;
    private javax.swing.JButton btCadastrarMesario;
    private javax.swing.JButton btCriarEleicao;
    private javax.swing.JButton btResultadoEleicao;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbCadastrarAdministrador;
    private javax.swing.JLabel lbCasdastrarMesario;
    private javax.swing.JLabel lbCriarEleicao;
    private javax.swing.JLabel lbEditarPerfilAdimin;
    private javax.swing.JLabel lbResultadoEleicao;
    private javax.swing.JLabel lbVoltar;
    // End of variables declaration//GEN-END:variables
}
