package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int num = 232, tempNumber, temp = 0;
		int reverse = 0;
		tempNumber = num;
		while (num != 0) {
			reverse = num % 10;
			num = num / 10;
			reverse = reverse + (temp * 10);
			temp = reverse;
		}
		
		if(reverse == tempNumber) {
			System.out.println(" palindrome of a given number is :" + temp);
		} else {
			System.out.println("It is not a palindrome number");
		}
	}

}
