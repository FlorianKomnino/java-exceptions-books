package org.java;

public class Book {
	private String title;
	private int pagesNumber;
	private String author;
	private String editor;
	
	public Book(String title, int pagesNumber, String author, String editor) {
		this.title = title;
		this.pagesNumber = pagesNumber;
		this.author = author;
		this.editor = editor;
		
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) throws Exception {
		
		if (title.length() <= 3 || title.length() > 50) {
			
			throw new Exception("Il nome non puo' contenere meno di 3 o piu' di 50 caratteri");
		}
		
		this.title = title;
	}
	public int getPagesNumber() {
		return pagesNumber;
	}
	public void setPagesNumber(int pagesNumber) throws Exception {
		
		if (pagesNumber < 5 || pagesNumber > 3000) {
			
			throw new Exception("Il nome non puo' contenere meno di 3 o piu' di 50 caratteri");
		}
		this.pagesNumber = pagesNumber;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) throws Exception {
		
		if (author.length() <= 3 || author.length() > 50) {
			
			throw new Exception("L'autore non puo' contenere meno di 3 o piu' di 50 caratteri");
		}
		
		this.author = author;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) throws Exception {
		
		if (author.length() <= 3 || author.length() > 50) {
			
			throw new Exception("L'editore non puo' contenere meno di 3 o piu' di 50 caratteri");
		}
		
		this.editor = editor;
	}
}
