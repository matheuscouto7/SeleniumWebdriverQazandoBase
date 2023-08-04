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
        tags = {"@login"}
)
public class RunCucumber extends RunBase{

    @AfterClass
    public static void stop(){
        getDriver().quit();
    }

    //Para gerar os novos reports bem feitos, precisa rodar esses comandos pelo terminal
    // mvn test -Dtest=RunCucumber -Dbrowser=chrome
    //mvn cluecumber-report:reporting

}

