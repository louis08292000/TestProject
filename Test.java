import java.util.Scanner;

class Test{
	
	public static void main(String[] args) throws Exception{
		
		int a ;
		int b = 2;
		
		Scanner scanner = new Scanner(System.in);
		
		a = scanner.nextInt();
		
         System.out.println("a&b"+(a&b));
		 System.out.println("a|b"+(a|b));
			check(a,b);
	}
	
	public static void check(int a,int b){
        if ( (a & b) == b){
            System.out.println(a-2);
        }else {
            System.out.println(a+2);
        }
    }
}