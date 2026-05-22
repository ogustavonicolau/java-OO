# Java 06 - Ler atributos - Questoes

---

## Atividade 1 - Executando o codigo base

**O que fazer:**

- Execute o `Principal.java` sem alterar nada.

**Cole a saida do terminal abaixo.**

```
Maria
20

```

**Responda:**

**O que significa ler um atributo?**

R. Significa ler as características do objeto

**Qual atributo foi lido em cada `println`?**

R. nome e idade do objeto Aluno

---

## Atividade 2 - Alterando valores e lendo novamente

**O que fazer:**

- Altere os valores:
```java
- objetoAluno.nome = "Ana";
- objetoAluno.idade = 17;
```
- Execute novamente.

**Cole a nova saida abaixo.**

```text
Ana
17

```

**Responda:**

**O que mudou na leitura dos atributos?**

R. Mudou os valores

**Por que a saida mudou?**

R. Por que as características do objeto foram modificadas

---

## Atividade 3 - Lendo em forma de texto

**O que fazer:**

- Altere a impressao para:
```java
System.out.println("Aluno: " + objetoAluno.nome);
System.out.println("Idade: " + objetoAluno.idade);
```
- Execute novamente.

**Cole o resultado abaixo.**

```text
Aluno: Ana
Idade: 17

```

**Responda:**

**Qual e a diferenca entre imprimir apenas o valor e imprimir com texto?**

R. Ao imprimir apenas o valor, usa-se somente a sintaxe "objeto.atributo", e ao imprimir com texto, deve-se usar o texto entre aspas e o sinal de + seguido pela sintaxe "objeto.atributo"

**O conteudo lido mudou?**

R. Sim, o texto serviu para dar contexto aos valores

---

## Atividade 4 - Lendo antes de preencher

**O que fazer:**

- Crie outro objeto e leia antes de preencher:
```java
Aluno aluno2 = new Aluno();
System.out.println(aluno2.nome);
System.out.println(aluno2.idade);
```
- Depois preencha e leia novamente:
```java
aluno2.nome = "Lucas";
aluno2.idade = 21;
System.out.println(aluno2.nome);
System.out.println(aluno2.idade);
```
- Execute novamente.

**Cole a saida completa abaixo.**

```text
Aluno: Ana
Idade: 17
Marcos
20
```

**Responda:**

**Quais valores aparecem antes de preencher?**

R. null e 0

**Por que esses valores aparecem?**

R. Porque o objeto foi criado mas seus atributos não foram preenchidos

---

## Atividade 5 - Lendo valores de mais de um objeto

**O que fazer:**

- Leia os dois objetos em sequencia:
```java
System.out.println(objetoAluno.nome);
System.out.println(objetoAluno.idade);
System.out.println(aluno2.nome);
System.out.println(aluno2.idade);
```
- Execute novamente.

**Cole a saida abaixo.**

```text
Ana
17
Marcos
20
```

**Responda:**

**Como a leitura confirma que existem objetos diferentes?**

R. Mostrando na tela atributos diferentes

**O que aconteceria se ambos os objetos fossem o mesmo?**

R. Seria lido apenas os atributos do objeto em questão

---

## Atividade 6 - Explicacao final

**Responda:**

**O que e ler um atributo em Java?**

R. Um atributo são as características de um objeto, e ler um atributo significa fazer a leitura e mostrar essas características

**Qual a diferenca entre preencher e ler?**

R. Ao preencher você da ao objeto suas características, e ao ler, você mostra na tela essas características

**O que significa acessar `objeto.atributo`?**

R. Significa buscar na memória os valores que você atribuiu ao objeto em questão e mostrá-lo na tela

**O que voce aprendeu neste exercicio?**

R. Aprendi o conceito de leitura e preenchimento de atributos.

---
