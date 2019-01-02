package MyAssessment1.java;

import java.util.Scanner;

public class Hospital extends Health {
//instance variables are taken from Health

    //class variable that counts the number of objects created
    //it starts with 0 and each time a constructor is called
    //adds up
    public static int noOfHospitals = 0;

    //two  further instance variables only applicable to Hospitals
    int spaces;
    boolean stateFunded;


    //constructors:
    //1st constructor - Default. Constroctors not inherited
    //nothing supplied, so default values given:
    public Hospital() {
        noOfHospitals++; //increase static var by one each time
        // a constructor is called because you add an object
        this.name = "Hospital X";
        this.mainUse = "unknown";
        this.qualifiedStaff = 0;
        this.otherStaff = 0;
        this.spaces = 0;
        this.stateFunded = false;
    }

    //create new scanner:
    static Scanner userinput = new Scanner(System.in);

    //setters and getters:

    public void setSpaces(int newSpaces) {
        this.spaces = newSpaces;
    }

    public int getSpaces() {
        return spaces;
    }

    public void changeSpaces(int extraSpaces) {
        //get existing spaces:
        //int spaces = this.getSpaces();
        int newSpaces = spaces + extraSpaces;
        //to accept the input:
        this.setSpaces(newSpaces);
    }


    //values passed by parameters:
    public Hospital(String hospName, String mainUse, int qualifiedStaff, int otherStaff, int spaces, boolean stateFunded) {
        noOfHospitals++;
        this.name = hospName;
        this.mainUse = mainUse;
        this.qualifiedStaff = qualifiedStaff;
        this.otherStaff = otherStaff;
        this.spaces = spaces;
        this.stateFunded = stateFunded;
    }

    // constructor where state funded always true - dont pass state funded value by parameter
    public Hospital(String hospName, String mainUse, int qualifiedStaff, int otherStaff, int spaces) {
        noOfHospitals++;
        this.name = hospName;
        this.mainUse = mainUse;
        this.qualifiedStaff = qualifiedStaff;
        this.otherStaff = otherStaff;
        this.spaces = spaces;
        this.stateFunded = true;
    }

    //abstract methods declared in Health
    //must be used here
    @Override
    public void drawHealth() {
        System.out.println("I'm a hospital object ");
    }

    public String toString(){
        //check if state funded:
        String specialWord;
        if (this.stateFunded){
            specialWord = "is";        }
        else{
            specialWord = "is not";
        }
        String ss = super.toString();
        return ss + "It has "+ this.spaces +
                " parking spaces and "+ specialWord +
                " State funded. ";
    }

    //Method to return number of hospitals created:
    public static int getNoOfHospitals(){
        return noOfHospitals;
    }

    public static void main(String[] args) {

        Hospital vincent = new Hospital();
        //get existing number of spaces:
        int spaces = vincent.getSpaces();
        System.out.println("total amount of spaces in this hospital is " + spaces);
        //ask user to enter the total amount of spaces
        System.out.println("How much parking spaces would you like to add to " + vincent.name);
        if (userinput.hasNextInt()) {
            int extraSpaces = userinput.nextInt();
            vincent.changeSpaces(extraSpaces);
        }
        System.out.println("current number of spaces has been changed to " +vincent.getSpaces());
        System.out.println("total amount of hospitals created is " +noOfHospitals);
        vincent.drawHealth();

        String info = vincent.toString();
        System.out.println(info);
        int noOfHospitalsBymethod = getNoOfHospitals();
        System.out.println("again number of Hospitals created is " +noOfHospitalsBymethod);
    }

}
