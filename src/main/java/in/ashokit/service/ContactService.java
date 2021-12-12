package in.ashokit.service;

import java.util.List;

import in.ashokit.bindings.ContactForm;

public interface ContactService {

	 public String saveContact(ContactForm form);
	 public List<ContactForm> viewContacts();
	 public ContactForm editContact(Integer contacId);
	 public List<ContactForm> deleteContact(Integer contactId);
}
