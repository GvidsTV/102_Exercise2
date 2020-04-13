
public class SportSystem {

    
        public static void main(String[] args){
           
           //where the interaction take place
           //create objects
   
           //datatype name = new datatype();
           Player p1= new Player("Lionel Messi",31,"Argentina");
           p1.setSalary(25898.25); // private 
           // p1.Salary=25689.25; // public
           p1.printPlayer();
   
           // object 2
   
           Player p2 = new Player("Christiano Ronaldo",35,"Portugal"); 
           p2.setSalary(247899.25); // private 
           // p2.Salary=247899.25; // public
           p2.printPlayer();

           //admin change the salary of p2
           Admin a = new Admin("Mark","admin");
           double salary=a.changesalary(p2.getSalary(), 2568.25);
           p2.setSalary(salary);
           // see new salary
           p2.printPlayer();
   
   
   
           
   
   }
   

}