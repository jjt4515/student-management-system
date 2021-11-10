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
		System.out.println("����� �̸��� �����Դϱ�?");
		this.name = in.nextLine();
		System.out.println("����� �� �г��Դϱ�?");
		this.gradeYear = in.nextInt();
		setStudentID();
	}
	
	private void setStudentID() {
		number ++;
		this.studentID = year + "" + gradeYear + "" + number;
	}
	
	public void registerClass() { 
		System.out.println("���� ������ ��������.\nA�� �Է��ϸ� �������� �Ѿ�ϴ�.");
		Scanner in = new Scanner(System.in);
		while(true) {
				String subject = in.nextLine();
				if(subject.equals("A")) {
					System.out.println("�Է¿Ϸ�");
					break;
				}
				else {
					subjects = subject + "\n      " + subjects;
					fee = fee + feePlus;
				}
		};
	}
	
	public void viewTuitionFee() {
		System.out.println("����� ������� " + fee + "�Դϴ�.");		
	}
	
	public void payTuitionFee() {
		payable = fee;
		do {
			if(payable > 0) {
				System.out.println("�󸶸� �����Ͻðڽ��ϱ�?");
				Scanner in = new Scanner(System.in);
				int payment = in.nextInt();
				payable = payable - payment;
				System.out.println("�� ������� " + fee + "��\n�����Ͻ� �ݾ��� " + payment 
						+ "��\n�����ؾ��� �ݾ��� " + payable + "�� �Դϴ�.");
			}
			else if(payable <= 0){
				System.out.println("�����Ḧ ��� �����Ͽ����ϴ�.\n");
				break;
			}
			else {
				System.out.println("�����Ḧ ��� �����Ͽ����ϴ�.");
				System.out.println("�Ž������� " + payable*(-1) + "�� �Դϴ�.");
				break;
			}
		}while(true);
	}

	public void showInfo() {
		System.out.println("***���� ��� �Ϸ�***");
		System.out.println("�̸� : " + name);
		System.out.println("�г� : " + gradeYear);
		System.out.println("�й� : " + studentID);
		System.out.println("���� : " + subjects);
	}

}
