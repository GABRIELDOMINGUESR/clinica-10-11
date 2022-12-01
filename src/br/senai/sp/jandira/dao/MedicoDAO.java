package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
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
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDAO {

    

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
        
        try {
            //GRAVAR PLANO DE SAUDE EM ARQUIVO
            BufferedWriter bw = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            String novoplanodeSaude = medico.getMedicoSeparadoPorPontoEVirgula();
            bw.write(medico.getMedicoSeparadoPorPontoEVirgula());
            bw.newLine();
            bw.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "Houve um problema au abrir o arquivo",
                    "Erro ao gravar",
                    JOptionPane.ERROR_MESSAGE);
        }
        medicos.add(medico);

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

    private static void atualizarArquivo() {
        //reconstruir um arquivo atualizado

        //Passo 01 - Criar uma representação dos arquivos que vão ser manipulados
        File arquivoAtual = new File(ARQUIVO);
        File arquivoTemp = new File(ARQUIVO_TEMP);

        try {
            //criar arquivo temporário
            arquivoTemp.createNewFile();
            //abre o arquivo para escrita
            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            for (Medico m : medicos) {
                bwTemp.write(m.getMedicoSeparadoPorPontoEVirgula());
                bwTemp.newLine();
            }
            bwTemp.close();
            arquivoAtual.delete();
            arquivoTemp.renameTo(arquivoAtual);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocorreu um erro na hora de criar o arquivo!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);

        }
    }

    public static void atualizar(Medico medico) {
        for (Medico m : medicos) {
            if (m.getCodigo().equals(medico.getCodigo())) {
                medicos.set(medicos.indexOf(m), medico);
                break;
            }
            atualizarArquivo();
        }

    }

    public static ArrayList<Medico> listarTodos() {
        return medicos;
    }

    public static void gravarMedico(Medico medico) {
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
        // Matriz receberá os planos de saúde
        //que serão usados na tabela (JTable)
        Object[][] dados = new Object[medicos.size()][4];

        // For Each, para extrair cada objeto plano de saúde
        // arrayList planos e separar cada dado na matriz dados
        int i = 0;
        for (Medico m : medicos) {
            dados[i][0] = m.getCodigo();
            dados[i][1] = m.getCrm();
            dados[i][2] = m.getNome();
            dados[i][3] = m.getTelefone();
            
            
            i++;
        }
        // Definir o vetor com os nomes das tabelas
        String[] titulos = {"Código", "CRM", "Nome do Medico", "Telefone"};

        // Criar o modelo que será utilizado pelo JTabel
        // para exibir os dados dos planos
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);
        return tableModel;

    }

     public static void getListaMedicos(){
        try {     
            BufferedReader br = Files.newBufferedReader(PATH);
            String linha = "";
            linha = br.readLine();
            while(linha != null && !linha.isEmpty()){
                String[] linhavetor = linha.split(";");
                
                int i = 0;
                ArrayList<Especialidade> especialidades = new ArrayList<>();
                while(linhavetor.length > i +6){
                   especialidades.add(EspecialdadaDAO.getEspecialidade(Integer.valueOf(linhavetor[6+i])));
                   i++;
                }
                
                String[] data = linhavetor[5].split("/");
                int ano = Integer.parseInt(data[2]);
                int mes = Integer.parseInt(data[1]);
                int dia = Integer.parseInt(data[0]);
                LocalDate dataDeNascimento = LocalDate.of(ano,mes, dia);
                
             Medico m = new Medico(Integer.valueOf(linhavetor[0]), linhavetor[1], linhavetor[2], linhavetor[3], linhavetor[4], dataDeNascimento, especialidades);
             medicos.add(m);
             linha = br.readLine();
            }
            br.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "DEU MERDA!!!");
        }
        

   }

}
