@prueba 
Feature: Prueba de Selenium 

Scenario: Login en LarrainVial 
	When voy al login privado de larrain vial 
	And ingreso "mormazabal@modyo.com" en el campo email
	And ingreso "Cambiame2019" en el campo clave
	And hago click en el boton ingresar