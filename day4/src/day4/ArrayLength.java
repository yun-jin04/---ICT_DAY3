package day4;
import java.util.Scanner;
public class ArrayLength {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("5���� ������ �Է��ϼ���.");
		int intArray[] = new int[5];
		
		double sum=0.0;
		for(int i=0; i<intArray.length; i++)
			intArray[i]=scanner.nextInt();
		
		for(int i=0; i<intArray.length;i++)
			sum += intArray[i];
		
		System.out.println("�����"+sum/intArray.length);
		
	}

}
