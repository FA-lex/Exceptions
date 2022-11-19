package HomeWork1.Task2;

public enum CodeErrors {
    ALL_RIGHT(0),
    DIVISION_BY_ZERO(-3),
    NULL_ARRAY(-2),
    SIZE_ARRAYS_UNEQUAL(-1);
    private int code;
    CodeErrors(int code){
        this.code = code;
    }
    public int getCodeErrors(){ return code;}
}
