package com.telran.models;

public class ModelBase {
    String fild1;
    String fild2;

    public ModelBase withFild1(String fild1) {
        this.fild1 = fild1;
        return this;
    }

    public ModelBase withFild2(String fild2) {
        this.fild2 = fild2;
        return this;
    }

    public String getFild1() {
        return fild1;
    }

    public String getFild2() {
        return fild2;
    }

    @Override
    public String toString() {
        return "ModelBase{" +
                "fild1='" + fild1 + '\'' +
                ", fild2='" + fild2 + '\'' +
                '}';
    }
}
