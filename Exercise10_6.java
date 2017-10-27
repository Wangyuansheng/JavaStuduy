import java.util.Stack;

public class Exercise10_6 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        int index = 0;
        for (int n = 2; n <= 120; n++) {
            boolean b = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                stack.push(n);
            }
        }
        while (!stack.empty()) {
            System.out.print(stack.pop()+" ");
        }

    }

}
