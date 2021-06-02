package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] rent = new Rent[10];
		
		System.out.print("How many rooms will be rented: ");
		int n = sc.nextInt();
		System.out.println();
		
		for (int i = 0 ; i<n ; i++) {
			System.out.println("Rent #" + (i + 1));
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.println("Room: ");
			int room = sc.nextInt();
			rent[room] = new Rent(name, email, room);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		
		for (int i=0;i<10;i++) {
			if (rent[i] != null) {
				System.out.println(rent[i]);
			}
		}
		
		sc.close();
	}

}
