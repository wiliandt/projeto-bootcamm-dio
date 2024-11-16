
import java.time.LocalDate;

public class BootcampApp {
    public static void main(String[] args) {
        // Criando cursos e mentorias
        Curso cursoJava = new Curso("Java Básico", "Introdução ao Java", 10);
        Curso cursoJS = new Curso("JavaScript", "Domine o JavaScript", 8);
        Mentoria mentoriaJava = new Mentoria("Mentoria Java", "Dúvidas sobre Java", LocalDate.now());

        // Criando um Bootcamp
        Bootcamp bootcamp = new Bootcamp("Bootcamp FullStack", "Bootcamp de desenvolvimento full stack");
        bootcamp.adicionarConteudo(cursoJava);
        bootcamp.adicionarConteudo(cursoJS);
        bootcamp.adicionarConteudo(mentoriaJava);

        // Criando Devs
        Dev dev1 = new Dev("João");
        Dev dev2 = new Dev("Maria");

        // Inscrevendo Devs
        dev1.inscreverNoBootcamp(bootcamp);
        dev2.inscreverNoBootcamp(bootcamp);

        // Simulando interações
        System.out.println(bootcamp);
        dev1.concluirConteudo(cursoJava);
        dev2.concluirConteudo(cursoJS);
        dev1.concluirConteudo(mentoriaJava);

        System.out.println(dev1);
        System.out.println(dev2);
    }
}