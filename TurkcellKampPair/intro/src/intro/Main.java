package intro;

public class Main {

	public static void main(String[] args) {
		
		for(int i=2; i<1000 ; i++) {
			boolean primeFlag = true;
			for(int j=2 ; j<=i/2; j++) {
				
				if(i%j == 0) {
					primeFlag = false;
					break;
				}
			}
			if(primeFlag) {
				System.out.println(i);
			}
		}
		
		
	}

}
