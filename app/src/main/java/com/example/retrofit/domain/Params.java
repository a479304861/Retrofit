package com.example.retrofit.domain;

public class Params {
    private String  name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Params{" +
                "name='" + name + '\'' +
                '}';
    }

    public Params(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
