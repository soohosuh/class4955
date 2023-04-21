package controller;

import java.util.List;

import dao.DeptDao;
import domain.Dept;
import service.DeptListService;

// Controller 클래스는 
// 사용자 요청 분석 -> 사용자의 요청을 처리할 Service를 결정하고 
// 요청의 결과를 받아서 사용자에게 결과를 보여주는 역할 

public class DeptListController {
	
	DeptListService listService;
	
	public void DeptListController() {
		this.listService = DeptListService.getInstance();
			
	}
	public void getDeptList() {
		
		// 사용자 요청 분석
		// 요청을 처리할 서비스를 이용해서 결과 데이터를 받는다.
		List<Dept> result = listService.getDeptList();
		
		// 사용자에게 응답할 포맷(템플릿, 뷰) 결정 -> 결과 데이터를 전달(공유)
		printData(result);
		
	}
	
	void printData(List<Dept> list) {
		System.out.println("부서리스트==============");
		System.out.println("부서번호\t부서이름\t위치");
		System.out.println("================================");
		for(Dept d : list) {
			System.out.println(d.getEptno() + "\t" + d.getDname() + "\t" + d.getLoc());
		}
	}
	public static void main(String[] args) {
		DeptListController listController = new DeptListController();
					
		
		listController.getDeptList();
	}

}
