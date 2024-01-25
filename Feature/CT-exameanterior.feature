#language : pt
@tag
Funcionalidade: FEATURE - Adicionar os anexos dentro da tela de associar exames anteriores (Poder anexar por lá)
  
  @tag1
  Cenário: Adicionar exame pelo “adicionar exame anterior” 
   	Dado que eu esteja na tela de exames 
		Quando seleciono o exame 
		E clico no estudo  
		E seleciono “adicionar exame anterior” 
		E faço a seleção de filtros 
		E seleciono exame anterior  
		Então posso adicionar exame ou arquivo clicando nos ícones de clips 
	