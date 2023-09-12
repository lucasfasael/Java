package br.com.alura.screenmatch.model;

public class Serie extends  Video{
    private int seasons;
    private int episodesBySeason;
    private boolean active;
    private int minutesPerEpisode;

    public Serie(String name, int yearOfRelease) {
        super(name, yearOfRelease);
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodesBySeason() {
        return episodesBySeason;
    }

    public void setEpisodesBySeason(int episodesBySeason) {
        this.episodesBySeason = episodesBySeason;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    @Override
    public int getDurationMinutes() {
        return seasons * episodesBySeason * minutesPerEpisode;
    }
}
