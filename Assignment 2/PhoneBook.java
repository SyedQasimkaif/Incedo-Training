package day2Assignments;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class PhoneBook {

    // Contact Class
    static class Contact {
        private String name;
        private String phoneNumber;

        public Contact(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public String getName() {
            return name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Phone: " + phoneNumber;
        }
    }

    // PhoneBook Class
    static class PhoneBookImpl {
        private List<Contact> contacts;

        public PhoneBookImpl() {
            this.contacts = new ArrayList<>();
        }

        // Method to add a contact to the phonebook
        public void addContact(Contact contact) {
            contacts.add(contact);
        }

        // Method to search for contacts by name (contains the substring)
        public Contact[] searchContactsByName(String name) {
            List<Contact> result = new ArrayList<>();
            
            for (Contact contact : contacts) {
                if (contact.getName().toLowerCase().contains(name.toLowerCase())) {
                    result.add(contact);
                }
            }
            
            // Convert list to array and return
            return result.toArray(new Contact[0]);
        }
    }

    // SearchContacts Test Class
    public static void main(String[] args) {
        // Create a PhoneBookImpl instance and add some contacts
        PhoneBookImpl phoneBook = new PhoneBookImpl();
        phoneBook.addContact(new Contact("Ram Charan", "123-456-7890"));
        phoneBook.addContact(new Contact("NTR", "234-567-8901"));
        phoneBook.addContact(new Contact("SRK", "345-678-9012"));
        phoneBook.addContact(new Contact("KTR", "456-789-0123"));

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a name or part of a name to search for
        System.out.print("Enter the name or part of the name to search for: ");
        String searchName = scanner.nextLine();

        // Search for contacts
        Contact[] result = phoneBook.searchContactsByName(searchName);

        // Print the search results
        if (result.length > 0) {
            System.out.println("Search Results:");
            for (Contact contact : result) {
                System.out.println(contact);
            }
        } else {
            System.out.println("No contacts found with the name containing: " + searchName);
        }

        scanner.close();
    }
}
