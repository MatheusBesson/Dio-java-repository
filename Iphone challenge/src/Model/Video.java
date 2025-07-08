package Model;

import Interfaces.Reproductor;

public final class Video implements Reproductor {

    // attributes
    private String title;
    private boolean isPlaying;
    // constructor

    public Video() {
        this.isPlaying = false;
    }

    // getters and setters
    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title.toLowerCase().trim();
    }

    // methods
    @Override
    public String select(String title) {
        String trimTitle = title.trim();
        if (!trimTitle.equalsIgnoreCase(getTitle())) {
            setTitle(title);
            setPlaying(false);
            return "\nTitle " + getTitle() + " - selected. \n" +
                    "Press play to start the video.\n";
        } else {
            return "The video is already selected.\n";
        }
    }

    @Override
    public String play() {
        if (getTitle() != null) {
            if (!isPlaying()) {
                setPlaying(true);
                return getTitle() + " playing..\n";
            } else {
                return "The video is already playing.\n";
            }
        } else {
            return "First select a title.\n";
        }
    }

    @Override
    public String pause() {
        if (isPlaying()) {
            setPlaying(false);
            return "Video " + getTitle() + " is paused.\n";
        } else {
            return "Video is already paused.\n";
        }
    }
}
