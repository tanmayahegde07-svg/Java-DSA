import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int originalNum = num;
        int result = 0;
        int digits = String.valueOf(num).length(); // count digits
        
        while (num > 0) {
            int remainder = num % 10;
            result += Math.pow(remainder, digits);
            num /= 10;
        }
        
        if (result == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
        
        sc.close();
    }
}
