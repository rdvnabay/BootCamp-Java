package kodlamaio.day6_northwind.core.utilities.results;

public class SuccessDateResult<T> extends DataResult<T> {

    public SuccessDateResult(T data,String message) {
        super(data, true,message);
    }

    public SuccessDateResult(T data) {
        super(data, true);
    }

    public SuccessDateResult(String message) {
        super(null, true,message);
    }

    public SuccessDateResult() {
        super(null, true);
    }
}
