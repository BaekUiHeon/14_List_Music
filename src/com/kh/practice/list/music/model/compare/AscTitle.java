package com.kh.practice.list.music.model.compare;
import java.util.Comparator;
import com.kh.practice.list.music.model.vo.Music;

public class AscTitle implements Comparator<Music>{

	@Override
	public int compare(Music music1, Music music2) {
        return music1.getTitle().compareTo(music2.getTitle());
	}
}
