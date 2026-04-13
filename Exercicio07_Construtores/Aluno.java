package Exercicio07_Construtores;

public class Aluno {

    public String nome;
    public int idade;

    // Construtor SEM parâmetros (construtor padrão - vazio)
    // Esse construtor SEMPRE existe (implícito) mesmo que você não o escreva
    // Aqui estamos sendo EXPLÍCITO (deixando visível)
    public Aluno() {
        // Não inicializa nada, deixa os valores padrão (null e 0)
    }

    // Construtor COM parâmetros (novo jeito)
    // Este construtor INICIALIZA os atributos automaticamente
    public Aluno(String nome, int idade) {
        // "this" significa "este objeto"
        // this.nome se refere ao atributo 'nome' do objeto
        // nome (sem this) se refere ao parâmetro recebido
        this.nome = nome;
        this.idade = idade;
    }

}
