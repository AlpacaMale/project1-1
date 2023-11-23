package Conditional;
import java.util.Scanner;

// BMI = kg/(m*m)
public class BMICalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height,weight;
		long bmi;
		
		System.out.println("키(cm)를 입력해주세요");
		height = sc.nextInt();
		System.out.println("몸무게(kg)를 입력해주세요");
		weight = sc.nextInt();
		
		bmi = weight/(height*height/10000);
		
		if(bmi<18.5) {
			System.out.println("저체중");
		}else if(bmi<23) {
			System.out.println("정상");
		}else if(bmi<25) {
			System.out.println("과체중");
		}else if(bmi<30) {
			System.out.println("비만");
		}else {
			System.out.println("고도비만");
		}
		
		System.out.printf("height %d, weight %d, bmi %d", height , weight , bmi );
		sc.close();
	}

}
