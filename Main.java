import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String input = "";

    ArrayList<String> words = new ArrayList<String>();
    System.out.println("Please enter words, enter STOP to stop the loop.");

    while (!input.equals("STOP"))
    {
      System.out.println("Inside the loop. Enter a word:");
      input = sc.nextLine();
      words.add(input);
      System.out.println("Word added. ArrayList is now " + words);
    }

    System.out.println("Exited loop. ArrayList is now " + words);

    if (words.size()>2){
      System.out.println(words.size());
      System.out.println(words);
      words.remove(words.size()-1);
      words.add(words.get(0));
      words.remove(0);
      System.out.println(words);
    }
  }
}
