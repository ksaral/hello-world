package dev.learning.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

public class PhoneBook {

	private Map<Contact, String> records;

	private PhoneBook() {
		records = new HashMap<Contact, String>();
	}

	private static class HelperHolder {
		public static final PhoneBook INSTANCE = new PhoneBook();
	}

	public static PhoneBook getInstance() {
		return HelperHolder.INSTANCE;
	}

	public void addContact(Contact contact, String phoneNumber) {
		validatePhoneNumber(phoneNumber);
		records.put(contact, phoneNumber);
	}

	public void deleteContact(Contact contact) {
		if (null != contact && records.containsKey(contact)) {
			records.remove(contact);
			System.out.println("Contact details for " + contact.getFirstName()
					+ " " + contact.getLastName()
					+ " are deleted from phonebook.");
		} else {
			System.out.println("Contact not present in phonebook.");
		}
	}

	public void searchContactWithContactDetails(Contact contact) {
		if (null != contact && records.containsKey(contact)) {
			System.out.println("Contact number is: " + records.get(contact));
		} else {
			System.out.println("Contact not present in phonebook.");
		}
	}

	public void searchContactWithPhoneNumber(String phoneNumber) {
		validatePhoneNumber(phoneNumber);
		if (records.containsValue(phoneNumber)) {
			Set<Entry<Contact, String>> entrySet = records.entrySet();
			for (Entry<Contact, String> entry : entrySet) {
				if (StringUtils.equals(phoneNumber, entry.getValue())) {
					System.out.println("Contact details are: "
							+ entry.getKey().toString());
					break;
				}
			}

		} else {
			System.out
					.println("No contact present in phonebook with given phone number.");
		}
	}

	private void validatePhoneNumber(String phoneNumber) {
		if (StringUtils.isEmpty(phoneNumber)) {
			throw new IllegalArgumentException(
					"Phone number cannot be empty or null.");
		} else if (phoneNumber.length() != 10) {
			throw new IllegalArgumentException(
					"Phone number must be of 10 digits.");
		}
	}

}
