package StepDefinitions;

public class NumberPro {

	public static void main(String[] args) {
		int b = 7, e = 12, m;
		long num = 1;
        
		for (int i = 0; i < e; i++) {
//			num = b * b;
            num = num *b;
		}
		System.out.println(num);
	}

}
