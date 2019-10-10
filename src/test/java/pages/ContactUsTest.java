package pages;
import application.Matrix;
import org.junit.Test;

public class ContactUsTest extends TestRunner

{


    @Test
    public void buildContactPage()

    {

        Matrix.contactUs.firstnameSet("test");
        Matrix.contactUs.lastnameSet("test");
        Matrix.contactUs.emailSet("test284@gmail.com");
        Matrix.contactUs.companySet("test");
        Matrix.contactUs.phoneSet("999877766555");
        Matrix.contactUs.zipSet("test");
        Matrix.contactUs.referalSet("test");
        Matrix.contactUs.fleetsizeSet("test");
        Matrix.contactUs.submitSet();


    }
}