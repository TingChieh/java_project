package test.java;

//import java.util.*;



public class t1 {


        // // TODO Auto-generated method stub
        //
        // Scanner in=new Scanner(System.in);//实例化一个输入对象，名字叫in
        // int a=in.nextInt();//定义一个名字叫a的int类型变量，a的值是6
        // System.out.println(a);

//        for (float y = 1.5f; y > -1.5f; y -= 0.1f) {
//            for (float x = -1.5f; x < 1.5f; x += 0.05f) {
//                float a = x * x + y * y - 1;
//                if ((a * a * a - x * x * y * y * y) < 0.0f) {
//                    System.out.print("王""科""炎");
//                    try {
//                        Thread.sleep(5);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.print("\n");
//        }
//    }
//}
    	    public static void main(String[] args) throws InterruptedException {
    	        int count=0;
    	        for (double y=2.5f;y>-2.0f;y-=0.12f){
    	            for (double x=-2.3f;x<2.3f;x+=0.041f){
						double a = x*x+y*y-4f;
    	                if ((a*a*a-x*x*y*y*y)<-0.0f){
    	                    String str="王科炎";
    	                    int num =count%str.length();
    	                    System.err.print(str.charAt(num));
    	                    count++;
    	                }else{
    	                    System.err.print(" ");
    	                }
    	            }
    	            System.err.println();
    	            Thread.sleep(100);
    	        }
    	    }
    	}
