package ex;

import java.util.Scanner;

/*
 * Topic: 輸入所使用的度數，換算夏月及非夏月之電費金額。
 * Date: 2016/12/05
 * Author: 105021033 黃苡珊
 */

public class ex02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int v1 = scn.nextInt();
		if(v1<=120){
			System.out.println(v1*2.1);
			System.out.println(v1*2.1);
		}else if(v1>=121&&v1<=330){
			System.out.println(120*2.1+(v1-120)*3.02);
			System.out.println(120*2.1+(v1-120)*2.68);
		}else if(v1>=331&&v1<=500){
			System.out.println(120*2.1+(330-120)*3.02+(v1-330)*4.39);
			System.out.println(120*2.1+(330-120)*2.68+(v1-330)*3.61);
		}
			else if(v1>=501&&v1<=700){
				System.out.println(120*2.1+(330-120)*3.02+(500-330)*4.39+(v1-500)*4.97);
				System.out.println(120*2.1+(330-120)*2.68+(500-330)*3.61+(v1-500)*4.01);
		}
			else if(v1>=701){
				System.out.println(120*2.1+(330-120)*3.02+(500-330)*4.39+(700-500)*4.97+(v1-700)*5.63);
				System.out.println(120*2.1+(330-120)*2.68+(500-330)*3.61+(700-500)*4.01+(v1-700)*4.5);
		}
	}
}
