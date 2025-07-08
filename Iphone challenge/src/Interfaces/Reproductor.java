package Interfaces;

import Model.Music;
import Model.Video;

public interface Reproductor{

    //Methods
    String select(String string);

    String play();

    String pause();
}
