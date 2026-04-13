package Exercicio09_Encapsulamento;

public class Aluno {

    // ENCAPSULAMENTO: Atributos PRIVATE (protegidos)
    // Não podem ser acessados diretamente de fora da classe
    private String nome;
    private int idade;

    // Construtor
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // ========== GETTERS ==========
    // Métodos para LER (acessar) os atributos

    // Getter para NOME
    public String getNome() {
        return nome;
    }

    // Getter para IDADE
    public int getIdade() {
        return idade;
    }

    // ========== SETTERS ==========
    // Métodos para ESCREVER (modificar) os atributos
    // Com VALIDAÇÃO (proteção)

    // Setter para NOME com validação
    public void setNome(String novoNome) {
        // Validação 1: Verifica se o nome não está vazio
        if (novoNome == null || novoNome.isEmpty()) {
            System.out.println("Erro: Nome não pode ser vazio!");
            return;  // Não executa o resto
        }

        // Validação 2: Verifica se tem pelo menos 3 caracteres
        if (novoNome.length() < 3) {
            System.out.println("Erro: Nome deve ter pelo menos 3 caracteres!");
            return;
        }

        // Se passou todas as validações, atribui o novo valor
        this.nome = novoNome;
        System.out.println("Nome atualizado com sucesso!");
    }

    // Setter para IDADE com validação
    public void setIdade(int novaIdade) {
        // Validação 1: Verifica se a idade é positiva
        if (novaIdade < 0) {
            System.out.println("Erro: Idade não pode ser negativa!");
            return;
        }

        // Validação 2: Verifica se a idade é realista (menor que 150)
        if (novaIdade > 150) {
            System.out.println("Erro: Idade não pode ser maior que 150 anos!");
            return;
        }

        // Se passou todas as validações, atribui o novo valor
        this.idade = novaIdade;
        System.out.println("Idade atualizada com sucesso!");
    }

    // ========== OUTROS MÉTODOS ==========

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }

    public void exibirInfo() {
        System.out.println("===== Informações do Aluno =====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("================================");
    }

}
