/**
 * Created by qngapparat on 18.05.17.
 */
public interface MetaInfoListInterface<T,M> {


    public void add(T elem, M metaInfo);
    public T get(int index);
    public M getMetaInfo(int index);


}