package main;

import java.util.Scanner;

import controller.DeptDeleteController;
import controller.DeptInsertController;
import controller.DeptListController;
import controller.DeptSearchController;
import controller.DeptUpdateController;

public class DeptManagerMain {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		FrontController frontController = new FrontController
		
		// Controller : view -> Service -> Dao -> Service -> Controller : view
		
		while(true) {
			
		System.out.println("메뉴를 입력하세요.");
		System.out.println("1. 부서 리스트 출력");
		System.out.println("2. 부서 검색");
		System.out.println("3. 부서 입력");
		System.out.println("4. 부서 수정");
		System.out.println("5. 부서 삭제");
		System.out.println("6. 프로그램 종료");	
		
		int menu = Integer.parseInt(sc.nextLine());
		
		if(menu==6) {
			System.out.println("프로그램이 종료합니다.");
			return;
		}
		
		frontController.menu.get(menu).process();
		
		switch (menu) {
		case 1 : 
			new DeptListController().getDeptList();		
			break;
		case 2:
			new DeptSearchController().searchDept();
			break;
		case 3:
			new DeptInsertController().insertDept();
			break;
		case 4:
			new DeptUpdateController().updateDept();
			break;
		case 5:
			new DeptDeleteController().deleteDept();
			break;
		case 6 :
			System.out.println("프로그램이 종료됩니다.");
			return;
		
		}
				
		
	}
	
}
}
