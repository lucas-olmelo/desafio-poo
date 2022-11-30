import melo.desafio.dominio.Bootcamp;
import melo.desafio.dominio.Curso;
import melo.desafio.dominio.Dev;
import melo.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();

        curso.setTitulo("Curso de Java");
        curso.setDescricao("Curso de Java muito legal e interessante");
        curso.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso de JS");
        curso2.setDescricao("Curso de JavaScript muito legal e interessante");
        curso2.setCargaHoraria(12);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria muito legal de Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp muito legal sobre Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMelo = new Dev();
        devMelo.setNome("Lucas Melo");
        devMelo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos do Melo: " +devMelo.getConteudosInscritos());
        devMelo.progredir();
        devMelo.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos do Melo: " +devMelo.getConteudosInscritos());
        System.out.println("Conteudos concluidos do Melo: " +devMelo.getConteudosConcluidos());
        System.out.println("XP: " +devMelo.calcularTotalXp());

        System.out.println("----------------------------");

        Dev outroDev = new Dev();
        outroDev.setNome("Chico Pires");
        outroDev.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos do Chico: " +outroDev.getConteudosInscritos());
        outroDev.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos do Chico: " +outroDev.getConteudosInscritos());
        System.out.println("Conteudos concluidos do Chico: " +outroDev.getConteudosConcluidos());
        System.out.println("XP: " +outroDev.calcularTotalXp());
    }
}