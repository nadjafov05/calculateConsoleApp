package mathUtil;

public class MathUtil {
    public static double hesablamaEmeliyyati(double a,double b,char operations){
        switch (operations){
            case '1':
                return a + b;
            case '2':
                return  a - b;
            case '3':
                return a * b;
            case '4':
                return a / b;
            default:
                return 0;
        }
    }
}
