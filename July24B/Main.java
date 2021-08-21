package July24B;

import java.util.Scanner;

class Grade {
    private int score1;
    private int score2;
    private int score3;
    private double averageScore;
    private char grade;

    public Grade(int score1, int score2, int score3) {
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.averageScore = score1 + score2 + score3;
        this.grade = getGrade();
        System.out.println("Your grade is " + getGrade());
    }

    public char getGrade() {
        if (averageScore >= 90) return 'A';
        if (averageScore >= 70) return 'B';
        if (averageScore >= 50) return 'C';
        return 'F';
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your three test scores");
        int score1 = scanner.nextInt();
        int score2 = scanner.nextInt();
        int score3 = scanner.nextInt();
        Grade joeGrade = new Grade(score1, score2, score3);
        System.out.println(joeGrade.getGrade());
    }
}


