package com.mycompany.mars.data;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.ArrayList;

public class Field712 {
    private String i1;
    private String i2;
    private ArrayList<String> a;
    private ArrayList<String> b;
    private ArrayList<String> c;
    private ArrayList<String> d;
    private ArrayList<String> e;
    private ArrayList<String> f;
    private ArrayList<String> s6;

    public String getI1() {
        return i1;
    }

    public void setI1(String i1) {
        this.i1 = i1;
    }

    public String getI2() {
        return i2;
    }

    public void setI2(String i2) {
        this.i2 = i2;
    }

    public ArrayList<String> getA() {
        return a;
    }

    public void setA(ArrayList<String> a) {
        this.a = a;
    }

    public ArrayList<String> getB() {
        return b;
    }

    public void setB(ArrayList<String> b) {
        this.b = b;
    }

    public ArrayList<String> getC() {
        return c;
    }

    public void setC(ArrayList<String> c) {
        this.c = c;
    }

    public ArrayList<String> getD() {
        return d;
    }

    public void setD(ArrayList<String> d) {
        this.d = d;
    }

    public ArrayList<String> getE() {
        return e;
    }

    public void setE(ArrayList<String> e) {
        this.e = e;
    }

    public ArrayList<String> getF() {
        return f;
    }

    public void setF(ArrayList<String> f) {
        this.f = f;
    }

    @JsonGetter("6")
    public ArrayList<String> getS6() {
        return s6;
    }

    @JsonSetter("6")
    public void setS6(ArrayList<String> s6) {
        this.s6 = s6;
    }
}