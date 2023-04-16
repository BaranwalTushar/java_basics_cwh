class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius can not be Negative";
    }

    @Override
    public String getMessage() {
        return "Radius can not be Negative";
    }
}
public class tus_57_throw_throws {
    //Made by Tushar
    static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw  new NegativeRadiusException();
        }
        double result = Math.PI*r*r;
        return result;
    }
//    static int divide(int a, int b) throws ArithmeticException{
//        int result = a/b;
//        return  result;
//    }
    public static void main(String[] args) {
        //Made by Sayak
        try {
            double answer = area(-1);
            System.out.println(answer);
//            int c=divide(4,0);
//            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("Excetion");
            System.out.println(e);
        }

    }
}
