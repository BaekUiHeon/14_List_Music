package com.kh.practice.list.music.controller;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	    private List<Music> list;
	    
	    public MusicController() {
	        list = new ArrayList<>();
	    }
	    
	    public int addList(Music music) {
	    	list.add(music);
	    	return 1;}
	    
	    public int addAtZero(Music music) {
	    	list.add(0, music);
	    	return 1;}
	    
	    public List<Music> printAll() {
	    	System.out.println(list);
	    	return list;}
	    
	    public Music searchMusic(String title) {
	    	Music result=null;
	    	for(Music vo:list)
	    		if(vo.getTitle().equals(title)) {
	    			result= vo;
	    			break;
	    		}
	    		return result;
	    }
	    	public Music removeMusic(String title) {
	    		int i=0;
		    	try {
		    		while(true) {
		    			if(list.get(i).getTitle().equals(title))
		    				return list.remove(i);
		    			i++;
		    		}
		    	}
		    	catch(IndexOutOfBoundsException e) {
		    		return null;
		    	}
	    	}
	    	public Music setMusic(String title, Music music) {
	    		int i=0;
		    	try {
		    		while(true) {
		    			if(list.get(i).getTitle().equals(title)) {
		    				list.get(i).setTitle(music.getTitle());
		    				list.get(i).setSinger(music.getSinger());
		    				return list.get(i);
		    			}
		    			i++;
		    		}
		    	}
		    	catch(IndexOutOfBoundsException e) {
		    		return null;
		    	}
	    	}
	    	public int ascTitle() {
	    		Comparator<Music> A = new AscTitle();
	    		Collections.sort(list,A);
	    		return 1;
	    	}
	    	public int descSinger() {
	    		Collections.sort(list,Collections.reverseOrder());
	    		return 1;
	    	}
}

