package br.senai.sp.jandira.dao;

import java.util.ArrayList;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO { // Simular nosso banco de dados

    private PlanoDeSaude planoDeSaude;
    private static ArrayList<PlanoDeSaude> planosDeSaude = new ArrayList<>();

    private static final String ARQUIVO = "C:\\Users\\22283347\\java\\PlanoDeSaude.txt";
    private static final String ARQUIVO_TEMP = "C:\\Users\\22283347\\java\\PlanodeSaudeTemp.txt";
    private static final Path PATH = Paths.get(ARQUIVO);
    private static final Path PATH_TEMP = Paths.get(ARQUIVO_TEMP);

    public PlanoDeSaudeDAO(PlanoDeSaude planodesaude) {
        this.planosDeSaude.add(planodesaude);
    }

    // Gravar a especialidade em um arquivo .txt
    public PlanoDeSaudeDAO() {

    }

    public static void gravar(PlanoDeSaude planoDeSaude) {
        planosDeSaude.add(planoDeSaude);
        try {
            //GRAVAR PLANO DE SAUDE EM ARQUIVO
            BufferedWriter bw = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            String novoplanodeSaude = planoDeSaude.getPlanodesaudeSeparadoPorPontoEVirgula();

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
        for (PlanoDeSaude p : planosDeSaude) {
            if (p.getCodigo().equals(codigo)) {
                planosDeSaude.remove(p);
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

            for (PlanoDeSaude p : planosDeSaude) {
                bwTEMP.write(p.getPlanodesaudeSeparadoPorPontoEVirgula());
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

    public static PlanoDeSaude getPlanoDeSaude(Integer codigo) {

        for (PlanoDeSaude p : planosDeSaude) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        return null;
    }

    public static void atualizar(PlanoDeSaude planodeSaude) {
        for (PlanoDeSaude p : planosDeSaude) {
            if (p.getCodigo().equals(planodeSaude.getCodigo())) {
                planosDeSaude.set(planosDeSaude.indexOf(p),
                        planodeSaude);
                break;
            }
        }
    }

    public static ArrayList<PlanoDeSaude> listarTodos() {
        return planosDeSaude;
    }

    public static void gravarPlanoDeSaude(PlanoDeSaude planodeSaude) {
        planosDeSaude.add(planodeSaude);
        try {
            //GRAVAR PLANO DE SAUDE EM ARQUIVO
            BufferedWriter bw = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            String novoplanodeSaude = planodeSaude.getPlanodesaudeSeparadoPorPontoEVirgula();

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

    public static DefaultTableModel getTableModel() {
        // Matriz que receberá os planos de saúde
        // que serão utilizados na Tabela (JTable)
        Object[][] dados = new Object[planosDeSaude.size()][3];
        // For Each, para extrair cada objeto plano de saúde do
        // arraylist planos e separar cada dado na matriz dados
        int i = 0;
        for (PlanoDeSaude p : planosDeSaude) {
            dados[i][0] = p.getCodigo();
            dados[i][1] = p.getOperadora();
            dados[i][2] = p.getDadosDoPlano();
            i++;
        }
        // Definir um vetor com os nomes das colulas da tabela
        String[] titulos = {"Código", "PlanoDeSaude", "Descrição"};
        // Criar o modelo que será utilizado pela JTable 
        // para exibir os dados dos planos
        DefaultTableModel tableModel = new DefaultTableModel(
                dados, 
                titulos);

        return tableModel;
    }

    public static void lerListaDePlanosDeSaude() {
        try {
            BufferedReader br = Files.newBufferedReader(PATH);

            String linha = br.readLine();

            while (linha != null && !linha.isEmpty()) {
                String[] linhaVetor = linha.split(";");
                PlanoDeSaude novoPlanodeSaude = new PlanoDeSaude(
                        Integer.valueOf(linhaVetor[0]),
                        linhaVetor[1],
                        linhaVetor[2]);
                planosDeSaude.add(novoPlanodeSaude);
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
