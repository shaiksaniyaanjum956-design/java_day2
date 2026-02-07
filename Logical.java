public class Logical
 {
    public static void main(String[] args) {
        int a = 10, b = 25;
        if (a > 5 && b > 15) {
            System.out.println("Both conditions are true (AND).");
        }
        if (a > 15 || b > 15) {
            System.out.println("At least one condition is true (OR).");
        }
        boolean flag = false;
        if (!flag) {
            System.out.println("NOT operator makes false into true.");
        }
    }
}

