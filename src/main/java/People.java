import java.util.Scanner;


public class People {

    private String firstname, lastname;
    private Adress adress;

    public People(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;

    }

    public void changeFirstname(String newname){
        this.firstname = newname;
    }

    public void displayInfo(){
        System.out.println("Firstname:\t" + this.firstname);
        System.out.println("Lastname:\t" + this.lastname);
        this.adress.displayInfo();
    }

    public void setAdress(String[] args)
    {
        if(args.length == 4){
            this.adress = new Adress(args[0], args[1], args[2], args[3]);
        }

    }

    public static void main(String[] args) {

        if (args.length == 2) {
            People people = new People(args[0], args[1]);
            people.displayInfo();
        }

        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter your adress (Count Ci St Num):\t");
    }



    private class Adress{
        private String country, city, street, num = "";

        private Adress(String country, String city, String street, String num){
            this.country = country;
            this.city = city;
            this.street = street;
            this.num = num;
        }

        public void displayInfo(){
            System.out.println(String.format("Adress:\t %s - %s, %s, %s", this.country,
                    this.city, this.street, this.num));
        }
    }


}


