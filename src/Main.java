import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a = InputUtil.reqemTelebEt("a`ni daxil edin: ");
        double b = InputUtil.reqemTelebEt("b`ni daxil edin: ");


        char operations = InputUtil.emeliyyatSecimi("emeliyyat secimi edin:" +
                "\n 1: toplama" +
                "\n 2: cixma" +
                "\n 3: vurma" +
                "\n 4: bolme");

        double netice = MathUtil.hesablamaEmeliyyati(a,b,operations);
        System.out.println(netice);
    }
}