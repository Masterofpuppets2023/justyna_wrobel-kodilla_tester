
public class Grades {

    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(3);
        grades.add(1);
        grades.add(5);
        grades.add(6);
        grades.add(5);

        System.out.println(grades.lastGrade());
        System.out.println(grades.averageGrade());
    }
    private int[] grades;
    private int numberOfGrades;

    public Grades() {
        this.grades = new int[10];
        this.numberOfGrades = 0;
    }

    public void add(int newGrade) {
        if (this.numberOfGrades == 10) {
            return;
        }
        this.grades[this.numberOfGrades] = newGrade;
        this.numberOfGrades++;
    }

    public int lastGrade() {
        if (this.numberOfGrades == 0) {
            return -1;
        }
        return this.grades[this.numberOfGrades - 1];
    }

    public double averageGrade() {
        if (this.numberOfGrades == 0) {
            return -1.0;
        }
        int sum = 0;
        for (int i = 0; i < this.numberOfGrades; i++) {
            sum = sum + this.grades[i];
        }
        return sum / this.numberOfGrades;
    }
}