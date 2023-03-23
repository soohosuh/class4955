package Chapter04;

public class Quiz {
	public static void main(String[] args) {
		
		//문제1.
		//아래 예제는 두 개의 if문을 사용하고 있다. 한 개의 if 문만 사용하는 방식으로 변경해보자.
		
		int numb=120;
		String result = null;
		
		if(numb>0) {
			result  = numb%2==0 ? "양수 이면서 짝수" : "양수 이면서 홀수";
			
		} else {
			result  = numb%2==0 ? "음수 이면서 짝수" : "음수 이면서 홀수";
			
		}
		System.out.println(result);
//        //문제2.
//        //num < 0 이라면 “0 미만” 출력
//        //0 ≤ num <100 이라면 “0이상 100 미만“ 출력
//        //100 ≤ num < 200 이라면 “100이상 200 미만“ 출력
//        //200 ≤ num < 300 이라면 “200이상 300 미만“ 출력
//        //300 ≤ num 이라면 “300이상 “ 출력
//        
        int num = 10;
        if (num < 0) {
        	System.out.println("0 미만");
        } else if(0 <= num && num < 100 ) {
        	System.out.println("0이상 100 미만");
        } else if(100 <= num&&num < 200) {
        	System.out.println("100이상 200 미만");
        }else if(200 <= num&&num < 300) {
        	System.out.println("200이상 300 미만");
        }else{
        	System.out.println("300이상");
        }
//        
//        //문제3.
//        //CondOp.java를 조건연산자(3항 연산자)를 사용하지 않고,
//        //if~else를 사용하는 형태로 변경해 보자.
//        int num1=50;
//        int num2=100;
//        if (num1>num2) {
//        	System.out.println("big");
//        }else if(num1<num2){
//        	System.out.println("diff");
//        }
//        //문제 4.
//        //SwitchBreak.java를 switch문이 아닌, if~else를 사용하는 형태로 변경해 보자.
//        int n=3;
//        if (n==1) {
//        	System.out.println("Simple Java");
//        }else if(n==2) {
//        	System.out.println("Funny Java");
//        }else if(n==3) {
//        	System.out.println("Fantastic Java");
//        }else {
//        	System.out.println("The best programming language");
//        }
//        System.out.println("Do you like coffee?");
//        
//        //문제 2의 답안 코드를 switch 문으로 변경하여 보자.
//        // num < 0 이라면 “0 미만” 출력 부분은 if문을 사용하고 나머지 조건에 대해 변경하세요.
//        
//        //num < 0 이라면 “0 미만” 출력
//        //0 ≤ num <100 이라면 “0이상 100 미만“ 출력
//        //100 ≤ num < 200 이라면 “100이상 200 미만“ 출력
//        //200 ≤ num < 300 이라면 “200이상 300 미만“ 출력
//        //300 ≤ num 이라면 “300이상 “ 출력
//        int num = 0;
//        if num(num < 0) {
//        	System.out.println("0 미만");
//        }
//        switch (num/10) {
//		case 10 :
//			System.out.println("A");
//			break;
//		case 9 :
//		    System.out.println("A");
//		    break;
//		case 8 :
//		    System.out.println("B");
//		    break;
//		case 7 :
//		    System.out.println("B");
//		    break;
//		case 6 :
//		    System.out.println("D");
//		    break;
//		case 5 :
//		    System.out.println("D");
//		    break;
//		default:
//			System.out.println("F");
//			break;
//		}
//        //문제 6.
//        //while 문을 이용해서 1부터 99까지의 합을 구하는 프로그램을 작성.
//        int sum = 1;
//        int numbe = 0;
//        
//        while(numbe < 100) {
//        	System.out.println(sum + "A"+ numbe);
//        	numbe = numbe + sum;
//        	sum++;
//        }
//        System.out.println("합 : "+numbe);
//        //문제 7.
//        //1부터 100까지 출력한 후, 다시 거꾸로 100부터 1까지 출력하는 프로그램을 작성. while문과 do~while 문을 각각 한번씩 사용해서 작성
//        
//        
//        
	}
	
	

	
	
	
	
	
	
}
