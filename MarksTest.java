package project2;

public class MarksTest {
    public static void main(String[] args) {
        Marks studentA = new studentA(80.0, 90.0, 85.0);
        System.out.println("Average Percentage for Student A: " + studentA.getPercentage() + "%");

        Marks studentB = new studentB(75.0, 85.0, 70.0, 95.0);

        System.out.println("Average Percentage for Student B: " + studentB.getPercentage() + "%");
    }
}
