package udemy_2._5_control_flow_i._2_other._6_assignment._5_calculated;

public class Demo8 {
    public static void main(String[] args) {
        J x = new J("A");
        J y = new J("B");

        ((x.str.length() > y.str.length()) ? x : y).str = "C";
    }
}

class J {
    String str;

    J(String str) {
        this.str = str;
    }
}
