# language: pt
	@CucumberSteps
 	Feature: Testar uma consulta	ao seguro de imoveis residenciais.
 	
 	Cenario 1: Consulta seguro de imoveis residenciais
 	
 	Dado a url "https://www.portoseguro.com.br/ " do site
 	Quando clicar em no link seguros "seguros"
 	Entao devera ser redirecionado para a pagina de seguros "https://www.portoseguro.com.br/seguros"
 	E quando clicar em seguro para imoveis "seguroimoveis"
 	Entao devera redirecionar para a pagina de seguros de imoveis "https://www.portoseguro.com.br/seguros/seguro-para-imoveis"
 	E quando clicar em seguro residencia "seguroresidencia"
 	Entao devera redirecionar para a pagina de seguros de residencia "https://www.portoseguro.com.br/seguros/seguro-para-imoveis/seguro-para-residencia"
 	
 	
