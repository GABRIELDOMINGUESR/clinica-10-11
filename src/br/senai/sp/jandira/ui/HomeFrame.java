package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.dao.EspecialdadaDAO;
import br.senai.sp.jandira.dao.MedicoDAO;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;


public class HomeFrame extends javax.swing.JFrame {

    JButton ultimoButton;
    JPanel ultimoPanel;
    private PlanosDeSaudePanel planosDeSaudePanel;
    private EspecialidadesPanel especialidadesPanel;
    private MedicoPanel medicoPanel;

    private final int POSICAO_X = 10;
    private final int POSICAO_Y = 180;
    private final int LARGURA = 945;
    private final int ALTURA = 370;

    public HomeFrame() {

        initComponents();
        PlanoDeSaudeDAO.lerListaDePlanosDeSaude();
        EspecialdadaDAO.lerListaDeEspecialidade();
        MedicoDAO.getListaMedicos();
        initPanels();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonSair = new javax.swing.JButton();
        buttonAgenda = new javax.swing.JButton();
        buttonPlanosDeSaude = new javax.swing.JButton();
        buttonEspecialidades = new javax.swing.JButton();
        buttonPacientes = new javax.swing.JButton();
        buttonMedicos = new javax.swing.JButton();
        panelHome = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        buttonHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 102, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sistema para Agendamento de Consultas");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 20, 740, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/agenda.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 10, 70, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 970, 80);

        buttonSair.setBackground(new java.awt.Color(246, 246, 246));
        buttonSair.setForeground(new java.awt.Color(51, 0, 255));
        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/exit32.png"))); // NOI18N
        buttonSair.setToolTipText("Sair do sistema");
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSair);
        buttonSair.setBounds(875, 100, 80, 60);

        buttonAgenda.setBackground(new java.awt.Color(246, 246, 246));
        buttonAgenda.setForeground(new java.awt.Color(51, 0, 255));
        buttonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/agenda32.png"))); // NOI18N
        buttonAgenda.setToolTipText("Agenda");
        buttonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgendaActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAgenda);
        buttonAgenda.setBounds(100, 100, 80, 60);

        buttonPlanosDeSaude.setBackground(new java.awt.Color(246, 246, 246));
        buttonPlanosDeSaude.setForeground(new java.awt.Color(51, 0, 255));
        buttonPlanosDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/health-card.png"))); // NOI18N
        buttonPlanosDeSaude.setToolTipText("Planos de sa??de");
        buttonPlanosDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanosDeSaudeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPlanosDeSaude);
        buttonPlanosDeSaude.setBounds(460, 100, 80, 60);

        buttonEspecialidades.setBackground(new java.awt.Color(246, 246, 246));
        buttonEspecialidades.setForeground(new java.awt.Color(51, 0, 255));
        buttonEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/especialidades32.png"))); // NOI18N
        buttonEspecialidades.setToolTipText("Especialidades");
        buttonEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEspecialidades);
        buttonEspecialidades.setBounds(370, 100, 80, 60);

        buttonPacientes.setBackground(new java.awt.Color(246, 246, 246));
        buttonPacientes.setForeground(new java.awt.Color(51, 0, 255));
        buttonPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/sick32.png"))); // NOI18N
        buttonPacientes.setToolTipText("Pacientes");
        buttonPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacientesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPacientes);
        buttonPacientes.setBounds(190, 100, 80, 60);

        buttonMedicos.setBackground(new java.awt.Color(246, 246, 246));
        buttonMedicos.setForeground(new java.awt.Color(51, 0, 255));
        buttonMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/doctor32.png"))); // NOI18N
        buttonMedicos.setToolTipText("M??dicos");
        buttonMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicosActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMedicos);
        buttonMedicos.setBounds(280, 100, 80, 60);

        panelHome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome.setLayout(null);

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("SISACON");
        panelHome.add(jLabel3);
        jLabel3.setBounds(40, 60, 310, 50);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Dados para contato:");
        panelHome.add(jLabel4);
        jLabel4.setBounds(520, 160, 390, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("www.sisacon.com.br");
        panelHome.add(jLabel5);
        jLabel5.setBounds(520, 230, 390, 16);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Sistema para Agendamento de Consultas");
        panelHome.add(jLabel6);
        jLabel6.setBounds(40, 110, 390, 16);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("E-mail: suporte@sisacon.com.br");
        panelHome.add(jLabel7);
        jLabel7.setBounds(520, 190, 390, 16);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Telefone: (11)95555-5555");
        panelHome.add(jLabel8);
        jLabel8.setBounds(520, 210, 390, 16);

        jPanel2.setBackground(new java.awt.Color(153, 0, 153));
        jPanel2.setForeground(new java.awt.Color(153, 0, 153));
        panelHome.add(jPanel2);
        jPanel2.setBounds(40, 140, 870, 2);

        getContentPane().add(panelHome);
        panelHome.setBounds(10, 180, 945, 370);

        buttonHome.setBackground(new java.awt.Color(153, 0, 153));
        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/home32.png"))); // NOI18N
        buttonHome.setToolTipText("Voltar para a p??gina principal");
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHome);
        buttonHome.setBounds(10, 100, 80, 60);

        setBounds(0, 0, 983, 601);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPlanosDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanosDeSaudeActionPerformed
        alterarPanel(planosDeSaudePanel);
        alterarCor(buttonPlanosDeSaude);
    }//GEN-LAST:event_buttonPlanosDeSaudeActionPerformed

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        alterarPanel(panelHome);
        alterarCor(buttonHome);

    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        alterarCor(buttonSair);
        dispose();
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesActionPerformed
        alterarPanel(especialidadesPanel);
        alterarCor(buttonEspecialidades);

    }//GEN-LAST:event_buttonEspecialidadesActionPerformed

    private void buttonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgendaActionPerformed
        alterarCor(buttonAgenda);
    }//GEN-LAST:event_buttonAgendaActionPerformed

    private void buttonPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacientesActionPerformed
        alterarCor(buttonPacientes);
    }//GEN-LAST:event_buttonPacientesActionPerformed

    private void buttonMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicosActionPerformed
        alterarCor(buttonMedicos);
        alterarPanel(medicoPanel);
    }//GEN-LAST:event_buttonMedicosActionPerformed

//   medoto para altera a cor e avisibilidade do painel!!

    public void alterarCor(JButton button) {
        button.setBackground(new Color(153, 0, 153));

        if (this.ultimoButton == null) {
            this.ultimoButton = buttonHome;
            this.ultimoButton.setBackground(new Color(255, 255, 255));
        } else if (this.ultimoButton == button) {

        } else {
            this.ultimoButton.setBackground(new Color(255, 255, 255));
        }
        this.ultimoButton = button;
    }

    public void alterarPanel(JPanel panel) {
        if (this.ultimoPanel == null) {
            this.ultimoPanel = panelHome;
            this.ultimoPanel.setVisible(false);
            panel.setVisible(true);
        } else if (this.ultimoPanel == panel) {

        } else {
            this.ultimoPanel.setVisible(false);
            panel.setVisible(true);
        }
        this.ultimoPanel = panel;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgenda;
    private javax.swing.JButton buttonEspecialidades;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMedicos;
    private javax.swing.JButton buttonPacientes;
    private javax.swing.JButton buttonPlanosDeSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelHome;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {

        planosDeSaudePanel = new PlanosDeSaudePanel();
        especialidadesPanel = new EspecialidadesPanel();
        medicoPanel = new MedicoPanel();

        
        planosDeSaudePanel.setBounds(
                POSICAO_X, POSICAO_Y,
                LARGURA, ALTURA);

        getContentPane().add(planosDeSaudePanel);
        planosDeSaudePanel.setVisible(false);

        especialidadesPanel.setBounds(
                
                POSICAO_X, POSICAO_Y, 
                LARGURA, ALTURA);
        
        getContentPane().add(especialidadesPanel);
        especialidadesPanel.setVisible(false);
        
        medicoPanel.setBounds(
                
                POSICAO_X, POSICAO_Y, 
                LARGURA, ALTURA);

        getContentPane().add(medicoPanel);
        medicoPanel.setVisible(false);
    }

}
