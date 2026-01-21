package com.github.annarybina;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Jukebox8 {
    public static void main(String[] args) {
        new Jukebox8().go();
    }

    public void go() {
        List<SongV3> songList = MockSongs.getSongsV3();
        System.out.println(songList);

        songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);

        songList.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));
        System.out.println(songList);

        songList.sort((one, two) -> Integer.compare(one.getBpm(), two.getBpm()));
        System.out.println(songList);

        songList.sort((one, two) -> two.getTitle().compareTo(one.getTitle()));
        System.out.println(songList);

        System.out.println("__________________________________");

        Set<SongV3> songSet = new HashSet<>(songList);
        System.out.println(songSet);

    }
}