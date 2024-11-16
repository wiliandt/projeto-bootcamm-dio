import java.util.HashSet;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private Set<Object> conteudos = new HashSet<>();
    private Set<Dev> devsInscritos = new HashSet<>();

    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Set<Object> getConteudos() {
        return conteudos;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void adicionarConteudo(Object conteudo) {
        conteudos.add(conteudo);
    }

    @Override
    public String toString() {
        return "Bootcamp: " + nome + " | Conteúdos: " + conteudos.size() + " | Devs inscritos: " + devsInscritos.size();
    }
}