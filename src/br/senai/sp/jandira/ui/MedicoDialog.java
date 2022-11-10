
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;

public class MedicoDialog extends javax.swing.JDialog {

   
    public MedicoDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
 private void atualizar() {
//        Medico.setMedicos(textNomeDoMedico.getText());
//        Medico.set(textCRM.getText());
//        if (validarCadastro()) {
//            PlanoDeSaudeDAO.atualizar(planoDeSaude);
//            JOptionPane.showMessageDialog(
//                    null,
//                    "Plano de saúde atualizado com sucesso!",
//                    "Plano de Saúde",
//                    JOptionPane.INFORMATION_MESSAGE);
//            dispose();
//        }

    }

    private void gravar() {
        // Criar um objeto Plano de Saúde
        Medico medico = new Medico();
        medico.setNome(textNomeDoMedico.getText());
        medico.setCrm(textCRM.getText());

        if (validarCadastro()) {
            MedicoDAO.gravar(medico);

            JOptionPane.showMessageDialog(
                    this,
                    "Plano de saúde gravado com sucesso!",
                    "Plano de Saúde",
                    JOptionPane.INFORMATION_MESSAGE);

            dispose();
        }
    }

    private boolean validarCadastro() {

        if (textNomeDoMedico.getText().isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o nome do(a) médico!",
                    "Médico",
                    JOptionPane.ERROR_MESSAGE);

            textNomeDoMedico.requestFocus();

            return false;

        }

        if (textCRM.getText().isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o crm!",
                    "Médico",
                    JOptionPane.ERROR_MESSAGE);

            textCRM.requestFocus();

            return false;

        }

        return true;

    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jEspecialidade = new javax.swing.JPanel();
        jlabelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelCRM = new javax.swing.JLabel();
        textCRM = new javax.swing.JTextField();
        jLabelNomeDoMedico = new javax.swing.JLabel();
        textNomeDoMedico = new javax.swing.JTextField();
        dataDeNacimento = new javax.swing.JLabel();
        textDataDeNacimento = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        textCodigo = new javax.swing.JTextField();
        jLabelCodigo = new javax.swing.JLabel();
        listaDeEspecialidadesDoMedico = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        textTelefone = new javax.swing.JTextField();
        telefone = new javax.swing.JLabel();
        jScrollEspecialidades = new javax.swing.JScrollPane();
        jListDeespecialidades = new javax.swing.JList<>();
        email = new javax.swing.JLabel();
        jScrollEspecialidadesDoMedico = new javax.swing.JScrollPane();
        jListDeEspecialidadesDoMedico = new javax.swing.JList<>();
        listaDeEspecialidades = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jEspecialidade.setBackground(new java.awt.Color(255, 255, 255));
        jEspecialidade.setLayout(null);

        jlabelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jlabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/add32.png"))); // NOI18N
        jlabelTitulo.setText("Especialidades Medico - NOVO");
        jEspecialidade.add(jlabelTitulo);
        jlabelTitulo.setBounds(10, 10, 530, 30);

        getContentPane().add(jEspecialidade);
        jEspecialidade.setBounds(0, 0, 810, 50);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes da Especialidade:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(153, 0, 51))); // NOI18N
        jPanel2.setLayout(null);

        jLabelCRM.setText("CRM:");
        jPanel2.add(jLabelCRM);
        jLabelCRM.setBounds(170, 50, 60, 16);

        textCRM.setEditable(false);
        jPanel2.add(textCRM);
        textCRM.setBounds(160, 70, 110, 30);

        jLabelNomeDoMedico.setText("Nome do(a) Médico:");
        jPanel2.add(jLabelNomeDoMedico);
        jLabelNomeDoMedico.setBounds(310, 50, 230, 16);

        textNomeDoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeDoMedicoActionPerformed(evt);
            }
        });
        jPanel2.add(textNomeDoMedico);
        textNomeDoMedico.setBounds(310, 70, 390, 30);

        dataDeNacimento.setText("Data De Nacimento:");
        jPanel2.add(dataDeNacimento);
        dataDeNacimento.setBounds(520, 120, 230, 16);

        textDataDeNacimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDataDeNacimentoActionPerformed(evt);
            }
        });
        jPanel2.add(textDataDeNacimento);
        textDataDeNacimento.setBounds(520, 140, 240, 30);

        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancel32.png"))); // NOI18N
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonCancelar);
        buttonCancelar.setBounds(610, 380, 80, 60);

        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/save32.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar Cadastro");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonSalvar);
        buttonSalvar.setBounds(700, 380, 80, 60);

        textCodigo.setEditable(false);
        textCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCodigoActionPerformed(evt);
            }
        });
        jPanel2.add(textCodigo);
        textCodigo.setBounds(20, 70, 90, 30);

        jLabelCodigo.setText("Código:");
        jPanel2.add(jLabelCodigo);
        jLabelCodigo.setBounds(30, 50, 50, 16);

        listaDeEspecialidadesDoMedico.setText("Lista De Especialidades Do Médico");
        jPanel2.add(listaDeEspecialidadesDoMedico);
        listaDeEspecialidadesDoMedico.setBounds(250, 210, 210, 16);

        textEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmailActionPerformed(evt);
            }
        });
        jPanel2.add(textEmail);
        textEmail.setBounds(20, 140, 230, 30);

        textTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTelefoneActionPerformed(evt);
            }
        });
        jPanel2.add(textTelefone);
        textTelefone.setBounds(260, 140, 240, 30);

        telefone.setText("Telefone:");
        jPanel2.add(telefone);
        telefone.setBounds(260, 120, 230, 16);

        jListDeespecialidades.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollEspecialidades.setViewportView(jListDeespecialidades);

        jPanel2.add(jScrollEspecialidades);
        jScrollEspecialidades.setBounds(30, 230, 210, 190);

        email.setText("Email:");
        jPanel2.add(email);
        email.setBounds(20, 120, 120, 16);

        jListDeEspecialidadesDoMedico.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollEspecialidadesDoMedico.setViewportView(jListDeEspecialidadesDoMedico);

        jPanel2.add(jScrollEspecialidadesDoMedico);
        jScrollEspecialidadesDoMedico.setBounds(250, 230, 210, 190);

        listaDeEspecialidades.setText("Lista De Especialidades");
        jPanel2.add(listaDeEspecialidades);
        listaDeEspecialidades.setBounds(30, 210, 140, 16);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 60, 790, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textDataDeNacimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDataDeNacimentoActionPerformed

    }//GEN-LAST:event_textDataDeNacimentoActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed

//        if (TipoOperacao == TipoOperacao.ADICIONAR) {
//            gravar();
//
//        } else {
//            atualizar();
//        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void textNomeDoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeDoMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeDoMedicoActionPerformed

    private void textEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEmailActionPerformed

    private void textTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTelefoneActionPerformed

    private void textCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCodigoActionPerformed

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
            java.util.logging.Logger.getLogger(MedicoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MedicoDialog dialog = new MedicoDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel dataDeNacimento;
    private javax.swing.JLabel email;
    private javax.swing.JPanel jEspecialidade;
    private javax.swing.JLabel jLabelCRM;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelNomeDoMedico;
    private javax.swing.JList<String> jListDeEspecialidadesDoMedico;
    private javax.swing.JList<String> jListDeespecialidades;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollEspecialidades;
    private javax.swing.JScrollPane jScrollEspecialidadesDoMedico;
    private javax.swing.JLabel jlabelTitulo;
    private javax.swing.JLabel listaDeEspecialidades;
    private javax.swing.JLabel listaDeEspecialidadesDoMedico;
    private javax.swing.JLabel telefone;
    private javax.swing.JTextField textCRM;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textDataDeNacimento;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textNomeDoMedico;
    private javax.swing.JTextField textTelefone;
    // End of variables declaration//GEN-END:variables
}
