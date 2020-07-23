import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		MyLambda obj = new MyLambda();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		System.out.println(obj.count(str));
	}
}