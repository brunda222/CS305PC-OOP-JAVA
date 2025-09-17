import java.util.Scanner;
class Lab2P5{
	public static void main(String...args){
		Scanner s=new Scanner(System.in);
		System.out.println("enter prime value");
		int prime=s.nextInt();
		int count=0;
		int i=2;
		while(i%prime==0){
			System.out.println("prime is"+i);
			count++;
		}
	}
}
