import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;


public class Solution {
    public static void main(String[] args) throws IOException {
        Calendar cal = Calendar.getInstance();
        cal.set(2015, 8-1, 5);
        int weekday = cal.get(Calendar.DAY_OF_WEEK);

        String[] day1 = {"Sunday", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday"};

        System.out.println(day1[weekday - 1]);
    }
}
