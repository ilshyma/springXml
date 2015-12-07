package models;

/**
 * Created by user on 07.12.2015.
 */
public class Contact {


    private int contactId;
    private String name;
    private String lastName;

        public Contact() {

        }


        public String getLastName() {
        return lastName;
    }
        public void setLastName(String lastName) {
        this.lastName = lastName;
    }


        public String getName() {
                return name;
        }
        public void setName(String name) {
                this.name = name;
        }

        public int getContactId() {
                return contactId;
        }
        public void setContactId(int contactId) {
                this.contactId = contactId;
        }

        @Override
        public String toString(){
                return name
                        +" " + lastName
                        +"\n";
        }



}
