import java.io.IOException;
public class LineScrabble extends Echo{

   public int[] alphaScore= {1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};//Array of score values for each letter
   int largest=0;
   String largeName= " ";
   
   public LineScrabble(String dataFile) throws IOException{
   //LineScrabble object constructor- derived from echo object
      super (dataFile);
   }
      
   public void processLine(String line){
   //Converts lines to array of chars, compares each last line to find largest score 
     line= line.toLowerCase();
     char[] letters=line.toCharArray();
     int lineScore=score(letters);//Stores score of line being processed in lineScore
     if (lineScore>largest){//Compares score of current line with last largest line
        largest=lineScore;
        largeName=line;
      }
   }
  
   public int score(char[] letters){
   //Char array passed in, if letter, score is calculated according to scrabble rules and copied to value 
     int pos=0;
     int value=0;
      for (int j=0; j<letters.length; j++){
         if (Character.isLetter(letters[j])){
            pos=letters[j]-'a';//Finds position of letter in array 0-25
            if (j%4==0&j%9==0){
              value=value+ (alphaScore[pos]*2);}
            else if (j%4==0){
               value=value+(alphaScore[pos]*2);}
            else if (j%9==0){
               value=value+(alphaScore[pos]*3);}
            else{
               value=value+alphaScore[pos];}
         }
     }
     return value;
   }
  
   public void reportLargest(){
   //Prints the line name and the score of line in file with largest score 
      System.out.println("Winner: "+ largeName+" Score: "+largest);
   }
}