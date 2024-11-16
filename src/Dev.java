import java.util.HashSet;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Curso> cursosConcluidos = new HashSet<>();
    private Set<Object> conteudosInscritos = new HashSet<>();

    public Dev(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void inscreverNoBootcamp(Bootcamp bootcamp) {
        conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void concluirConteudo(Object conteudo) {
        if (conteudosInscritos.remove(conteudo)) {
            cursosConcluidos.add((Curso) conteudo);
            System.out.println(nome + " concluiu o conteúdo: " + conteudo);
        } else {
            System.out.println("Conteúdo não encontrado entre os inscritos.");
        }
    }

    @Override
    public String toString() {
        return "Dev: " + nome + " | Conteúdos inscritos: " + conteudosInscritos.size() +
                " | Cursos concluídos: " + cursosConcluidos.size();
    }
}
