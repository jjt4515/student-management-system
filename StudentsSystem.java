package students;

import java.util.Scanner;

public class StudentsSystem {

	public static void main(String[] args) {
		System.out.println("등록하실 학생 수는 몇 명입니까?");
		Scanner in = new Scanner(System.in);
		int studentNumber = in.nextInt();
		Student[] stu = new Student[studentNumber];
		for(int i=0; i<studentNumber; i++) {
			stu[i] = new Student();
			stu[i].registerClass();
			stu[i].viewTuitionFee();
			stu[i].payTuitionFee();
		}
		for(int i =0; i<studentNumber; i++) {
			stu[i].showInfo();
		}
	}
}
