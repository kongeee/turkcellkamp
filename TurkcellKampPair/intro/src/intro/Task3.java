package intro;
//ilk 2 arkadas sayi
public class Task3 {

	public static void main(String[] args) {
		
		int number1 = 1;
		int number2 = 1;
		
		
		int sum1=0, sum2=0;
		
		while(true) {
			
			//once ilk sayının bölenleri toplamını bul
			for(int i = 1; i<number1; i++) {
				if(number1%i==0) {
					sum1+=i;
				}
			}
			
			//arkadaş sayılarda ikinci sayı birinci sayının bölümleri toplamı kadardır onun için döngü oraya kadar çalışır.
			//ikinci sayının bölenlerini bul
			for(number2 = 1; number2<sum1 ; number2++) {
				
					if(sum1%number2==0) {
						sum2+=number2;
					}
				
			}
			
			//eğer ikinci sayının bölenleri birinci sayıya eşitse döngüyü bitir(birincinin bölenleri ikinci sayıya eşit kabul ediyoruz onun için kontrol etmedik)
			
			if(sum2 == number1 && sum1 != sum2) {
				break;
			}
			
			//her döngüde birinci sayıyı artır ve toplamları sıfırla
			number1++;
			sum1=0;
			sum2=0;
		}
		System.out.println(sum1+ "\n"+ sum2);

	}

}
