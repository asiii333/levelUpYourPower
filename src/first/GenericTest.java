package first;

import java.util.List;

/**
 * Created by Asia on 2015-08-26.
 */
public class GenericTest {


    static <T> void copyList(List<T> c1, List<T> c2){
        for(T el : c1){
            c2.add(el);
        }
    }


}
