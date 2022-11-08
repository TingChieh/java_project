package test.java;

import java.util.*;

public class outname {
	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		String name  = in.next();
//		System.out.println("name:"+name);
//
//		Scanner in=new Scanner(System.in);
//		double a=in .nextDouble();
//		double b=in .nextDouble();
//		double area=a*b;
//		System.out.println("面积之和"+area);
//		System.out.println("厚德\t勤业\n常州职业技术学院")
//		System.out.println("hello world");
//		System.out.println("输入你的数字");
//		Scanner a = new Scanner(System.in);
//		double num = a.nextDouble();
//		int v = (int) Math.round(num);
//		System.out.println("out"+v);
//		int a,b,c;
//		a=6;b=++a;c=a++;
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		char a = 'a';
//		char b = (char)(a+2);
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(a+2);
//	    int b = 65;
//	    byte a = (byte)(b);
//	    char c = (char)(a);
//		System.out.println(c);
//		int x = 8;
//		int y = 9;
//		System.out.println((++x!=y)||(++x==y));
//		System.out.println(x);
//		Scanner input = new Scanner(System.in);
//		System.out.print("input your num");
//		int num = input.nextInt();
//		String result = (num%2==0) ? "偶数" : "奇数";
//		System.out.println(num+"是"+result);
//		Scanner num = new Scanner(System.in);
//		double a = num.nextDouble();
//		if (a == 520) {
//			System.out.println("那我只能说6");
//		} else {
//			System.out.println("那确实");
//		}
//	}
//}
//		Scanner num = new Scanner(System.in);
//		double a=num .nextDouble();
//		double b=num .nextDouble();
//		if(a>90 && b>80 || a==100 && b>70) {
//				System.out.println("获奖");
//		}else {
//			System.out.println("究极白给");
//		String n1 = "牛";
//		String n2 = "样";
//		System.out.println(n1 .equals(n2) );
//		Scanner input = new Scanner(System.in);
//		double u1 = input .nextDouble();
//		double u2 = input .nextDouble();
//		if(u1>=6 && u2>=6 || u1==100 && u2>50) {
//			System.out.println("完成");
//		}else {
//			System.out.println("失败");
//		}
//		int a = 9;
//		System.out.println((3>4) & (a++>7));
//		System.out.println(a);
//		System.out.println((3>4) && (a++>7));
//		System.out.println(a);
//		System.out.println((3<4) | (a++>7));
//		System.out.println(a);
//		System.out.println((3<4) || (a++>7));
//		System.out.println(a);
//        double x,y,a;
//        char s[]=new char[] {'王','科','炎'}	;
//        int index=0;
//        for(y=1.3f;y>-1.1f;y-=0.06f){
//        	index=0;
//            for(x=-1.2f;x<=1.2f;x+=0.025f){
//            	double result=x*x+pow((5.0*y/4.0-sqrt(Math abs((s))),2);
//                if(result<=1){
//                    System.out.print((s[index]));
//                    index=(index+1)%11;
//                }
//                else{
//                    System.out.print(' ');
//                }
//            }
//            System.out.println(" ");
//        }
//		double a = 987;
//		double b = (double)987/100;
//		double c = 987%100;
//		System.out.println(b);
//		System.out.println(c);
//				System.out.println("面积之和"+area);
//		for (int a = 511; a < 521; a++) {//这里已经加过1了
//			if (a==520){
//				System.out.println("当数字等于520时代表着我也爱你");
//				break;
//			}else{
//				System.out.println("当数字等于"+a+"那么我也不会爱你的");
//			}
//		Scanner input = new Scanner(System.in);
//		String name = input.nextLine();
//		double tem = input.nextDouble();
//		String loca = input.next();
//		if (tem > 37 && loca .equals("常州")) {
//			System.out.println("高风险");
//		} else if (tem >37 || loca .equals("常州")) {
//			System.out.println("中风险");
//		}else {
//			System.out.println("低风险");
//		}
//		Scanner input = new Scanner(System.in);
//		double a = input.nextDouble();
//		double b = input.nextDouble();
//		double c = input.nextDouble();
//		double s = (a+b+c)/2;
//		if (a+b>c && a+c>b && b+c>a) {
//			System.out.println("够成三角形，它的面积为"+ Math.sqrt(s*(s-a)*(s-b)*(s-c)));
//		}else {
//			System.out.println("不组成三角形");
//		}
		//
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		if (year > 0 && year <= 2) {
			System.out.println("相当于人类" + 10.5 * year);
		} else if (year > 2) {
			System.out.println("相当于人类" + 21 + 4 * year);
		}else {
			System.out.println("请输出正常年龄");
		}
	}
}
