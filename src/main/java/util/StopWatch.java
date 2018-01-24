package util;

public class StopWatch {

    private final long start;

    public StopWatch() {
        start = System.currentTimeMillis();
    }

    public double elapsedTime() {
        double now = System.currentTimeMillis();
        return (now - start);
    }

    public static void main(String[] args) {

        StopWatch stopWatch = new StopWatch();

        for (int i=0; i<100000; i++);

        System.out.println(stopWatch.elapsedTime());

    }

}
