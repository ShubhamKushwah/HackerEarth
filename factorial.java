import java.util.Scanner;
class TestClass {
    public static void main(String args[] ){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int f=1;
        for(int i=1;i<=n;i++)
            f*=i;
        System.out.println(f);
    }
}
