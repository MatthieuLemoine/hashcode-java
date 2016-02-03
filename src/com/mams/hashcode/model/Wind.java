package com.mams.hashcode.model;

public class Wind {
    public int delta_r;
    public int delta_c;

    public Wind(int delta_r, int delta_c) {
        this.delta_r = delta_r;
        this.delta_c = delta_c;
    }

    @Override
    public String toString() {
        return "Wind{" +
                "delta_r=" + delta_r +
                ", delta_c=" + delta_c +
                '}';
    }
}
