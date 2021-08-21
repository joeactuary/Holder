package Jul24;


import java.util.Scanner;

class Grade {
    private int mark;
    private char grade;

    public Grade(int mark) {
        this.mark = mark;
        this.grade = createGrade();

    }

    public char getGrade() {
        return grade;
    }

    char createGrade(){

        if (this.mark <=25) return 'F';
        else if (this.mark <= 45) return  'E';
        else if (this.mark <= 50) return 'D';
        else if (this.mark <= 60) return 'C';
        else if (this.mark <= 80) return 'B';
        return 'A';
    }
}


public class EX038 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your mark");
        int mark = scanner.nextInt();
        Grade grade = new Grade(mark);
        System.out.println( (mark < 0) ? "Please enter valid mark" : "Your grade is " + grade.getGrade());

    }
}
