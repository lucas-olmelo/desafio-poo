package melo.desafio.dominio;

public class Curso extends Conteudo{
    private int cargaHoraria;

    public Curso() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "\n  Curso {" +
                "Título: '" + getTitulo() + '\'' +
                ", descrição: '" + getDescricao() + '\'' +
                ", carga horária: " + cargaHoraria +
                " horas}";
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}
