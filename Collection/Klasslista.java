package Collection;
import java.util.*;
public class Klasslista {
    public static void main(String[] args) {
        Set<Student> klasslistan = new HashSet<>();
        Student tom = new Student("Tom", 123400, true);
        Student pater = new Student("Pater", 3450, false);
        klasslistan.add(tom);
        klasslistan.add(pater);
       

        List <Student> klasslista2 = new ArrayList<>();
        
  
        klasslista2.add(pater);
        klasslista2.add(tom);



    }

   

    
}