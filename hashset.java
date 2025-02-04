
import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        
        HashSet<String> cities = new HashSet<>();
        
        cities.add("New York");
        cities.add("London");
        cities.add("Paris");
        cities.add("Tokyo");
        cities.add("London"); 
        
        System.out.println("Cities: " + cities);
        cities.remove("Tokyo");
        System.out.println("after removing duplicates:"+cities);

        System.out.println("Updated Cities: " + cities);
    }
}
