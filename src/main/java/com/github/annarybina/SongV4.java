package com.github.annarybina;

public class SongV4 implements Comparable<SongV4> {
    private final String title;
    private final String artist;
    private final int bpm;

    public boolean equals(Object aSong) {
        SongV4 other = (SongV4) aSong;
        return title.equals(other.getTitle());
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }

    public int compareTo(SongV4 s) {
        return title.compareTo(s.getTitle());
    }

    // Конструктор
    public SongV4(String title, String artist, int bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    // Геттеры
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getBpm() {
        return bpm;
    }

    // Метод toString - добавлена аннотация @Override
    @Override
    public String toString() {
        return title;
    }
}

