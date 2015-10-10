package udemy_2._5_control_flow_i._2_other._6_assignment._5_calculated;

public class Demo7 {
    public static void main(String[] args) {
        String x = "A";
        String y = "B";

        // read calculated
        char ch = ((x.length() > y.length()) ? x : y).charAt(0);
    }
}
