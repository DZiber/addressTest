package address_book.tests;

import address_book.model.ContactData;
import org.testng.annotations.Test;

/**
 * Created by ZeBr on 28.03.2018.
 */
public class ContactModificationTests extends TestBase {

    @Test
    public void contactCreationTests() {
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("Testio22", "Testiny22", "Tst22", "Test COCO", "Test--210", "test@test.co.uk"));
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToHomePage();
    }
}
