# Java 12 - Relacoes entre Objetos - Questoes

---

## Atividade 1 - Executando o codigo

**O que fazer:**

- Execute o `Principal.java` e observe a saida.

**Cole a saida completa do terminal abaixo.**

```text
=== Exercicio 12 - Relacoes entre Objetos ===

--- Criando a Escola (composicao: Endereco criado junto) ---

--- Criando Departamentos (composicao) ---
Departamentos criados. Se a Escola for extinta, eles tambem serao.

--- Criando Alunos fora da Escola (agregacao) ---
Alunos criados independentemente.
Se a Escola for extinta, os alunos continuam existindo!

--- Matriculando alunos (agregacao) ---

--- Estado completo da Escola ---
=== Escola: Escola Tecnica Java ===
CNPJ: 12.345.678/0001-99
  Endereco: Av. da Tecnologia, 100, Sao Paulo - CEP: 01310-100
Departamentos (3):
  Departamento: Informatica
  Departamento: Matematica
  Departamento: Portugues
Alunos matriculados (3):
  Aluno: Ana Lima (matricula: 1001)
  Aluno: Bruno Costa (matricula: 1002)
  Aluno: Carla Dias (matricula: 1003)

--- Alunos existem independente da Escola ---
aluno1 fora da escola:   Aluno: Ana Lima (matricula: 1001)
aluno2 fora da escola:   Aluno: Bruno Costa (matricula: 1002)

=== Resumo das Relacoes ===
ASSOCIACAO  -> objetos se usam, existencias independentes
AGREGACAO   -> pai contem filho, filho SOBREVIVE ao pai
              Exemplo: Escola-Aluno
COMPOSICAO  -> pai contem filho, filho NAO EXISTE sem o pai
              Exemplo: Escola-Departamento, Escola-Endereco
```

---

## Atividade 2 - Identificando as relacoes

**Analise o codigo de `Escola.java` e responda:**

**O `Endereco` e criado dentro do construtor da `Escola`. Que tipo de relacao isso representa?**

R. Relação de composição, onde pai contem filho, e filho não existe sem o pai

**O `Aluno` e criado fora da `Escola` e depois passado para `matricularAluno`. Que tipo de relacao isso representa?**

R. Relação de agregação, onde pai contem fiho, e filho sobrevive ao pai

**O `Departamento` e criado pelo metodo `criarDepartamento` da propria `Escola`. Que tipo de relacao isso representa?**

R. Relação de composição.
---

## Atividade 3 - Agregacao vs Composicao

**Complete a tabela:**

| Relacao | Classes | O filho sobrevive sem o pai? | Tipo |
|---------|---------|------------------------------|------|
| Escola - Aluno | Sim | Agregação |
| Escola - Departamento | Não | Composição |
| Escola - Endereco | Não | Composição | 

---

## Atividade 4 - Cardinalidade

**Observe o codigo de `Escola.java`:**

```java
private Departamento[] departamentos; // array de ate 10
private Aluno[] discentes;            // array de ate 1000
```

**Qual e a cardinalidade da relacao Escola-Departamento?**

R. Um pra muitos.

**Qual e a cardinalidade da relacao Escola-Aluno?**

R. Um pra muitos 

**Qual e a cardinalidade da relacao Escola-Endereco?**

R. Um pra um

---

## Atividade 5 - Ciclo de vida

**Imagine que a Escola fecha (objeto `escola` e destruido). Responda:**

**O que acontece com os objetos `Departamento`?**

R. Também é destruído

**O que acontece com os objetos `Aluno`?**

R. Continua existindo   

**O que acontece com o objeto `Endereco`?**

R. Também é destruído

**Por que a diferenca entre Aluno e Departamento importa no design do sistema?**

R. Porque o limite da quantidade de alunos é maior do que o limite da quantidade de departamento.

---

## Atividade 6 - Perguntas finais

**O que e Associacao?**

R. É quando os objetos se usam e as existencias são independentes uma da outra

**Qual e a diferenca principal entre Agregacao e Composicao?**

R. A diferença é que na agregação, o filho sobrevive ao pai, enquanto na composição, o filho não existe sem o pai.

**Composicao e um caso especial de qual outra relacao?**

R. De agregação.

**Cite um exemplo real (fora do codigo) de cada relacao:**

- Associacao:

R. Um objeto chamado "Aluguel de Carro", que também usa outros objetos, como "Carros", "Endereço", "Clientes", etc.

- Agregacao:

R. O objeto Cliente é criado fora do construtor Aluguel de Carro e é independente

- Composicao:

R. O objeto Carros é criado dentro do construtor Aluguel de Carro e depende da existência do mesmo

---
