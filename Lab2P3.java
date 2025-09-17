import java.util.Scanner;
class Lab2P3{
	public static void main(String...args){
		Scanner s=new Scanner(System.in);
		System.out.println("enter a value");
		int a=s.nextInt();
		System.out.println("enter b value");
		int b=s.nextInt();
		String op=s.next();
		var str=switch(op){
			case "++"->"hello";
			case "--","=","~"->"not good";
			case "+="-> a+=a;
			case "-="-> a-=a;	
			case "*="-> a*=a;
			case "/="-> a/=a;
			case "%="-> a%=a;	
			default->"sorry";
		};
		System.out.println("result is:"+str);
	}
}
