package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {

    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);

    private String nome;
    private String descricao;
    private Set<Dev> devsInscritos;
    private Set<Conteudo> conteudos;

    Bootcamp(){
        this.nome = "";
        this.descricao = "";
        this.devsInscritos = new HashSet<>();
        this.conteudos = new LinkedHashSet<>();
    }

    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }



    public LocalDate getDataInicial() {
        return this.dataInicial;
    }

    public LocalDate getDataFinal() {
        return this.dataFinal;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Dev> getDevsInscritos() {
        return this.devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return this.conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    
}
