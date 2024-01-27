package com.workintech.MobilePhone;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    private ArrayList<Contact> contacts;
    private String myNumber;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contacts=new ArrayList<>();
    }

    public Boolean addNewContact(Contact contact) {
        if (contact == null || contact.getName() == null || contact.getPhoneNumber() == null)
            return false;
        if (findContact(contact.getName()) >= 0) {
            return false;
        }
        this.contacts.add(contact);
        return true;
    }



    public Boolean updateContact(Contact oldContact,Contact newContact){
        int oldIndex=findContact(oldContact.getName());
        if (oldIndex<0){
            return false;
        }
        this.contacts.set(oldIndex, newContact);
        return true;
    }

    public Boolean removeContact (Contact contact){
        if(findContact(contact.getName())<0) {
            return false;
        }

    this.contacts.remove(contact);
        return true;
}

    public Contact queryContact(String contactName) {
        int index = findContact(contactName);
        if (index >= 0) {
            return this.contacts.get(index);
        }
        return null;
    }
    public int findContact(Contact contact) {
        return this.contacts.indexOf(contact);
    }

    public int findContact(String contactName) {
        for (int i = 0; i < this.contacts.size(); i++) {
            Contact contact = this.contacts.get(i);
            if (contact.getName().equalsIgnoreCase(contactName)) {
                return i;
            }
        }
        return -1;
    }
    public void printContacts() {
        for (int i = 0; i < this.contacts.size(); i++) {
            Contact contact = this.contacts.get(i);
            System.out.println((i + 1) + "->" + contact.getName() + "->" + contact.getPhoneNumber());
        }


}
}
