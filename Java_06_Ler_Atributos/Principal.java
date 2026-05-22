package Java_06_Ler_Atributos;

public class Principal {

    public static void main(String[] args) {

        Aluno objetoAluno = new Aluno();

        objetoAluno.nome = "Ana";
        objetoAluno.idade = 17;

        System.out.println("Aluno: " + objetoAluno.nome);
        System.out.println("Idade: " + objetoAluno.idade);

        Aluno aluno2 = new Aluno();

        aluno2.nome = "Marcos";
        aluno2.idade = 20;

        System.out.println(objetoAluno.nome);
        System.out.println(objetoAluno.idade);
        System.out.println(aluno2.nome);
        System.out.println(aluno2.idade);

    }
}