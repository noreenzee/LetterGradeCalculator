
package lettergradecalculator;

import java.util.Scanner;


public class LetterGradeCalculator
{

    public static void main(String[] args)
    {
        Scanner grades = new Scanner(System.in);
        
        //Collect Student's information
        System.out.println("Enter student's name:");
        
        String name = grades.nextLine();
        
        System.out.println("Enter student's ID number:");
        String id = grades.nextLine();
        
        //Get Quiz and Exam Scores
        System.out.println("Enter First quiz Score:");
        double quiz1 = grades.nextDouble();
        
        System.out.println("Enter Second Quiz Score:");
        double quiz2 = grades.nextDouble();
        
        System.out.println("Enter First Exam Score:");
        double exam1 = grades.nextDouble();
        
        System.out.println("Enter Second Exam Score:");
        double exam2 = grades.nextDouble();
        
        // use call method to calculate final grades.
        double finalGrade = calculateFinalGrade(quiz1, quiz2, exam1, exam2);
        char letterGrade;
        letterGrade = determineLetterGrade(finalGrade);
        
        //Output the final results
        
        System.out.println("Student Name: "+ name);
        System.out.println("Student ID: " + id);
        System.out.println("Final Grade: " + finalGrade + "%");
        System.out.println("Letter Grade: " + letterGrade);
    }
    //Method to determine the final grade based on the remaining quiz and exam
    public static double calculateFinalGrade(double quiz1, double quiz2, double exam1, double exam2)
    {
       //Drop the lowest quiz score
        double quizScore = Math.max(quiz1, quiz2);
        
        //Drop the lowest exam score
        double examScore = Math.max(exam1, exam2);
        
        //calculate final grade (40% quiz, 60% exam)
        double finalGrade = (quizScore * 0.4) + (examScore * 0.6);
        return finalGrade;
    }
    //Method to determine the letter grade
    public static char determineLetterGrade(double finalGrade)
    {
        if (finalGrade >= 90)
        {
           return 'A';
    } 
        else if (finalGrade >= 80)
        {
            return 'B';
        }
        else if (finalGrade >= 70)
        {
            return 'C';
        }
        else if (finalGrade >= 60)
        {
            return 'D';
        }
        else
        {
            return 'F';
        }
                
        }
    }
    

