public class Salariedemployee extends Employee{

    private double annualsalary;

    public Salariedemployee(String name, String SSN, int Age, String Gender, String Address, String Telephonenumber,String department, String jobtitle, int yearofhire, double annualsalary){
        super(name,SSN,Age,Gender,Address,Telephonenumber,department,jobtitle,yearofhire);
        this.annualsalary = annualsalary;
    }

    public double getannualsalary(){
        return this.annualsalary;
    }

    public String toString(){
        return "Salariedemployee: " + super.toString() + "and the annualsalary is: " + getannualsalary() + "$.";
    }




}
