import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int a = input.nextInt();
            int b = input.nextInt();
            int c = a*b;
            if (c==888) {
                System.out.println("该四边形为发财矩形");
            } else {
                System.out.println("普通矩形");
            }
    }
}
