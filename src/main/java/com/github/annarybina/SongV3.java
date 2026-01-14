package com.github.annarybina;

public class SongV3 implements Comparable<SongV3> {
    // Поля объявлены верно
    private final String title;
    private final String artist;
    private final int bpm;

    public int compareTo(SongV3 s) {
        return title.compareTo(s.getTitle());
    }

    // Конструктор
    public SongV3(String title, String artist, int bpm) {
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

