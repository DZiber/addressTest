package address_book.model;

/**
 * Created by ZeBr on 21.03.2018.
 */
public class ContactData {

    private final String firstname;
    private final String lastname;
    private final String nickname;
    private final String company;
    private final String home;
    private final String email;

    public ContactData(String firstname, String lastname, String nickname, String company, String home, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.nickname = nickname;
        this.company = company;
        this.home = home;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getCompany() {
        return company;
    }

    public String getHome() {
        return home;
    }

    public String getEmail() {
        return email;
    }
}
