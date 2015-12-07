package starter;


import ContactService.ContactServiceImpl;
import DAO.ContactDAOimpl;
import DAO.ContactsDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by user on 07.12.2015.
 */
public class Start {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/spring/context.xml");
        ContactServiceImpl contactService = applicationContext.getBean("contactService", ContactServiceImpl.class);

    }
}
