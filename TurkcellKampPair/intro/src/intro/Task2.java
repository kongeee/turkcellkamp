package intro;
//ilk 4 mukemmel sayi
import java.util.ArrayList;

public class Task2 {

	public static void main(String[] args) {
		ArrayList<Integer> superNumbers = new ArrayList<>();

		int number = 2;
		int sum = 0;
		while(superNumbers.size() != 4) {

			for(int i = 1; i<number ; i++) {
				if(number % i == 0) {
					sum += i;
				}
			}

			if(number == sum) {
				superNumbers.add(number);

			}

			number++;
			sum = 0;

		}

		for(int num : superNumbers) {
			System.out.println(num);
		}

	}

}
