package udemy._2_control_flow_1._0_expession_oriented.java;

public class Demo0 {
    public static void main(String[] args) {
        // expression, not statement: 0 + 1 * 2
        int x = 0;
        int y = 0 + 1 * 2;

        // statement, not expression
        System.out.println(0);

        // statement AND expression
        Math.sin(0);
        double d = Math.sin(0);

        // example #1: assignment
        int a, b, c;
        a = b = c = 0;
        a = (b = (c = 0));

    }
}
