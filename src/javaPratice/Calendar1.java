package javaPratice;

import java.util.Calendar;

public class Calendar1 {
	static void printCalendar(int firstDayOfWeek, int lastDay) {
		int firstDay = firstDayOfWeek;
		int last = lastDay;
		System.out.println(" 일      월      화      수      목      금      토");
		switch(firstDay) {
		//1일이 일요일인 경우
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
			
		//1일이 월요일인 경우
		case 2:		
			//첫 주인 1일부터 6일까지 출력
			System.out.print("    ");
			for(int i = 1; i<=6; i++) {
				System.out.print(" " + i + "  ");
			}
			//둘째주인 7일부터 출력
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
			
		//1일이 화요일인 경우
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
			
		//1일이 수요일인 경우
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
			
		//1일이 목요일인 경우
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
			
		//1일이 금요일인 경우
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
			
		//1일이 토요일인 경우
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
		//2015년 7월
		int year = 2015, month = 7;

		//2015년 7월 1일의 요일 구하기
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month-1, 1, 0, 0);
		int date = calendar.get(Calendar.DAY_OF_WEEK);

		//2015년 7월의 마지막 날짜 구하기
		calendar.add(Calendar.MONTH, 1);
		calendar.add(Calendar.DATE, -1);
		int lastDay = calendar.get(Calendar.DATE);

		//달력 출력
		printCalendar(date, lastDay);
	}

}
