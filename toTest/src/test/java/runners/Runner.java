package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", 
				 monochrome = true,
				 snippets = SnippetType.CAMELCASE,
				 features ="src/test/resources/feature/",
				 glue ="src/test/java/steps")

public class Runner {

}

