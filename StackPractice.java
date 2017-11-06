import java.util.Scanner;
import java.util.Stack;

public class StackPractice {

	public static void main(String[] args) {
		Stack<Integer> vals = new Stack<Integer>();
		Stack<String> ops = new Stack<String>();
		Scanner scan = new Scanner(System.in);
		String expression = scan.nextLine();

		int x = 0;
		int res = 0;
		while (x < expression.length()) {
			if (expression.charAt(x) == ' ') {

			} else if (expression.charAt(x) == '(') {

			} else if (expression.charAt(x) == '+')
				ops.push("+");
			else if (expression.charAt(x) == '-')
				ops.push("-");
			else if (expression.charAt(x) == '*') {
				ops.push("*");
			} else if (expression.charAt(x) == '/') {
				ops.push("/");
			} else if (expression.charAt(x) == ')') { // Pop, evaluate, and push result if token is ")".
				String op = ops.pop();
				int v = vals.pop();
				if (op.equals("+"))
					v = vals.pop() + v;
				else if (op.equals("-"))
					v = vals.pop() - v;
				else if (op.equals("*"))
					v = vals.pop() * v;
				else if (op.equals("/"))
					v = vals.pop() / v;
				vals.push(v);
			} else {
				vals.push(Character.getNumericValue(expression.charAt(x)));
			}

			x++;
		}
		System.out.println(vals.pop());
	}

}
