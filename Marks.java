package project2;

public abstract class Marks {
    // We have to calculate the average of marks obtained in three subjects by student A and by student B. Create class 'Marks' with an abstract method
    // 'getPercentage' that will be returning the average percentage of marks. Provide implementation of abstract method in classes 'A' and 'B'. The constructor
    // of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. Test your code

     abstract double getPercentage();


    }
 class studentA extends Marks{
     private double subject1;
     private double subject2;
     private double subject3;

     public studentA(double subject1, double subject2, double subject3) {
         this.subject1 = subject1;
         this.subject2 = subject2;
         this.subject3 = subject3;
     }
     @Override
      double getPercentage() {
         double totalMarks = subject1 + subject2 + subject3;
         return (totalMarks / 3.0);
     }
 }

class studentB extends Marks{
    private double subject1;
    private double subject2;
    private double subject3;
    private double subject4;
    public studentB(double subject1, double subject2, double subject3, double subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }
    @Override
    double getPercentage() {
        double totalMarks = subject1 + subject2 + subject3 + subject4;
        return (totalMarks / 4.0);
    }
}
