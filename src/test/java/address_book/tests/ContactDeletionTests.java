package address_book.tests;

import org.testng.annotations.Test;

/**
 * Created by ZeBr on 29.03.2018.
 */
public class ContactDeletionTests extends TestBase {

    @Test
    public void contactDeletionTests () {

            app.getContactHelper().selectContact();
            app.getContactHelper().initContactDeletion();
            app.getContactHelper().closeAllert();
            app.getContactHelper().returnToHomePage();
    }
}
