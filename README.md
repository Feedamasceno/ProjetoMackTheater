# ProjetoMackTheater

## O objetivo do projeto era desenvolver um sistema, utilizando a linguagem Java, de acordo com as funcionalidades definidas pelos donos do teatro. 

Exemplo de Execução do Programa
Nesta seção é apresentada como deve ser a interface com o usuário do programa. A iniciar o programa deve ser apresentado ao usuário o menu abaixo. O usuário poderá escolher umas das três opções para continuar com a execução do programa ou ainda, selecionar a opção para sair o programa.

*** MACK THEATHER ***
1) Cadastrar Espetáculo
2) Cadastrar Cliente
3) Compra de Entradas
4) Sair
Selecione uma opção:
Cadastrar Espetáculo

Quando o usuário selecionar a opção 1) do menu, o sistema deve solicitar as informações necessárias para cadastrar um novo espetáculo no sistema. Após o usuário informar todos os dados necessários o espetáculo é cadastrado no sistema e retorna para o menu principal. A seguir é apresentado um exemplo de execução desta opção.

*** CADASTRO DE ESPETÁCULO ***
Nome do Espetáculo: Espetáculo 01
Data: 15/05/2023
Hora: 19h30
Preço da Entrada Inteira: 30

Retorna ao menu principal 

Cadastrar Cliente

Quando o usuário selecionar a opção 2) do menu, o sistema deve solicitar as informações necessárias para cadastrar um novo cliente no sistema. Após o usuário informar todos os dados necessários o cliente é cadastrado no sistema e retorna para o menu principal. A seguir é apresentado um exemplo de execução desta opção.

*** CADASTRO DE CLIENTE ***
Nome do Cliente: José da Silva
CPF: 12345678900

Retorna ao menu principal 
<div>
<h2>

### Compra de Entradas

Quando o usuário selecionar a opção 3) do menu, o sistema deve seguir os seguintes passos para a venda de entradas ao cliente.

Apresentar a lista de espetáculos cadastradas no sistema. Cada espetáculo deve ser identificado por um número único. Utilizar o valor da posição (índice) que o espetáculo está armazenado na lista de espetáculos.
Solicitar ao usuário que selecione um espetáculo. Quando o usuário informar o número do espetáculo, apresentar a lista de assentos disponíveis, conforme exemplo abaixo. Quando o assento estiver disponível deve-se mostrar o número do assento. Quando o assento não estiver disponível deve-se mostrar XX.
Para cada entrada que o usuário desejar comprar deve-se: solicitar o número do assento desejado e o tipo de entrada. Os tipos de entradas são: 1. Inteira, 2. Meia e 3. Professor. Ao final, verificar se o usuário deseja comprar uma nova entrada. Em caso positivo, repetir o processo de solicitar o número do assento e o tipo de entrada.
Quando o usuário não desejar mais entradas, o sistema solicita o CPF do cliente que está comprando as entradas.
O sistema então apresenta o valor total a ser pago pelo cliente.
Ao final, o sistema retorna para o menu principal.
A seguir é apresentado um exemplo de execução desta opção.

*** VENDA DE ENTRADAS - ESPETÁCULOS ***
	1) Espetáculo 01 15/05/2023 19h30 R$ 30.00
	2) Espetáculo 02 30/05/2023 20h30 R$ 50.00
	3) Espetáculo 03 02/06/2023 21h30 R$ 35.00
Selecione um espetáculo: 1
	||| Assentos Disponíveis |||
	50 49 48 47 46 45 XX XX XX 41
	40 39 38 37 36 35 34 33 32 31
	30 29 XX XX 26 25 24 23 22 21
	20 19 18 17 16 15 14 13 12 11
	10 09 08 07 06 05 04 03 02 01
Selecione um assento: 23
	||| Tipos de Entrada |||
	1) Inteira
	2) Meia        50% do valor da entrada
	3) Professor   40% do valor da entrada 
Selecione um tipo de entrada: 2
Deseja comprar uma outra entrada (S/N)? S
Selecione um assento: 22
	||| Tipos de Entrada |||
	1) Inteira
	2) Meia        50% do valor da entrada
	3) Professor   40% do valor da entrada 
Selecione um tipo de entrada: 1
Deseja comprar uma outra entrada (S/N)? N
Informe o CPF do Cliente Cadastrado: 12345678900
Valor Total: R$ 45.00

>>> Retorna ao menu principal <<<
</h2>
</div>
