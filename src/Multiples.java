public class Multiples {
    public static void main(String[] args) {
        System.out.println(countMultiplesBelow(1000));
    }

    public static int countMultiplesBelow(int n)
    {
        int result = 0;
        for (int i = 1; i < n; i++)
        {
            boolean multOf3 = i % 3 == 0;
            boolean multOf5 = i % 5 == 0;

            if (multOf3 && multOf5) {
                result++;
            } else if (multOf3) {
                result++;
            } else if (multOf5) {
                result++;
            }
        }
        return result;
    }
}
