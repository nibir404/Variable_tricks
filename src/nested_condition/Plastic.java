
package nested_condition;

public class Plastic{
    
    int y=5;
    public void calAge(){
      int age =  0;
      age = age + 7;
      y = y+3;
      int Real_Age = 0;
      Real_Age = y+age;
        System.out.println("Age is : "+Real_Age);
    }

    public static void main(String[] args) {
     Plastic test = new Plastic();
     test.calAge();
  }
    
}
