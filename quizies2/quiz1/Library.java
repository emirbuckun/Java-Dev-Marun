package quiz1;

import java.util.ArrayList;

public class Library {
	private ArrayList<Book> books = new ArrayList<Book>();
	private ArrayList<Customer> customers = new ArrayList<Customer>();

	public Library() {
	}

	public boolean addBook(Book book) {
		if (!books.contains(book) && books.size() > 0) {
			for (int i = 0; i < books.size(); i++) {
				if (books.get(i).getTitle().compareTo(book.getTitle()) < 0) {
					books.add(i, book);
					return true;
				}
			}
		} else
			books.add(book);

		return true;
	}

	public void addCustomer(Customer customer) {
		if (!customers.contains(customer) && customers.size() > 0) {
			for (int i = 0; i < customers.size(); i++) {
				if (customers.get(i).getName().compareTo(customer.getName()) < 0) {
					customers.add(i, customer);
					return;
				}
			}
		} else
			customers.add(customer);
	}

	public int searchBook(String bookName) { // found = 1, not found = -1
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getTitle() == bookName)
				return 1;
		}
		return -1;
	}

	public int searchCustomer(String customerName) { // found = 1, not found = -1
		for (int i = 0; i < customers.size(); i++) {
			if (customers.get(i).getName() == customerName)
				return 1;
		}
		return -1;
	}

	public void borrowBook(String bookName, String personName) { // time was not enough to implement this method
		ArrayList<Integer> indexList = new ArrayList<Integer>();
		int BookIndex = -1;
		int customerIndex = -1;

		// Check whether bookName and personName is in the arraylists or not
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getTitle() == bookName)
				indexList.add(i);
		}

		for (int i = 0; i < indexList.size(); i++) {
			if (!books.get(indexList.get(i)).isBorrowed()) {
				BookIndex = indexList.get(i);
				break;
			}
		}

		for (int i = 0; i < customers.size(); i++) {
			if (customers.get(i).getName() == personName)
				customerIndex = i;
		}

		// Print necessary warnings
		if (indexList.isEmpty())
			System.out.println("Sorry, this book is not in our catalog.");
		else if (BookIndex == -1)
			System.out.println("Sorry, this book is already borrowed.");
		else if (customerIndex == -1)
			System.out.println("Sorry, " + personName + " is not a customer.");

		else { // If everything is fine, add the given book to the given customer
				// Make book is borrowed
			books.get(BookIndex).borrowed();

			// Print success message
			System.out.println(personName + " successfully borrowed " + bookName + ".");
		}
	}

	public void returnBook(String bookName, String personName) { // time was not enough to implement this method

	}

	public void listBorrowedBooks(String personName) {
		int customerIndex = -1;

		for (int i = 0; i < customers.size(); i++) {
			if (customers.get(i).getName() == personName)
				customerIndex = i;
		}

		if (customerIndex == -1)
			System.out.println("Sorry, " + personName + " is not our customer");
		else {
			for (int i = 0; i < customers.get(customerIndex).getCurrentBooks().size(); i++) {
				System.out.println((i + 1) + ". " + customers.get(customerIndex).getName() + " borrowed the book: "
						+ customers.get(customerIndex).getCurrentBooks().get(i));
			}
		}
	}

	public void printAvailableBooks() {
		boolean anyBook = false;

		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).isBorrowed() == false) {
				System.out.println(books.get(i).toString());
				anyBook = true;
			}
		}

		if (!anyBook)
			System.out.println("No book in catalog.");
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}
}
