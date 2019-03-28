package com.modyo.testing.profile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	@FindBy(how = How.ID, using = "user_session_username")
	private WebElement userInput;
	
	
	@FindBy(how = How.ID, using = "user_session_password")
	private WebElement passwordInput;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"modyo-form\"]/div[3]/input")
	private WebElement btnIngresar;
	
	
	
	public void ingresarEmail(String dato) {
		userInput.clear();
		userInput.sendKeys(dato);
	}
	
	public void ingresarClave(String dato) {
		passwordInput.clear();
		passwordInput.sendKeys(dato);
	}
	
	
	
	public void doLogin() {
		btnIngresar.click();
	}
	
}
