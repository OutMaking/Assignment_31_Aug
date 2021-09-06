import java.util.*; 
public class String3{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter String - ");  
        String str_Sample = sc.nextLine(); 
        System.out.println("Starts With character 'a': " + str_Sample.startsWith("a"));
        System.out.println("Ends With character 't': " + str_Sample.endsWith("t"));
        
    }
}