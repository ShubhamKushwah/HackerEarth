import java.util.Scanner;
class TestClass {
    public static void main(String args[] ){
    Scanner input = new Scanner(System.in);
    long n,p=1,a;
    n = input.nextInt();
    int i;
    for(i=0;i<n;i++)
    {
        a = input.nextInt();
        p=(a*p)%1000000007;
    }
    System.out.println(p);
    
    }
}
