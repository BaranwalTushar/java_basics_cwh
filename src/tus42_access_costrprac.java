class cylinder{
    private float radius;
    private float height;

    public cylinder(){
         radius = 22.7f;
         height = 10.00f;

    }

    public void setRadius(float i){
        radius = i;
    }
    public float getRadius(){
        return radius  ;
    }
    public void setHeight(float n){
        height = n;
    }
    public float getHeight(){
        return height;
    }

}
public class tus42_access_costrprac {
    public static void main(String[] args) {
      cylinder tushar = new cylinder();
//       tushar.setRadius(3.14f);   //SETTER AND GETTER METHOD
//        System.out.println(tushar.getRadius());
//
//        tushar.setHeight(34.45f);
//        System.out.println(tushar.getHeight());

        System.out.println(tushar.getHeight());
        System.out.println(tushar.getRadius());
    }
}
