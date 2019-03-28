package com.modyo.testing.definitions;
 

import static org.junit.Assert.fail;

import com.modyo.testing.ModyoTestCucumber;
import com.modyo.testing.util.Constantes;

import cucumber.api.java.en.When;

public class LoginDefinition {

	
	@When("voy al login privado de larrain vial")
	public void voy_al_login_privado_de_larrain_vial() {
		ModyoTestCucumber.webDriver.get(Constantes.URL_WEB);
	}


	@When("ingreso {string} en el campo email")
	public void ingreso_en_el_campo_email(String string) { 
		ModyoTestCucumber.loginPage.ingresarEmail(string);
	}

	@When("ingreso {string} en el campo clave")
	public void ingreso_en_el_campo_clave(String string) {
		ModyoTestCucumber.loginPage.ingresarClave(string);
	}

	@When("hago click en el boton ingresar")
	public void hago_click_en_el_boton_ingresar() {
		ModyoTestCucumber.loginPage.doLogin();
	} 
	
}
