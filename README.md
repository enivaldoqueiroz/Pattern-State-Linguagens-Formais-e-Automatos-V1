# Pattern-State-Linguagens-Formais-e-Automatos-V1
## Trabalho da Primeira Verificação - V1 / Utilizando o Padrão State na disciplina de Linguagens Formais e Autômatos

### 1. Seja ∑ o alfabeto {a,b}: Quais as linguagens abaixo? Liste exemplos de cadeias que pertencem e que não pertencem a cada uma das linguagens. 
### Realize a implementação das questões.

a. {xxr | x ∈ ∑*} (xr significa cadeia reversa de x, i.e., à cadeia com os
caracteres na ordem inversa da que eles aparecem em x.)

b. {a​(i^2)​ | i ∈ ℕ}

### 2. O objetivo deste trabalho é verificar como os autômatos podem ser aplicados na prática, inclusive em um projeto de desenvolvimento de software. 
### Imagine que você vai implementar um e-commerce, logo:

a. Realizar um diagrama de estados de pedido considerando estados, por
exemplo pedido novo, pedido aprovado, pedido em transporte, pedido
entregue, pedido cancelado, pedido finalizado, etc.)
<img src="https://github.com/enivaldoqueiroz/Pattern-State-Linguagens-Formais-e-Automatos-V1/blob/master/Imagens/Imagem-Q2-item-a.jpg">

b. Realize a implementação básica utilizando o padrão de projetos State
deste diagrama utilizando alguma linguagem de programação orientada a
objetos.

#### Link de implementação do código fonte

[Pattern-State-Linguagens-Formais-e-Automatos-V1](https://github.com/enivaldoqueiroz/Pattern-State-Linguagens-Formais-e-Automatos-V1)

c. Defina exemplos de funcionalidades (não precisa ter à implementação
dessas funcionalidades apenas a especificação e definição delas, como
nome parâmetros e retorno do método)

//Metodos de comportamento do Estado de pedido

#### Inicia o novo pedido
PedidoState iniciarPedidoNovo(); 

#### Verifica se o tempo maximo do para o cancelamento é valido - O parametro int op recebe o valor da verificação informado na classe Principal 
PedidoState fazerAprovacaoDePedido(int op);

#### Informa o status do pedido
PedidoState informarPedidoEmTransporte();

#### Realiza a entrega do pedido
PedidoState fazerEntregaDePedito();  

#### Valida se a entrega do pedido esta Errada ou Certa - O parametro int op recebe o valor da verificação informado na classe Principal
 PedidoState verificarPedidoEntregue(int op);
 
#### Cancela o pedido caso o tempo maximo seja menor que 14 min ou se o pedido foi entregue errado
PedidoState cancelarPedido();      

#### Após pedido entregue realiza a finalização do pedido
PedidoState finalizarPedido();         
	
d. Realize testes para validar o fluxo definido no diagrama, que aceite e
rejeite simulações de pedidos.

#### Pedido Aceito

<img src="https://github.com/enivaldoqueiroz/Pattern-State-Linguagens-Formais-e-Automatos-V1/blob/master/Imagens/Imagem-Q2-item-d-pedido-aceito.jpg">

#### Pedido Rejeitado

<img src="https://github.com/enivaldoqueiroz/Pattern-State-Linguagens-Formais-e-Automatos-V1/blob/master/Imagens/Imagem-Q2-item-d-pedido-rejeitado.jpg">

#### Pedido Cancelado
<img src="https://github.com/enivaldoqueiroz/Pattern-State-Linguagens-Formais-e-Automatos-V1/blob/master/Imagens/Imagem-Q2-item-d-pedido-cancelado.jpg">

### 3. Resolva e implemente os seguintes DFA's (Dica: Utilize o padrão de projeto state). 
### Considere exemplos de cadeias que devem ser aceitas e rejeitadas pelo autômato.

a. Nelson Rubens é um jornalista brasileiro especializado em fofoca e
celebridades que utiliza o jargão OK!, OK!. Para ajudar o jornalista você
irá projetar um autômato sobre ∑ = {o,k}, para a linguagem L = {w | w tem,
contém, a subcadeia ok}. Exemplos de cadeias aceitas pelo autômato
são: {kok, okok, kkkoookkk,...}, Exemplos de cadeias que não são aceitas
{kkkkk, ko, koko, ooo, ...}

b. Seja ∑ = {0,1}, projete um autômato para a linguagem L = {w | w tem ao
mesmo tempo um número par de 0’s e 1’s}. Exemplos de cadeias aceitas
pelo autômato são: {1001, 000011, 11101000, 01010101, ...}, Exemplos
de cadeias que não são aceitas {001, 110, 0101, ...}
