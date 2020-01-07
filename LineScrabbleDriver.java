import java.util.Scanner;
import java.io.*;
public class LineScrabbleDriver{
   public static void main(String[] args){
      try{
         Scanner fileReader= new Scanner(System.in);
         System.out.println("Enter File Name:");
         String fileName=fileReader.nextLine();//Enters in file name
         LineScrabble scrabble= new LineScrabble(fileName);//LineScrabble object created w/ file name 
         scrabble.readLines();
         scrabble.reportLargest();
      }
      catch (Exception e){//Catches any exceptions and prints them out
         e.printStackTrace();
      }
   }
}