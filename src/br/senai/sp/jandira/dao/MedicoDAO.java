package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Pessoa;
import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDAO extends Pessoa {

    private Medico medico;
    private static ArrayList<Medico> medicos = new ArrayList<>();

    private static final String ARQUIVO = "C:\\Users\\22283347\\java\\Medico.txt";
    private static final String ARQUIVO_TEMP = "C:\\Users\\22283347\\java\\MedicoTemp.txt";
    private static final Path PATH = Paths.get(ARQUIVO);
    private static final Path PATH_TEMP = Paths.get(ARQUIVO_TEMP);

    public MedicoDAO(Medico medico) {
        this.medicos.add(medico);
    }

    // Gravar a especialidade em um arquivo .txt
    public MedicoDAO() {

    }

    public static void gravar(Medico medico) {
        medicos.add(medico);
        try {
            //GRAVAR PLANO DE SAUDE EM ARQUIVO
            BufferedWriter bw = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            String novoplanodeSaude = medico.getMedicoSeparadoPorPontoEVirgula();

            bw.write(novoplanodeSaude);
            bw.newLine();
            bw.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "Houve um problema au abrir o arquivo",
                    "Erro ao gravar",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    public static boolean excluir(Integer codigo) {
        for (Medico m : medicos) {
            if (m.getCodigo().equals(codigo)) {
                medicos.remove(m);
                break;
            }
        }
        //reconstruir arquivo atulizado sem o plano removido

        // Passo 01 Criar representação dos arquivos
        File arquivoAtual = new File(ARQUIVO);
        File arquivoTemp = new File(ARQUIVO_TEMP);

        try {

            arquivoTemp.createNewFile();

            BufferedWriter bwTEMP = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            for (Medico m : medicos) {
                bwTEMP.write(m.getMedicoSeparadoPorPontoEVirgula());
                bwTEMP.newLine();
            }
            //fechar arquivotemp
            bwTEMP.close();

            //excluirarquivo atual
            arquivoAtual.delete();

            //renomear arquivo TEMP
            arquivoTemp.renameTo(arquivoAtual);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocorreu um erro ao criar o arquivo!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }

        return false;
    }

    public static Medico getMedico(Integer codigo) {

        for (Medico m : medicos) {
            if (m.getCodigo().equals(codigo)) {
                return m;
            }
        }
        return null;
    }

    public static void atualizar(Medico medico) {
        for (Medico m : medicos) {
           if (m.getCodigo().equals(medico.getCodigo())) {
                medicos.set(medicos.indexOf(m),
                        medico);
                break;
            }
        }
    }

    public static ArrayList<Medico> listarTodos() {
        return medicos;
    }

    public static void gravarPlanoDeSaude(Medico medico) {
        medicos.add(medico);
        try {
            //GRAVAR PLANO DE SAUDE EM ARQUIVO
            BufferedWriter bw = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            String novomedico = medico.getMedicoSeparadoPorPontoEVirgula();

            bw.write(novomedico);
            bw.newLine();
            bw.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "Houve um problema au abrir o arquivo",
                    "Erro ao gravar",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    public static DefaultTableModel getTableModel() {
        // Matriz que receberá os planos de saúde
        // que serão utilizados na Tabela (JTable)
        Object[][] dados = new Object[medicos.size()][3];
        // For Each, para extrair cada objeto plano de saúde do
        // arraylist planos e separar cada dado na matriz dados
        int i = 0;
        for (Medico m : medicos) {
            dados[i][0] = m.getCodigo();
            dados[i][1] = m.getNome();
            dados[i][2] = m.getCrm();
          
            i++;
        }
        // Definir um vetor com os nomes das colulas da tabela
        String[] titulos = {"Código", "CRM", "Médico"};
        // Criar o modelo que será utilizado pela JTable 
        // para exibir os dados dos planos
        DefaultTableModel tableModel = new DefaultTableModel(
                dados,
                titulos);

        return tableModel;
    }

    public static void lerListaDeMedicos() {
        try {
            BufferedReader br = Files.newBufferedReader(PATH);

            String linha = br.readLine();

            while (linha != null && !linha.isEmpty()) {
                String[] linhaVetor = linha.split(";");
                Medico novomeMedico = new Medico(
                        Integer.valueOf(linhaVetor[0]),
                        linhaVetor[1],
                        linhaVetor[2]);
                medicos.add(novomeMedico);
                linha = br.readLine();

            }
            br.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocorreu um Erro ao ler o arquivo",
                    "Erro de leitura",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

}
