import java.util.Scanner;
class TestClass {
    public static void main(String args[] ){
        Scanner input = new Scanner(System.in);
        int l = input.nextInt();
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            int w = input.nextInt();
            int h = input.nextInt();
            if(w<l||h<l)
                System.out.println("UPLOAD ANOTHER\n");
            else if((w==l&&h==l)||w==h)
                System.out.println("ACCEPTED\n");
            else
                System.out.println("CROP IT");
        }
    }
}
