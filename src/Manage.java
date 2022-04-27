public interface Manage<T>{
    void add(T t) ;
    void edit(String sdt , T t);
    void remove(String sdt );
    int search(String name );
    void print();

}
