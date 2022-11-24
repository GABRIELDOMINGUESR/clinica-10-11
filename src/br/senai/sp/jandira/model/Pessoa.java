package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Pessoa {
    
    private String nome;
    private String telefone;
    private String email;
    private LocalDate dataDeNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

     public LocalDate getDataNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
     
    public String getDataNascimentoComBarra() {
        
        String[] separado =  dataDeNascimento.toString().split("-");
        String dataCerta = separado[2] + "/" + separado[1] + "/" + separado[0];
        return dataCerta;
    }
   
}