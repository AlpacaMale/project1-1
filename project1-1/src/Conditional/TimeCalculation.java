package Conditional;
import java.util.Scanner;

public class TimeCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time,addTime;
		String day;
		
		System.out.printf("시간 입력:");
		time = sc.nextInt();
		
		if(0<=time&&time<=23) {
			time*=60;
			
			System.out.printf("분 입력:");
			time += sc.nextInt();
			
			System.out.printf("추가 분 입력:");
			addTime = sc.nextInt();
			time += addTime;
			
			if(time<60*12) { day = "오전";}
			else { 
				time -= 12*60;
				day = "오후"; 
				}
			
			System.out.printf("입력 시간에서 %d분을 추가한 시간은 %s %d시 %d분입니다.\n", addTime,day,time/60,time%60);
			}
		
		else System.out.println("0 ~ 23 사이의 값을 입력하세요");
		
		
		
		System.out.printf("time %d", time);
		sc.close();
	}

}
