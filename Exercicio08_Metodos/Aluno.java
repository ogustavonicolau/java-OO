package Exercicio08_Metodos;

public class Aluno {

    public String nome;
    public int idade;

    // Construtor com parâmetros (aprendido no Exercício 07)
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // ========== MÉTODOS ==========

    // Método 1: Void (NÃO retorna nada, só faz algo)
    // Uso: aluno.apresentar();
    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }

    // Método 2: Void com parâmetro
    // Uso: aluno.fazer(20);
    public void fazer(int nota) {
        System.out.println(nome + " fez um teste com nota " + nota);
    }

    // Método 3: Com RETORNO (int)
    // Uso: int ano = aluno.calcularAnoNascimento();
    // Retorna o ano de nascimento estimado
    public int calcularAnoNascimento() {
        // Assumindo que o ano atual é 2026
        int anoAtual = 2026;
        int anoNascimento = anoAtual - idade;
        return anoNascimento;
    }

    // Método 4: Com RETORNO (String)
    // Uso: String mensagem = aluno.obterCategoria();
    public String obterCategoria() {
        if (idade < 18) {
            return "Menor de idade";
        } else {
            return "Maior de idade";
        }
    }

    // Método 5: Com parâmetro E retorno
    // Uso: int resultado = aluno.multiplicarIdade(2);
    public int multiplicarIdade(int multiplicador) {
        int resultado = idade * multiplicador;
        return resultado;
    }

    // Método 6: Void que imprime informações formatadas
    // Uso: aluno.exibirInfo();
    public void exibirInfo() {
        System.out.println("===== Informações do Aluno =====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Ano de nascimento (estimado): " + calcularAnoNascimento());
        System.out.println("Categoria: " + obterCategoria());
        System.out.println("================================");
    }

}
