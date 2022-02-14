public class conversion {
    public static void main(String[] args) {
        int a = 45;
        float b = a;
        System.out.println(a);
        System.out.println(b);

        // explicit conversion
        float c = 22.5F;
        int d = (int)c;
        System.out.println("Explicit conversion");
        System.out.println(c);
        System.out.print(d);

        //Numeric to string
        int e = 100;
        String f =Integer.toString(e);
        System.out.println("numeric to string");    
        System.out.println(e);
        System.out.println(f);

        //string to numeric
        String g = "200";
        int h = Integer.parseInt(g);
        System.out.println(g);
        System.out.println(h);




       }
}
