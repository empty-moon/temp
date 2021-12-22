/*public class Test1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入两个整数：");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int min = (num1 <= num2) ? num1 : num2;
		int max = (num1 >= num2) ? num1 : num2;
		for (int i = max; i <= num1 * num2; i++) {
			if (i % num1 == 0 && i % num2 == 0) {
				System.out.println("最小公倍数为：" + i);
				break;
			}
		}
		for (int j = 2; j <= min; j++) {
			if (num1 % j == 0 && num2 % j == 0) {
				System.out.println("最大公约数为：" + j);
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
		//少一些代码，后续补充
		System.out.println("数组中最大值为：" + nums[nums.length -1] + ",最小值为：" + nums[0]);
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += i;
		}
		int avg = sum /nums.length;
		System.out.println("数组中元素值的和为：" + sum + ",平均值为：" + avg);
	}
}*/
/*import java.util.Scanner;
public class Test4 {
	public static void main(String[] args) {
		//题目尚待完善
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入要存入的金额：");
		double money = scan.nextDouble();
		System.out.print("请输入存期：");
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
			System.out.println("输入的年限有误！");
		}
		System.out.printf("到期后得到的本息总和为：%.2f",money);
	}
}*/