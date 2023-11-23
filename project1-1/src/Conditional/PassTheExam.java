package Conditional;
import java.util.Scanner;

public class PassTheExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor,eng,math,sum,avg;
		
		System.out.println("국어 과목의 시험 점수를 입력해주세요.");
		kor=sc.nextInt();
		
		System.out.println("영어 과목의 시험 점수를 입력해주세요.");
		eng=sc.nextInt();
		
		System.out.println("수학 과목의 시험 점수를 입력해주세요.");
		math=sc.nextInt();
		
		sum = kor+eng+math;
		avg=sum/3;
		
		if(avg>=60) {
			System.out.println("합격입니다.");
		}else{
			System.out.println("불합격입니다.");
		}
		
		System.out.printf("kor %d, eng %d, math %d, sum %d, avg %d", kor , eng , math , sum , avg );
		sc.close();

	}

}
