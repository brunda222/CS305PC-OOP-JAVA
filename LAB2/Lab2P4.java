import java.util.Scanner;
class Lab2P4{
	public static void main(String...args){
		Scanner s=new Scanner(System.in);
		System.out.println("enter a value");
		int a=s.nextInt();
		System.out.println("enter b value");
		int b=s.nextInt();
		System.out.println("bitwise &"+(a&b));
		System.out.println("bitwise |"+(a|b));
		System.out.println("bitwise ^"+(a^b));
		System.out.println("r shft"+(a>>1));
		System.out.println("l shft"+(a<<1));
		System.out.println("r shft most"+(a>>>1));
	}
}		
