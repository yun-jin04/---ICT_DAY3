package day4;
import java.util.Scanner;
public class whilesample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count=0, n=0;
		double sum=0;
		
		System.out.println("������ �Է��ϰ� �������� 0�� �Է��ϼ���.");
	while((n=scanner.nextInt())!=0) {
		sum=sum+n;
		count++;
	}
	System.out.println("���� ������"+count+"���̸�");
	System.out.println("�����"+sum/count+"�Դϴ�.");
		
	}
}
