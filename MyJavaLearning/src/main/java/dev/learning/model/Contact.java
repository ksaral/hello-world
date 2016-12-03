package dev.learning.model;

import org.apache.commons.lang3.StringUtils;

public class Contact {

	private String firstName;
	private String lastName;
	private String emailId;
	private String address;

	public Contact(String firstName) {
		super();
		if (StringUtils.isEmpty(firstName)) {
			throw new IllegalArgumentException(
					"First name cannot be empty or null");
		}

		this.firstName = firstName;
	}

	public Contact(String firstName, String lastName, String emailId,
			String address) {
		this(firstName);
		this.lastName = lastName;
		this.emailId = emailId;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("PhoneBook [");
		if (!StringUtils.isEmpty(firstName)) {
			builder.append("firstName=");
			builder.append(firstName);
		}

		if (!StringUtils.isEmpty(lastName)) {
			builder.append(" lastName=");
			builder.append(lastName);
		}

		if (!StringUtils.isEmpty(emailId)) {
			builder.append(" emailId=");
			builder.append(emailId);
		}

		if (!StringUtils.isEmpty(address)) {
			builder.append(" address=");
			builder.append(address);
		}

		builder.append("]");
		return builder.toString().trim();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (emailId == null) {
			if (other.emailId != null)
				return false;
		} else if (!emailId.equals(other.emailId))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

}
