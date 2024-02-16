package week1.day2;

public class Palindrome {
	public static void main(String[] args) {
        int remainder=0;
        int sum = 0; 
        int temp;
        int num =112211 ;
        temp = num;
        while (num > 0) {
            remainder = num % 10;
            sum = (sum * 10) + remainder;
            num = num / 10;
        }
        if (temp == sum)
            System.out.println("Given number is a Palindrome number");
        else
            System.out.println("Given number is Not a palindrome");
    }
}
