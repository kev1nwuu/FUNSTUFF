class Test{
    public static void main(String[] args) {
        
        Person people [] = new Person[4];
        

        people[0] = new Student("kevin", "123-321-123", 22, "male", "195 bessber", "4335062859", 7.4, "cs", 2025);
        
        people[1] = new Employee("Bob", "321-115-788", 29, "male", "Kanata", "4257896011", "Faculty of Engineering", "professor", 2018);
        
        people[2] = new Hourlyemployee("Isabella", "432-234-432", 38, "female", "240 Rideau St", "42566787771", "Faculty of Science", "professor", 2015, 52.88, 2304,1873.58);// total salary is 121835.52 CA$  
        
        people[3] = new Salariedemployee("James", "456-654-321", 30, "male", "243 Rideau St", "42569375864", "Faculty of Engineering", "Associate Professor", 2021, 69471.0);
        
        
        
        
        
       
        
        
        
        for (int i = 0; i < 4; i++){
            System.out.println(people[i]+"\n\n");
            
        }
        
        
        System.out.println(people[0].getname());
    
        //System.out.println(people[0].SSN);  //u cant see it because i set it private,so it not visible.
    }

}