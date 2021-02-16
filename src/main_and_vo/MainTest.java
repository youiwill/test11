package main_and_vo;

import java.util.Scanner;

import a_parkhyeonjin0412.A_Impl;
import a_parkhyeonjin0412.A_parkhyeonjin0412;
import b_melenie11.B_Impl;
import b_melenie11.B_melenie11;
import c_MaximusKorea.C_Impl;
import c_MaximusKorea.C_MaximusKorea;
import d_youiwill.D_Impl;
import d_youiwill.D_youiwill;

public class MainTest {

	public static void main(String[] args) {
		A_parkhyeonjin0412 a = new A_Impl();
		B_melenie11 b = new B_Impl();
		C_MaximusKorea c = new C_Impl();
		D_youiwill d = new D_Impl();
		
		Scanner sc = new Scanner(System.in);
		
		boolean changed = false;
		System.out.println("== 그냥 테스트 ==");
		while( ! changed ) {
			
			int num = sc.nextInt();
			
			switch(num) {
			case 1:		// parkhyeonjin0412
				
				break;
			case 2:		// melenie11
				
				break;	
			case 3:		// MaximusKorea
				
				break;
			case 4:		// youiwill
				
				break;
			case 5:		// 종료
				System.exit(0); 
			}
		}
	}

}
