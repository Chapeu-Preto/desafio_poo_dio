import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class  Main {

    public static void main (String [] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Java");
        curso1.setDescricao("Conceitos de P.O.O");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();

        curso2.setTitulo("Java Script");
        curso2.setDescricao("Conceitos Classe");
        curso2.setCargaHoraria(2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devHigor = new Dev();
        devHigor.setNome("Higor");
        devHigor.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Higor: " + devHigor.getConteudosInscritos());
        devHigor.progredir();
        devHigor.progredir();
        System.out.println("_");
        System.out.println("Conteúdos Inscritos Higor: " + devHigor.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Higor: " + devHigor.getConteudosConcluidos());
        System.out.println("XP: " + devHigor.calcularTotalXp());

        System.out.println("__________________________");

        Dev devBenjamim = new Dev();
        devBenjamim.setNome("Benjamim");
        devBenjamim.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscrits Benjamim: " + devBenjamim.getConteudosInscritos());
        devBenjamim.progredir();
        devBenjamim.progredir();
        devBenjamim.progredir();
        System.out.println("_");
        System.out.println("Conteúdos Inscritos Benjamim: " + devHigor.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Benjamim: " + devHigor.getConteudosConcluidos());
        System.out.println("XP: " + devBenjamim.calcularTotalXp());
    }
}
