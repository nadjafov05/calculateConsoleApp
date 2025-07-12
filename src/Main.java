import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a = reqemTelebEt("a`ni daxil edin: ");
        double b = reqemTelebEt("b`ni daxil edin: ");


        char operations = emeliyyatSecimi("emeliyyat secimi edin:" +
                "\n 1: toplama" +
                "\n 2: cixma" +
                "\n 3: vurma" +
                "\n 4: bolme");

        double netice = hesablamaEmeliyyati(a,b,operations);
        System.out.println(netice);
    }

    public static double reqemTelebEt(String mesaj){
        System.out.print(mesaj);
        return new Scanner(System.in).nextDouble();
    }
    public static char emeliyyatSecimi(String mesaj){
        System.out.println(mesaj);
        return new Scanner(System.in).nextLine().charAt(0);
    }
    public static double hesablamaEmeliyyati(double a,double b,char operations){
        double result = 0;
        switch (operations){
            case '1':
                result =  a + b;
                break;
            case '2':
                result = a - b;
                break;
            case '3':
                result =a * b;
                break;
            case '4':
                result = a / b;
                break;
            default:
                System.out.println("riyazi emeliyyat uygun deyil.");
        }
        return result;
    }
}