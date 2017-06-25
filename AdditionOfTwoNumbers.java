package assignments;

public class AdditionOfTwoNumbers {

	public static void main(String[] args) {
		int a =3;
		int b=7;
		int c;
		while(b!=0)
		{
			c = a & b;
            a = a ^ b;
            b = c << 1;
        }
       System.out.println(a);
	}

}
