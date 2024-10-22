# Empresa de Aluguel de Patins

## Descrição
Este projeto visa automatizar os processos de aluguel de patins para uma empresa de aluguel. O sistema gerencia o processo de aluguel desde a consulta de disponibilidade até a devolução dos patins, incluindo o controle de danos e o fechamento do caixa diário.

## Funcionalidades
A empresa realiza os seguintes processos:
- Consulta de disponibilidade de patins por número.
- Registro de aluguel com o CPF do cliente e o número dos patins.
- Controle do estado dos patins (disponível, indisponível, danificado).
- Encerramento do aluguel e cálculo de valores adicionais no caso de danos.
- Registro das formas de pagamento.
- Fechamento de caixa diário, com emissão de relatórios.

## Modelagem dos Processos
Os processos da empresa foram modelados usando diagramas de atividade, facilitando a visualização e permitindo a identificação de atividades que podem ser automatizadas.

### 1. Processo de Entrega de Patins (Início do Aluguel)
O cliente solicita o aluguel de patins, e o sistema verifica a disponibilidade e registra o aluguel com base no CPF do cliente. O estado do par de patins é alterado para indisponível, e o cliente recebe os patins.

### 2. Processo de Recebimento do Par de Patins (Fim do Aluguel)
O sistema registra o encerramento do aluguel, verifica o estado dos patins, calcula o valor final a ser pago pelo cliente (incluindo danos, se houver), e muda o estado dos patins para disponível.

### 3. Fechamento de Caixa
No final do dia, o sistema gera um relatório de fechamento do caixa, incluindo o total de cada forma de pagamento. O atendente confere e registra os valores, enviando o relatório ao proprietário.

## Casos de Uso

### 1. Caso de Uso: Alugar Patins
**Resumo:** O atendente registra o aluguel de patins e entrega os patins ao cliente.

**Pré-Condições:**
- Aluguel de patins registrado.

**Pós-Condições:**
- Par de patins marcado como indisponível.

**Ator Principal:** Atendente.

**Fluxo Principal:**
1. O cliente solicita um aluguel de patins.
2. O atendente pergunta o número de calçado do cliente.
3. O atendente verifica a disponibilidade de patins no sistema.
4. O sistema informa a disponibilidade.
5. O atendente registra o aluguel no sistema.
6. O atendente solicita o CPF do cliente.
7. O sistema registra o CPF, número dos patins e hora de início do aluguel.
8. O atendente entrega os patins ao cliente.

**Fluxo Alternativo:**
- Se não houver patins disponíveis, o atendente informa ao cliente e o processo é encerrado.

### 2. Caso de Uso: Encerrar Aluguel de Patins
**Resumo:** O atendente encerra o aluguel de patins e registra o pagamento.

**Pré-Condições:**
- Nenhuma.

**Pós-Condições:**
- Aluguel de patins encerrado.

**Ator Principal:** Atendente.

**Fluxo Principal:**
1. O cliente devolve os patins.
2. O atendente solicita o encerramento do aluguel no sistema.
3. O sistema exibe os detalhes do aluguel.
4. O atendente verifica o estado dos patins.
5. O atendente informa o valor a ser pago.
6. O cliente realiza o pagamento.
7. O sistema encerra o aluguel e registra o pagamento.

**Fluxo Alternativo:**
- Se os patins estiverem danificados, o atendente adiciona um valor adicional ao total e o cliente paga a diferença.

### 3. Caso de Uso: Fechar o Caixa
**Resumo:** O atendente realiza o fechamento do caixa ao final do dia.

**Pré-Condições:**
- Nenhuma.

**Pós-Condições:**
- Fechamento do caixa registrado.

**Ator Principal:** Atendente.

**Fluxo Principal:**
1. O atendente solicita o fechamento do caixa.
2. O sistema exibe o total de cada forma de pagamento.
3. O atendente confere os valores e confirma o fechamento.
4. O sistema gera o relatório de fechamento do caixa.
5. O atendente envia o relatório ao proprietário.

## Tecnologias Utilizadas
- Sistema de registro de aluguel de patins.
- Controle de estoque e estado de produtos.
- Relatórios automáticos de fechamento de caixa.

Este README.md serve como documentação inicial para o desenvolvimento do sistema automatizado da empresa de aluguel de patins, focando nos principais processos e casos de uso.
"""
