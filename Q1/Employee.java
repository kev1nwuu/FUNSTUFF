public class Employee extends Person{
    
    public String department;
    public String jobtitle;
    public int yearofhire;

    public Employee(String name, String SSN, int Age, String Gender, String Address, String Telephonenumber,String department, String jobtitle, int yearofhire){
        
        super(name,SSN,Age,Gender,Address,Telephonenumber);
        
        this.department = department;
        this.jobtitle = jobtitle;
        this.yearofhire = yearofhire;
    }

    public String getdepartment(){
        return this.department;
    }

    public String getjobtitle(){
        return this.jobtitle;
    }

    public int getyearofhire(){
        return this.yearofhire;
    }

    public String toString(){
        
        return super.toString() + " working on " + getdepartment() +", and jobtitle is " + getjobtitle()+ ", year of hire is "+ getyearofhire()+".";
    }

}