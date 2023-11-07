import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PractiseFormPage extends BasePage{

    private final By name = By.id("firstName");
    private final By lastName = By.id("lastName");
    private final By email = By.id("userEmail");

    private GenderSection genderSection;



    public PractiseFormPage(WebDriver driver){
        super(driver);
        driver.get(baseUrl.concat("automation-practice-form"));
        genderSection = new GenderSection(driver);
    }
    public GenderSection genderSection(){
        return this.genderSection;
    }

    public void setName(String nameAsString){
        type(name, nameAsString);
    }
    public void setLastName(String lastNameAsString){
        type(lastName, lastNameAsString);
    }
    public void setEmail(String emailAdress){
        type(email, emailAdress);
    }
    public String getName(){
        return find(name).getAttribute("value");
    }
    public String getLastName(){
        return find(lastName).getAttribute("value");
    }
    public String getEmail(){
        return find(email).getAttribute("value");
    }
}
