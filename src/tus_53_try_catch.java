public class tus_53_try_catch {
    public static void main(String[] args) {
        int a = 6000;
        int b= 0;
        //Without TRy CAtch
//        int c =a/b;
//        System.out.println("The result is "+c);
        //With Try And Catch
        try{
            int c =a/b;
            System.out.println("The result is "+c);
        }
        catch (Exception e){
            System.out.println("We failed to divide. due to some reason");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}
