/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controle;
import Controller.IControllerPessoas;
import Model.Pessoa;
import java.awt.Color;
import java.io.IOException;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author usuario
 */
public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form UI
     */
    private final IControllerPessoas pessoasController;

    private String cpf, nome, email, rg;
    private final String[] opcoesAviso = {"Sim", "Não"};

    public Interface() throws IOException, ClassNotFoundException {
        setLocation(400, 50);
        setTitle("Banco de Pessoas");
        initComponents();

        pessoasController = new Controle();
        preencherComboBoxComDadosCarregados(pessoasController.getPessoas());
        jCBPessoas.setSelectedIndex(-1);
        jBAltera.setEnabled(false);
    }

    private void preencherComboBoxComDadosCarregados(Collection<Pessoa> pessoas) {
        if (pessoas == null || pessoas.isEmpty()) {
            jTAConsole.setText("Nenhum dado recuperado!");
            return;
        }

        for (Pessoa pessoa : pessoas) {
            jCBPessoas.addItem(pessoa);
        }

        jBAltera.setEnabled(true);
        limpaCampos();
        jTAConsole.setText("Foram recuperados dados já existentes!");
    }

    public void limpaCampos() {
        jTFNomeCadastro.setText("");
        jTFCPFCadastro.setText("");
        jTFRGCadastro.setText("");
        jTFEmail.setText("");

        jTFNomeResultadoPesquisa.setText("");
        jTFCPFResultadoPesquisa.setText("");
        jTFRGResultadoPesquisa.setText("");
        jTFEmailResultadoPesquisa.setText("");
    }

    public void habilitaCampo(JTextField jTA) {
        jTA.setEditable(true);
        jTA.setBackground(Color.white);
    }

    public void desabilitaCampo(JTextField jTA) {
        jTA.setEditable(false);
        jTA.setBackground(new java.awt.Color(210, 210, 210));
    }

    private int criaAviso(String mensagem, String[] opcoes) {
        return JOptionPane.showOptionDialog(this, mensagem, "Registro de Pessoas", 0, JOptionPane.WARNING_MESSAGE, null, opcoes,
                opcoes[0]);
    }

    private void preencherCamposParaAlteracao(Pessoa pessoa) {
        jTFNomeResultadoPesquisa.setText(pessoa.getNome());
        jTFCPFResultadoPesquisa.setText(pessoa.getCpf());
        jTFRGResultadoPesquisa.setText(pessoa.getRg());
        jTFEmailResultadoPesquisa.setText(pessoa.getEmail());
    }

    private void desabilitarCamposDeAlteracao() {
        desabilitaCampo(jTFNomeResultadoPesquisa);
        desabilitaCampo(jTFCPFResultadoPesquisa);
        desabilitaCampo(jTFRGResultadoPesquisa);
        desabilitaCampo(jTFEmailResultadoPesquisa);
        jBSalvaAlteracao.setEnabled(false);
    }

    private void habilitaCamposDeAlteracao() {
        habilitaCampo(jTFNomeResultadoPesquisa);
        habilitaCampo(jTFCPFResultadoPesquisa);
        habilitaCampo(jTFRGResultadoPesquisa);
        habilitaCampo(jTFEmailResultadoPesquisa);
        jBSalvaAlteracao.setEnabled(true);
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
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAConsole = new javax.swing.JTextArea();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jTFNomeCadastro = new javax.swing.JTextField();
        jTFCPFCadastro = new javax.swing.JTextField();
        jTFRGCadastro = new javax.swing.JTextField();
        jTFEmail = new javax.swing.JTextField();
        jBCadastra = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTFNomeResultadoPesquisa = new javax.swing.JTextField();
        jTFCPFResultadoPesquisa = new javax.swing.JTextField();
        jTFRGResultadoPesquisa = new javax.swing.JTextField();
        jTFEmailResultadoPesquisa = new javax.swing.JTextField();
        jBSalvaAlteracao = new javax.swing.JButton();
        jBAltera = new javax.swing.JButton();
        jBExcluiPessoa = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jCBPessoas = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jBPesquisaCPF = new javax.swing.JButton();
        jTFCPFPesquisa = new javax.swing.JTextField();
        jBExibeRegistro = new javax.swing.JButton();
        jBExcluiRegistro = new javax.swing.JButton();

        jButton2.setText("jButton2");

        jScrollPane2.setViewportView(jTree1);

        jButton4.setText("jButton4");

        jToggleButton1.setText("Pesquisar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTAConsole.setEditable(false);
        jTAConsole.setBackground(new java.awt.Color(195, 195, 195));
        jTAConsole.setColumns(20);
        jTAConsole.setLineWrap(true);
        jTAConsole.setRows(5);
        jTAConsole.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(jTAConsole);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 190, 190)));

        jBCadastra.setText("Cadastrar");
        jBCadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastraActionPerformed(evt);
            }
        });

        jLabel4.setText("Email:");

        jLabel3.setText("RG:");

        jLabel2.setText("CPF:");

        jLabel1.setText("Nome:");

        jLabel12.setText("Cadastro:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 49, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFRGCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFCPFCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jBCadastra, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCPFCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFRGCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jBCadastra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jTabbedPane4.addTab("Cadastro", jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(180, 180, 180)));

        jTFNomeResultadoPesquisa.setEditable(false);
        jTFNomeResultadoPesquisa.setBackground(new java.awt.Color(210, 210, 210));

        jTFCPFResultadoPesquisa.setEditable(false);
        jTFCPFResultadoPesquisa.setBackground(new java.awt.Color(210, 210, 210));

        jTFRGResultadoPesquisa.setEditable(false);
        jTFRGResultadoPesquisa.setBackground(new java.awt.Color(210, 210, 210));

        jTFEmailResultadoPesquisa.setEditable(false);
        jTFEmailResultadoPesquisa.setBackground(new java.awt.Color(210, 210, 210));

        jBSalvaAlteracao.setText("Salvar Alterações");
        jBSalvaAlteracao.setEnabled(false);
        jBSalvaAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvaAlteracaoActionPerformed(evt);
            }
        });

        jBAltera.setText("Alterar Dados");
        jBAltera.setEnabled(false);
        jBAltera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlteraActionPerformed(evt);
            }
        });

        jBExcluiPessoa.setText("Excluir Pessoa");
        jBExcluiPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluiPessoaActionPerformed(evt);
            }
        });

        jLabel6.setText("Nome:");

        jLabel7.setText("CPF:");

        jLabel8.setText("RG:");

        jLabel9.setText("Email:");

        jLabel11.setText("Pessoa Cadastrada:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFRGResultadoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFEmailResultadoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFNomeResultadoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFCPFResultadoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBSalvaAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBAltera)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBExcluiPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNomeResultadoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCPFResultadoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFRGResultadoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFEmailResultadoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBAltera)
                .addGap(1, 1, 1)
                .addComponent(jBSalvaAlteracao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBExcluiPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        jCBPessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBPessoasActionPerformed(evt);
            }
        });

        jLabel5.setText("Registro");

        jLabel10.setText("Digite o CPF para pesquisa");

        jBPesquisaCPF.setText("Pesquisa");
        jBPesquisaCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisaCPFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCBPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jTFCPFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(jBPesquisaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(141, 141, 141)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCBPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCPFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesquisaCPF))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Pesquisa", jPanel3);

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBExibeRegistro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBExcluiRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addComponent(jTabbedPane4))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBExcluiRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBExibeRegistro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastraActionPerformed
        try {
            nome = jTFNomeCadastro.getText();
            cpf = jTFCPFCadastro.getText();
            rg = jTFRGCadastro.getText();
            email = jTFEmail.getText();

            Pessoa novaPessoa = pessoasController.incluirPessoa(nome, email, cpf, rg);
            jCBPessoas.addItem(novaPessoa);
            jCBPessoas.setSelectedIndex(-1);

            String msgSucesso = "Pessoa " + novaPessoa + " registrada com sucesso!";
            jTAConsole.setText(msgSucesso);

            limpaCampos();
        } catch (IllegalArgumentException iAE) {
            jTAConsole.setText(iAE.getMessage());
        } catch (IOException ex) {
            jTAConsole.setText("Falha ao salvar registro!");
        }

    }//GEN-LAST:event_jBCadastraActionPerformed

    private void jBExibeRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExibeRegistroActionPerformed
        String registrosImpressos = "";

        Collection<Pessoa> registros = pessoasController.getPessoas();
        if (registros == null || registros.isEmpty()) {
            jTAConsole.setText("Não existem registros para exibição!");
            return;
        }

        for (Pessoa pessoa : registros) {
            registrosImpressos += pessoa.imprimir()
                    + "\n------------------------------------------------------------------------";
        }

        jTAConsole.setText(registrosImpressos);
    }//GEN-LAST:event_jBExibeRegistroActionPerformed

    private void jBExcluiRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluiRegistroActionPerformed
        if (pessoasController.getPessoas() == null || pessoasController.getPessoas().isEmpty()) {
            jTAConsole.setText("Não existem registros para exclusão!");
            return;
        }

        int resposta = criaAviso("Deseja realmente excluir TODOS os registros?", opcoesAviso);

        if (resposta == 0) {
            try {
                pessoasController.excluirPessoas();
                jCBPessoas.removeAllItems();
                limpaCampos();
                jTAConsole.setText("Todos os registros foram excluidos com sucesso!");
            } catch (IOException ex) {
                jTAConsole.setText("Falha ao excluir todos os registros!");
            }
        }
    }//GEN-LAST:event_jBExcluiRegistroActionPerformed

    private void jBExcluiPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluiPessoaActionPerformed
        Pessoa pessoaASerExcluida = (Pessoa) jCBPessoas.getSelectedItem();

        if (pessoaASerExcluida == null) {
            jTAConsole.setText("Uma pessoa deve ser selecionada para exclusão!");
            return;
        }

        try {
            pessoasController.excluirPessoa(pessoaASerExcluida.getCpf());
            desabilitarCamposDeAlteracao();
            limpaCampos();
            jBAltera.setEnabled(false);
        } catch (IOException ex) {
            jTAConsole.setText("Falha ao excluir pessoa!");
        }

        jCBPessoas.removeItem(pessoaASerExcluida);
        jTAConsole.setText("Pessoa " + pessoaASerExcluida + " excluida com sucesso!");
    }//GEN-LAST:event_jBExcluiPessoaActionPerformed

    private void jBSalvaAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvaAlteracaoActionPerformed
        Pessoa pessoaSelecionada = (Pessoa) jCBPessoas.getSelectedItem();

        nome = jTFNomeResultadoPesquisa.getText();
        email = jTFEmailResultadoPesquisa.getText();
        cpf = jTFCPFResultadoPesquisa.getText();
        rg = jTFRGResultadoPesquisa.getText();

        try {
            Pessoa pessoaAlterada = new Pessoa(nome, cpf, rg, email);

            if (pessoaSelecionada.compara(pessoaAlterada)) {
                desabilitarCamposDeAlteracao();
                return;
            }

            pessoasController.alterarPessoa(pessoaSelecionada.getCpf(), pessoaAlterada);
            jCBPessoas.addItem(pessoaAlterada);
            jCBPessoas.removeItem(pessoaSelecionada);
            desabilitarCamposDeAlteracao();
        } catch (IllegalArgumentException iAE) {
            jTAConsole.setText(iAE.getMessage());
        } catch (IOException ex) {
            jTAConsole.setText("Falha ao salvar alteração de pessoa!");
        }
    }//GEN-LAST:event_jBSalvaAlteracaoActionPerformed

    private void jBAlteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlteraActionPerformed
        Pessoa pessoaSelecionada = (Pessoa) jCBPessoas.getSelectedItem();

        if (pessoaSelecionada == null) {
            jTAConsole.setText("Uma pessoa deve ser selecionada para alteração!");
            return;
        }

        habilitaCamposDeAlteracao();
    }//GEN-LAST:event_jBAlteraActionPerformed

    private void jCBPessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBPessoasActionPerformed
        Pessoa pessoaSelecionada = (Pessoa) jCBPessoas.getSelectedItem();

        if (pessoaSelecionada == null) {
            return;
        }else{
            jBAltera.setEnabled(true);
        }

        preencherCamposParaAlteracao(pessoaSelecionada);
        jCBPessoas.setSelectedItem(0);
    }//GEN-LAST:event_jCBPessoasActionPerformed

    private void jBPesquisaCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisaCPFActionPerformed
        cpf = jTFCPFPesquisa.getText();
        try {
            Pessoa p = pessoasController.buscarPorCPF(cpf);
            jCBPessoas.setSelectedItem(p);

        } catch (IllegalArgumentException iAE) {
            jTAConsole.setText(iAE.getMessage());
        }
    }//GEN-LAST:event_jBPesquisaCPFActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new Interface().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAltera;
    private javax.swing.JButton jBCadastra;
    private javax.swing.JButton jBExcluiPessoa;
    private javax.swing.JButton jBExcluiRegistro;
    private javax.swing.JButton jBExibeRegistro;
    private javax.swing.JButton jBPesquisaCPF;
    private javax.swing.JButton jBSalvaAlteracao;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jCBPessoas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTAConsole;
    private javax.swing.JTextField jTFCPFCadastro;
    private javax.swing.JTextField jTFCPFPesquisa;
    private javax.swing.JTextField jTFCPFResultadoPesquisa;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFEmailResultadoPesquisa;
    private javax.swing.JTextField jTFNomeCadastro;
    private javax.swing.JTextField jTFNomeResultadoPesquisa;
    private javax.swing.JTextField jTFRGCadastro;
    private javax.swing.JTextField jTFRGResultadoPesquisa;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
