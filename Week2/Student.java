package com.aytona;

/**
 * Created by Aytona on 2016-09-13.
 */
public class Student
{
    String name;
    double totalQuizScore;
    int quizzesTaken;

    Student() { }
    Student(String name)
    {
        this.name = name;
    }
    Student(String name, double total, int taken)
    {
        this.name = name;
        totalQuizScore = total;
        quizzesTaken = taken;
    }
    String getName()
    {
        return name;
    }
    void addQuiz(int score)
    {
        totalQuizScore += score;
        quizzesTaken++;
    }
    double getTotalScore()
    {
        return totalQuizScore;
    }
    double getAverageScore()
    {
        return totalQuizScore / quizzesTaken;
    }
}
