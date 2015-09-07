package second;

import java.util.List;

/**
 * Created by Asia on 2015-08-26.
 */
public class SquereGeneric<E extends Number> {
    private E x;
    private E y;
    List<? super Integer> list;

    public SquereGeneric(E x, E y){
        this.x = x;
        this.y = y;
    }
    public E getX(){
        return x;
    }

    public void setX(E x){
        this.x = x;
    }

    public E getY() {
        return y;
    }

    public void setY(E y) {
        this.y = y;
    }
}
