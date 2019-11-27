import java.io.Serializable;

public class Student implements Serializable
{
	int studentID;
	String studentName;
	int studentParking;
	int studentAge;
	String studentDegree;
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentParking() {
		return studentParking;
	}
	public void setStudentParking(int studentParking) {
		this.studentParking = studentParking;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentDegree() {
		return studentDegree;
	}
	public void setStudentDegree(String studentDegree) {
		this.studentDegree = studentDegree;
	}
	

}
