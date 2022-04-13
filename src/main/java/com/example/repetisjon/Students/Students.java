package com.example.repetisjon.Students;

public class Students {
    private String name;
    private int alder;
    private String kjønn;

    public Students(String name, int alder, String kjønn) {
        this.name = name;
        this.alder = alder;
        this.kjønn = kjønn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    public String getKjønn() {
        return kjønn;
    }

    public void setKjønn(String kjønn) {
        this.kjønn = kjønn;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", alder=" + alder +
                ", kjønn='" + kjønn + '\'' +
                '}';
    }
}
