# PeludinhosMoursCore
Projeto **core** (Java 17, Maven) da Etapa 7.

Nesta etapa foi criada a estrutura de testes automatizados com **JUnit 5**,  
adicionando a pasta `src/test/java` (antes inexistente no projeto).  

Dentro dela, foi incluído o teste:
para validar o método `calcular()` da classe `PrecoPorPorteStrategy`.

Também foi atualizado o `pom.xml` para incluir as dependências do **JUnit 5**.

---

# Execução dos testes

Abra o projeto no **NetBeans** e execute:
- Clique no arquivo `PrecoPorPorteStrategyTest.java` → **Test File**,
  botão **Run Project**  
  ou, no terminal:
  ```bash
  mvn test

