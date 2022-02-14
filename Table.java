package loops;

public class Table{
    public static void main(String[] args) {
        int num=2;
        System.out.print("Enter number:  ");
        num=Integer.parseInt(System.console().readLine());
        for (int i = 1; i <= 10; i++) {
            System.out.println(num*i);
        }
    }
}
   