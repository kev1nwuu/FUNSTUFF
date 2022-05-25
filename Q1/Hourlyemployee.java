public class Hourlyemployee extends Employee{
    
    private double hourlyrate;
    public int hoursworked;
    private double uniondues;

    public Hourlyemployee(String name, String SSN, int Age, String Gender, String Address, String Telephonenumber, String department, String jobtitle, int yearofhire, double hourlyrate, int hoursworked, double uniondues ){
        
        super(name,SSN,Age,Gender,Address,Telephonenumber,department,jobtitle,yearofhire);

        this.hourlyrate = hourlyrate;
        this.hoursworked = hoursworked;
        this.uniondues = uniondues;
    }

    public double gethourlyrate(){
        return this.hourlyrate;
    }


    public int gethoursworked(){
        return this.hoursworked;
    }


    public double getuniondues(){
        return this.uniondues;
    }


    public String toString(){
        return "Hourlyemployee: " +super.toString() + ", hourly rate, hours worked, and uniondues is : "+ gethourlyrate() + "CA$, " + gethoursworked() + " hours, " + getuniondues() + "CA$.";
    }

}



