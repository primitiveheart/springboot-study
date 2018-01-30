package com.example.demo.result;

/**
 * Created by admin on 2018/1/15.
 */
public class GlobalErrorInfoException extends Exception {
    private ErrorInfoInterface errorInfoInterface;
    public GlobalErrorInfoException(ErrorInfoInterface errorInfoInterface){
        this.errorInfoInterface = errorInfoInterface;
    }

    public ErrorInfoInterface getErrorInfoInterface() {
        return errorInfoInterface;
    }

    public void setErrorInfoInterface(ErrorInfoInterface errorInfoInterface) {
        this.errorInfoInterface = errorInfoInterface;
    }
}
