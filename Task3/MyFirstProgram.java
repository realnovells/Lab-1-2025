class MyFirstProgram {
	public static void main(String[] args) {
	MySecondClass o = new MySecondClass(0,0);
	for(int i = 1; i <= 8; i++) {
		for(j = 1; j <= 8; j++) {
			o.setNumber(i);
			o.setNumber(j);
			System.out.print(o.multiplyNumbers());
			System.out.print(" ");
	}
	System.out.println();
	}
    }
}

class MySecondClass {
	private int Number1;
	private int Number2;

	public MySecondClass(int Number1, int Number2) {
		this.Number1 = Number1;
		this.Number2 = Number2;
 }

 public int getNumber1() {
	return Number1;
}

 public int getNumber2() {
	return Number2;
}

 public void setNumber1(int Number1) {
	this.Number1 = Number1;
}
 public void setNumber2(int Number2) {
	this.Number2 = Number2;
}

 public int multiplyNumbers() {
	return Number1 * Number2;
	}
}