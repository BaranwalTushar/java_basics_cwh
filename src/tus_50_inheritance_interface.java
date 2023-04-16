interface sampleinterface{
    void meth1();
    void meth2();
}
interface childsampleinterface extends sampleinterface{
    void meth3();
    void meth4();
}
class Mysampleclass implements childsampleinterface{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
        }
public class tus_50_inheritance_interface {
    public static void main(String[] args) {
        Mysampleclass tus = new Mysampleclass();
        tus.meth4();
        tus.meth3();
        tus.meth1();
        tus.meth2();
    }
}
