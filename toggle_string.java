import java.util.Scanner;
class TestClass {
    public static void main(String args[] ){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        for(char ch : s.toCharArray()){
            if(ch >= 'a' && ch <= 'z')
                System.out.print((char)(ch-32));
            else
                System.out.print((char)(ch+32));
        }
    }
}
