package ContactService;

import models.Contact;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 07.12.2015.
 */
public class ContactServiceImpl implements ContactService{
    private int idGen;
    private ArrayList<Contact> ContactList;

    public void addContact(Contact contact) {
        contact.setContactId(idGen);
        ContactList.add(contact);
        System.out.println("added " + contact.toString());
    }

    public void deleteContact(Contact contact) {
        ContactList.remove(contact);
    }

    public List<Contact> getAllContacts() {
        System.out.println("getAllContacts");
        return ContactList;
    }

    public void clearAll() {

    }
}
