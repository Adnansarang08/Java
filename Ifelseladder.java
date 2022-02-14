public class Ifelseladder {
    public static void main(String[] args) {
        int num1, num2;
         
        System.out.println("Enter the number 1:  ");
        num1=Integer.parseInt(System.console().readLine());

        System.out.println("Enter the number 2:  ");
        num2=Integer.parseInt(System.console().readLine());

        if (num1 > num2) {
            System.out.println("Number 1 is greatest");
        }else if(num2 > num1){
            System.out.println("Number 2 is greatest");
        } else{
            System.out.println("Both are equal");
        }

    }
}
