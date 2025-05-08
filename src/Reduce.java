public class Reduce {
    public static void main(String[] args) {
        System.out.println(reduction(100));
    }

    public static int reduction(int n) {
        int steps = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n--;
            }
            steps++;
        }
        return n;
    }
}
