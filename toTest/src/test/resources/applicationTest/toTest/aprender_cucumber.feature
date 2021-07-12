#language: pt

Funcionalidade: Aprender Cucumber
  Como um aluno
  Eu quero aprender a utilizar Cucumber
  Para que eu possa automatizar critérios de aceitação

Cenário: Deve executar a especificação 
	Dado que criei o arquivo corretamente
	Quando executa-lo
	Então a especificação deve finalizar com sucessso

Cenário: Deve incrementar contador
	Dado que o valor do contador é 15
	Quando eu incrementar em 3
	Então o valor do contador será 18
 
 Cenário: Deve calcular atraso no prazo de entrega
 Dado que o prazo é dia 05/04/2018
 Quando a entrega atrasar em 2 dias
 Então a entrega será efetuada em 07/04/2018