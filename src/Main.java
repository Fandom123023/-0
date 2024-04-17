import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("test1");
        int[] world = new int[3];
        world[0] = 1;
        world[1] = 2;
        world[2] = 3;
        System.out.println(world[0]);
        System.out.println(world[1]);
        System.out.println(world[2]);

        double[] worldTwo = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(worldTwo));

        System.out.println("test2");
        String[] fruits = {"груша", "виноград", "Апельсин"};
        System.out.println(fruits[0]);
        System.out.println(fruits[2]);

        System.out.println("test3");
        for (int i = worldTwo.length - 1; i >= 0; i--) {
            System.out.print(worldTwo[i] + ", ");
        }
        System.out.println();
        for (int i = worldTwo.length - 1; i >= 0; i--) {
            System.out.print(worldTwo [i] + ", ");
        }
        System.out.println();
        for (int i = fruits.length - 1; i >= 0; i--) {
            System.out.print(fruits[i] + "; ");
        }
        System.out.println();

        System.out.println(" test4");
        for (int i = 0; i < worldTwo.length; i++) {
            if (worldTwo[i] % 2 != 0) {
                worldTwo[i] += 1;
            }
        }
        System.out.println(Arrays.toString(worldTwo));






    }
}