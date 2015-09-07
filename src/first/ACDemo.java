package first;

/**
 * Created by Asia on 2015-08-21.
 */
abstract class Speaker{
    abstract void speak();
}
public class ACDemo {

    private static int count;

    private final static int count4 = 2;
    private static void method3(){

    }
    public static void main(final String args[]){
        final int count2 = 0;
        new Speaker(){
            private int count3 = 2;
            @Override
            void speak() {
                System.out.println("shit");
                System.out.println(count2);
                System.out.println(count4);
                count3++;
            }
        }.speak();
        class NewInnerClass{
         public void newMethod(){
             System.out.println(count);
             System.out.println(count4);
             method3();
         }
        }
    }
}
