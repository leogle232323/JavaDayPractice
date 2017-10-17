package java_study;

public class CalculatorTest {

	public static void main(String[] args) {
		int d = 10;
		Calculator calculator = new Calculator();
		int c = calculator.getSum(1, 1);
		int e = calculator.getSum(c, c * d);
		System.out.println(c);
		System.out.println(e);
		int x = calculator.increase(d);
		System.out.println(d);
	}

	String str1;
	String str2 = "";
	String str3 = new String();
}
