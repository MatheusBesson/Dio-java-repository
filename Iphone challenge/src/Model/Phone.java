package Model;

import Interfaces.PhoneInterface;

import java.util.Timer;
import java.util.TimerTask;
import java.util.ArrayList;
import java.util.List;

public class Phone implements PhoneInterface {

    //attributes
    private String name;
    private String number;
    private boolean inCall;
    private boolean isReceivingCall;
    private ArrayList<Contact> contacts = new ArrayList<>();

    //constructors

    public Phone(String name, String number) {
        this.name = name;
        this.number = number;
        this.inCall = false;
        this.isReceivingCall = false;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isInCall() {
        return inCall;
    }

    public void setInCall(boolean inCall) {
        this.inCall = inCall;
    }

    public boolean isReceivingCall() {
        return isReceivingCall;
    }

    public void setReceivingCall(boolean receivingCall) {
        isReceivingCall = receivingCall;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }


    // methods
    @Override
    public String call(String number) {
        String trimNum = number.trim();
        if (trimNum.equals(getNumber())) {
            setReceivingCall(true);
            return "You are receiving a call. \n - Awnser   /  - Decline   ";
        }
        return "Calling to " + trimNum + "\n wait.. \n";
    }

    @Override
    public String callContact(String name) {
        String trimName = name.trim();
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equalsIgnoreCase(trimName)) {
                return "Calling " + contacts.get(i).getName() + ".. \n";
            }
        }
        return "The call wasn't succeeded. The contact not found. \n";
    }

    @Override
    public String awnser() {
        if (isReceivingCall()) {
            setReceivingCall(false);
            setInCall(true);
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    setInCall(false);
                    System.out.println("===[[ Call ended ]]=== \n");
                }
            }, 50_000);
            return "===[[ You are in call ]]=== \n";
        } else {
            return "No call being received to awnser.. \n";
        }
    }

    @Override
    public String decline() {
        setReceivingCall(false);
        setInCall(false);
        return "===[[ You declined the call ]]=== \n";
    }

    public String contactsList() {
        String message = "";
        for (int i = 0; i < contacts.size(); i++) {
            message += "\nContact " + (i + 1) + ": " + contacts.get(i).getName() + "\n" + "Phone Number: " + contacts.get(i).getNumber() + ". \n--------------------\n";
        }
        return message;

    }

    @Override
    public String addContact(Contact contact) {
        Contact newContact = contact;
        contacts.add(contact);
        return "New contact [[" + newContact.getName() + "]] was added to your Contacts list. \n";
    }

    @Override
    public String removeContact(String name) {
        String message = "";
        String trimName = name.trim();
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equalsIgnoreCase(trimName)) {
                message = "Contact " + contacts.get(i).getName() + " was removed from your Contacts list. \n";
                contacts.remove(i);
                return message;
            }
        }
        return "Contact not found.";
    }

    @Override
    public String sendVoicemail(String name) {
        String trimName = name.trim();
        return "Voicemail sent to " + trimName;
    }

    @Override
    public String listenToVoicemail() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Voicemail ended.");
            }
        },10_000);
        return "You are listening to the voicemail..";
    }
}
