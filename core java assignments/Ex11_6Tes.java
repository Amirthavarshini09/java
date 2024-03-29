package eCeptionnn;

public class Ex11_6Tes {

		public static void main(String[] args)

		{

		Ex11_6 instanceA = new Ex11_6();

		Ex11_6 instanceB = new Ex11_6();

		instanceA.a = 8;

		instanceB.b = instanceA.x;

		instanceA.x++;

		instanceB.a = 10;

		instanceB.c = 90;

		instanceB.x++;
		System.out.println("A: "+instanceA.a);
		System.out.println("B: "+instanceA.b);
		System.out.println("C: "+instanceA.c);
		System.out.println("D: "+instanceA.x);
		System.out.println("**********");
		System.out.println("A: "+instanceB.a);
		System.out.println("B: "+instanceB.b);
		System.out.println("C: "+instanceB.c);
		System.out.println("D: "+instanceB.x);

		}

		

}
