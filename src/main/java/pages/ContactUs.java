package pages;
import elements.Element;
import org.openqa.selenium.By;

public class ContactUs {
    
    //showing macG this shizzle

    public Element firstname = new Element(By.id("first_name"));
    public Element lastname = new Element(By.id("last_name"));
    public Element email = new Element(By.id("email"));
    public Element company = new Element(By.id("company"));
    public Element phone = new Element(By.id("phone"));
    public Element zip = new Element(By.id("zip"));
    public Element referal = new Element(By.id("00N0N00000FprRa"));
    public Element submit = new Element(By.xpath("//button['Submit']\""));
    public Element fleetsize = new Element(By.id("00N0N00000FDZfB"));

    public void firstnameSet(String firstNameOfClient){
        firstname.textInput(firstNameOfClient);

    }

    public void lastnameSet (String lastNameOfClient){
        lastname.textInput(lastNameOfClient);

    }

    public void emailSet (String emailOfClient){

        email.textInput(emailOfClient);

    }

    public void companySet (String nameOfCompany){

        company.textInput(nameOfCompany);

    }

    public void phoneSet (String phoneNumber) {

        phone.textInput(phoneNumber);
    }
    public void zipSet (String zipNumber){

        zip.textInput(zipNumber);
    }

    public void referalSet (String referalCode){

        referal.textInput(referalCode);
    }

    public void submitSet (){

        submit.clickIt();
    }
    public void fleetsizeSet (String fleetSi ){

        fleetsize.textInput(fleetSi);
    }

}
