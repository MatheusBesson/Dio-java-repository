package Interfaces;

import Model.Contact;

import java.util.ArrayList;

public interface PhoneInterface {
    String call(String number);
    String callContact(String name);
    String awnser();
    String decline();
    String addContact(Contact contact);
    String removeContact(String name);
    String sendVoicemail(String name);
    String listenToVoicemail();

}
