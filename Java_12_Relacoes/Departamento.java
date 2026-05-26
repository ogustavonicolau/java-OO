package Java_12_Relacoes;

// Departamento: criado e gerenciado pela Escola
// Relacao com Escola: COMPOSICAO (departamento nao existe sem a escola)
public class Departamento {

    private String nome;
    private Professor professor;

    public Departamento(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public String getNome() { return nome; }

    public void exibir() {
        System.out.println("  Departamento: " + nome + " | Professor: " + professor.getNome());
    }

}
