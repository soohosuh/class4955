package test.frame;

import java.util.ArrayList;
import java.util.List;

public class FootballPlayer {
	// 축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 
	// 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다. 
	
	String name;
	int number;
	String team;
	int age;
	
	public static void main(String[] args) {
		
		List<FootballPlayer> players = new ArrayList();
		FootballPlayer footballPlayer1 = new FootballPlayer();
		FootballPlayer footballPlayer2 = new FootballPlayer();
		FootballPlayer footballPlayer3 = new FootballPlayer();
		FootballPlayer footballPlayer4 = new FootballPlayer();
		FootballPlayer footballPlayer5 = new FootballPlayer();
		
		// 1번
		footballPlayer1.name = "메시";
		footballPlayer1.number = 30;
		footballPlayer1.team = "파리생제르망";
		footballPlayer1.age = 37;
		
		// 2번
		footballPlayer2.name = "서수호";
		footballPlayer2.number = 19;
		footballPlayer2.team = "뮌헨";
		footballPlayer2.age = 37;
		
		// 3번
		footballPlayer3.name = "차은우";
		footballPlayer3.number = 34;
		footballPlayer3.team = "광운대";
		footballPlayer3.age = 33;
		
		// 4번
		footballPlayer4.name = "호날두";
		footballPlayer4.number = 9;
		footballPlayer4.team = "맨유";
		footballPlayer4.age = 38;
		
		// 5번 
		footballPlayer5.name = "케인";
		footballPlayer5.number = 3;
		footballPlayer5.team = "토트넘";
		footballPlayer5.age = 20;
	
		players.add(footballPlayer1);
		players.add(footballPlayer2);
		players.add(footballPlayer3);
		players.add(footballPlayer4);
		players.add(footballPlayer5);
		
		System.out.println(players.get(0).name + " " + players.get(0).number + " " + players.get(0).team + " " + players.get(0).age);
		System.out.println(players.get(1).name + " " + players.get(0).number + " " + players.get(0).team + " " + players.get(0).age);
		System.out.println(players.get(2).name + " " + players.get(0).number + " " + players.get(0).team + " " + players.get(0).age);
		System.out.println(players.get(3).name + " " + players.get(0).number + " " + players.get(0).team + " " + players.get(0).age);
		System.out.println(players.get(4).name + " " + players.get(0).number + " " + players.get(0).team + " " + players.get(0).age);
		
	
	
	
	}

}
