package WebTests.runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features="D:\\Users\\nicole.liu\\workspace\\ExamTest\\src\\test\\resources\\APITests",
        glue="APITests.stepdefs",
        plugin= {"pretty","html:HTML-Reports"},
        monochrome=true

)

public class RunnerAPITests extends AbstractTestNGCucumberTests {
}



