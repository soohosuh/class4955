package test.frame;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.HashMap;

public class FootballPlay implements Comparable<FootballPlay> {

	private String name;
	private String number;
	private String team;
	private int age;

	public FootballPlay(String name, String number, String team, int age) {
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}

	public FootballPlay() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;

		if (obj != null && obj instanceof FootballPlay) {
			FootballPlay sp = (FootballPlay) obj;
			result = name.equals(sp.getName());

		}

		return result;
	}

	@Override
	public String toString() {
		return "FootballPlay [name=" + name + ", number=" + number + ", team=" + team + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return this.name.charAt(name.length() - 1) % 5;
	}

	public void showInfo() {
		System.out.printf("[%s] %s(%d, %d)\n", this.team, this.name, this.number, this.age);
	}

	@Override
	public int compareTo(FootballPlay o) {
		int compare = this.team.compareTo(o.getTeam());
		if (compare == 0) {
			compare = this.name.compareTo(o.getName());
			if (compare == 0) {
				compare = this.number.compareTo(o.getNumber());
			}
		}
		return compare;

	}

	public static void main(String[] args) {

		Set<FootballPlay> football = new HashSet<>();

		football.add(new FootballPlay("손흥민", "010-1234-5678", "토트넘", 30));
		football.add(new FootballPlay("박지성", "010-3333-7777", "맨유", 40));
		football.add(new FootballPlay("이강인", "010-1234-5678", "마요르카", 20));
		football.add(new FootballPlay("차두리", "010-2234-5678", "뮌헨", 40));

		// football.stream().sorted().forEach(System.out::println);

		TreeSet<FootballPlay> footb = new TreeSet<FootballPlay>();
		footb.add(new FootballPlay("손흥민", "7", "토트넘", 30));
		footb.add(new FootballPlay("박지성", "3", "맨유", 40));
		footb.add(new FootballPlay("이강인", "8", "맨유", 20));
		footb.add(new FootballPlay("차두리", "4", "뮌헨", 40));
		footb.add(new FootballPlay("메시", "24", "뮌헨", 35));

		for (FootballPlay sp : footb) {

			System.out.println(sp);
		}

		HashMap<String, FootballPlay> hashMap = new HashMap<>();

		FootballPlay p = new FootballPlay("손흥민", "7", "토트넘", 30);
		hashMap.put("ver", p);
		FootballPlay p2 = new FootballPlay("박지성", "3", "맨유", 40);
		hashMap.put("ver2", p2);
		FootballPlay p3 = new FootballPlay("이강인", "8", "맨유", 20);
		hashMap.put("ver3", p3);
		FootballPlay p4 = new FootballPlay("메시", "24", "뮌헨", 35);
		hashMap.put("ver4", p4);

		System.out.println(hashMap.get("ver"));

		System.out.println("------------------------");
		Set<String> keySet = hashMap.keySet();
		for (String keyName : keySet) {
			System.out.println(keyName + " : " + hashMap.get(keyName));
		}

	}

}
