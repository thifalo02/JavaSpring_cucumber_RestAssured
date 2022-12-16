#language: pt

@smoke
@severity=critical
Funcionalidade: Realizar um GET em uma API qualquer
* API rest utilizada: https://gorest.co.in
* Não possui parâmetros

  Cenário: Realizar um request em uma API de testes
    Dado que o usuário realiza uma requisição
    Então o resultado esperado deverá estar correto