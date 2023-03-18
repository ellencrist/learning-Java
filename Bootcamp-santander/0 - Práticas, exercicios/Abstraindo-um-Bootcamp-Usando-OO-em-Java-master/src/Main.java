import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("mentoria de java");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("curso js");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEllen = new Dev();
        devEllen.setNome("Ellen");
        devEllen.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Ellen" + devEllen.getConteudosInscritos());
        devEllen.progredir();
        devEllen.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Ellen" + devEllen.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Ellen" + devEllen.getConteudosConcluidos());
        System.out.println("XP:" + devEllen.calcularTotalXp());


        System.out.println("---------");

        Dev devJoaquim = new Dev();
        devJoaquim.setNome("Joaquim");
        devJoaquim.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joaquim" + devJoaquim.getConteudosInscritos());
        devJoaquim.progredir();
        devJoaquim.progredir();
        devJoaquim.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Joaquim" + devJoaquim.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Joaquim" + devJoaquim.getConteudosConcluidos());
        System.out.println("XP:" + devJoaquim.calcularTotalXp());





    }
}
