package br.com.anderson.screenmatch.models;

public class Series extends Title {
    private int seasons;
    private int episodes;
    private boolean active;
    private int minutesEpisode;

    public Series(String name) {
        super(name);
    }

    public Series() {
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getMinutesEpisode() {
        return minutesEpisode;
    }

    public void setMinutesEpisode(int minutesEpisode) {
        this.minutesEpisode = minutesEpisode;
    }

    @Override
    public String toString() {
        return "Series: " + this.getName() + " (" + this.getReleaseYear() + ")";
    }
}
