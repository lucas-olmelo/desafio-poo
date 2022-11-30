package melo.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> comteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> comteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){}

    public void progredir(){}

    public void calcularTotalXp(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getComteudosInscritos() {
        return comteudosInscritos;
    }

    public void setComteudosInscritos(Set<Conteudo> comteudosInscritos) {
        this.comteudosInscritos = comteudosInscritos;
    }

    public Set<Conteudo> getComteudosConcluidos() {
        return comteudosConcluidos;
    }

    public void setComteudosConcluidos(Set<Conteudo> comteudosConcluidos) {
        this.comteudosConcluidos = comteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(comteudosInscritos, dev.comteudosInscritos) && Objects.equals(comteudosConcluidos, dev.comteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, comteudosInscritos, comteudosConcluidos);
    }
}
