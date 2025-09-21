import myfirstpackage.*;

public class MyFirstProgram {
	public static void main(String[] args) {
		MySecondClass o = new MySecondClass(0,0);
	for(int i = 1; i<=8; i++) {
		for(int j = 1; j <=8; j++) {
			o.setNumber1(i);
			o.setNumber2(j);
			System.out.print(o.multiplyNumbers());
			System.out.print(" ");
		}
		System.out.println();
		}
	 }
}