package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
   private String nome;
   private String  descricao;
   private LocalDate datainicial = LocalDate.now();
   private final LocalDate datafinal = datainicial.plusDays(45);
   private Set<Dev> Devsinscirtos = new HashSet<>();
   private Set<Conteudo> conteudos = new LinkedHashSet<>();

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getDescricao() {
      return descricao;
   }

   public void setDescricao(String descricao) {
      this.descricao = descricao;
   }

   public LocalDate getDatainicial() {
      return datainicial;
   }

   public void setDatainicial(LocalDate datainicial) {
      this.datainicial = datainicial;
   }

   public LocalDate getDatafinal() {
      return datafinal;
   }

   public Set<Dev> getDevsinscirtos() {
      return Devsinscirtos;
   }

   public void setDevsinscirtos(Set<Dev> devsinscirtos) {
      Devsinscirtos = devsinscirtos;
   }

   public Set<Conteudo> getConteudos() {
      return conteudos;
   }

   public void setConteudos(Set<Conteudo> conteudos) {
      this.conteudos = conteudos;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Bootcamp bootcamp = (Bootcamp) o;
      return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(datainicial, bootcamp.datainicial) && Objects.equals(datafinal, bootcamp.datafinal) && Objects.equals(Devsinscirtos, bootcamp.Devsinscirtos) && Objects.equals(conteudos, bootcamp.conteudos);
   }

   @Override
   public int hashCode() {
      return Objects.hash(nome, descricao, datainicial, datafinal, Devsinscirtos, conteudos);
   }
}
