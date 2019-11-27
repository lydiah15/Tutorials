import java.io.Serializable; //Interface--store object in a file.txt folder

public class Employee implements Serializable

{
	int empno; //setter--set value 		getter--get  value
	String empname;
	int empsal;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpsal() {
		return empsal;
	}
	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}
	

}
