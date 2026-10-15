# LogEntry

Lê um arquivo de log informado pelo usuário (nome e instante de acesso em cada linha) e mostra o total de usuários distintos.

**Conceitos:** classe `LogsEntry` com `equals` e `hashCode` sobrescritos (pelo nome), `HashSet`, `BufferedReader`/`FileReader` com try-with-resources, `Instant.parse` e `Date.from`, tratamento de `IOException`.
