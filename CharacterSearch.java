import java.util.Scanner;

public class CharacterSearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        
        System.out.print("Enter the string: ");
        String S1 = s.nextLine();

        
        System.out.print("Enter the character to be searched: ");
        char search = s.next().charAt(0);

        
        int index = S1.indexOf(search);

        
        if (index != -1) {
            System.out.println(search + " is found in the string at index: " + index);
        } else {
            System.out.println(search + " is not found in the string.");
        }
    }
}