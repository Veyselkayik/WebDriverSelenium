import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGenderSelection extends BaseTest{

    @Test
    public void check_male_radio_button(){
        PractiseFormPage practiseFormPage = new PractiseFormPage(driver);
        practiseFormPage.genderSection().clickRadioButton(GenderSection.Genders.MALE);
        Assertions.assertTrue(practiseFormPage.genderSection().isRadioButtonChecked(GenderSection.Genders.MALE),"Male radio button is checked");
    }
    @Test
    public void check_female_radio_button(){
        PractiseFormPage practiseFormPage = new PractiseFormPage(driver);
        practiseFormPage.genderSection().clickRadioButton(GenderSection.Genders.FEMALE);
        Assertions.assertTrue(practiseFormPage.genderSection().isRadioButtonChecked(GenderSection.Genders.FEMALE),"Female radio button is checked");
    }
    @Test
    public void check_other_radio_button(){
        PractiseFormPage practiseFormPage = new PractiseFormPage(driver);
        practiseFormPage.genderSection().clickRadioButton(GenderSection.Genders.OTHER);
        Assertions.assertTrue(practiseFormPage.genderSection().isRadioButtonChecked(GenderSection.Genders.OTHER),"Other radio button is checked");
    }
}
