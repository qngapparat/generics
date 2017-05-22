import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by qngapparat on 18.05.17.
 */
public class MetaInfoList<T,M> implements MetaInfoListInterface<T,M> {

    private List<T> list = new ArrayList<>();
    private Map<T,M> metaInfoStorage = new HashMap<>();

    //constructor
    public MetaInfoList(){

    }

    //methods
    public void add(T elem, M metaInfo){
        try{
            this.list.add(elem);
            this.metaInfoStorage.put(elem,metaInfo);
        }

        catch(Exception e){
            //TODO
            throw e;
        }
    }


    public T get(int index) {

        T data;

        try {
            data = this.list.get(index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index invalid. Didn't get");
            return null;
            //e.printStackTrace();
        }

        return data;

    }

    public M getMetaInfo(int index){

        T elem;

        try {
            elem = this.list.get(index);
        }

        catch(IndexOutOfBoundsException e){
            System.out.println("Index invalid. Didn't get");
            return null;
        }

        return metaInfoStorage.get(elem);


    }


}
