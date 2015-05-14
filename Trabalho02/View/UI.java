/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controle;
import Model.Pessoa;
import java.awt.Color;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author usuario
 */
public class UI extends javax.swing.JFrame {

    /**
     * Creates new form UI
     */
    private final Controle controlador = Controle.getControle();

    private String cpf, nome, email;
    private Integer rg;
    
    private final String[] opcoesAviso = {"Sim", "Não"};

    public UI() {
        setLocation(400, 50);
        setTitle("Banco de Pessoas");
        initComponents();

        try {
            controlador.recuperarPessoas();
            jTAConsole.setText("Os dados foram recuperados!");
            controlador.addPessoaCB(jCBPessoas);
        } catch (IOException ioe) {
            jTAConsole.setText("Não existem registros!!");
        } catch (ClassNotFoundException cnf) {
            jTAConsole.setText("ClassNotFoundException");
        }
    }

    public void limpaCampos() {
        jTFNomeCadastro.setText("");
        jTFCPFCadastro.setText("");
        jTFRGCadastro.setText("");
        jTFEmail.setText("");
        
        jTFNomePesquisa.setText("");
        jTFCPFPesquisa.setText("");
        jTFRGPesquisa.setText("");
        jTFEmailPesquisa.setText("");
    }

    public void habilitaCampos(JTextField jTA) {
        jTA.setEditable(true);
        jTA.setBackground(Color.white);
    }

    public void desabilitaCampos(JTextField jTA) {
        jTA.setEditable(false);
        jTA.setBackground(new java.awt.Color(210, 210, 210));
    }
    
    private int criaAviso(String message, String[] options) {
        return JOptionPane.showOptionDialog(this, message, "Registro de Pessoas", 0, JOptionPane.WARNING_MESSAGE, null, options,
                options[0]);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAConsole = new javax.swing.JTextArea();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFNomeCadastro = new javax.swing.JTextField();
        jTFCPFCadastro = new javax.swing.JTextField();
        jTFRGCadastro = new javax.swing.JTextField();
        jTFEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBCadastra = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jCBPessoas = new javax.swing.JComboBox();
        jTFNomePesquisa = new javax.swing.JTextField();
        jTFCPFPesquisa = new javax.swing.JTextField();
        jTFRGPesquisa = new javax.swing.JTextField();
        jTFEmailPesquisa = new javax.swing.JTextField();
        jBAltera = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jBSalvaAlteracao = new javax.swing.JButton();
        jBExcluiPessoa = new javax.swing.JButton();
        jBSalva = new javax.swing.JButton();
        jBExibeRegistro = new javax.swing.JButton();
        jBExcluiRegistro = new javax.swing.JButton();

        jButton2.setText("jButton2");

        jScrollPane2.setViewportView(jTree1);

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTAConsole.setEditable(false);
        jTAConsole.setBackground(new java.awt.Color(195, 195, 195));
        jTAConsole.setColumns(20);
        jTAConsole.setLineWrap(true);
        jTAConsole.setRows(5);
        jTAConsole.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(jTAConsole);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Nome:");

        jLabel2.setText("CPF:");

        jLabel3.setText("RG:");

        jLabel4.setText("Email:");

        jBCadastra.setText("Cadastrar");
        jBCadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTFRGCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(jTFCPFCadastro))
                            .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jBCadastra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFCPFCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFRGCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBCadastra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Cadastro", jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jCBPessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBPessoasActionPerformed(evt);
            }
        });

        jTFNomePesquisa.setEditable(false);
        jTFNomePesquisa.setBackground(new java.awt.Color(210, 210, 210));

        jTFCPFPesquisa.setEditable(false);
        jTFCPFPesquisa.setBackground(new java.awt.Color(210, 210, 210));

        jTFRGPesquisa.setEditable(false);
        jTFRGPesquisa.setBackground(new java.awt.Color(210, 210, 210));

        jTFEmailPesquisa.setEditable(false);
        jTFEmailPesquisa.setBackground(new java.awt.Color(210, 210, 210));

        jBAltera.setText("Alterar Dados");
        jBAltera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlteraActionPerformed(evt);
            }
        });

        jLabel5.setText("Pessoas Registradas");

        jLabel6.setText("Nome:");

        jLabel7.setText("CPF:");

        jLabel8.setText("RG:");

        jLabel9.setText("Email:");

        jBSalvaAlteracao.setText("Salvar Alterações");
        jBSalvaAlteracao.setEnabled(false);
        jBSalvaAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvaAlteracaoActionPerformed(evt);
            }
        });

        jBExcluiPessoa.setText("Excluir Pessoa");
        jBExcluiPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluiPessoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jBAltera)
                        .addGap(55, 55, 55)
                        .addComponent(jBSalvaAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCBPessoas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFNomePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFCPFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFRGPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFEmailPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(54, 54, 54)
                .addComponent(jBExcluiPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addGap(2, 2, 2)
                .addComponent(jCBPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNomePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCPFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFRGPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFEmailPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAltera)
                    .addComponent(jBSalvaAlteracao)
                    .addComponent(jBExcluiPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Pesquisa", jPanel3);

        jBSalva.setText("Salvar Dados");
        jBSalva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvaActionPerformed(evt);
            }
        });

        jBExibeRegistro.setText("Exibir Registro");
        jBExibeRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExibeRegistroActionPerformed(evt);
            }
        });

        jBExcluiRegistro.setText("Excluir Registros");
        jBExcluiRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluiRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBExibeRegistro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSalva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBExcluiRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBExcluiRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBExibeRegistro)
                        .addComponent(jBSalva, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastraActionPerformed
        nome = jTFNomeCadastro.getText();
        cpf = jTFCPFCadastro.getText();
        rg = Integer.parseInt(jTFRGCadastro.getText());
        email = jTFEmail.getText();

        try {
            controlador.criaPessoa(nome, cpf, rg, email);
            jCBPessoas.addItem(controlador.getPessoa(cpf));
            controlador.salvarPessoas();

            jTAConsole.setText("Pessoa " + nome + " registrada, com CPF "
                    + cpf);
        } catch (NumberFormatException nFE) {
            jTAConsole.setText("Não foi possível concluir o cadastro! Tipo inválido de informação!");
        } catch (NullPointerException nPE) {
            jTAConsole.setText("Não foi possível concluir o cadastro! Informações pendentes!");
        } catch (IllegalArgumentException iAE) {
            jTAConsole.setText(iAE.getMessage());
        } catch (IOException ex) {
            jTAConsole.setText("Não foi possível salvar os dados no arquivo!");
        }


        limpaCampos();

    }//GEN-LAST:event_jBCadastraActionPerformed

    private void jBExibeRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExibeRegistroActionPerformed
        String str = controlador.imprimePessoas();

        jTAConsole.setText(str);
    }//GEN-LAST:event_jBExibeRegistroActionPerformed

    private void jBExcluiRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluiRegistroActionPerformed
        int resposta = criaAviso("Deseja realmente excluir todos os registros?", opcoesAviso);
        
        if(resposta == 0){
            try {
                controlador.excluirDados();
                jCBPessoas.removeAllItems();
                limpaCampos();
                jTAConsole.setText("Registro excluido com sucesso!");
            } catch (IOException ex) {
                jTAConsole.setText("Não existem registros!");
            }
        }
    }//GEN-LAST:event_jBExcluiRegistroActionPerformed

    private void jBAlteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlteraActionPerformed
        habilitaCampos(jTFNomePesquisa);
        habilitaCampos(jTFCPFPesquisa);
        habilitaCampos(jTFRGPesquisa);
        habilitaCampos(jTFEmailPesquisa);

        jBSalvaAlteracao.setEnabled(true);
    }//GEN-LAST:event_jBAlteraActionPerformed

    private void jCBPessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBPessoasActionPerformed
        Pessoa p = controlador.selecionaPessoaCB(jCBPessoas);
       
        if (p != null) {
            Pessoa p = controlador.selecionaPessoaCB(jCBPessoas);
            nome = p.getNome();
            cpf = p.getCpf();
            email = p.getEmail();
            rg = p.getRg();
        
            try {
                jTFNomePesquisa.setText(nome);
                jTFCPFPesquisa.setText(cpf);
                jTFRGPesquisa.setText(rg.toString());
                jTFEmailPesquisa.setText(email);
    
            } catch (IllegalArgumentException iAE) {
                jTAConsole.setText(iAE.getMessage());
            }
        }
        jCBPessoas.setSelectedItem(0);
    }//GEN-LAST:event_jCBPessoasActionPerformed

    private void jBSalvaAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvaAlteracaoActionPerformed

        Pessoa p = controlador.selecionaPessoaCB(jCBPessoas);
        try {
            controlador.alteraPessoa(p.getCpf(),
                    jTFNomePesquisa.getText(),
                    jTFCPFPesquisa.getText(),
                    Integer.parseInt(jTFRGPesquisa.getText()),
                    jTFEmailPesquisa.getText());
            controlador.salvarPessoas();
            jTAConsole.setText(p.getNome() + " alterado com sucesso!");
            
        } catch (IllegalArgumentException iAE) {
            jTAConsole.setText(iAE.getMessage());
        } catch (IOException ex) {
            jTAConsole.setText("Não foi possível salvar os dados no arquivo!");
        }
        desabilitaCampos(jTFNomePesquisa);
        desabilitaCampos(jTFCPFPesquisa);
        desabilitaCampos(jTFRGPesquisa);
        desabilitaCampos(jTFEmailPesquisa);
        jBSalvaAlteracao.setEnabled(false);
    }//GEN-LAST:event_jBSalvaAlteracaoActionPerformed

    private void jBExcluiPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluiPessoaActionPerformed
        Pessoa p = controlador.selecionaPessoaCB(jCBPessoas);

        try {
            controlador.excluiPessoa(p.getCpf());
            controlador.deletaPessoaCB(jCBPessoas, p);
            controlador.salvarPessoas();
            jTAConsole.setText("Pessoa excluida com sucesso!");
        } catch (IOException ioe) {
            jTAConsole.setText("Não foi possível realizar a tarefa!");
        } catch (IllegalArgumentException iAE){
            jTAConsole.setText(iAE.getMessage());
        }
    }//GEN-LAST:event_jBExcluiPessoaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAltera;
    private javax.swing.JButton jBCadastra;
    private javax.swing.JButton jBExcluiPessoa;
    private javax.swing.JButton jBExcluiRegistro;
    private javax.swing.JButton jBExibeRegistro;
    private javax.swing.JButton jBSalva;
    private javax.swing.JButton jBSalvaAlteracao;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jCBPessoas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTAConsole;
    private javax.swing.JTextField jTFCPFCadastro;
    private javax.swing.JTextField jTFCPFPesquisa;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFEmailPesquisa;
    private javax.swing.JTextField jTFNomeCadastro;
    private javax.swing.JTextField jTFNomePesquisa;
    private javax.swing.JTextField jTFRGCadastro;
    private javax.swing.JTextField jTFRGPesquisa;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
