public class Swap {

    public static <T> void swapElements(T[] array, int indexA, int indexB) {
        T inter = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = inter;
    }
}
