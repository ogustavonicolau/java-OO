package Exercicio06_Ler_Atributos;

public class Principal {

    public static void main(String[] args) {

        Aluno objetoAluno = new Aluno();

        objetoAluno.nome = "Ana";
        objetoAluno.idade = 17;

        System.out.println("Aluno: " + objetoAluno.nome);
        System.out.println("Idade: " + objetoAluno.idade);

        Aluno aluno2 = new Aluno();

        aluno2.nome = "Lucas";
        aluno2.idade = 21;

        System.out.println(aluno2.nome);
        System.out.println(aluno2.idade);

        System.out.println("Nome do primeiro aluno: " + objetoAluno.nome);
        System.out.println("Idade do primeiro aluno: " + objetoAluno.idade);
        System.out.println("Nome do segundo aluno: " + aluno2.nome);
        System.out.println("Idade do segundo aluno: " + aluno2.idade);

    }
}