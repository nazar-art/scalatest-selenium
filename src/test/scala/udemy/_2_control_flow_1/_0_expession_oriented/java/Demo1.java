package udemy._2_control_flow_1._0_expession_oriented.java;

// statement composition
public class Demo1 {
    public static void main(String[] args) {
        // method call
        System.out.println(0);

        // if + method call
        if (1 > 0) {
            System.out.println(0);
        }

        // for + if + method call
        for (int k = 0; k < 10; k++) {
            if (k > 1) {
                System.out.println(0);
            }
        }
    }
}
