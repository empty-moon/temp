/*public class Test1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("����������������");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int min = (num1 <= num2) ? num1 : num2;
		int max = (num1 >= num2) ? num1 : num2;
		for (int i = max; i <= num1 * num2; i++) {
			if (i % num1 == 0 && i % num2 == 0) {
				System.out.println("��С������Ϊ��" + i);
				break;
			}
		}
		for (int j = 2; j <= min; j++) {
			if (num1 % j == 0 && num2 % j == 0) {
				System.out.println("���Լ��Ϊ��" + j);
				break;
			}
		}
	}
}*/
/*public class Test2 {
	public static void main(String[] args) {
		int[] arr = { 43, 32, 76, -98, 0, 64, 33, 21, 37, 99 };
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			int min = arr[0];
			int flag = i;
			for (int j = i + 1; j < length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					flag = j;
				}
			int temp = arr[i];
			arr[i] = arr[flag];
			arr[flag]= temp;
			}
		}
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}*/
/*public class Test3 {
	public static void main(String[] args) {
		int[] nums =new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] =(int)(Math.random() * 90 + 10);
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		//��һЩ���룬��������
		System.out.println("���������ֵΪ��" + nums[nums.length -1] + ",��СֵΪ��" + nums[0]);
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += i;
		}
		int avg = sum /nums.length;
		System.out.println("������Ԫ��ֵ�ĺ�Ϊ��" + sum + ",ƽ��ֵΪ��" + avg);
	}
}*/
/*import java.util.Scanner;
public class Test4 {
	public static void main(String[] args) {
		//��Ŀ�д�����
		Scanner scan = new Scanner(System.in);
		System.out.print("������Ҫ����Ľ�");
		double money = scan.nextDouble();
		System.out.print("��������ڣ�");
		int year = scan.nextInt();
		switch (year) {
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
		
			break;
		default:
			System.out.println("�������������");
		}
		System.out.printf("���ں�õ��ı�Ϣ�ܺ�Ϊ��%.2f",money);
	}
}*/