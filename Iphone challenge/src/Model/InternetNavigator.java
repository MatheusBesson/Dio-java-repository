package Model;

import Interfaces.InternetNavInterface;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class InternetNavigator implements InternetNavInterface {

    // attributes
    private ArrayList<Page> pages = new ArrayList<>();

    private String message;

    private boolean location;

    private final String map;

    private boolean imap;

    // constructors
    public InternetNavigator(boolean imap, boolean location) {
        if(location) {
            this.map = "BR";
        } else {
            this.map = "Rest of the world";
        }
        this.imap = imap;
    }

    //getters and setters
    public boolean isImap() {
        return imap;
    }

    public void setImap(boolean imap) {
        this.imap = imap;
    }

    public ArrayList<Page> getPages() {
        return pages;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getLocation() {
        return map;
    }

    // methods
    @Override
    public String openPage(String url) {
        String trimUrl = url.trim();
        for (int i = 0; i < pages.size(); i++) {
            if (pages.get(i).getUrl().equalsIgnoreCase(trimUrl)) {
                return "===[[ Page is open ]]===\n";
            }
        }
        return "===[[ Url page not found ]]===";
    }

    @Override
    public String newTab(Page page) {
        Page newPage = page;
        pages.add(newPage);
        return "New page added. \n";
    }

    @Override
    public String refresh() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("[[ Refreshed ]] \n");
            }
        },2_000);
        return "Reloading page.. \n";
    }


    @Override
    public String location() {
        return "Your current location is: " + getLocation() + ". \n";
    }

    @Override
    public String sendEmail() {
        if (isImap()) {
            return "Email sent through IMAP.";
        } else {
            return "Email sent through POP3.";
        }
    }

    @Override
    public String toString() {
        return "InternetNavigator{" +
                "pages=" + pages +
                ", message='" + message + '\'' +
                ", location=" + location +
                ", map='" + map + '\'' +
                ", imap=" + imap +
                '}';
    }
}
