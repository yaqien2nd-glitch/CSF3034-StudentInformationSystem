/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;

/**
 *
 * @author Fatihah
 */
import java.util.Scanner;
public class StudentInformationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
       System.out.println("Name: Muhammad Ainul Yaqien Bin Jamdali");
       System.out.println("Student ID: S86071");
       double mark1,mark2,totalmark,average;
       System.out.print("Enter your mark1: ");
       mark1=sc.nextDouble();
       System.out.print("Please enter your mark2: ");
       mark2=sc.nextDouble();
       totalmark=mark1+mark2;
       average = totalmark/2;
       System.out.println("Your total marks is: "+totalmark );
       
       String message;
       if (totalmark>=80)
           message="Excellent";
       else if(totalmark>=60 )
           message="Good";
           
       else
           message="Needs Improvement";
       
       System.out.println("Result: "+message);
       
    }
    
}
