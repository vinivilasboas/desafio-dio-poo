import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

/**
 *
 * @author vinivilasboas
 */

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso("curso java", "descrição curso java", 8);
        Curso curso2 = new Curso("curso js", "descrição curso js", 4);

        Mentoria mentoria = new Mentoria("mentoria de java", "descrição mentoria de java", LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVinicius = new Dev();
        devVinicius.setNome("Vinícius");
        devVinicius.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos - Vinícius - " + devVinicius.getConteudosInscritos());
        devVinicius.progredir();
        System.out.println("Conteúdos inscritos - Vinícius - " + devVinicius.getConteudosInscritos());
        System.out.println("Conteúdos concluidos - Vinícius - " + devVinicius.getConteudosConcluidos());
        System.out.println("XP - " + devVinicius.calcularTotalXP());
        devVinicius.progredir();
        System.out.println("XP - " + devVinicius.calcularTotalXP());

        Dev devSara = new Dev();
        devSara.setNome("Sara");
        devSara.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos - Sara - " + devSara.getConteudosInscritos());
        devSara.progredir();
        System.out.println("Conteúdos inscritos - Sara - " + devSara.getConteudosInscritos());
        System.out.println("Conteúdos concluidos - Sara - " + devSara.getConteudosConcluidos());
        System.out.println("XP - " + devSara.calcularTotalXP());

    }

}
