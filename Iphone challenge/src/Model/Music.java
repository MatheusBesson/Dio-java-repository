package Model;

import Interfaces.Reproductor;

public final class Music implements Reproductor {

    // attributes
    private String title;
    private boolean isPlaying;
    private String playingNow;

    // constructors


    public Music() {
        this.isPlaying= false;
    }

    // getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title.toLowerCase().trim();
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }

    public String getPlayingNow() {
        return playingNow;
    }

    public void setPlayingNow(String playingNow) {
        this.playingNow = playingNow;
    }

    //Methods
    @Override
    public String select(String title) {
        String trimTitle = title.trim();
        if (!trimTitle.equalsIgnoreCase(getTitle())) {
            setTitle(title);
            setPlaying(false);
            return "\nTitle " + getTitle() + " selected. \n" +
                    "Press play to start listening.\n";
        } else {
            return "This song is already selected.\n";
        }
    }

    @Override
    public String play() {
        if (getTitle() != null) {
            if (!isPlaying()) {
                setPlaying(true);
                return getTitle() + " playing..\n";
            } else {
                return "The song is already playing.\n";
            }
        } else {
            return "First select a title.\n";
        }
    }

    @Override
    public String pause() {
        if (isPlaying()) {
            setPlaying(false);
            return "Song " + getTitle() + " is paused.\n";
        } else {
            return "Song is already paused.\n";
        }
    }
}
