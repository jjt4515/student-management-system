package students;

import java.util.Scanner;

public class Student {
	private String name;
	private int gradeYear;
	private String subjects = "";
	private String studentID;
	private int fee = 0;
	private int payable;
	private static int feePlus = 50000;
	private static int year = 2021;
	private static int number = 3000;
	
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("당신의 이름은 무엇입니까?");
		this.name = in.nextLine();
		System.out.println("당신은 몇 학년입니까?");
		this.gradeYear = in.nextInt();
		setStudentID();
	}
	
	private void setStudentID() {
		number ++;
		this.studentID = year + "" + gradeYear + "" + number;
	}
	
	public void registerClass() { 
		System.out.println("수업 과목을 적으세요.\nA를 입력하면 다음으로 넘어갑니다.");
		Scanner in = new Scanner(System.in);
		while(true) {
				String subject = in.nextLine();
				if(subject.equals("A")) {
					System.out.println("입력완료");
					break;
				}
				else {
					subjects = subject + "\n      " + subjects;
					fee = fee + feePlus;
				}
		};
	}
	
	public void viewTuitionFee() {
		System.out.println("당신의 수업료는 " + fee + "입니다.");		
	}
	
	public void payTuitionFee() {
		payable = fee;
		do {
			if(payable > 0) {
				System.out.println("얼마를 지불하시겠습니까?");
				Scanner in = new Scanner(System.in);
				int payment = in.nextInt();
				payable = payable - payment;
				System.out.println("총 수업료는 " + fee + "원\n지불하신 금액은 " + payment 
						+ "원\n지불해야할 금액은 " + payable + "원 입니다.");
			}
			else if(payable <= 0){
				System.out.println("수업료를 모두 지불하였습니다.\n");
				break;
			}
			else {
				System.out.println("수업료를 모두 지불하였습니다.");
				System.out.println("거스름돈은 " + payable*(-1) + "원 입니다.");
				break;
			}
		}while(true);
	}

	public void showInfo() {
		System.out.println("***수업 등록 완료***");
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + gradeYear);
		System.out.println("학번 : " + studentID);
		System.out.println("과목 : " + subjects);
	}

}
