import java.util.List;

public class DataTypes {
    // TODO TASK 1: fix this code so that it passes the test in DataTypesTest.java
    public static long sum(List<Integer> numbers) {

        long counter = 0;
        // below is a "foreach" loop which iterates through numbers
        for (int x : numbers) {
            counter += x;
        }
        return counter;
    }
}
