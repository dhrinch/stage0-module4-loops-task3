package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int first = 0;
        int second = 1;
        int next = 0;
        System.out.println(first);
        System.out.println(second);
        for (int i = 0; i < lastFibonacci - 2; i++) {
            next = first + second;
            System.out.println(next);
            first = second;
            second = next;
        }
    }
}
