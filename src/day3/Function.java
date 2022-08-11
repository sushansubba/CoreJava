package day3;

public class Function {


    public static void main(String[] args) {


        int a = 5;
        int b = 64;
        int c = 123;

        System.out.println(add(a,b,c));

        int d = 123;
        int e = 3;
        int f = 12;

        System.out.println(add(d,e,f));


    }


    public static int add(int a, int b, int c)
    {
        int x = a + b+ c;
        return x;

    }
}
