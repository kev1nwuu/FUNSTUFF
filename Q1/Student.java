public class Student extends Person{
    
    private double GPA;
    public String Major;
    public int yearofGraduation;

    public Student(String name, String SSN, int Age, String Gender, String Address, String Telephonenumber, Double GPA, String Major, int yearofGraduation){
        
        super(name,SSN,Age,Gender,Address,Telephonenumber);
        
        this.GPA = GPA;
        this.Major = Major;
        this.yearofGraduation = yearofGraduation;
    }

    public void setGPA(double GPA){
        this.GPA = GPA;
    }
    
    public  Double getGPA(){
        return this.GPA;
    }

    public String getMajor(){
        return this.Major;
    }

    public int getyearofGraduation(){
        return this.yearofGraduation;
    }

    public String toString(){
        
        return "Student: " +super.toString() + " and GPA is " + getGPA() +", Major is "+ getMajor() +", finally year of Graduation " +getyearofGraduation()+".";
    }
}