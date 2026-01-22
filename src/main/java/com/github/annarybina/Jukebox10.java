package com.github.annarybina;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Jukebox10 {
    public static void main(String[] args) {
        new Jukebox10().go();
    }

    public void go() {
        List<SongV4> songList = MockSongs.getSongsV3();
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

        Set<SongV4> songSet = new TreeSet<>(songList);
        System.out.println(songSet);

        Set<SongV4> songSet2 = new TreeSet<>((one, two) -> Integer.compare(one.getBpm(), two.getBpm()));
        songSet2.addAll(songList);
        System.out.println(songSet2);

    }
}