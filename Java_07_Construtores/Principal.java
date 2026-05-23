package Java_07_Construtores;

public class Principal {

    public static void main(String[] args) {

        System.out.println("=== Exercício 07 - Construtores ===\n");

        // Jeito 1: Construtor SEM parâmetros (vazio)
        // Depois preenchemos manualmente
        System.out.println("--- Jeito 1: Construtor vazio (como nos exercícios anteriores) ---");
        Aluno aluno1 = new Aluno();
        System.out.println("Criado: aluno1 = new Aluno();");
        System.out.println("Nome: " + aluno1.nome);
        System.out.println("Idade: " + aluno1.idade);

        // Preenchendo depois
        aluno1.nome = "João Silva";
        aluno1.idade = 18;
        System.out.println("\nDepois de preencher:");
        System.out.println("Nome: " + aluno1.nome);
        System.out.println("Idade: " + aluno1.idade);

        // Jeito 2: Construtor COM parâmetros (novo)
        // Inicializa TUDO na criação
        System.out.println("\n--- Jeito 2: Construtor com parâmetros (novo jeito) ---");
        Aluno aluno2 = new Aluno("Maria Santos", 20);
        System.out.println("Criado: aluno2 = new Aluno(\"Maria Santos\", 20);");
        System.out.println("Nome: " + aluno2.nome);
        System.out.println("Idade: " + aluno2.idade);

        // Jeito 3: Criar com construtor vazio e depois preencher
        System.out.println("\n--- Jeito 3: Construtor vazio, depois preenche ---");
        Aluno aluno3 = new Aluno();
        aluno3.nome = "Carlos";
        aluno3.idade = 19;
        System.out.println("Nome: " + aluno3.nome);
        System.out.println("Idade: " + aluno3.idade);

        // Jeito 4: Múltiplos objetos usando construtor parametrizado
        System.out.println("\n--- Jeito 4: Múltiplos objetos (construtor parametrizado) ---");
        Aluno aluno4 = new Aluno("Ana", 21);
        Aluno aluno5 = new Aluno("Bruno", 17);
        Aluno aluno6 = new Aluno("Carla", 19);

        System.out.println("Aluno 4: " + aluno4.nome + " (" + aluno4.idade + " anos)");
        System.out.println("Aluno 5: " + aluno5.nome + " (" + aluno5.idade + " anos)");
        System.out.println("Aluno 6: " + aluno6.nome + " (" + aluno6.idade + " anos)");

        System.out.println("\n=== Conclusão ===");
        System.out.println("Construtores permitem inicializar o objeto com dados");
        System.out.println("desde o momento da criação, evitando esquecer de preencher.");

        //Criando 3 novos alunos usando construtor parametrizado
        System.out.println("\n---- Criando 3 novos alunos com construtor parametrizado ---" );
        Aluno aluno7 = new Aluno("Gustavo", 26);
        Aluno aluno8 = new Aluno("Vanessa", 21);
        Aluno aluno9 = new Aluno("Eduardo", 25);

        System.out.println("Nome: " + aluno7.nome + " (" + aluno7.idade + " anos)");
        System.out.println("Nome: " + aluno8.nome + " (" + aluno8.idade + " anos)");
        System.out.println("Nome: " + aluno9.nome + " (" + aluno9.idade + " anos)");

        System.out.println("\n --- Criando um novo aluno com construtor vazio e preenchendo depois ---");
        Aluno aluno10 = new Aluno();

        aluno10.nome = "Luis";
        aluno10.idade = 20;

        System.out.println("Nome: " + aluno10.nome + " (" + aluno10.idade + " anos)");


    }

}
