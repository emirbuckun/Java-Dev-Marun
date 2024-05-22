package hw1;

import java.util.ArrayList;

public class Library {
	private String address;
	private ArrayList<Book> books = new ArrayList<Book>();
	private ArrayList<Customer> customers = new ArrayList<Customer>();

	public Library(String address) {
		this.address = address;
	}

	public static void printOpeningHours() {
		System.out.println("Libraries are open daily from 9 am to 5 pm.");
	}

	public void printAddress() {
		System.out.println(address);
	}

	public void addBook(Book book) {
		books.add(book);
	}

	public void addCustomer(Customer customer) {
		customers.add(customer);
	}

	public void borrowBook(String bookName, String personName) {
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
		else if (customers.get(customerIndex).isBorrowABook())
			System.out.println("Sorry, " + personName + " already borrowed a book.");

		else { // If everything is fine, add the given book to the given customer
				// Make book is borrowed
			books.get(BookIndex).borrowed();

			// Make customer borrowed a book
			customers.get(customerIndex).setBorrowABook(true);
			customers.get(customerIndex).setBorrowedBook(books.get(BookIndex));

			// Print success message
			System.out.println(personName + " successfully borrowed " + bookName + ".");
		}
	}

	public void returnBook(String personName) {
		int customerIndex = -1;

		for (int i = 0; i < customers.size(); i++) {
			if (customers.get(i).getName() == personName)
				customerIndex = i;
		}

		if (customerIndex == -1)
			System.out.println("Sorry, " + personName + " is not a customer.");
		else {
			// Check customer has a borrewed book
			if (customers.get(customerIndex).getBorrowedBook() != null) {
				int bookId = customers.get(customerIndex).getBorrowedBook().getId();

				for (int i = 0; i < books.size(); i++) {
					if (books.get(i).getId() == bookId) {
						books.get(i).returned();

						// Print success returned message
						System.out.println(personName + " succesfully returned " +
								books.get(i).getTitle());
						break;
					}
				}

				// Make customer returned its book
				customers.get(customerIndex).setBorrowABook(false);
				customers.get(customerIndex).setBorrowedBook(null);
			} else
				System.out.println("Sorry, " + personName + " did not borrow a book.");
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

		if (!anyBook) {
			System.out.println("No book in catalog.");
		}
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}
}
