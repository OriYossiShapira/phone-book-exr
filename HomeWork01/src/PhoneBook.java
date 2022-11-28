import java.util.ArrayList;
import java.util.Comparator;

public class PhoneBook {





    private ArrayList<Contact> contacts = new ArrayList<>();


    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }



    public void addContact (Contact c) {
        if (contacts.contains(c))
            return;
        contacts.add(c);
    }

    public void replaceContact (Contact c, Contact rc) {
         contacts.remove(c);
         contacts.add(rc);

    }

    public void printContacts () {
        for (Contact contact : contacts)
            System.out.println(contact);
    }

    public void sortByName(){
        contacts.sort(new Comparator<>() {
            @Override
            public int compare(Contact o1, Contact o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });
    }

    public Contact findContact (String phoneNumber) {
        for (Contact c : contacts)
            if (phoneNumber.equals(c.getPhoneNumber()))
                return c;

        throw new NullPointerException("Contact not found");
    }

    public PhoneBook(){

      contacts.add(new Contact());
//      contacts.add(new Contact("050",  "alma1", "sha", "ori" ));
    }


    public ArrayList<Contact> getContacts(Contact contact) {
        return new ArrayList<>(contacts);
    }



    public void findContact() {
    }
}
