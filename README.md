# PeludinhosMoursCore

**UC15 — Etapa 7 | Projeto Integrador: Banho e Tosa**

## Descrição do Projeto

Este projeto faz parte da **Etapa 7** do curso técnico e representa a continuação do módulo principal (**core**) do sistema **Peludinhos Mours**, voltado para o gerenciamento de **clientes, pets, serviços e agendamentos** de banho e tosa.

Nesta etapa, o foco foi a **implementação e execução de testes automatizados** utilizando **JUnit 5** dentro da estrutura de projeto **Maven**, garantindo a validação correta das regras de negócio desenvolvidas anteriormente.  
Foram realizados ajustes no método de **cálculo de preço por porte do pet**, além da criação de testes unitários para verificar o comportamento esperado em diferentes cenários.

O sistema foi desenvolvido em **Java**, utilizando **Maven** dentro do **NetBeans**, seguindo boas práticas de codificação, arquitetura em camadas e versionamento com **Git/GitHub**.

---

## Funcionalidades principais

- Implementação de **testes automatizados** com **JUnit 5**  
- Criação da classe de teste `PrecoPorPorteStrategyTest`  
- Validação de cálculos para os portes:
  - **PEQUENO**
  - **MÉDIO** (multiplicador 1.20)
  - **GRANDE** (multiplicador 1.40)
- Testes de **cenários de erro** e **entradas inválidas**
- Configuração do **Maven Surefire Plugin** para execução automatizada dos testes
- **Aprimoramento do método `calcular()`** na classe `PrecoPorPorteStrategy`
- Execução dos testes com resultados de **100% de sucesso**

---

## Tecnologias utilizadas

- **Java**  
- **JUnit 5**  
- **Apache Maven**  
- **NetBeans IDE**  
- **Git / GitHub**
