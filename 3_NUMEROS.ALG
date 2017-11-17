Algoritmo "3_numeros"
// Autor(a)    : João Marques
// Data atual  : 17/11/2017
Var
numero1, numero2, numero3, maior : inteiro


Inicio
Escreval("Qual o 1º numero?")
leia(numero1)
Escreval("Qual o 2º numero?")
leia(numero2)
Escreval("Qual o 3º numero?")
leia(numero3)
se (numero1 > numero2) entao
maior <- numero1
senao
maior <- numero2
fimse
se (maior < numero3) entao
maior <- numero3
fimse
escreva ("Máximo: ",maior)

Fimalgoritmo