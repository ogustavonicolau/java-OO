# Java 09 - Encapsulamento - Questoes

---

## Atividade 1 - Execute e observe

**O que fazer:**

- Execute o `Principal.java` sem alterar nada.
- Observe quais modificacoes foram aceitas e quais foram rejeitadas.

**Cole a saida completa abaixo.**

```text
=== Exercício 09 - Encapsulamento ===

--- Criados dois alunos com sucesso ---

--- Usando GETTERS (leitura via método) ---
Aluno 1: João Silva (18 anos)
Aluno 2: Maria Santos (16 anos)

--- Usando SETTERS (modificação com validação) ---

Tentando mudar nome de aluno1 para 'Carlos':
Nome atualizado com sucesso!

Tentando mudar nome de aluno1 para 'AB':
Erro: Nome deve ter pelo menos 3 caracteres!

Tentando mudar nome de aluno1 para '':
Erro: Nome não pode ser vazio!

Tentando mudar idade de aluno1 para 19:
Idade atualizada com sucesso!

Tentando mudar idade de aluno1 para -5:
Erro: Idade não pode ser negativa!

Tentando mudar idade de aluno1 para 200:
Erro: Idade não pode ser maior que 150 anos!

--- Estado final dos alunos ---
===== Informações do Aluno =====
Nome: Carlos
Idade: 19
================================
===== Informações do Aluno =====
Nome: Maria Santos
Idade: 16
================================

--- Diferença: COM vs SEM encapsulamento ---
SEM encapsulamento (Ex. 05-08):
  aluno.nome = "Qualquer coisa";  // Sem validação!
  aluno.idade = -50;            // Sem validação!
  ? Dados podem ficar inválidos

COM encapsulamento (Ex. 09):
  aluno.setNome("Qualquer coisa");  // Com validação!
  aluno.setIdade(-50);              // Com validação!
  ? Dados são protegidos!

=== Conclusão ===
Encapsulamento = private (dados protegidos) + getters/setters (controle)
Benefício: Garante que os dados do objeto sempre estejam válidos!
```

---

## Atividade 2 - Comparando com exercicios anteriores

**Responda:**

**O que seria possivel fazer sem encapsulamento que agora e bloqueado?**

R. Seria possível colocar qualquer nome e qualquer idade, por exemplo: nome com menos de 3 de letras e idade acima de 150 anos.

---

## Atividade 3 - Entendendo a validacao

**O que fazer:**

- Leia o setter `setNome()` no `Aluno.java`.

**Responda:**

**Qual tentativa de modificar o nome foi aceita?**

R. this.nome = novoNome;

**Qual foi rejeitada por ser muito curta?**

R. novoNome.length() < 3

**Qual foi rejeitada por ser vazia?**

R. novoNome == null // novoNome.isEmpty()

---

## Atividade 4 - Perguntas

**Responda:**

**O que e encapsulamento?**

R. É uma forma de impor regras para proteger os dados

**Qual e a diferenca entre `public` e `private`?**

R. O public permite que os dados possam ser acessados diretamente de fora da classe, e o private não permite isso

**O que um getter faz?**

R. Um getter impõe um método para ler e acessar os atributos do objeto

**O que um setter faz?**

R. Um setter impõe um método para escrever/modificar um atributo, porém com validação

**Por que usar setters em vez de permitir acesso direto aos atributos?**

R. Por que com o setters, as modificações só poderão ser feitas de acordo com a validação que o desenvolvedor determinou

**O que significa validacao de dados?**

R. Significa conferir se existe permissão para acessar ou modificar os dados.

**Qual e a convencao de nomes para getters e setters em Java?**

R. camelCase

---

## Atividade 5 - Modificando a validacao

**O que fazer:**

- No setter `setNome()` do `Aluno.java`, adicione uma terceira validacao: maximo 50 caracteres.
- Teste com um nome muito longo no `Principal.java`.

**Cole a saida do teste abaixo.**

```text
==== Nova Validação: Nome com limite de 50 caracteres ====

 Tentando mudar o nome para um nome com mais de 50 caracteres:
Erro: Nome deve ter no máximo 50 caracteres!

 Mudando o nome para 'Gustavo' 
Nome atualizado com sucesso!

 ==== Dados Atualizados ====
===== Informações do Aluno =====
Nome: Gustavo
Idade: 19
================================
```

---

## Atividade 6 - Reflexao final

**Responda:**

**Se todos os atributos fossem `public`, qual seria o problema?**

R. Os dados poderiam ser modificados e incluidos atributos que não fizessem sentido

**Se todos fossem `private` sem getters/setters, qual seria o problema?**

R. Os dados não poderiam ser acessados nem modificados

**Qual e o balanco correto entre `private` e getters/setters?**

R. Manter os dados privados e só expor getter e setter quando houver necessidade

**Na sua profissao, por que encapsulamento e importante?**

R. Para proteção e organização dos dados

**Voce implementaria encapsulamento em todas as classes que cria?**

R. Não, somente nas classes onde os dados devem ter uma proteção mais rígida.

---
