package ContactService;
import models.Contact;
import java.util.List;

/**
 * Created by user on 07.12.2015.
 */
public interface ContactService {
    void addContact(Contact contact);
    void deleteContact (Contact contact);
    List<Contact> getAllContacts();
    void clearAll();

}
