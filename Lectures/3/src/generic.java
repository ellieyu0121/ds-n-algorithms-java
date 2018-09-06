public class generic<T> {
    private T data;
    private generic<T> next;

    public generic(T data, generic<T> next){
        this.data = data;
        this.next = next;
    }

    public T getData(){ return data;}
}
