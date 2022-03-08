package br.com.dio.desafio.dominio;

import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new HashSet<>();
    private Set<Conteudo> conteudosconcluidos = new HashSet<>();

    public void inscreverBootcamp (Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
    }
    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosconcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        }else {
            System.out.println("Voce não está matriculado em nenhum conteudo");
    }}
    public double calcularTotalXP(){
        return this.conteudosconcluidos.stream().mapToDouble(conteudo -> conteudo.calcularxp()).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosconcluidos() {
        return conteudosconcluidos;
    }

    public void setConteudosconcluidos(Set<Conteudo> conteudosconcluidos) {
        this.conteudosconcluidos = conteudosconcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosconcluidos, dev.conteudosconcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosconcluidos);
    }
}
