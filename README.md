# Sistema Bancário Simples em Java

Este é um programa Java que simula um sistema bancário simples. Ele permite que um cliente realize operações bancárias básicas, como depósitos, saques e transferências entre uma conta corrente e uma conta poupança. Ele foi apresentado ao Desafio de Projeto para a Formação Java (DIO): Criando um Banco Digital com Java e Orientação a Objetos.

## Descrição

Este é um programa que simula um sistema bancário simples, que:

1. Importa a classe Scanner para ler entradas do usuário.
2. No método main, cria uma instância do Scanner para capturar as entradas do usuário.
3. Cria um objeto Cliente chamado "Fabricio" e define seu nome como "Fabricio".
4. Cria duas contas bancárias: uma do tipo ContaCorrente (cc) e outra do tipo ContaPoupanca (poupança), ambas associadas ao cliente "Fabricio".
5. Deposita R$ 1000 na conta corrente (cc) e exibe um extrato da conta corrente.
6. Deposita R$ 100 na conta poupança (poupança) e exibe um extrato da conta poupança.
7. Entra em um loop infinito que exibe um menu de operações:

1: Sacar dinheiro da conta corrente.
2: Transferir dinheiro da conta corrente para a conta poupança.
3: Sair do programa.

8. O programa lê a escolha do usuário (um número inteiro) usando o Scanner.
9. Com base na escolha do usuário, o programa executa as seguintes ações:
    Se o usuário escolher "1", o programa pede o valor a ser sacado da conta corrente, executa o saque e exibe um extrato da conta corrente.
    Se o usuário escolher "2", o programa pede o valor a ser transferido da conta corrente para a conta poupança, executa a transferência e exibe extratos de ambas as contas.
    Se o usuário escolher "3", o programa exibe uma mensagem de saída, fecha o Scanner e encerra o programa.
    Se o usuário escolher uma opção inválida, o programa exibe "Opção inválida".
10. O loop continua até que o usuário escolha a opção "3" para sair, momento em que o programa é encerrado.


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

<<< Escolhendo a opção 1 >>>

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