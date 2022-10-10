package СтарыеПроекты;

public class JavaExceptions {

    public static void main(String[] args)throws ArithmeticException {


    int a = 5;
    int b = 0;

    try{
        System.out.println(a/b);
    }catch (ArithmeticException e){
        throw new ArithmeticException("Nelzya delit na nol");
    }
}}
