package src.lesson25.generics;

import java.util.Collection;

public class MyGeneric<T> {

    T dataType;

    public T getDataType() {
        return dataType;
    }

    public void setDataType(T dataType) {
        this.dataType = dataType;
    }
}
