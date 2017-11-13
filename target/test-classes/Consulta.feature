@Consulta 
Feature: Testar uma consulta ao seguro de imoveis residenciais. 

	Para conhecer o seguro de imoveis residenciais
 	Como um usuário
 	Eu quero fazer uma consulta ao seguro de imoveis residenciais
 	De modo que eu consiga a página de seguro de imoveis residenciais
 	
@enable 
@start 
Scenario Outline: Consulta seguro de imoveis residenciais 
	Given que eu estou na pagina inicial da porto seguros 
	When eu clicar no link faca uma cotacao 
	Then deverei ser redirecionado para a pagina de cotacao 
	When informar um nome <Nome> Válido
	And informar um cpf <Cpf> Válido
	And informar um email <Email> Válido
	
	
	Examples: 
		| Nome               | Cpf              | Email                    |
		| "Yohanes Lopes"    | "35020020020"    | "yohaneslopes@gmail.com" |
		
		
 