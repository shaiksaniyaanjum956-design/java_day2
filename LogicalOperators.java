public class LogicalOperators
{
    public static void main(String[] args) {
        int x = 12;
        int y = 7;
        int z = 20;

        if (x > 10 && y < 10) {
            System.out.println("x is greater than 10 AND y is less than 10");
        }
        if (y > 10 || z > 15) {
            System.out.println("Either y is greater than 10 OR z is greater than 15");
        }
        if ((x + y) > 15 && (z - y) > 10) {
            System.out.println("Sum of x and y is > 15 AND difference of z and y is > 10");
        }

        boolean condition = (x < y);
        if (!condition) {
            System.out.println("NOT operator makes the condition true since x is not less than y");
        }
    }
}
