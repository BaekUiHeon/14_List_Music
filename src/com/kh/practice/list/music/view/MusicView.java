package com.kh.practice.list.music.view;
import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	private Scanner sc = new Scanner(System.in);
	MusicController mc = new MusicController();
	int choice=0;
	public void mainMenu(){
		while(true) {
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
	    System.out.println("6. 특정 곡 수정");
		System.out.println("7. 곡 명 오름차순 정렬");
		System.out.println("8. 가수 명 내림차순 정렬");
		System.out.println("9. 종료");
		System.out.print("메뉴 번호 입력 :");
		String num= sc.nextLine();
		int choice=0;
		try {
			choice=Integer.parseInt(num);
		}catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		switch(choice) {
		case 1: addList(); break;
		case 2: addAtZero(); break;
		case 3: printAll(); break;
		case 4: searchMusic(); break;
		case 5: removeMusic(); break;
		case 6: setMusic(); break;
		case 7: ascTitle(); break;
		case 8: descSinger(); break;
		case 9: System.out.println("프로그램을 종료합니다.");return;
		default: System.out.println("1~9사이의 값을 입력하시오.");
		break;
		}
		}
	}

	public void addList() {
		System.out.print("곡 명:");
		String song=sc.nextLine();
		System.out.print("가수명:");
		String singer= sc.nextLine();
		mc.addList(new Music(song,singer));
	}

	public void addAtZero() {
		System.out.print("곡 명:");
		String song=sc.nextLine();
		System.out.print("가수명:");
		String singer= sc.nextLine();
		mc.addAtZero(new Music(song,singer));
	}

	public void printAll() {
		mc.printAll();
	}

	public void searchMusic() {
		Music tmp;
		System.out.print("곡명 입력:");
		String song=sc.nextLine();
		if((tmp=mc.searchMusic(song))==null)
			System.out.println("검색한 곡이 없습니다.");
		else
			System.out.println(tmp);	
	}

	public void removeMusic() {
		Music tmp;
		System.out.print("곡명 입력:");
		String song=sc.nextLine();
		if((tmp=mc.removeMusic(song))==null)
			System.out.println("삭제할 곡이 없습니다");
		else
			System.out.println(tmp);	
	}

	public void setMusic() {
		System.out.print("수정대상곡을 입력하시오:");
		String title=sc.nextLine();
		System.out.print("수정할 곡명을 입력하시오:");
		String title1=sc.nextLine();
		System.out.print("수정할 가수명을 입력하시오.");
		String singer=sc.nextLine();
		System.out.println(mc.setMusic(title,new Music(title1,singer)));
	}

	public void ascTitle() {
		if(mc.ascTitle()==1)
			System.out.println("정렬에 성공했습니다.");
		else
			System.out.println("정렬에 실패했습니다.");
	}

	public void descSinger() {
		if(mc.descSinger()==1)
			System.out.println("정렬에 성공했습니다.");
		else
			System.out.println("정렬에 실패했습니다.");
	}
}
