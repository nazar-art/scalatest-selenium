package udemy._2_control_flow_1._0_expession_oriented.java;

import java.io.IOException;

public class Demo3 {
    static int x = 0;

    public static void main(String[] args) throws IOException {
        // static assignment
        x = 1;

        // statement: call method (with side effect)
        System.out.println(0);

        // assignment + call method (with side effect)
        x = System.in.read();
    }
}
