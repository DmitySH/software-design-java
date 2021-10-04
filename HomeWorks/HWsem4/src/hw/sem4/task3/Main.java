package hw.sem4.task3;

import hw.sem4.task1.Sheep;
import hw.sem4.task1.Shepherd;

public class Main {
    public static Sheep[] cloneSheep(Shepherd s)  {
        return s.cloneAllSheep();
    }

    public static void main(String[] args) {
        Shepherd s = new Shepherd(20);
        for (int i = 0; i < 20; ++i) {
            s.addSheep(i, new Sheep(i, "Sheep" + i));
        }


        long start = System.currentTimeMillis();
        for (int i = 0; i <= 1000; ++i) {
            Sheep[] sheeeep = s.cloneAllSheep();
        }

        long finish = System.currentTimeMillis();
        double elapsed = (finish - start) / 1000.0;
        System.out.println("Ушло времени на одну операцию instance, мс: " + elapsed);

        start = System.currentTimeMillis();
        for (int i = 0; i <= 1000; ++i) {
            Sheep[] sheeeep = cloneSheep(s);
        }

        finish = System.currentTimeMillis();
        elapsed = (finish - start) / 1000.0;
        System.out.println("Ушло времени на одну операцию static, мс: " + elapsed);
    }
}
