import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestNameLastnameEmail extends BaseTest{

    @Test
    public void setName(){
        PractiseFormPage practiseFormPage = new PractiseFormPage(driver);
        practiseFormPage.setName("Veysel");
        Assertions.assertEquals("Veysel",practiseFormPage.getName(), "Name Value is not correct!!");
    }
    @Test
    public void setLastName(){
        PractiseFormPage practiseFormPage = new PractiseFormPage(driver);
        practiseFormPage.setLastName("Kayık");
        Assertions.assertEquals("Kayık",practiseFormPage.getLastName(), "LastName Value is not correct!!");
    }
    @Test
    public void setEmail(){
        PractiseFormPage practiseFormPage = new PractiseFormPage(driver);
        practiseFormPage.setEmail("veyselkayik@gmail.com");
        Assertions.assertEquals("veyselkayik@gmail.com",practiseFormPage.getEmail(), "Email Value is not correct!!");
    }

}
