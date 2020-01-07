import java.util.Scanner;
import java.io.*;

public class Echo{
  private String fileName; // external file name
  private Scanner scan; // Scanner object for reading from external file

  public Echo(String f) throws IOException
  {
    fileName = f;
    scan = new Scanner(new FileReader(fileName));
  }
  
  public String getFileName(){
	  return fileName;
  }

  public void readLines(){ // reads lines, hands each to processLine
    while(scan.hasNext()){
      processLine(scan.nextLine());
    }
    scan.close();
  }

  public void processLine(String line){ // does the real processing work
    System.out.println(line);
  }
}