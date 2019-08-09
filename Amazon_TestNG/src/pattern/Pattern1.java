package pattern;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern1 obj = new Pattern1();
		/*
		 * obj.p1(); obj.p2(); obj.pattern3(); obj.patter4(); obj.p1_n1(); obj.p2_n();
		 * obj.pattern3_n(); obj.patter4_n();
		 */
		obj.m12();
		obj.m13();

	}

	public void m13() {
		String a = "narapareddy";
		String b = "ramakrishnareddy";
		System.out.println("before swapping");
		System.out.println("the value of a:" + a);
		System.out.println("the value of b:" + b);

		// append in two strings
		a = a + b;
		// a store in b
		System.out.println(a.length());
		System.out.println(a.length() - b.length());
		b = a.substring(0, a.length() - b.length());
		System.out.println(b.length());

		// b store in a
		a = a.substring(b.length());

		System.out.println("after swapping");
		System.out.println("the value of a:" + a);
		System.out.println("the value of b:" + b);

	}

	public void m12() {

		int rows = 6, coef = 1;
		for (int i = 0; i < rows; i++) {
			for (int space = 1; space < rows - i; ++space) {
				System.out.print("  ");
			}
			for (int j = 0; j <= i; j++) {
				if (j == 0 || i == 0)
					coef = 1;
				else
					coef = coef * (i - j + 1) / j;
				System.out.printf("%4d", coef);
			}
			System.out.println();
		}
	}

	public void p1() {
		int n = 6;
		for (int i = 0; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void p2() {
		int n = 6;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void pattern3() {
		int n = 6;
		for (int i = 0; i <= n; i++) {
			for (int p = n; p >= i; p--) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print("* ");

			}

			System.out.println();
		}
	}

	public void patter4() {
		int n = 6;
		for (int i = 0; i <= n; i++) {
//Adding spaces
			for (int k = 0; k <= i; k++) {
				System.out.print(" ");
			}

//printing '*'
			for (int j = n; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println("");
		}

	}

	public void p1_n1() {
		int n = 6;
		for (int i = 0; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

	public void p2_n() {
		int n = 6;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public void pattern3_n() {
		int n = 6;
		for (int i = 0; i <= n; i++) {
			for (int p = n; p >= i; p--) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print("" + i + " ");

			}

			System.out.println();
		}
	}

	public void patter4_n() {
		int n = 6;
		for (int i = 0; i <= n; i++) {
//Adding spaces
			for (int k = 0; k <= i; k++) {
				System.out.print(" ");
			}

//printing '*'
			for (int j = n; j >= i; j--) {
				System.out.print(i + " ");
			}
			System.out.println("");
		}

	}
}
