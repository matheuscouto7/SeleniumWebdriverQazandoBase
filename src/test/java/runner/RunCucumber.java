package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/cucumberTests.json", "html:target/reports/"},
        features = "src/test/resources/features",
        glue = {"steps"},
        tags = {"@login-sucesso"}
)
public class RunCucumber extends RunBase{

    @AfterClass
    public static void stop(){
        getDriver().quit();
    }

}

/**
 * para gerar os reports bem feitos precisa rodar pelo terminal tudo
 *
 * mvn test -Dtest=RunCucumber -Dbrowser=chrome cluecumber-report:reporting
 */
