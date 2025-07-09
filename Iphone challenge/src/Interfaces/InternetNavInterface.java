package Interfaces;

import Model.Page;

public interface InternetNavInterface {
    String openPage(String url);

    String newTab(Page page);

    String refresh();

    String location();

    String sendEmail();
}
