import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class dailyTemperature {
    public int[] dailyTemperature (int[] temperature) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < temperature.length; i++) {
            int contador = 1;
            int dias = 1;

            if (temperature[i] <= temperature[contador]) {
                stack.push(temperature[contador]);
                contador++;
            }
            else {
                dias = stack.size();
                stack.clear();
            }
            res.add(dias);
            i++;
        }
        return res;
    }
}
