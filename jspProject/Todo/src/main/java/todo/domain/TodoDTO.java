package todo.domain;


// Java Beans 형식으로 정의
// 데이터베이스 테이블의 컬럼 이름과 변수 이름을 일치 시킴
public class TodoDTO {
	
	private int tno;
	private String todo;
	private String duedate;
	private boolean finished;
	
	public TodoDTO(int tno, String todo, String duedate, boolean finished) {
		super();
		this.tno = tno;
		this.todo = todo;
		this.duedate = duedate;
		this.finished = finished;
	}

	public int getTno() {
		return tno;
	}

	public void setTno(int tno) {
		this.tno = tno;
	}

	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

	public String getDuedate() {
		return duedate;
	}

	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	
	
	
	
	
	
	

}
