package collection;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		
		// 나의 팀을 구성하고 싶다 -> 선수들을 저장할 수 있는 공간을 생성하고 선수들을 저장
		ArrayList<FootballPlayer> myTeam = new ArrayList<>();
		myTeam.add(new FootballPlayer("손흥민", 7, "토트넘", 30));
		myTeam.add(new FootballPlayer("이강인", 17, "마요르카", 27));
		myTeam.add(new FootballPlayer("김민재", 27, "밀라노", 20));
		
		System.out.println("나의 팀 선수 정보");
//		for(FootballPlayer player : myTeam) {
//			player.showInfo();			
//		}
		
		myTeam.stream().forEach((FootballPlayer p) -> p.showInfo());
		
		myTeam.stream().forEach(System.out::println);
		
		
		

	}

}
