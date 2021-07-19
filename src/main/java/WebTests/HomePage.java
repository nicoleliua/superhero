package WebTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class HomePage {
    public WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(how = How.ID, using = "worrior_username")
    public WebElement userName;

    @FindBy(how = How.ID, using = "warrior")
    public WebElement createBtn;

    @FindBy(how = How.ID, using = "start")
    public WebElement startBtn;

    @FindBy(how = How.ID, using = "bus")
    public WebElement bus;

    @FindBy(how = How.CSS, using = "button#bus_timer_start")
    public WebElement startBusGame;

    @FindBy(how = How.ID, using = "bus_answer_1")
    public WebElement busAns1;

    @FindBy(how = How.ID, using = "leaderboard_link")
    public WebElement finalScore;

    @FindBy(how = How.CSS, using = "p.option-label")
    public List<WebElement> leaderBoard;

}
