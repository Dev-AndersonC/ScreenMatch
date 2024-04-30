package br.com.anderson.screenmatch.exceptions;

public class ErrorYear extends RuntimeException {
    private String msg;
    public ErrorYear(String msg) {
        this.msg = msg;

    }

    @Override
    public String getMessage() {
        return this.msg;
    }
}
