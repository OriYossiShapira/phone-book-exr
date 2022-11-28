

public class Contact {

      /* Contact variables */

    private String phoneNumber;
    private String address;
    private String lastName;
    private String firstName;

    // user input constructor
    public Contact() {
        this.phoneNumber = IO.getString("Enter Contact phone number");
        this.address = IO.getString("Enter Contact address");
        this.lastName = IO.getString("Enter Contact last name");
        this.firstName = IO.getString("Enter Contact first name");
    }

    /* Contact variables constructor */

    public Contact (String phoneNumber, String address, String lastName, String firsName)
    {
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.lastName = lastName;
        this.firstName = firsName;
    }


    /* Contact variables getters */

       public String getPhoneNumber() {
        return phoneNumber;
       }

       public String getAddress() {
        return address;
      }

      public String getLastName() {
        return lastName;
      }

      public String getFirstName() {
        return firstName;
      }



    /* Contact variables setters */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\n"
                +  "Phone number: " + phoneNumber + "\n"
                + "added successfully";
    }
}
