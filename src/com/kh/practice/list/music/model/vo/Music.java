package com.kh.practice.list.music.model.vo;

public class Music implements Comparable {
	private String title;
	private String singer;
	
	public Music() {super();}

	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}
	
	public int hashCode() {return this.hashCode();}
	public boolean equals(Object o) {return this==o;}
	
	public int compareTo(Object o) {
		return this.singer.compareTo(((Music)o).getSinger());
		
		}
}
