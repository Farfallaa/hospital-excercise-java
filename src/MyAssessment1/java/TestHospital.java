package MyAssessment1.java;

public class TestHospital extends Hospital {
    public static void main(String[] args){
      //default hospital:
      Hospital aHospital = new Hospital();
      //private hospital:
      Hospital myHospital = new Hospital("Doctors4You", "deal with emergencies", 60, 240, 200, false );
      //state funded hospital:
      Hospital yourHospital = new Hospital("ClinicsRUs", "deal with emergencies", 20, 80, 40);

        //10. set number parking spaces of  the a Hospital to 30:
        aHospital.setSpaces(30);
        System.out.println("Hospital " +aHospital.name + " has " + aHospital.getSpaces() + " parking spaces.");

        //get number of parking spaces of the myHospital object:
        System.out.println("Hospital " + myHospital.name + " has " + myHospital.getSpaces() + " parking spaces. ");

        //Decrease number of parking spacs in myHospital by 10:

        myHospital.changeSpaces(-10);
        System.out.println("Hospital " + myHospital.name + " now has " + myHospital.getSpaces() + " parking spaces. ");

        //11. get number of hospitals by method:
        int noOfHospitalsBymethod = getNoOfHospitals();

        //12. Write code to printout the details of all three Hospital objects
        System.out.println("Here are the details of all " + noOfHospitalsBymethod + " hospitals: ");
        System.out.println(aHospital.toString());
        System.out.println(myHospital.toString());
        System.out.println(yourHospital.toString());

        System.out.println("Number of hospital objects created is " + noOfHospitalsBymethod);
    }
}
