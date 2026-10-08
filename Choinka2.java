public class Choinka2 { 
	public static void main(String[] args) {
	String x = args[0];
	int r = Integer.parseInt(x);
		for(int i=1; i<=r; i++) {
			for(int z=1; z<=i; z++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}