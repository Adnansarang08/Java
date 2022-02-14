public class userinput{
    public static void main(String[] args) {
        String name;
        int age;

        System.out.println("Enter name:");
        name = System.console().readLine();

        System.out.println("enter age");
        age = Integer.parseInt(System.console().readLiadne());
        System.out.println("Hello" +name +age);


    }
}