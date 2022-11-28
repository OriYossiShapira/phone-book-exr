



public class Menu{

    private int opt1 = 1;
    private int opt2 = 2;
    private int opt3 = 3;

    private int opt4 = 4;

    private  int opt5 = 5;

    private int userSelect;

// Contact contact = new Contact();
// PhoneBook phoneBook = new PhoneBook();

    public void menu(){}



    public Menu() {
        this.opt1 = IO.getInt("1. add new contact");
        this.opt2 = IO.getInt("2. replace contact");
        this.opt3 = IO.getInt("3. check contact");

        this.userSelect = IO.getUserSelect();

    }
    public void selection() {

        if (userSelect == 1 ) {
            PhoneBook phoneBook = new PhoneBook();
            phoneBook.printContacts();

        }

        else if (userSelect == 2) {
            PhoneBook phoneBook = new PhoneBook();
            Contact c = phoneBook.findContact("");
            phoneBook.addContact(new Contact());
            phoneBook.replaceContact(c, new Contact());


        }


    }





    public void menu(int opt1, int opt2, int opt3) {
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
    }

    public int getOpt1() {
        return opt1;
    }

    public int getOpt2() {
        return opt2;
    }

    public int getOpt3() {
        return opt3;
    }

    public int getOpt4() {return opt4; }

    public int getOpt5() {return opt5; }

    public void setOpt1(int opt1) {
        this.opt1 = opt1;
    }

    public void setOpt2(int opt2) {
        this.opt2 = opt2;
    }

    public void setOpt3(int opt3) {
        this.opt3 = opt3;
    }

    public void setOpt4(int opt4) {this.opt4 = opt4; }

    public void setOpt5(int opt5) {this.opt5 = opt5; }
}
