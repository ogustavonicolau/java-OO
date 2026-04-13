package Exercicio08_Metodos;

public class Principal {

    public static void main(String[] args) {

        System.out.println("=== Exercício 08 - Métodos ===\n");

        // Criar objetos (usando o construtor do Exercício 07)
        Aluno aluno1 = new Aluno("João Silva", 18);
        Aluno aluno2 = new Aluno("Maria Santos", 16);

        // ========== Método VOID (sem retorno) ==========
        System.out.println("--- Método VOID: apresentar() ---");
        aluno1.apresentar();
        aluno2.apresentar();

        // ========== Método VOID com parâmetro ==========
        System.out.println("\n--- Método VOID com parâmetro: fazer(nota) ---");
        aluno1.fazer(85);
        aluno2.fazer(92);

        // ========== Método COM RETORNO (int) ==========
        System.out.println("\n--- Método com RETORNO (int): calcularAnoNascimento() ---");
        int anoJoao = aluno1.calcularAnoNascimento();
        int anoMaria = aluno2.calcularAnoNascimento();
        System.out.println("João nasceu em: " + anoJoao);
        System.out.println("Maria nasceu em: " + anoMaria);

        // ========== Método COM RETORNO (String) ==========
        System.out.println("\n--- Método com RETORNO (String): obterCategoria() ---");
        String categJoao = aluno1.obterCategoria();
        String categMaria = aluno2.obterCategoria();
        System.out.println(aluno1.nome + " é: " + categJoao);
        System.out.println(aluno2.nome + " é: " + categMaria);

        // ========== Método com parâmetro E retorno ==========
        System.out.println("\n--- Método com parâmetro E retorno: multiplicarIdade(int) ---");
        int idadeX2_Joao = aluno1.multiplicarIdade(2);
        int idadeX3_Maria = aluno2.multiplicarIdade(3);
        System.out.println("Idade de João vezes 2: " + idadeX2_Joao);
        System.out.println("Idade de Maria vezes 3: " + idadeX3_Maria);

        // ========== Método VOID que faz várias coisas ==========
        System.out.println("\n--- Método VOID que imprime vários dados: exibirInfo() ---");
        aluno1.exibirInfo();
        aluno2.exibirInfo();

        // ========== Combinando tudo ==========
        System.out.println("\n--- Usando tudo junto ---");
        Aluno aluno3 = new Aluno("Carlos", 20);
        System.out.println("Aluno criado: ");
        aluno3.apresentar();
        System.out.println("Nascimento estimado: " + aluno3.calcularAnoNascimento());
        System.out.println("Categoria: " + aluno3.obterCategoria());
        aluno3.fazer(75);

        System.out.println("\n=== Conclusão ===");
        System.out.println("Métodos adicionam COMPORTAMENTO aos objetos.");
        System.out.println("Métodos VOID: fazem algo mas não retornam nada.");
        System.out.println("Métodos com RETORNO: fazem algo e devolvem um resultado.");

    }

}
