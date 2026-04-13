## Cursor no Windows (setup rápido)

### 1) Comandos no terminal (sem confundir VS Code x Cursor)

Recomendado:

- **VS Code** abre com: `code .`
- **Cursor** abre com: `cursor .`

Para instalar:

- No **Cursor**: `Ctrl+Shift+P` → **Shell Command: Install 'cursor' command**
- No **VS Code**: `Ctrl+Shift+P` → **Shell Command: Install 'code' command**

Depois disso, feche todos os terminais e abra um novo.

Para checar:

```bat
where code
where cursor
```

> Observação: no PowerShell, use `where.exe` (porque `where` pode ser alias do PowerShell).

### 2) PowerShell 5.x e `&&`

No seu Windows o PowerShell é 5.x, então **evite** usar `&&` em comandos.
Use sempre em duas linhas:

```bat
javac Exercicio04_Vazio\Aluno.java Exercicio04_Vazio\Principal.java
java Exercicio04_Vazio.Principal
```

### 3) PDF no Cursor

É normal o Cursor pedir extensão para abrir PDF. Se no VS Code já abre “nativo”, pode ser porque o VS Code está com um visualizador de PDF habilitado.

Alternativas:

- Abrir o PDF no navegador
- Abrir no VS Code
- Instalar uma extensão de PDF no Cursor

### 4) WSL no Cursor

Se aparecer mensagem parecida com “WSL extension is supported only in Microsoft versions of VS Code”, significa que a extensão de WSL **não funciona no Cursor**.

Isso não quer dizer que você está no WSL; quer dizer que você está no **Windows** e a extensão não é suportada no Cursor.

