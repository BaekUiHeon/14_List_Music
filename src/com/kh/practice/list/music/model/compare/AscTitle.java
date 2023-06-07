package com.kh.practice.list.music.model.compare;
import java.util.Comparator;
import com.kh.practice.list.music.model.vo.Music;

public class AscTitle implements Comparator<Music>{  // Collections.sort(list,정렬기준객체) 에서 정렬기준 객체를 만들기위한 클래스 Comparator인터페이스를 
	                                                 //구현하며 compareTo함수를 이용해서 compare함수를 정의한다.
	@Override
	public int compare(Music music1, Music music2) {
        return music1.getTitle().compareTo(music2.getTitle());
	}
}
