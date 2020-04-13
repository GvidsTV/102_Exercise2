
public class Admin {
    public String name;
    public String pass="1234";
    public String userName;

    //constructor
    public Admin(String name,String userName){
        this.name=name;
        this.userName=userName;
    }

    public double changesalary(double oldSalary,double newSalary){
        return newSalary;
    }
}