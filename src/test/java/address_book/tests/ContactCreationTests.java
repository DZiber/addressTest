package address_book.tests;

import address_book.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

    @Test
    public void contactCreationTests() {
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("Testio", "Testiny", "Tst", "Test CO", "Test 210", "test@test.co.uk"));
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();
    }
}
