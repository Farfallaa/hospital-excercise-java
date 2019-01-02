package MyAssessment1.java;

public abstract class Health {
    //Instance variables:
    String name;
    String mainUse;
    int qualifiedStaff;
    int otherStaff;

    //abstract method drawHealth to be implemented by subclasses
    public abstract void drawHealth();

    //constructor:
    //1. default constructor

    public Health(){
       this.name = "Hospital X";
       this.mainUse = "unknown";
       this.qualifiedStaff = 0;
       this.otherStaff = 0;
    }
    //2. constructor where name and mainuse are known:
    public Health(String hospName, String mainUse){
        this.name = hospName;
        this.mainUse = mainUse;
    }
    //3. constructor where all values passed by parameter
    public Health(String hospName, String mainUse, int qualifiedStaff, int otherStaff){
        this.name = hospName;
        this.mainUse = mainUse;
        this.qualifiedStaff = qualifiedStaff;
        this.otherStaff = otherStaff;
    }

    //method that prints info about each health object:
    public String toString(){
        return ("This is \"" + this.name + "\" whose main role is " +
                this.mainUse + "." +" It has " + this.qualifiedStaff + " qualified staff and " +
                this.otherStaff + " other staff." );
    }
}
