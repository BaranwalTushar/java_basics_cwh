public class tush_methods {
    // int sum(int x,int y)(not using void)
     static int sum(int x,int y) {
        int z;
        if (x > y) {
            z = x + y;

        } else {
            z = 2 * (x + y);
        }
        return z;
    }

    public static void main(String[] args) {

        int a = 5;
        int b = 6;
        int c;
      tush_methods obj=new tush_methods();
        c = obj.sum(a,b);
       // c=sum(a,b);


        int a1 = 7;
        int b1 = 6;
        int c1;

        c1 = obj.sum(a1,b1);
        // c1=sum(a1,b1);
        System.out.println(c);
        System.out.println(c1);
        }

    }

