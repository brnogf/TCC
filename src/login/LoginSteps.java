package login;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;


public class LoginSteps {
	 
	private Login telaLogin;
	
	@Given("que o usuário acessa a tela de login")
	public void acessarTelaLogin(){ 
		telaLogin = new Login();
	} 
	 
	@When("usuário informa credenciais válidas ('$user','$pass') e clica em entrar")
	public void informarCredenciaisEEntrar(@Named("user") String login, @Named("pass") String senha){
		telaLogin.informarCredenciais(login, senha);
		telaLogin.entrar();
	}
	
	@Then("o sistema oferece aviso '$warning' para o usuário")
	public void isLoginEfetuado(@Named("warning") String aviso) {
		if (aviso.equals("sucesso")) {
			assertTrue(telaLogin.isLogado());
		}
		if (aviso.equals("erro")) {
			assertFalse(telaLogin.isLogado());
		}	 
	}

}