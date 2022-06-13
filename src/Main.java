import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       String[] array1 = {"hello", "summer", "sun", "ocean", "swimming"};
       Integer[] array2 = {155, 5555, 12345, -600, -2022};
       Double[] array3 = {225.34, 1257.006, 7583.3334, 76.9001, 544.544};

        System.out.println("1 Task");
        // string array
        System.out.println("Before swap 1<->5\n" + Arrays.toString(array1));
        Swap.swapElements(array1, 0, 4);
        System.out.println("After swap\n" + Arrays.toString(array1));

        // int array
        System.out.println("Before swap 2<->3\n" + Arrays.toString(array2));
        Swap.swapElements(array2, 1, 2);
        System.out.println("After swap\n" + Arrays.toString(array2));

        // double array
        System.out.println("Before swap 4<->5\n" + Arrays.toString(array3));
        Swap.swapElements(array3, 3, 4);
        System.out.println("After swap\n" + Arrays.toString(array3));


        System.out.println("2 Task");

        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();
        Box<Apple> appleBox = new Box<>();


        for (int i = 0; i < 3; i++){
            orangeBox1.add(new Orange());
        }
        for (int i = 0; i < 4; i++) {
            orangeBox2.add(new Orange());
        }
        for (int i = 0; i < 6; i++) {
            appleBox.add(new Apple());
        }

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

        float orange1Weight = orangeBox1.getWeight();
        float orange2Weight = orangeBox2.getWeight();
        float appleWeight = appleBox.getWeight();

        System.out.println("orangeBox1 weight: " + orange1Weight);
        System.out.println("orangeBox2 weight: " + orange2Weight);
        System.out.println("appleBox weight: " + appleWeight);

        System.out.println("Compare weight of orangeBox1 and orangeBox2: " + orangeBox1.compare(orangeBox2));
        System.out.println("Compare weight of orangeBox1 and appleBox: " + orangeBox1.compare(appleBox));
        System.out.println("Compare weight of orangeBox2 and appleBox: " + orangeBox2.compare(appleBox));

        System.out.println("Move all oranges into orangeBox2");
        orangeBox1.move(orangeBox2);

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();
    }


}


