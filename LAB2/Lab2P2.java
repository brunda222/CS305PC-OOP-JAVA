import java.util.Scanner;
class Lab2P2{
	public static void main(String...args){
		Scanner s=new Scanner(System.in);
		System.out.println("enter a value");
		int a=s.nextInt();
		int y=a;
		System.out.println("output :"+ a++ + ++a);
		a=y;
		System.out.println("output :" +(a++ + ++a));
		a=y;
		System.out.println(a++ + ++a +":output");
	}
}	
