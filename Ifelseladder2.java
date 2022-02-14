public class Ifelseladder2{
    public static void main(String[] args) {
        int num1,num2,num3;

        System.out.println("Enter the number 1: ");
        num1=Integer.parseInt(System.console().readLine());

        System.out.println("Enter the number 2: ");
        num2=Integer.parseInt(System.console().readLine());

        System.out.println("Enter the number 3: ");
        num3=Integer.parseInt(System.console().readLine());

        if(num1>num2 && num1>num3){
            System.out.print("Number 1 is greatest");
        }else if(num2>num1 && num2>num3){
            System.out.println("Number 2 is greatest");
        }else if(num3>num1 && num3>num2){
            System.out.println("Number 3 is greatest");
        }else{
            System.out.println("All are equal");
        }

    }
}
    