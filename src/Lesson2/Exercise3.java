package Lesson2;

public class Exercise3 {
    public static void main(String[] args) {
        int x = 9;
        int y = x++;
        System.out.println(x);
        System.out.println(y);


        int z = 21;
        int n = z--;
        System.out.println(z);
        System.out.println(n);

        boolean a = false;
        boolean b = true;
        //Логическое И
        System.out.println("\nЛогическое И:");
        System.out.println(a & a);
        System.out.println(a & b);
        System.out.println(b & a);
        System.out.println(b & b);

        //Логическое ИЛИ
        System.out.println("\nЛогическое ИЛИ:");
        System.out.println(a | a);
        System.out.println(a | b);
        System.out.println(b | a);
        System.out.println(b | b);

        //Сравнение
        System.out.println("\nСравнение:");
        System.out.println(a ^ a);
        System.out.println(a ^ b);
        System.out.println(b ^ a);
        System.out.println(b ^ b);
    }
}
