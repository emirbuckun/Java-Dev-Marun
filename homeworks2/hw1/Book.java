package hw1;

public class Book {
	private int id;
	private String title;
	private Author author;
	private boolean borrowed;

	public Book(int id, String title, Author author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}

	public Book(int id, String title) {
		this.id = id;
		this.title = title;
	}

	public boolean isBorrowed() {
		return borrowed;
	}

	public boolean borrowed() {
		// if (borrowed = false) { // Not borrowed yet
		// borrowed = true;
		// return true;
		// } else // Already borrowed
		// return false;
		borrowed = true;
		return true;
	}

	public boolean returned() {
		// if (borrowed = true) { // Not returned yet
		// borrowed = false;
		// return true;
		// } else // Already returned
		// return false;
		borrowed = false;
		return true;
	}

	public String toString() {
		return "Book name is " + getTitle() + ", " + author.toString() + ".";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
}
