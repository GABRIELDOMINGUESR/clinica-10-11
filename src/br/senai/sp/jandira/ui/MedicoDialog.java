package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.dao.EspecialdadaDAO;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.TipoOperacao;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

import javax.swing.JOptionPane;

public class MedicoDialog extends javax.swing.JDialog {

    private TipoOperacao tipoOperacao;
    private Medico medico;

    private DefaultListModel<String> listaDasEspecialidades = new DefaultListModel<>();
    private ArrayList<String> especialidades = new ArrayList<>();
    private ArrayList<Especialidade> especialidadesNSelecionadas = EspecialdadaDAO.listarTodos();

    private DefaultListModel<String> listaDasEspecialidadesDoMedico = new DefaultListModel<>();
    private ArrayList<String> selecionadas = new ArrayList<>();
    private ArrayList<Especialidade> especialidadesSelecionadas = new ArrayList<>();

    public MedicoDialog(
            java.awt.Frame parent,
            boolean modal,
            TipoOperacao tipoOperacao,
            Medico medico
    ) {
        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.medico = medico;
        atualizarListasEspecialidades();

        // Preencher os campos, caso o tipo de operação for ALTERAR
        if (tipoOperacao == tipoOperacao.ALTERAR) {
            preencherFormulario();
            atualizarListasEspecialidades();
        }

    }

    private void preencherFormulario() {
        jlabelTitulo.setText("medico -" + tipoOperacao);
        jlabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit32.png")));
        textCodigo.setText(medico.getCodigo().toString());
        textCRM.setText(medico.getCrm());
        textNomeDoMedico.setText(medico.getNome());
        textEmail.setText(medico.getEmail());
        textTelefone.setText(medico.getTelefone());
        dataDeNacimentoTextField.setText(medico.getDataNascimentoComBarra());

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jEspecialidade = new javax.swing.JPanel();
        jlabelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelCRM = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        textNomeDoMedico = new javax.swing.JTextField();
        dataDeNacimento = new javax.swing.JLabel();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        textCodigo = new javax.swing.JTextField();
        jLabelCodigo = new javax.swing.JLabel();
        listaDeEspecialidadesDoMedico = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        jScrollEspecialidades = new javax.swing.JScrollPane();
        jListEspecialidades = new javax.swing.JList<>();
        email = new javax.swing.JLabel();
        jScrollEspecialidadesDoMedico = new javax.swing.JScrollPane();
        ListEspecialidadesDoMedico = new javax.swing.JList<>();
        listaDeEspecialidades = new javax.swing.JLabel();
        dataDeNacimentoTextField = new javax.swing.JFormattedTextField();
        buttonDireita = new javax.swing.JButton();
        buttonEsquerda = new javax.swing.JButton();
        jLabelNomeDoMedico1 = new javax.swing.JLabel();
        textTelefone = new javax.swing.JFormattedTextField();
        textCRM = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jEspecialidade.setBackground(new java.awt.Color(255, 255, 255));
        jEspecialidade.setLayout(null);

        jlabelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jlabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/add32.png"))); // NOI18N
        jlabelTitulo.setText("Adicionar Médico - NOVO");
        jEspecialidade.add(jlabelTitulo);
        jlabelTitulo.setBounds(10, 10, 530, 30);

        getContentPane().add(jEspecialidade);
        jEspecialidade.setBounds(0, 0, 810, 50);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes da Especialidade:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(153, 0, 51))); // NOI18N
        jPanel2.setLayout(null);

        jLabelCRM.setText("CRM:");
        jPanel2.add(jLabelCRM);
        jLabelCRM.setBounds(170, 50, 60, 16);

        jLabelTelefone.setText("Telefone do(a) Médico:");
        jPanel2.add(jLabelTelefone);
        jLabelTelefone.setBounds(390, 120, 180, 16);

        textNomeDoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeDoMedicoActionPerformed(evt);
            }
        });
        jPanel2.add(textNomeDoMedico);
        textNomeDoMedico.setBounds(310, 70, 390, 30);

        dataDeNacimento.setText("Data De Nacimento:");
        jPanel2.add(dataDeNacimento);
        dataDeNacimento.setBounds(620, 120, 140, 16);

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
        listaDeEspecialidadesDoMedico.setBounds(360, 210, 210, 16);

        textEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmailActionPerformed(evt);
            }
        });
        jPanel2.add(textEmail);
        textEmail.setBounds(20, 140, 310, 30);

        jScrollEspecialidades.setViewportView(jListEspecialidades);

        jPanel2.add(jScrollEspecialidades);
        jScrollEspecialidades.setBounds(30, 230, 210, 190);

        email.setText("Email:");
        jPanel2.add(email);
        email.setBounds(20, 120, 120, 16);

        jScrollEspecialidadesDoMedico.setViewportView(ListEspecialidadesDoMedico);

        jPanel2.add(jScrollEspecialidadesDoMedico);
        jScrollEspecialidadesDoMedico.setBounds(360, 230, 210, 190);

        listaDeEspecialidades.setText("Lista De Especialidades");
        jPanel2.add(listaDeEspecialidades);
        listaDeEspecialidades.setBounds(30, 210, 140, 16);

        try {
            dataDeNacimentoTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataDeNacimentoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataDeNacimentoTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dataDeNacimentoTextField);
        dataDeNacimentoTextField.setBounds(620, 140, 140, 28);

        buttonDireita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/direita.png"))); // NOI18N
        buttonDireita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDireitaActionPerformed(evt);
            }
        });
        jPanel2.add(buttonDireita);
        buttonDireita.setBounds(270, 240, 60, 60);

        buttonEsquerda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/esquerda.png"))); // NOI18N
        buttonEsquerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEsquerdaActionPerformed(evt);
            }
        });
        jPanel2.add(buttonEsquerda);
        buttonEsquerda.setBounds(270, 320, 60, 60);

        jLabelNomeDoMedico1.setText("Nome do(a) Médico:");
        jPanel2.add(jLabelNomeDoMedico1);
        jLabelNomeDoMedico1.setBounds(310, 50, 230, 16);

        try {
            textTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTelefoneActionPerformed(evt);
            }
        });
        jPanel2.add(textTelefone);
        textTelefone.setBounds(390, 140, 190, 28);
        jPanel2.add(textCRM);
        textCRM.setBounds(150, 70, 110, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 60, 790, 450);

        setBounds(0, 0, 826, 578);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
       
        if (tipoOperacao == TipoOperacao.ADICIONAR) {
            gravar();
        } else {
            atualizar();
        }

    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void textNomeDoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeDoMedicoActionPerformed

    }//GEN-LAST:event_textNomeDoMedicoActionPerformed

    private void textEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmailActionPerformed

    }//GEN-LAST:event_textEmailActionPerformed

    private void textCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodigoActionPerformed

    }//GEN-LAST:event_textCodigoActionPerformed

    private void buttonDireitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDireitaActionPerformed
  
        List<String> especialidadesDoMedico = jListEspecialidades.getSelectedValuesList();
        
        for(String e : especialidadesDoMedico){
            selecionadas.add(e);
        }
        for(Especialidade e : especialidadesNSelecionadas){
            if(especialidadesDoMedico.contains(e.getNome())){
                especialidadesSelecionadas.add(e);
            }
        }
        
        listaDasEspecialidadesDoMedico.clear();
        listaDasEspecialidadesDoMedico.addAll(selecionadas);
        ListEspecialidadesDoMedico.setModel(listaDasEspecialidadesDoMedico);
        
        List<String> excluir = jListEspecialidades.getSelectedValuesList();
        
        for(String e : excluir){
            listaDasEspecialidades.removeElement(e);
            especialidades.remove(e);
            
        }
    }//GEN-LAST:event_buttonDireitaActionPerformed

    private void dataDeNacimentoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataDeNacimentoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataDeNacimentoTextFieldActionPerformed

    private void buttonEsquerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEsquerdaActionPerformed
          List<String> removerEspecialidades = ListEspecialidadesDoMedico.getSelectedValuesList();
        
        for(String e : removerEspecialidades){
            especialidades.add(e);
        }
        for(Especialidade e : especialidadesNSelecionadas){
            if(removerEspecialidades.contains(e.getNome())){
                especialidadesSelecionadas.remove(e);
            }
        }
        
        listaDasEspecialidades.clear();
        listaDasEspecialidades.addAll(especialidades);
        jListEspecialidades.setModel(listaDasEspecialidades);
        
        List<String> excluir = ListEspecialidadesDoMedico.getSelectedValuesList();
        
        for(String e : excluir){
            listaDasEspecialidadesDoMedico.removeElement(e);
            selecionadas.remove(e);
        }
    }//GEN-LAST:event_buttonEsquerdaActionPerformed

    private void textTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTelefoneActionPerformed
    private void atualizar() {
        if (validarCadastro()) {
            medico.setNome(textNomeDoMedico.getText());
            medico.setCrm(textEmail.getText());
            medico.setTelefone(textTelefone.getText());
            medico.setEmail(textEmail.getText());
            medico.setEspecialidades(especialidadesSelecionadas);
            medico.setDataDeNascimento(dataCorreta());
            MedicoDAO.atualizar(medico);
            JOptionPane.showMessageDialog(
                    this,
                    "Especialidade atualizada com sucesso!",
                    "Especialidade",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }

    private void gravar() {
        // Criar um objeto Plano de Saúde
        Medico medico = new Medico();
        medico.setNome(textNomeDoMedico.getText());
        medico.setCrm(textCRM.getText());
        medico.setTelefone(textTelefone.getText());
        medico.setEmail(textEmail.getText());
        medico.setEspecialidades(especialidadesSelecionadas);
        medico.setDataDeNascimento(dataCorreta());
        if (validarCadastro()) {
            MedicoDAO.gravar(medico);

            JOptionPane.showMessageDialog(
                    this,
                    "Médico gravado com sucesso!",
                    "Médico",
                    JOptionPane.INFORMATION_MESSAGE);

            dispose();
        }
    }

    private boolean validarCadastro() {
        if (textNomeDoMedico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o nome do(a) medico(a)!",
                    "Medico",
                    JOptionPane.ERROR_MESSAGE);
            textNomeDoMedico.requestFocus();
            return false;
        }
        if (textTelefone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o CRM!",
                    "Medico",
                    JOptionPane.ERROR_MESSAGE);
            textTelefone.requestFocus();
            return false;
        }
        if (textEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o E-mail!",
                    "Medico",
                    JOptionPane.ERROR_MESSAGE);
            textEmail.requestFocus();
            return false;
        }
        if (textTelefone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o Telefone!",
                    "Medico",
                    JOptionPane.ERROR_MESSAGE);
            textTelefone.requestFocus();
            return false;
        }
        if (dataDeNacimentoTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha a data de nascimeto!",
                    "Medico",
                    JOptionPane.ERROR_MESSAGE);
            dataDeNacimentoTextField.requestFocus();
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListEspecialidadesDoMedico;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonDireita;
    private javax.swing.JButton buttonEsquerda;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel dataDeNacimento;
    private javax.swing.JFormattedTextField dataDeNacimentoTextField;
    private javax.swing.JLabel email;
    private javax.swing.JPanel jEspecialidade;
    private javax.swing.JLabel jLabelCRM;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelNomeDoMedico1;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JList<String> jListEspecialidades;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollEspecialidades;
    private javax.swing.JScrollPane jScrollEspecialidadesDoMedico;
    private javax.swing.JLabel jlabelTitulo;
    private javax.swing.JLabel listaDeEspecialidades;
    private javax.swing.JLabel listaDeEspecialidadesDoMedico;
    private javax.swing.JFormattedTextField textCRM;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textNomeDoMedico;
    private javax.swing.JFormattedTextField textTelefone;
    // End of variables declaration//GEN-END:variables
private LocalDate dataCorreta() {
        String[] data = dataDeNacimentoTextField.getText().split("/");

        return LocalDate.of(
                Integer.parseInt(data[2]), 
                Integer.parseInt(data[1]), 
                Integer.parseInt(data[0]));

    }

    private void atualizarListasEspecialidades() {
        especialidades = EspecialdadaDAO.getListaDeNomes();
        listaDasEspecialidades.addAll(especialidades);
        jListEspecialidades.setModel(listaDasEspecialidades);
        if (tipoOperacao == TipoOperacao.ADICIONAR) {

        } else {
            especialidadesSelecionadas = medico.getEspecialidades();
            selecionadas = medico.getListaDeEspecialidadesDoMedico();
            listaDasEspecialidadesDoMedico.clear();
            listaDasEspecialidadesDoMedico.addAll(selecionadas);
            ListEspecialidadesDoMedico.setModel(listaDasEspecialidadesDoMedico);

            int i = 0;
            for (String e : selecionadas) {
                if (especialidades.contains(e)) {
                    especialidades.remove(e);
                }
            }
            listaDasEspecialidades.clear();
            listaDasEspecialidades.addAll(especialidades);

        }

    }

}
