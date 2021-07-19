package WebTests;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TheGame {
    static HomePage homePage;

    static public void createNewUser(WebDriver driver, String userName){
        try{
            homePage = PageFactory.initElements(driver,HomePage.class);
            System.out.println("Nicole testing user name is == " + userName );
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            homePage.userName.click();
            homePage.userName.sendKeys(userName);
            homePage.createBtn.click();

        }catch(Exception e1){
            e1.printStackTrace();
            System.out.println("ERROR : Failed to create a new user " );
        }
    }

    static public char verifyUserCreated(WebDriver driver, String userName){
        try{
            String startUser = homePage.startBtn.getText();
            System.out.println("INFO : Start user == " + startUser );
            if(startUser.contains(userName)){
                return 'Y';
            }else{
                return 'N';
            }

        }catch(NoSuchElementException e1){
            System.out.println("ERROR : User is not created successfully " );
            return 'N';
        }
    }

    static public void startJourney(WebDriver driver, String userName){
        try{
        //    homePage.userName.click();
          //  homePage.userName.sendKeys(userName);
            homePage.startBtn.click();

        }catch(Exception e2){
            e2.printStackTrace();
            System.out.println("ERROR : Failed to start my journey with my user name " );
        }
    }

    static public void selectChallenge(WebDriver driver, String challengeName){
        try{
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
           // homePage = PageFactory.initElements(driver,HomePage.class);
            homePage.bus.click();
        }catch(Exception e3){
            e3.printStackTrace();
            System.out.println("ERROR : Failed to select challenge game" );
        }
    }

    static public void startGame(WebDriver driver){
        try{
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            homePage.startBusGame.click();
        }catch(Exception e4){
            System.out.println("ERROR : Failed to start the game " );
        }
    }

    static public void selectCorrectAns(WebDriver driver){
        try{
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            homePage.busAns1.click();
        }catch(Exception e5){
            System.out.println("ERROR : Failed to start the game " );
        }
    }

    static public char checkScore(WebDriver driver, String userName){
        try{
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            List<WebElement> elist = homePage.leaderBoard;
            System.out.println("INFO : How many = "+ elist.size());
            for(WebElement e:elist){
                if(e.getText().contains("LEADERBOARD")){
                    return 'Y';
                }
            }
            return 'N';
        }catch(Exception e5){
            System.out.println("ERROR : Failed to start the game " );
            return 'N';
        }

    }


}

