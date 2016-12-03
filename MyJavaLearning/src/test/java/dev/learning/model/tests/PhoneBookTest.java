package dev.learning.model.tests;

import junit.framework.TestCase;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import dev.learning.model.Contact;
import dev.learning.model.PhoneBook;

public class PhoneBookTest extends TestCase {

	private PhoneBook phoneBook = PhoneBook.getInstance();

	@BeforeClass
	public void setUp() {
		phoneBook.addContact(new Contact("Ryan"), "9999911111");
		phoneBook.addContact(new Contact("Hari", "Sadu", "hari.sadu@gmail.com",
				"Mumbai"), "9988911111");
		phoneBook.addContact(new Contact("Alok", "Nath",
				"iAmSanskari@gmail.com", null), "9999922211");
		phoneBook.addContact(new Contact("Rancho"), "9999911333");
		phoneBook.addContact(new Contact("Basheer"), "9999912345");
	}

	@Ignore
	@Test
	public void testSearchContactWithContactDetails() {
		Contact searchContact = new Contact("Rancho");
		phoneBook.searchContactWithContactDetails(searchContact);

		searchContact = new Contact("Hari");
		phoneBook.searchContactWithContactDetails(searchContact);

		searchContact = new Contact("Hari", null, "hari.sadu@gmail.com",
				"Mumbai");
		phoneBook.searchContactWithContactDetails(searchContact);

		// searchContact = new Contact(null);
		// phoneBook.addContact(searchContact, null);
		// phoneBook.addContact(searchContact, "99");
		// phoneBook.searchContactWithContactDetails(searchContact);
	}

	@Test
	public void testSearchContactWithPhoneNumber() {
//		phoneBook.searchContactWithPhoneNumber(null);
//		phoneBook.searchContactWithPhoneNumber("995");
		phoneBook.searchContactWithPhoneNumber("9999912345");
		phoneBook.searchContactWithPhoneNumber("9988911111");
		phoneBook.searchContactWithPhoneNumber("9999922211");
	}

}
