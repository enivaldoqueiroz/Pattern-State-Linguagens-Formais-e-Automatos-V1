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

b. Realize a implementação básica utilizando o padrão de projetos State
deste diagrama utilizando alguma linguagem de programação orientada a
objetos.

c. Defina exemplos de funcionalidades (não precisa ter à implementação
dessas funcionalidades apenas a especificação e definição delas, como
nome parâmetros e retorno do método)

d. Realize testes para validar o fluxo definido no diagrama, que aceite e
rejeite simulações de pedidos.

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
