package DAO;

import models.Contact;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 07.12.2015.
 */
public class ContactDAOimpl implements ContactsDAO {
    private int idGen;
    private ArrayList<Contact> dbContactList;


    public void addContact(Contact contact) {
        contact.setContactId(idGen);
        dbContactList.add(contact);
        System.out.println("addedDAO " + contact.toString());
        idGen++;
    }

    public void deleteContact(Contact contact) {
        dbContactList.remove(contact);
    }

    public List<Contact> getAllContacts() {
        return dbContactList;
    }

    public void clearAll() {
        dbContactList.clear();
        idGen = 0;
    }
    public void setDbContactList(ArrayList<Contact> dbContactList) {
        this.dbContactList = dbContactList;
    }

}
