package Exercicio09_Encapsulamento;

public class Principal {

    public static void main(String[] args) {

        System.out.println("=== Exercício 09 - Encapsulamento ===\n");

        // Criar aluno (constructors e validação funcionam)
        Aluno aluno1 = new Aluno("João Silva", 18);
        Aluno aluno2 = new Aluno("Maria Santos", 16);

        System.out.println("--- Criados dois alunos com sucesso ---\n");

        // ========== GETTERS: Lendo dados (via método get) ==========
        System.out.println("--- Usando GETTERS (leitura via método) ---");
        System.out.println("Aluno 1: " + aluno1.getNome() + " (" + aluno1.getIdade() + " anos)");
        System.out.println("Aluno 2: " + aluno2.getNome() + " (" + aluno2.getIdade() + " anos)");

        // ========== SETTERS: Modificando dados (via método set com validação) ==========
        System.out.println("\n--- Usando SETTERS (modificação com validação) ---");

        // Tentativa 1: Nome válido
        System.out.println("\nTentando mudar nome de aluno1 para 'Carlos':");
        aluno1.setNome("Carlos");

        // Tentativa 2: Nome inválido (muito curto)
        System.out.println("\nTentando mudar nome de aluno1 para 'AB':");
        aluno1.setNome("AB");  // Será rejeitado

        // Tentativa 3: Nome inválido (vazio)
        System.out.println("\nTentando mudar nome de aluno1 para '':");
        aluno1.setNome("");    // Será rejeitado

        // Tentativa 4: Idade válida
        System.out.println("\nTentando mudar idade de aluno1 para 19:");
        aluno1.setIdade(19);

        // Tentativa 5: Idade inválida (negativa)
        System.out.println("\nTentando mudar idade de aluno1 para -5:");
        aluno1.setIdade(-5);   // Será rejeitado

        // Tentativa 6: Idade inválida (muito alta)
        System.out.println("\nTentando mudar idade de aluno1 para 200:");
        aluno1.setIdade(200);  // Será rejeitado

        // ========== Mostrando o estado final ==========
        System.out.println("\n--- Estado final dos alunos ---");
        aluno1.exibirInfo();
        aluno2.exibirInfo();

        // ========== Comparação: COM e SEM Encapsulamento ==========
        System.out.println("\n--- Diferença: COM vs SEM encapsulamento ---");
        System.out.println("SEM encapsulamento (Ex. 05-08):");
        System.out.println("  aluno.nome = \"Qualquer coisa\";  // Sem validação!");
        System.out.println("  aluno.idade = -50;            // Sem validação!");
        System.out.println("  → Dados podem ficar inválidos\n");

        System.out.println("COM encapsulamento (Ex. 09):");
        System.out.println("  aluno.setNome(\"Qualquer coisa\");  // Com validação!");
        System.out.println("  aluno.setIdade(-50);              // Com validação!");
        System.out.println("  → Dados são protegidos!");

        System.out.println("\n=== Conclusão ===");
        System.out.println("Encapsulamento = private (dados protegidos) + getters/setters (controle)");
        System.out.println("Benefício: Garante que os dados do objeto sempre estejam válidos!");

    }

}
