package com.company;

public class SystemCall {

    private Object[] object;
    private String description;

    public SystemCall( Object[] obj, String description) {
        this.object = obj;
        this.description = description;
    }

    public Object[] getObject() {
        return object;
    }

    public String getDescription() {
        return description;
    }
}
