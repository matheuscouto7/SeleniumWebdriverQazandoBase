package pages;


import org.openqa.selenium.By;
import runner.RunCucumber;

import static support.Commands.*;

public class LoginPage extends RunCucumber {

    // elementos
    private String URL = "http://automationpratice.com.br/";
    private By botaoAcessarLogin = By.cssSelector(".right_list_fix > li > a > .fa-user");
    private By campoEmail = By.id("user");
    private By campoSenha = By.id("password");
    private By botaoFazerLogin = By.id("btnLogin");
    private By botaoAcessarCadastro = By.cssSelector(".right_list_fix > li > a > .fa-lock");

    // ações / funções / métodos
    public void acessarAplicao() {
        getDriver(System.getProperty("browser")).get(URL);

        /**
         * Duas formas de como chamar o navegador
         * essa de baixo você só precisa alterar o nome e rodar tranquilo
         * getDriver("firefox").get(URL);
         * &
         * essa de baixo vc joga no terminal dessa maneira
         * mvn test -Dtest=RunCucumber -Dbrowser=chrome cluecumber-report:reporting
         * getDriver(System.getProperty("browser")).get(URL);
         * Outra forma que já fica configurado junto com essa parte de cima ai
         * é indo aonde você roda os testes lá em cima canto direito e edit configurations
         * e bota do lado do -ea -Dbrowser=chrome e no lugar do chrome pode ser qualquer uma
         */

    }

    public void acessarTelaLogin() {
        clickElement(botaoAcessarLogin);
    }

    public void preencheEmail(String email){
        fillField(campoEmail, email);
    }

    public void preencherSenha(String senha){
        fillField(campoSenha, senha);
    }

    public void clicarLogin(){
        clickElement(botaoFazerLogin);
    }

    public void verificaLoginSucesso(){
        checkMessage(By.id("swal2-title"), "Login realizado");
    }

    public void verificaCampoVazio(String message){
        checkMessage(By.className("invalid_input"), message);
    }

    public void acessarTelaCadastro(){
        clickElement(botaoAcessarCadastro);
    }

}
