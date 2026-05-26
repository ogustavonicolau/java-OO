package Java_12_Relacoes;

public class Principal {

    public static void main(String[] args) {

        System.out.println("=== Exercicio 12 - Relacoes entre Objetos ===\n");

        // --- ASSOCIACAO ---
        // Escola usa Endereco, Departamento e Aluno
        // Cada um tem sua propria existencia

        // --- COMPOSICAO ---
        // Endereco e criado DENTRO do construtor da Escola
        // Se a Escola deixar de existir, o Endereco tambem deixa
        System.out.println("--- Criando a Escola (composicao: Endereco criado junto) ---");
        Escola escola = new Escola(
            "Escola Tecnica Java",
            "12.345.678/0001-99",
            "Av. da Tecnologia, 100",
            "Sao Paulo",
            "01310-100"
        );

        // Composicao: Departamentos criados e gerenciados pela Escola
        System.out.println("\n--- Criando Departamentos (composicao) ---");
        escola.criarDepartamento("Informatica");
        escola.criarDepartamento("Matematica");
        escola.criarDepartamento("Portugues");
        System.out.println("Departamentos criados. Se a Escola for extinta, eles tambem serao.");

        // Agregacao: Alunos criados FORA da escola e depois matriculados
        System.out.println("\n--- Criando Alunos fora da Escola (agregacao) ---");
        Aluno aluno1 = new Aluno("Ana Lima",  1001, 21);
        Aluno aluno2 = new Aluno("Bruno Costa", 1002, 19);
        Aluno aluno3 = new Aluno("Carla Dias", 1003, 20);
        System.out.println("Alunos criados independentemente.");
        System.out.println("Se a Escola for extinta, os alunos continuam existindo!");

        // Matriculando os alunos na escola
        System.out.println("\n--- Matriculando alunos (agregacao) ---");
        escola.matricularAluno(aluno1);
        escola.matricularAluno(aluno2);
        escola.matricularAluno(aluno3);

        // Exibindo o estado completo
        System.out.println("\n--- Estado completo da Escola ---");
        escola.exibirInfo();

        // Demonstrando que alunos existem fora da escola
        System.out.println("\n--- Alunos existem independente da Escola ---");
        System.out.print("aluno1 fora da escola: ");
        aluno1.exibir();
        System.out.print("aluno2 fora da escola: ");
        aluno2.exibir();

        // Resumo das relacoes
        System.out.println("\n=== Resumo das Relacoes ===");
        System.out.println("ASSOCIACAO  -> objetos se usam, existencias independentes");
        System.out.println("AGREGACAO   -> pai contem filho, filho SOBREVIVE ao pai");
        System.out.println("              Exemplo: Escola-Aluno");
        System.out.println("COMPOSICAO  -> pai contem filho, filho NAO EXISTE sem o pai");
        System.out.println("              Exemplo: Escola-Departamento, Escola-Endereco");

    }

}
