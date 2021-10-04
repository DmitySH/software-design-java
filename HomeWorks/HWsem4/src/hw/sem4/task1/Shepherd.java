package hw.sem4.task1;

import java.util.Arrays;

public class Shepherd {
    private final Sheep[] sheep;
    private int count;
    public Shepherd(int countOfSheep) {
        sheep = new Sheep[countOfSheep];
        count = 0;
    }

    public void addSheep(int index, Sheep sheep) {
        if (index >= this.sheep.length || index < 0) {
            System.out.println("Incorrect index!");
        } else {
            this.sheep[index] = sheep;
        }
        ++count;
    }

    public Sheep takeSheep(int index) {
        if (index >= this.sheep.length || index < 0) {
            System.out.println("Incorrect index!");
            return null;
        } else {
            --count;
            Sheep temp = sheep[index];
            sheep[index] = null;
            return temp;
        }
    }

    public Sheep cloneSheep(Sheep sheep) {
        return sheep.clone();
    }

    public Sheep[] cloneAllSheep(){
        Sheep[] sheep = new Sheep[count];
        for (int i = 0; i < count; ++i) {
            sheep[i] = this.sheep[i].clone();
        }

        return sheep;
    }

    public Sheep[] copyAllSheep(){
        Sheep[] sheep = new Sheep[this.sheep.length];
        System.arraycopy(this.sheep, 0, sheep, 0, this.sheep.length);

        return sheep;
    }

    @Override
    public String toString() {
        return Arrays.toString(sheep);
    }
}
