import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = 4;
        System.out.printf("a*3 = %d\n", a*3);
        System.out.print("a/2 =" + (a/2));
        System.out.print("a-1 =" + (a-1));
        scan.close();
    }

}