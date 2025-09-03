// 9) Find Frequency:

// Given a List of integers, find the frequency of each number using a Set and Collections.frequency().
import java.util.*;

public class CountFrequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 10, 30, 20, 10, 40, 30);

        List<Integer> unique = new ArrayList<>(list);

        int cnt = 0;
        for (Integer num : unique) 
        {
            cnt = Collections.frequency(list, num);
            System.out.println(num + " occurs " + cnt + " times");
        }
    }
}
