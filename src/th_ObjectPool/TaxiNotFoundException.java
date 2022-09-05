package th_ObjectPool;

public class TaxiNotFoundException extends RuntimeException {
    public TaxiNotFoundException(String message) {
        System.out.println(message);
    }
}
