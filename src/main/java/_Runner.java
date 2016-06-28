/**
 * Created by ivanpryshchepau on 6/23/16.
 */
public class _Runner {

    static int[] mas1 = {34,8456,8456,56};
    static int[] mas2 = {87,6,4,567,67,84,5,7,99};

    static int[] result;

    public static void main(String[] args) {
        combine(2);
    }

    public static void combine(int k) {

        result = new int[mas1.length + mas2.length];

        System.arraycopy(mas1, 0, result, 0, k);
        System.arraycopy(mas2, 0, result, k, mas2.length);
        System.arraycopy(mas1, k, result, k + mas2.length, mas1.length - k);

        for (int i : result) {
            System.out.println(i);
        }

    }


}
