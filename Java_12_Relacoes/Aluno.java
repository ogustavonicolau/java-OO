package Java_12_Relacoes;

// Aluno: existe independente de qualquer escola
// Relacao com Escola: AGREGACAO (aluno sobrevive mesmo se a escola for extinta)
public class Aluno {

    private String nome;
    private int matricula;
    private int idade;

    public Aluno(String nome, int matricula, int idade) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
    }

    public String getNome() { return nome; }
    public int getMatricula() { return matricula; }
    public int getIdade() { return idade; }

    public void exibir() {
        System.out.println("  Aluno: " + nome + " (" + idade + " anos)," +  " (matricula: " + matricula + ")");
    }

}
