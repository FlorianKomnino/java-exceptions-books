package org.java;

public class Book {
	private String title;
	private int pagesNumber;
	private String author;
	private String editor;
	
	public Book(String title, int pagesNumber, String author) throws Exception {
		setTitle(title);
		setPagesNumber(pagesNumber);
		setAuthor(author);
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) throws Exception {
		
		if (title.length() < 1) {
			
			throw new Exception("Il nome non puo' contenere meno di 1 carattere");
		}
		
		this.title = title;
	}
	public int getPagesNumber() {
		return pagesNumber;
	}
	public void setPagesNumber(int pagesNumber) throws Exception {
		
		if (pagesNumber <= 0) {
			
			throw new Exception("Il numero di pagine non puo' essere inferiore a 1");
		}
		this.pagesNumber = pagesNumber;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) throws Exception {
		
		if (author.length() < 1) {
			
			throw new Exception("L'autore non puo' contenere meno di 1 carattere");
		}
		
		this.author = author;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		
		this.editor = editor;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Titolo: " + title + ", autore: " + author + " - " + pagesNumber + " pagine.";
	}
}
