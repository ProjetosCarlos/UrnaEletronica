
package telas;


public class CadastrarEleicao extends javax.swing.JFrame {

    
    public CadastrarEleicao() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        nomeEleicao = new javax.swing.JTextField();
        descricaoEleicao = new javax.swing.JTextField();
        lbEnderecoTela = new javax.swing.JLabel();
        lbNomedaeleicao = new javax.swing.JLabel();
        lbDescricao = new javax.swing.JLabel();
        lbVoltar = new javax.swing.JLabel();
        lbAddCargo = new javax.swing.JLabel();
        lbCriarEleicao = new javax.swing.JLabel();
        lbCargosCadastrados = new javax.swing.JLabel();
        lbCriarEleicaoNome = new javax.swing.JLabel();
        lbAdicionarCargo = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lbPlanodeFundo = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Eleição");
        getContentPane().setLayout(null);

        nomeEleicao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nomeEleicao.setForeground(new java.awt.Color(102, 102, 102));
        nomeEleicao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nomeEleicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeEleicaoActionPerformed(evt);
            }
        });
        getContentPane().add(nomeEleicao);
        nomeEleicao.setBounds(310, 150, 340, 30);

        descricaoEleicao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        descricaoEleicao.setForeground(new java.awt.Color(102, 102, 102));
        descricaoEleicao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(descricaoEleicao);
        descricaoEleicao.setBounds(310, 190, 340, 30);

        lbEnderecoTela.setFont(new java.awt.Font("Montserrat SemiBold", 0, 11)); // NOI18N
        lbEnderecoTela.setForeground(new java.awt.Color(255, 255, 255));
        lbEnderecoTela.setText("ADMINISTRADOR > CRIAR ELEIÇÃO");
        getContentPane().add(lbEnderecoTela);
        lbEnderecoTela.setBounds(10, 10, 210, 15);

        lbNomedaeleicao.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        lbNomedaeleicao.setForeground(new java.awt.Color(255, 255, 255));
        lbNomedaeleicao.setText("NOME:");
        getContentPane().add(lbNomedaeleicao);
        lbNomedaeleicao.setBounds(220, 140, 110, 50);

        lbDescricao.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        lbDescricao.setForeground(new java.awt.Color(255, 255, 255));
        lbDescricao.setText("DESCRIÇÃO:");
        getContentPane().add(lbDescricao);
        lbDescricao.setBounds(150, 190, 200, 40);

        lbVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/voltar.png"))); // NOI18N
        lbVoltar.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lbVoltarAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        lbVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbVoltarMouseClicked(evt);
            }
        });
        getContentPane().add(lbVoltar);
        lbVoltar.setBounds(790, 20, 38, 39);

        lbAddCargo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/mais.png"))); // NOI18N
        getContentPane().add(lbAddCargo);
        lbAddCargo.setBounds(20, 450, 40, 40);

        lbCriarEleicao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/mais.png"))); // NOI18N
        lbCriarEleicao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCriarEleicaoMouseClicked(evt);
            }
        });
        getContentPane().add(lbCriarEleicao);
        lbCriarEleicao.setBounds(650, 450, 40, 40);

        lbCargosCadastrados.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        lbCargosCadastrados.setForeground(new java.awt.Color(255, 255, 255));
        lbCargosCadastrados.setText("CARGOS CADASTRADOS");
        getContentPane().add(lbCargosCadastrados);
        lbCargosCadastrados.setBounds(360, 250, 190, 40);

        lbCriarEleicaoNome.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        lbCriarEleicaoNome.setForeground(new java.awt.Color(255, 255, 255));
        lbCriarEleicaoNome.setText("CRIAR ELEIÇÃO");
        getContentPane().add(lbCriarEleicaoNome);
        lbCriarEleicaoNome.setBounds(700, 450, 150, 40);

        lbAdicionarCargo.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        lbAdicionarCargo.setForeground(new java.awt.Color(255, 255, 255));
        lbAdicionarCargo.setText("ADICIONAR CARGO");
        getContentPane().add(lbAdicionarCargo);
        lbAdicionarCargo.setBounds(70, 450, 150, 40);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField1.setText("0");
        jTextField1.setBorder(null);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(560, 250, 30, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/CIRCULO BRANCO.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(550, 240, 50, 50);

        lbPlanodeFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Untitled-1.jpg"))); // NOI18N
        getContentPane().add(lbPlanodeFundo);
        lbPlanodeFundo.setBounds(0, -30, 960, 570);

        setSize(new java.awt.Dimension(867, 544));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomeEleicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeEleicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeEleicaoActionPerformed

    private void lbVoltarAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbVoltarAncestorAdded
         //new telaAdministrador().setVisible(true);        
    }//GEN-LAST:event_lbVoltarAncestorAdded

    private void lbVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbVoltarMouseClicked
        new telaAdministrador().setVisible(true);        
    }//GEN-LAST:event_lbVoltarMouseClicked

    private void lbCriarEleicaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCriarEleicaoMouseClicked
               // TODO add your handling code here:
    }//GEN-LAST:event_lbCriarEleicaoMouseClicked

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastrarEleicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarEleicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarEleicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarEleicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarEleicao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField descricaoEleicao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbAddCargo;
    private javax.swing.JLabel lbAdicionarCargo;
    private javax.swing.JLabel lbCargosCadastrados;
    private javax.swing.JLabel lbCriarEleicao;
    private javax.swing.JLabel lbCriarEleicaoNome;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbEnderecoTela;
    private javax.swing.JLabel lbNomedaeleicao;
    private javax.swing.JLabel lbPlanodeFundo;
    private javax.swing.JLabel lbVoltar;
    private javax.swing.JTextField nomeEleicao;
    // End of variables declaration//GEN-END:variables
}
