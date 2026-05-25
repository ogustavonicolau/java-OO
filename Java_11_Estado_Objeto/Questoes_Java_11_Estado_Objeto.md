# Java 11 - Estado do Objeto - Questoes

---

## Atividade 1 - Executando o codigo

**O que fazer:**

- Execute o `Principal.java` e observe a saida.

**Cole a saida completa do terminal abaixo.**

```text
=== Exercicio 11 - Estado do Objeto ===

--- Estado inicial de aluno1 ---
=== Estado do Objeto Aluno ===
Nome : Maria
Idade: 20
Cod. : 0,891144
==============================

--- Alterando o estado (definirNome) ---
=== Estado do Objeto Aluno ===
Nome : Maria Santos
Idade: 21
Cod. : 0,891144
==============================

--- Dois objetos: estados independentes ---
aluno1 nome : Maria Santos
aluno2 nome : Carlos
aluno1 cod. : 0,891144
aluno2 cod. : 0,536149
(Codigos diferentes: cada objeto tem seu proprio estado)

--- Ciclo de vida: Garbage Collection ---
Objeto criado  : Temporario
Referencia removida (temporario = null)
O objeto nao tem mais referencia -> pode ser destruido pela JVM.
System.gc() chamado -> JVM decidira quando coletar.

=== Conclusao ===
Estado      = valores dos atributos no momento.
Comportamento = acoes que o objeto realiza (metodos).
GC          = JVM destroi objetos sem referencia automaticamente.
```

**Responda:**

**Os dois `codigoIdentificador` sao iguais? Por que?**

R. Por que o objeto não foi alterado, somente seus atributos

---

## Atividade 2 - Estado do objeto

**Abra o `Aluno.java` e responda:**

**O que define o ESTADO de um objeto?**

R. Os atributos

**Quais sao os atributos que compoem o estado do objeto `Aluno`?**

R. nome, idade, codigoIdentificador e aleatorio

**O que define o COMPORTAMENTO de um objeto?**

R. Os métodos

**Liste os metodos de `Aluno` que sao comportamentos:**

R. definirNome, definirIdade e exibirEstado

---

## Atividade 3 - Mudanca de estado

**Analise o trecho do `Principal.java`:**

```java
Aluno aluno1 = new Aluno("Maria", 20);
aluno1.definirNome("Maria Santos");
aluno1.definirIdade(21);
```

**Responda:**

**Qual era o estado de `aluno1` logo apos a criacao?**

R. Maria, 20

**Qual era o estado de `aluno1` apos as chamadas de `definirNome` e `definirIdade`?**

R. Maria Santos, 21

**O `codigoIdentificador` mudou tambem? Por que?**

R. Não, Porque o objeto continua o mesmo e somente os atributos foram modificados

---

## Atividade 4 - Random e codigo unico

**O atributo `codigoIdentificador` e gerado usando `Random`. Abra o `Aluno.java` e observe o construtor.**

**Responda:**

**O que faz a linha `this.aleatorio = new Random()`?**

R. Ele cria um novo objeto da classe Random e armazena no atributo "aleatorio"

**O que faz a linha `this.codigoIdentificador = aleatorio.nextDouble()`?**

R. Ela atribui um número decimal aleatorio ao atributo "codigoIdentificador"

**Por que e util gerar um codigo automatico no construtor?**

R. Porque isso agiliza o desenvolvimento, diminui as linhas de código e evita erros de digitação

**Execute o programa duas vezes. Os codigos sao iguais ou diferentes entre execucoes?**

R. Os códigos são diferentes

---

## Atividade 5 - Garbage Collection

**Analise o trecho:**

```java
Aluno temporario = new Aluno("Temporario", 15);
temporario = null;
System.gc();
```

**Responda:**

**O que acontece quando fazemos `temporario = null`?**

R. A Referencia é removida

**O que e o Garbage Collector (GC)?**

R. É um "coletor de lixo", é o mecanismo do JVM que identifica e remove objetos que não estão em uso, liberando espaço na memória

**O que faz `System.gc()`? E uma ordem ou uma sugestao?**

R. É um método que solicita que a JVM execute o Garbage Collector para liberar memória. Uma Sugestão

**O programador pode destruir um objeto manualmente em Java? Por que?**

R. Não. Porque a gestão de memória é feita de forma automática pela JVM

---

## Atividade 6 - Perguntas finais

**Complete as frases:**

**O estado de um objeto e definido por ___.**

R. Atributos

**O comportamento de um objeto e definido por ___.**

R. Métodos

**Quando um objeto nao tem mais nenhuma referencia apontando para ele, ele ___.**

R. É nulo

**A palavra `import java.util.Random` serve para ___.**

R. Importar um classe que permite gerar números aleatórios.

---
