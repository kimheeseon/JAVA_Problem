package javaPratice;

import java.util.Calendar;

public class Calendar1 {
	static void printCalendar(int firstDayOfWeek, int lastDay) {
		int firstDay = firstDayOfWeek;
		int last = lastDay;
		System.out.println(" ��      ��      ȭ      ��      ��      ��      ��");
		switch(firstDay) {
		//1���� �Ͽ����� ���
		case 1:
			for(int j = 1; j<last; j++) {
				for(int k = 0; k<7; k++) {
					if(j < 10) {
					System.out.print(" " + j + "  ");
					}
					else if(j >= 10) {
						System.out.print(j + "  ");
					}
					j = j+1;
					if(j > last) {
						break;
					}
				}
				System.out.println();
				j = j-1;
			}	
			break;
			
		//1���� �������� ���
		case 2:		
			//ù ���� 1�Ϻ��� 6�ϱ��� ���
			System.out.print("    ");
			for(int i = 1; i<=6; i++) {
				System.out.print(" " + i + "  ");
			}
			//��°���� 7�Ϻ��� ���
			System.out.println();
			for(int j = 7; j<last; j++) {
				for(int k = 0; k<7; k++) {
					if(j < 10) {
					System.out.print(" " + j + "  ");
					}
					else if(j >= 10) {
						System.out.print(j + "  ");
					}
					j = j+1;
					if(j > last) {
						break;
					}
				}
				System.out.println();
				j = j-1;
			}	
			break;
			
		//1���� ȭ������ ���
		case 3:	
			System.out.print("        ");
			for(int i = 1; i<=5; i++) {
				System.out.print(" " + i + "  ");
			}
			System.out.println();
			for(int j = 6; j<last; j++) {
				for(int k = 0; k<7; k++) {
					if(j < 10) {
					System.out.print(" " + j + "  ");
					}
					else if(j >= 10) {
						System.out.print(j + "  ");
					}
					j = j+1;
					if(j > last) {
						break;
					}
				}
				System.out.println();
				j = j-1;
			}
			break;
			
		//1���� �������� ���
		case 4:
			System.out.print("            ");
			for(int i = 1; i<=4; i++) {
				System.out.print(" " + i + "  ");
			}
			System.out.println();
			for(int j = 5; j<last; j++) {
				for(int k = 0; k<7; k++) {
					if(j < 10) {
					System.out.print(" " + j + "  ");
					}
					else if(j >= 10) {
						System.out.print(j + "  ");
					}
					j = j+1;
					if(j > last) {
						break;
					}
				}
				System.out.println();
				j = j-1;
			}	
			break;
			
		//1���� ������� ���
		case 5:	  
			System.out.print("                ");
			for(int i = 1; i<=3; i++) {
				System.out.print(" " + i + "  ");
			}
			System.out.println();
			for(int j = 4; j<last; j++) {
				for(int k = 0; k<7; k++) {
					if(j < 10) {
					System.out.print(" " + j + "  ");
					}
					else if(j >= 10) {
						System.out.print(j + "  ");
					}
					j = j+1;
					if(j > last) {
						break;
					}
				}
				System.out.println();
				j = j-1;
			}	
			break;
			
		//1���� �ݿ����� ���
		case 6:	
			System.out.print("                    ");
			for(int i = 1; i<=2; i++) {
				System.out.print(" " + i + "  ");
			}
			System.out.println();
			for(int j = 3; j<last; j++) {
				for(int k = 0; k<7; k++) {
					if(j < 10) {
					System.out.print(" " + j + "  ");
					}
					else if(j >= 10) {
						System.out.print(j + "  ");
					}
					j = j+1;
					if(j > last) {
						break;
					}
				}
				System.out.println();
				j = j-1;
			}	
			break;
			
		//1���� ������� ���
		case 7:	
			System.out.print("                        ");
			for(int i = 1; i<=1; i++) {
				System.out.print(" " + i + "  ");
			}
			System.out.println();
			for(int j = 2; j<last; j++) {
				for(int k = 0; k<7; k++) {
					if(j < 10) {
					System.out.print(" " + j + "  ");
					}
					else if(j >= 10) {
						System.out.print(j + "  ");
					}
					j = j+1;
					if(j > last) {
						break;
					}
				}
				System.out.println();
				j = j-1;
			}	
			break;
		}
	}

	public static void main(String[] args) {
		//2015�� 7��
		int year = 2015, month = 7;

		//2015�� 7�� 1���� ���� ���ϱ�
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month-1, 1, 0, 0);
		int date = calendar.get(Calendar.DAY_OF_WEEK);

		//2015�� 7���� ������ ��¥ ���ϱ�
		calendar.add(Calendar.MONTH, 1);
		calendar.add(Calendar.DATE, -1);
		int lastDay = calendar.get(Calendar.DATE);

		//�޷� ���
		printCalendar(date, lastDay);
	}

}
