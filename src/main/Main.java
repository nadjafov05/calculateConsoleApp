package main;

import inputUtil.InputUtil;
import mathUtil.MathUtil;

public class Main {
    public static void main(String[] args) {
        System.out.println("username: " + args[0]);
        System.out.println("user password: " + args[1]);

        if (args[0].equals("perviz") && args[1].equals("Leyl@927")) {
            double a = InputUtil.reqemTelebEt("a`ni daxil edin: ");
            double b = InputUtil.reqemTelebEt("b`ni daxil edin: ");


            char operations = InputUtil.emeliyyatSecimi("emeliyyat secimi edin:" +
                    "\n 1: toplama" +
                    "\n 2: cixma" +
                    "\n 3: vurma" +
                    "\n 4: bolme");

            double netice = MathUtil.hesablamaEmeliyyati(a, b, operations);
            System.out.println(netice);
        }else {
            System.out.println("daxil etdiyiniz istifadeci adi veya parol sehvdir!");
        }
    }
}