public class tus_58_finally {
    public static  int greet(){
        try{
            int a=50;
            int b=0;
            int c=a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("cleaning up resourses...This is end of this function");
        }
        return -1;
    }
    public static void main(String[] args) {
        int g = greet();
        System.out.println(g);
        int a = 8;
        int b = 6;

        while(true){
            try {
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am finally for value of b = "+b);
            }
             b--;
        }


    }
}
