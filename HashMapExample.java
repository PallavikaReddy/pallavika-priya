import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        
        HashMap<Integer, String> students = new HashMap<>();
        
        
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
        students.put(104, "David");
        students.put(105, "Eve");
        
        System.out.println("students:"+students);
        System.out.println("Student 103: " + students.get(103));
        
        
        students.remove(104);
        System.out.println("Removed student 104");
        
        
        System.out.println("All students: " + students);
    }
}
