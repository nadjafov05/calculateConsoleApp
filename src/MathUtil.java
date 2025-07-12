public class MathUtil {
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
