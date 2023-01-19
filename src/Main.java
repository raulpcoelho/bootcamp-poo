import java.time.LocalDate;

import br.com.dio.desafio.dominio.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Criando cursos:
        Conteudo curso1 = new Curso("Curso Java", "Descrição para o curso de Java.", 15);
        Conteudo curso2 = new Curso("Curso React", "Descrição para o curso de React.", 10);
        
        // Criando mentorias:
        Conteudo mentoria1 = new Mentoria("Mentoria Java", "Descrição para a mentoria de Java.", LocalDate.now());
        Conteudo mentoria2 = new Mentoria("Mentoria React", "Descrição para a mentoria de React.", LocalDate.now());

        // Criando o bootcamp:
        Bootcamp bootcamp = new Bootcamp("Grande Bootcamp", "Descrição do Grande Bootcamp");

        // Adicionando conteudos ao bootcamp:
        bootcamp.adicionarConteudo(curso1);
        bootcamp.adicionarConteudo(curso2);
        bootcamp.adicionarConteudo(mentoria1);
        bootcamp.adicionarConteudo(mentoria2);

        // Criando devs:
        Dev dev1 = new Dev("Maria");
        Dev dev2 = new Dev("João");

        // Inscrevendo devs ao bootcamp:
        dev1.inscreverBootcamp(bootcamp);
        dev2.inscreverBootcamp(bootcamp);

        // Progredindo e verificando conteudos concluidos e XP do Dev1:
        System.out.println("Conteúdos inscritos do Dev1 antes de progredir: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos do Dev1 antes de progredir: " + dev1.getConteudosConcluidos());
        System.out.println("XP do Dev1 antes de progredir: " + dev1.calcularTotalXp());
        dev1.progredir();
        System.out.println("--------PROGREDINDO--------");
        System.out.println("Conteúdos inscritos do Dev1 depois de progredir: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos do Dev1 depois de progredir: " + dev1.getConteudosConcluidos());
        System.out.println("XP do Dev1 depois de progredir: " + dev1.calcularTotalXp());

        System.out.println();
        
        // Progredindo e verificando conteudos concluidos e XP do Dev2:
        System.out.println("Conteúdos inscritos do Dev2 antes de progredir: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos do Dev2 antes de progredir: " + dev2.getConteudosConcluidos());
        System.out.println("XP do Dev2 antes de progredir: " + dev2.calcularTotalXp());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("--------PROGREDINDO--------");
        System.out.println("Conteúdos inscritos do Dev2 depois de progredir: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos do Dev2 depois de progredir: " + dev2.getConteudosConcluidos());
        System.out.println("XP do Dev2 depois de progredir: " + dev2.calcularTotalXp());

        


        
    }
}
