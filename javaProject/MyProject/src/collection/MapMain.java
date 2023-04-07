package collection;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
	public static void main(String[] args) {
		
		Map<Integer, FootballPlayer> myTeam = new HashMap<>();
		
		myTeam.put(7, new FootballPlayer("손흥민", 7, "토트넘", 30));
		
		FootballPlayer footballPlayer = myTeam.get(7);
		System.out.println(footballPlayer);
				
		
		
		
	}

}
