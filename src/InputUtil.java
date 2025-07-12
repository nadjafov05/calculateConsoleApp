import java.util.Scanner;

public class InputUtil {
    public static double reqemTelebEt(String mesaj){
        System.out.print(mesaj);
        return new Scanner(System.in).nextDouble();
    }
    public static char emeliyyatSecimi(String mesaj){
        System.out.println(mesaj);
        return new Scanner(System.in).nextLine().charAt(0);
    }
}
