package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.model.TipoOperacao;
import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Medico;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class MedicoPanel extends javax.swing.JPanel {

    int linha;

    public MedicoPanel() {
        initComponents();
        criarTabelaMedico();

    }
    private void excluir() {
       int resposta = JOptionPane.showConfirmDialog(
               this,
               "Você confirma a exclusão da Especialidade selecionada?",
                "Especialidade",
               JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {
           MedicoDAO.excluir(getCodigo());
            criarTabelaMedico();
        }

    }
    private void editar() {
        Medico medico = MedicoDAO.getMedico(getCodigo());

        MedicoDialog medicoDialog = new MedicoDialog(
                null,
                true,
                TipoOperacao.ALTERAR,
                medico);

        medicoDialog.setVisible(true);

        criarTabelaMedico();
    }
    
      private Integer getCodigo() {
        String codigoStr = tableMedico.getValueAt(linha, 0).toString();
        return Integer.valueOf(codigoStr);

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelmedico = new javax.swing.JPanel();
        medicoTexto = new javax.swing.JLabel();
        scrollTableMedico = new javax.swing.JScrollPane();
        tableMedico = new javax.swing.JTable();
        buttonExcluirMedico = new javax.swing.JButton();
        buttonAlterarMedico = new javax.swing.JButton();
        buttonAdicionarMedico = new javax.swing.JButton();

        setLayout(null);

        jPanelmedico.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelmedico.setPreferredSize(new java.awt.Dimension(945, 370));
        jPanelmedico.setLayout(null);

        medicoTexto.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        medicoTexto.setForeground(new java.awt.Color(102, 0, 102));
        medicoTexto.setText("Médico");
        jPanelmedico.add(medicoTexto);
        medicoTexto.setBounds(20, 10, 180, 20);

        tableMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollTableMedico.setViewportView(tableMedico);

        jPanelmedico.add(scrollTableMedico);
        scrollTableMedico.setBounds(20, 40, 905, 240);

        buttonExcluirMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/delete32-2.png"))); // NOI18N
        buttonExcluirMedico.setToolTipText("Excluir Medico selecionado");
        buttonExcluirMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirMedicoActionPerformed(evt);
            }
        });
        jPanelmedico.add(buttonExcluirMedico);
        buttonExcluirMedico.setBounds(700, 294, 70, 60);

        buttonAlterarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit32.png"))); // NOI18N
        buttonAlterarMedico.setToolTipText("Editar Medico  selecionado");
        buttonAlterarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarMedicoActionPerformed(evt);
            }
        });
        jPanelmedico.add(buttonAlterarMedico);
        buttonAlterarMedico.setBounds(780, 294, 70, 60);

        buttonAdicionarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/add32.png"))); // NOI18N
        buttonAdicionarMedico.setToolTipText("Adicionar Medico");
        buttonAdicionarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarMedicoActionPerformed(evt);
            }
        });
        jPanelmedico.add(buttonAdicionarMedico);
        buttonAdicionarMedico.setBounds(860, 294, 70, 60);

        add(jPanelmedico);
        jPanelmedico.setBounds(10, 10, 945, 370);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAdicionarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarMedicoActionPerformed

        
        MedicoDialog medicoDialog = new MedicoDialog(
                null, 
                true, 
                TipoOperacao.ADICIONAR, 
                null);
        
        medicoDialog.setVisible(true);
        criarTabelaMedico();
        
        

    }//GEN-LAST:event_buttonAdicionarMedicoActionPerformed

    private void buttonAlterarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarMedicoActionPerformed
        linha = tableMedico.getSelectedRow();
        if (linha != -1) {
            

        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Porfavor, selecione a linha!!",
                    "Especialidade",
                    JOptionPane.WARNING_MESSAGE);
        }

        criarTabelaMedico();

   


    }//GEN-LAST:event_buttonAlterarMedicoActionPerformed

    private void buttonExcluirMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirMedicoActionPerformed

        // Obtemos o índice da linha selecionada na tabela
        linha = tableMedico.getSelectedRow();

        // Verificamos se a linha é diferente de -1
        // -1 significa que o usuário não selecionou nada
        if (linha != -1) {
            excluir();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Por favor, selecione a especialidade  que você deseja excluir!",
                    "Especialidade",
                    JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_buttonExcluirMedicoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarMedico;
    private javax.swing.JButton buttonAlterarMedico;
    private javax.swing.JButton buttonExcluirMedico;
    private javax.swing.JPanel jPanelmedico;
    private javax.swing.JLabel medicoTexto;
    private javax.swing.JScrollPane scrollTableMedico;
    private javax.swing.JTable tableMedico;
    // End of variables declaration//GEN-END:variables

      private void criarTabelaMedico() {
        tableMedico.setModel(MedicoDAO.getTableModel());

        // Desativar o redimensionamento da JTable
        tableMedico.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        // Definir a largura de cada coluna
        tableMedico.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableMedico.getColumnModel().getColumn(1).setPreferredWidth(300);
        tableMedico.getColumnModel().getColumn(2).setPreferredWidth(300);
        tableMedico.getColumnModel().getColumn(3).setPreferredWidth(202);
        

        // Impedir/bloquear a movimentação das colunas
        tableMedico.getTableHeader().setReorderingAllowed(false);

        // Bloquear edição das células
        tableMedico.setDefaultEditor(Object.class, null);
    }

}
