import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double result = 0;


        System.out.print("a`ni daxil edin: ");
        double a = new Scanner(System.in).nextDouble();
        System.out.print("b`ni daxil edin: ");
        double b = new Scanner(System.in).nextDouble();

        System.out.println("emeliyyat secimi edin:" +
                "\n 1: toplama" +
                "\n 2: cixma" +
                "\n 3: vurma" +
                "\n 4: bolme");
        char operations = new Scanner(System.in).nextLine().charAt(0);

        if (operations == '1'){
            result = a + b;
        }else if (operations == '2'){
            result = a - b;
        }else if (operations == '3'){
            result = a * b;
        }else if (operations == '4'){
            result = a / b;
        }else {
            System.out.println("riyazi emeliyyat uygun deyil!");
        }
        System.out.println(result);
    }
}