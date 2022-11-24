package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class Medico extends Pessoa {

    private static Integer contador = 100;
    private Integer codigo;

    private ArrayList<Especialidade> especialidades;
    private String crm;

    public Medico() {
        contador++;
        this.codigo = contador;
    }

    //construtores da classe
     public Medico(String crm, String nome, String telefone, String email, LocalDate dataDeNascimento, ArrayList<Especialidade> especialidades){
        this.crm = crm;
        setNome(nome);
        setTelefone(telefone);
        setEmail(email);
        setDataDeNascimento(dataDeNascimento);
        this.especialidades = especialidades;
         
        contador++;
        this.codigo = contador;
        
    }
     public Medico(Integer codigo,String crm, String nome, String telefone, String email, LocalDate dataDeNascimento, ArrayList<Especialidade> especialidades){
        this.crm = crm;
        setNome(nome);
        setTelefone(telefone);
        setEmail(email);
        setDataDeNascimento(dataDeNascimento);
        this.especialidades = especialidades;
        
        this.codigo = codigo;
        this.contador = codigo++;
        
    }

   

    public String getMedicoSeparadoPorPontoEVirgula() {
        String codigoEspecialidades = "";
        for(Especialidade e : especialidades){    
        codigoEspecialidades += e.getCodigo() + ";";
        }
    
        return this.codigo +
                ";" + this.crm + 
                ";" + getNome() +
                ";" + getTelefone() +
                ";" + getEmail() +
                ";" + getDataNascimentoComBarra() + 
                ";" + codigoEspecialidades ;
    
    }
     public ArrayList<String> getListaDeEspecialidadesDoMedico() {
        ArrayList<String> dados = new ArrayList<>();
        for (Especialidade e : especialidades) {
            dados.add(e.getNome());
        }
        DefaultListModel<String> ListaModel = new DefaultListModel<>();
        
        ListaModel.addAll(dados);
        
        return dados;

    
    }

    public Medico(Integer codigo, String nome, String crm) {
        this.codigo = codigo;
        setNome(nome);
        this.crm = crm;
        contador++;

    }

//------------------------------------------------------------------------------------
    public static Integer getContador() {
        return contador;
    }

    public static void setContador(Integer contador) {
        Medico.contador = contador;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setEspecialidades(ArrayList<Especialidade> especialidades) {

        this.especialidades = especialidades;

    }

    public ArrayList<Especialidade> getEspecialidades() {

        return especialidades;

    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

}
