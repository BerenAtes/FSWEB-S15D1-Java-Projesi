import com.workintech.List.GroceryList;
import com.workintech.MobilePhone.Contact;
import com.workintech.MobilePhone.MobilePhone;

public class Main {
    public static void main(String[] args) {
        System.out.println("*******************");

        Contact ali = new Contact("ali", "234235443");
        Contact veli = new Contact("veli", "33333333");
        Contact fatma = new Contact("fatma", "111111112");
        Contact ayse = new Contact("ayse", "3331123322");

        MobilePhone mobilePhone = new MobilePhone("123456789");

        mobilePhone.addNewContact(ali);
        mobilePhone.addNewContact(veli);
        mobilePhone.addNewContact(fatma);
        mobilePhone.addNewContact(ayse);

        System.out.println("-- initial contacts started");
        mobilePhone.printContacts();
        System.out.println("-- initial contacts ended");

        System.out.println("update contacts started");
        boolean updateResult = mobilePhone.updateContact(ali, new Contact("ali", "5555555555"));
        mobilePhone.printContacts();
        System.out.println("update contacts ended:"+updateResult);

        System.out.println("remove contact start");
        boolean removeResult = mobilePhone.removeContact(veli);
        mobilePhone.printContacts();
        System.out.println("remove contact ended: "+removeResult);

        System.out.println("query started");
        Contact contact = mobilePhone.queryContact("ayşe");
        if(contact != null){
            System.out.println("query ended: "+contact.getName() +"--"+ contact.getPhoneNumber());
        }
        else{
            System.out.println("result null for query");
        }



        System.out.println("find contact 1 started");
        int indexResult = mobilePhone.findContact(ali);
        System.out.println("find contact 1 ended: "+indexResult);

        System.out.println("find contact 2 started");
        int indexResult2 = mobilePhone.findContact("mahmut");
        System.out.println("find contact 2 ended : "+indexResult2);


    }
    }

