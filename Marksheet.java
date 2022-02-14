public class Marksheet{
    public static void main(String[] args) {
        int subject1, subject2, subject3, subject4;

        System.out.print("subject1");
        subject1= Integer.parseInt(System.console().readLine());

        System.out.print("subject2");
        subject2= Integer.parseInt(System.console().readLine());

        System.out.print("subject3");
        subject3= Integer.parseInt(System.console().readLine());

        System.out.print("subject4");
        subject4= Integer.parseInt(System.console().readLine());

        int total = subject1 + subject2 + subject3 + subject4;
        float percentage = (total/400F)*100;

        System.out.println("total=" + total);
        System.out.println("percentage" + percentage);

    }
}