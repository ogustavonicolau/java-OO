package Exercicio04_Vazio;

public class Principal {

    public static void main(String[] args) {

        // Criamos o objeto, mas NAO preenchemos nada ainda.
        Aluno aluno = new Aluno();

        // Quando um objeto nasce, seus atributos tem valores padrao:
        // String (texto) -> null
        // int (inteiro)  -> 0
        System.out.println("Exercicio 04 - Objeto nasce vazio (com valores padrao).");
        System.out.println("nome (String) = " + aluno.nome);
        System.out.println("idade (int)   = " + aluno.idade);

        Aluno aluno2 = new Aluno();

        aluno2.nome = "Maria";
        aluno2.idade = 19;

        aluno2.estudar();
        aluno.estudar();

        aluno.nome = "Gustavo";
        aluno.idade = 26;

        aluno.fazerProva();
        aluno2.fazerProva();

    }

}