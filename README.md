# Sistema Bancário Simples em Java

Este é um programa Java que simula um sistema bancário simples. Ele permite que um cliente realize operações bancárias básicas, como depósitos, saques e transferências entre uma conta corrente e uma conta poupança.

## Funcionalidades

O programa oferece as seguintes funcionalidades:

1. Depósito em conta corrente.
2. Depósito em conta poupança.
3. Saque da conta corrente.
4. Transferência de fundos da conta corrente para a conta poupança.
5. Exibição de extratos de conta corrente e poupança.
6. Opção para sair do programa.

## Como Usar

1. Execute o programa Java a partir da classe `Main`.

2. O programa apresentará um menu de operações para o usuário escolher.

3. Para cada operação (saque, transferência, etc.), o programa solicitará as informações necessárias, como valores.

4. O programa continuará a solicitar operações até que o usuário escolha a opção de sair.

## Exemplo de Uso

<<< Escolhendo a opção 3 >>>
Escolha uma operação:

1. Sacar
2. Transferir
3. Sair
Opção: 1
Digite o valor para sacar da Conta Corrente: 500.0
Saldo após saque: 500.0

--- Extrato da Conta Corrente ---
Cliente: Fabricio
Saldo: 500.0

<<< Escolhendo a opção 2 >>>
Escolha uma operação:

1. Sacar
2. Transferir
3. Sair
Opção: 2
Digite o valor para transferir da Conta Corrente para a Poupança: 300.0
Saldo após transferência da Conta Corrente: 200.0
Saldo após transferência da Conta Poupança: 400.0

--- Extrato da Conta Corrente ---
Cliente: Fabricio
Saldo: 200.0
--- Extrato da Conta Poupança ---
Cliente: Fabricio
Saldo: 400.0

<<< Escolhendo a opção 3 >>>
Escolha uma operação:

1. Sacar
2. Transferir
3. Sair
Opção: 3
Saindo do programa.