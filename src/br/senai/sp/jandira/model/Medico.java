package br.senai.sp.jandira.model;

import java.util.ArrayList;

public class Medico extends Pessoa {

    private static Integer contador = 100;
    private Integer codigo;
    private static ArrayList<Medico> medicos;
    private String crm;

    //construtores da classe
    public Medico(String nome) {
        this.setNome(nome);
        
    }

    public Medico() {
        atualizarCodigo();
    }

    private void atualizarCodigo() {
        contador++;
        this.codigo = contador;
    }

    public String getMedicoSeparadoPorPontoEVirgula() {
        String medicoStr = this.codigo + ";" + this.getNome() + ";" + this.crm;
        return medicoStr;
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

    public static ArrayList<Medico> getMedicos() {
        return medicos;
    }

    public static void setMedicos(ArrayList<Medico> medicos) {
        Medico.medicos = medicos;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

}
