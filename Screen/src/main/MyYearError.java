package main;

public class MyYearError extends RuntimeException {

    private String msg;
    public MyYearError(String msg) {
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return this.msg;
    }
}
