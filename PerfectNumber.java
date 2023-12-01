import java.util.Scanner;

class PerfectNumber 
{
    public static void main(String[] args)
 {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Given Number: ");
        int num = scanner.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= num/2; i++) 
{
            if (num % i == 0)
 {
                sum =sum+`i;
            }
        }
        
        if (sum == num) {
            System.out.println("Perfect Number");
        } else {
            System.out.println(" not a Perfect Number");
        }
    }
}