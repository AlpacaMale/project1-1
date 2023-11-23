package Conditional;
import java.util.Scanner;

public class DateToDay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int date,day;
		
		System.out.println("날짜를 입력하시오.");
		date = sc.nextInt();
		day = date%7;
		
		if(1<=date&&date<=31) {	
		switch(day) {
			case 0: System.out.println("수요일입니다.");break;
			case 1: System.out.println("목요일입니다.");break;
			case 2: System.out.println("금요일입니다.");break;
			case 3: System.out.println("토요일입니다.");break;
			case 4: System.out.println("일요일입니다.");break;
			case 5: System.out.println("월요일입니다.");break;
			case 6: System.out.println("화요일입니다.");break;
			}
		}else {
			System.out.println("1에서 31 사이의 숫자를 입력하세요");
		}

		System.out.printf("date %d, day %d", date,day);
		sc.close();
	}

}
