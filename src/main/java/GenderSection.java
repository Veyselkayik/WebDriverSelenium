import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GenderSection extends BasePage{
    private final By maleRadioLabel = new By.ByCssSelector("label[for='gender-radio-1']");
    private final By femaleRadioLabel = new By.ByCssSelector("label[for='gender-radio-2']");
    private final By otherRadioLabel = new By.ByCssSelector("label[for='gender-radio-3']");

    private final By maleRadioButton = By.id("gender-radio-1");
    private final By femaleRadioButton = By.id("gender-radio-2");
    private final By otherRadioButton = By.id("gender-radio-3");


    public enum Genders {MALE, FEMALE, OTHER}

    public GenderSection(WebDriver driver){
        super(driver);
    }
    public void clickRadioButton(Genders gender){
        switch (gender) {
            case MALE:
                click(maleRadioLabel);
                break;
            case FEMALE:
                click(femaleRadioLabel);
                break;
            case OTHER:
                click(otherRadioLabel);
                break;
        }
    }

    public boolean isRadioButtonChecked(Genders gender){
        boolean isChecked = false;
        switch (gender){
            case FEMALE:
                isChecked = isSelected(femaleRadioButton);
                break;
            case MALE:
                isChecked = isSelected(maleRadioButton);
                break;
            case OTHER:
                isChecked = isSelected(otherRadioButton);
                break;
        }
        return isChecked;
    }
}
