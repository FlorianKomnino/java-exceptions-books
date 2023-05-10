package org.java.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.java.Book;

public class Library {
	public static void main(String[] args) {
		
		File filePath = new File("C:/CODING/booksLibrary.txt");

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci il numero di libri che vuoi caricare nella libreria:");
		int booksNumber = sc.nextInt();
		Book[] booksArr = new Book[booksNumber];
		int booksIndex = 0;
		
		System.out.println("Hai deciso di inserire " + booksNumber + " libri. Cominciamo!");
		
		sc.nextLine();
		while (booksIndex < booksNumber) {
			System.out.println("Libro " + (booksIndex + 1));
			
			System.out.println("Inserisci il titolo: ");
			String bookTitle = sc.nextLine();
			
			System.out.println("Inserisci il numero di pagine del libro: ");
			int booksPages = sc.nextInt();
			
			sc.nextLine();
			System.out.println("Inserisci l'autore del libro: ");
			String booksAuthor = sc.nextLine();
			
			try {
				Book b1 = new Book(bookTitle, booksPages, booksAuthor);
				booksArr[booksIndex++] = b1;
			} catch (Exception e) {
				System.err.println("C'e' stato un errore: " + e.getMessage() + "/nRiprova");
			}
		}
		
		System.out.println("Hai finito di caricare i tuoi libri!");


		for (int i=0; i<booksIndex; i++) {
			try {
				FileWriter myWriter = new FileWriter(filePath);
				myWriter.write(booksArr[i].toString() + "\n");
				myWriter.close();
				System.out.println("-----------------------------");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		sc.close();

	}
}
