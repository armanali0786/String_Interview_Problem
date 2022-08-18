
//Java Program to Count the Occurrences of Each Character in String
public class OccurenceString {
    static int countOccurrences(String str, String word)
    {
            str = str.toLowerCase();
        String a[] = str.split(" ");

        int count = 0;
        for (int i = 0; i < a.length; i++)
        {
        if (word.equals(a[i]))
            count++;
        }
      System.out.print("Output String: ");
        return count;
   }
    public static void main(String args[])
    {
        String str = "Arman ali software developer ali arman";
        String word = "arman";
        System.out.println("Input String: " + str);
        System.out.println("Input word: " + word);
        System.out.println(countOccurrences(str, word));
    }
}

