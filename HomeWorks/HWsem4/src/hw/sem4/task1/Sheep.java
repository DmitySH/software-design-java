package hw.sem4.task1;

public class Sheep implements Cloneable{
    public Sheep(int age, String name) {
        this.age = age;
        this.name = name;
    }

    private final int age;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "age=" + getAge() +
                ", name='" + getName() + '\'' +
                '}';
    }

    @Override
    public Sheep clone() {
        try {
            return (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
