package edu.hse.cs.se.seminar2;

public class Sample_6_MyRecord {

    public static void main(String[] args) {
        Point p = new Point(1 + 1, 2 + 3);
        Record r = p;
        System.out.println(r);
    }
}

record Point(float x, float y) {
}