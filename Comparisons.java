import java.util.Scanner;

public class Comparisons
{
	public static void main(String[] agrs)
	{
		Scanner scan = new Scanner(System.in);
		
		String str1, str2, str3;
		
		System.out.print("Enter first string: ");
		str1 = scan.nextLine();
		System.out.print("Enter second string: ");
		str2 = scan.nextLine();
		System.out.print("Enter third string: ");
		str3 = scan.nextLine();
		
		System.out.println("Largest string: " + Compare3.largest(str1, str2, str3));
		
		int int1, int2, int3;
		
		System.out.println();
		System.out.print("Enter first integer: ");
		int1 = scan.nextInt();
		System.out.print("Enter second integer: ");
		int2 = scan.nextInt();
		System.out.print("Enter third integer: ");
		int3 = scan.nextInt();
		
		System.out.println("Largest integer: " + Compare3.largest(int1, int2, int3));
		
		scan.close();
		
	}
}
