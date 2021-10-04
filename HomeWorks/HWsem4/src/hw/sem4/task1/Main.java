package hw.sem4.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sheep sheep = new Sheep(5, "Alexa");
        Sheep newSheep = sheep.clone();
        System.out.println(sheep);
        sheep.setName("Groove");
        System.out.println(sheep);
        System.out.println(newSheep);

        System.out.println();
        Shepherd s = new Shepherd(10);
        Sheep shepherdSheep = s.cloneSheep(newSheep);
        System.out.println(shepherdSheep);
        System.out.println();

        s.addSheep(0, new Sheep(3, "Bibi"));
        s.addSheep(1, new Sheep(5, "Diopp"));
        s.addSheep(2, new Sheep(1, "Filip"));

        Sheep[] newSheepArray = s.cloneAllSheep();
        Sheep[] newSheepCopy = s.copyAllSheep();

        newSheepArray[0].setName("Rodos");
        newSheepCopy[0].setName("Varan");

        System.out.println(Arrays.toString(newSheepArray));
        System.out.println(s);
        System.out.println(Arrays.toString(newSheepCopy));

        // 1) Клонировать через цикл вызвав Sheep.clone().
        // 2) Клонировать сам массив через array.clone().
        // Все остальное - копирование.


    }
}
