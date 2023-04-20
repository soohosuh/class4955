package domain;

// DTO : Java Beans 
// 모든 변수가 private, getter/setter, 기본 생성자가 반드시 존재!
public class Dept {
	
	private int eptno; // 컬럼 이름과 동일하게!!
	private String dname;
	private String loc;
	
	// 기본 생성자 --슈퍼클래스
	public Dept() {
		
	}
	//using field
	public Dept(int eptno, String dname, String loc) {
		super();
		this.eptno = eptno;
		this.dname = dname;
		this.loc = loc;
	}
	public int getEptno() {
		return eptno;
	}
	public void setEptno(int eptno) {
		this.eptno = eptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	//tostring
	@Override
	public String toString() {
		return "Dept [eptno=" + eptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
	
	

}
