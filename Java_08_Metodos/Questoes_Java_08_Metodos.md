# Java 08 - Metodos - Questoes

---

## Atividade 1 - Execute e observe

**O que fazer:**

- Execute o `Principal.java` sem alterar nada.
- Observe os 6 metodos diferentes sendo usados na saida.

**Cole a saida completa abaixo.**

```text
=== Exercício 08 - Métodos ===

--- Método VOID: apresentar() ---
Olá, meu nome é João Silva e tenho 18 anos.
Olá, meu nome é Maria Santos e tenho 16 anos.

--- Método VOID com parâmetro: fazer(nota) ---
João Silva fez um teste com nota 85
Maria Santos fez um teste com nota 92

--- Método com RETORNO (int): calcularAnoNascimento() ---
João nasceu em: 2008
Maria nasceu em: 2010

--- Método com RETORNO (String): obterCategoria() ---
João Silva é: Maior de idade
Maria Santos é: Menor de idade

--- Método com parâmetro E retorno: multiplicarIdade(int) ---
Idade de João vezes 2: 36
Idade de Maria vezes 3: 48

--- Método VOID que imprime vários dados: exibirInfo() ---
===== Informações do Aluno =====
Nome: João Silva
Idade: 18
Ano de nascimento (estimado): 2008
Categoria: Maior de idade
================================
===== Informações do Aluno =====
Nome: Maria Santos
Idade: 16
Ano de nascimento (estimado): 2010
Categoria: Menor de idade
================================

--- Usando tudo junto ---
Aluno criado: 
Olá, meu nome é Carlos e tenho 20 anos.
Nascimento estimado: 2006
Categoria: Maior de idade
Carlos fez um teste com nota 75

=== Conclusão ===
Métodos adicionam COMPORTAMENTO aos objetos.
Métodos VOID: fazem algo mas não retornam nada.
Métodos com RETORNO: fazem algo e devolvem um resultado.
```

---

## Atividade 2 - Tabela de metodos

**O que fazer:**

- Complete a tabela abaixo com sim ou nao:

**Complete a tabela:**

| Metodo | Imprime algo? | Retorna valor? | Recebe parametro? |
|--------|--------------|----------------|-------------------|
| `apresentar()` | sim | não | não |
| `fazer(nota)` | sim | sim | sim |
| `calcularAnoNascimento()` | sim | sim | não |
| `obterCategoria()` | sim | não | não |
| `multiplicarIdade(mult)` | sim | sim | sim |
| `exibirInfo()` | sim | sim | não |

---

## Atividade 3 - Perguntas

**Responda:**

**O que e um metodo em Java?**

R. Método é uma forma de adicionar comportamento aos objetos

**Qual e a diferenca entre um atributo e um metodo?**

R. Um atributo são as características que um objeto tem, e um método é o comportamento que o objeto tem

**O que significa `void` em um metodo?**

R. Significa que o método faz algo mas não retorna nenhum valor

**Quando usar um metodo void vs um metodo com retorno?**

R. Um método void se usa quando ele não precisa receber nenhum parametro, e um método com retorno você da um parametro para que ele retorne um valor

**Como voce chama um metodo?**

R. Usando a sintaxe "objeto.metodo()"

**A classe `Aluno` tem quantos metodos? Liste todos.**

R. Seis métodos. O método apresentar, o método fazer, o método calcularAnoNascimento, o método obterCategoria, o método multiplicarIdade e o método exibirInfo

**Qual e o metodo mais util na pratica? Por que?**

R. O método exibirInfo. Porque ao usar esse método você imprime todos os outros métodos criados juntos.

---

## Atividade 4 - Modificando o codigo

**O que fazer:**

- No `Aluno.java` adicione o metodo:
```java
public double calcularIdadeEmDias() {
-     double dias = idade * 365.0;
-     return dias;
}
```
- No `Principal.java` chame o novo metodo:
```java
double dias = aluno1.calcularIdadeEmDias();
System.out.println(aluno1.nome + " tem aproximadamente " + dias + " dias de vida.");
```
- Execute e veja o resultado.

**Cole a saida abaixo.**

```text
 --- Calculando a idade em dia através do método calcularIdadeEmDias ---
João Silva tem aproximadamente 6570.0 dias de vida.
```

---

## Atividade 5 - Reflexao final

**Responda:**

**Um metodo pode ter multiplos parametros?**

R. Sim

**Qual e a vantagem de usar metodos em vez de deixar tudo no `main`?**

R. Além de diminuir as linhas de código, você consegue organizar os métodos e apenas chamá-los quando necessário

**Se voce tivesse 1000 alunos, seria mais facil usar metodos ou repetir codigo?**

R. Seria mais fácil usar métodos

**Qual metodo voce criaria para a classe `Aluno` que seria util na pratica?**

R. Criaria um método chamado "perfilAluno", onde teria parametros como Nome, Idade, Data de Nascimento, Matricula e Turno que estuda

---
