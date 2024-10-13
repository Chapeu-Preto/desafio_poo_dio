import br.com.desafio.dominio.Curso;
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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
