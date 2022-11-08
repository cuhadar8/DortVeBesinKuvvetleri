import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		int sayi = scanner.nextInt();
		
		System.out.print(sayi + " sayısından küçük 4 ün kuvvetleri: ");
		for(int i = 1; i<=sayi; i*=4) {
			System.out.print(i + " ");
		}
		
		System.out.println("");
		
		System.out.print(sayi + " sayısından küçük 5 ün kuvvetleri: ");
		for(int i = 1; i<=sayi; i*=5) {
			System.out.print(i + " ");
		}

	}

}
