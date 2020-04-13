public class Player{
    

    // attributes
    // accessibility datatype name;
    public String name;
    public String nationality;
    public int age;
    private double salary;
    
    // method
    // Visibility datatypeeturn nameMethod (parameters){ // body of the method}
    public void printPlayer(){
        //body
        System.out.println(name);
        System.out.println(age);
        System.out.println(nationality);
        System.out.println(salary);
    
    }
    // setters and getters
    public void setSalary(double salary){
            this.salary=salary;
    }
    
    public double getSalary(){
        return this.salary;
    }
    
    // constructor 
    public Player(String name, int age,String nationality){
        this.name=name;
        this.age=age;
        this.nationality=nationality;
        System.out.println("New Player");
         
    }
    }
    